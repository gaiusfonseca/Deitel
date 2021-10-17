/* 
    7.21 (Gráficos de tartaruga) A linguagem Logo tornou famoso o conceito de gráficos de tartaruga. Imagine uma 
    tartaruga mecânica que caminha no lugar sob o controle de um aplicativo Java. A tartaruga segura uma caneta em uma 
    de duas posições, para cima ou para baixo. Enquanto a caneta estiver para baixo, a tartaruga desenha formas à medida
    que se move, e enquanto estiver para cima, a tartaruga move-se quase livremente sem escrever nada. Neste problema, 
    você simulará a operação da tartaruga e criará um bloco de rascunho computadorizado.

    Utilize um array de 20 por 20 floor que é inicializado com zeros. Leia comandos a partir de um array que contenha 
    esses comandos. Monitore a posição atual da tartaruga todas as vezes e se a caneta está atualmente para cima ou para
    baixo. Suponha que a tartaruga sempre inicie na posição (0, 0) do chão com sua caneta para cima. O conjunto de 
    comandos de tartaruga que seu aplicativo deve processar é mostra do na Figura 7.29.

    1 - Caneta para cima
    2 - Caneta para baixo
    3 - Vira para a direita
    4 - vira para a esquerda
    5, 10 - Avance 10 espaçoes (substitua 10 por um número diferente de espaços)
    6 - Exiba o array 20 por 20
    9 - fim dos dados (sentinela)

    Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão. O “programa” seguinte desenharia e exibiria
    um quadrado de 12 por 12 deixando a caneta na posição levantada:

    2
    5,12
    3
    5,12
    3
    5,12
    3
    5,12
    1
    6
    9

    À medida que a tartaruga se move com a caneta por baixo, configure os elementos apropriados do array floor como 1.
    Quando o comando 6 (exibir o array) for dado, onde quer que haja um 1 no array, exiba um asterisco ou o caractere 
    que você escolher. Onde quer que haja um 0 , exiba um espaço em branco.

    Escreva um aplicativo para implementar as capacidades dos gráficos de tartaruga discutidas aqui. Escreva vários 
    programas de gráfico de tartaruga para desenhar formas interessantes. Adicione outros comandos para aumentar as 
    capacidades de sua linguagem de gráfico de tartaruga.
*/

import java.util.Arrays;
import java.util.Scanner;

public class App{

    //instância um Scanner para capturar a entrada do usuário
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        //cria um array bidimensional de inteiros 20 x 20 para representar o piso
        int[][] floor = new int[20][20];

        //armazena o valor do usuário
        int option;

        final int MOVES = 7;

        //prepara um array com as mensagens do menu do jogo
        String[] messages = {
            "Informe a ação desejada:",
            "1 - Caneta para cima",
            "2 - Caneta para baixo",
            "3 - Vira para a direita",
            "4 - Vira para a esquerda",
            "5 - Avance 7 espaçoes",
            "6 - Exiba o array 20 por 20",
            "9 - Fim dos dados"
        };

        //cria uma nova tartaruega na posição 0,0 com a caneta para cima
        Turtle turtle = new Turtle();

        //solicita ao usuário uma entrada e a processa
        do{
            option = requestInput(messages);

            switch(option){
                //vira a caneta para cima
                case 1:
                    turtle.setPen(false);
                    break;
                //vira a caneta para baixo
                case 2:
                    turtle.setPen(true);
                    break;
                //gira a tartaruga para a direita
                case 3:
                    turtle.turnRight();
                    break;
                //gira a tartaruga para a esquerda
                case 4:
                    turtle.turnLeft();
                    break;
                //movimenta a tartaruga
                case 5:
                    turtle.move(floor, MOVES);
                    break;
                //exibe o gráfico
                case 6:
                    display(floor);
                    break;
                //sai do programa
                case 9:
                    break;
                //informa que a opção selecionada é inválida
                default:
                    System.out.println("opção inválida");
            }
        }while(option != 9);


    }

    /**
     * Imprime o desenho feito pela tartaruga até o momento
     * @param floor um array bidimensional de inteiros em que o 0 representam os espaços vazios e 1 representa o risco 
     * da caneta
     */
    public static void display(int[][] floor) {
        
        for(int line = 0; line < floor.length; line++){

            for(int column = 0; column < floor.length; column++){

                if(floor[line][column] == 0){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }

    /**
     * Solicita um input do usuárioe verifica se é um valor válido
     * @return retorna o valor inserido pelo usuário, dentre as opções válidas
     */
    public static int requestInput(String[] messages) {
        
        //estabelece uma lista de valores válidos
        final int[] VALID_OPTIONS = {1, 2, 3, 4, 5, 6, 9};
        
        //armazena a entrada do usuário
        int option;

        //repete a solicitação enquando o usuário não fornecer um valor válido
        do{
            for(String message : messages){
                System.out.println(message);
            }
            option = input.nextInt();
        }while(Arrays.binarySearch(VALID_OPTIONS, option) < 0);

        return option;
    }
}