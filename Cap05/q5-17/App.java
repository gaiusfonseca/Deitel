/* 
    5.17 Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; 
    produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um aplicativo que leia 
    uma série de pares de números como segue:
    
    a) número de produto
    
    b) quantidade vendida
    
    Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve 
    calcular e exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela 
    para determinar quando o programa deve parar o loop e exibir os resultados finais.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int product;            //armazena o código do produto
        int quantity;           //armazena a quantidade vendida
        double total = 0;       //armazena o valor total das vendas
        int sentinel = 0;    //armazena o valor da  sentinela

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        while(sentinel != -1){

            //solicita ao usuário que inform se deseja informar uma nova venda
            System.out.print("digite a opcao desejada:\n 1 - informa uma nova entrada\n-1 - encerrar o programa\n>>");
            sentinel = input.nextInt();

            //quando a sentinela for inserida, o programa será encerrado
            if(sentinel == -1){
                break;
            }

            //verifica se é uma entrada válida
            do{
                //solicita ao usuário o código do produto
                System.out.print("informe o número do produto: ");
                product = input.nextInt();
            }while(product < 1 || product > 5);
    
            //verifica se é uma entrada válida
            do{
                //solicita ao usuário a quantidade vendida
                System.out.print("informe quantas unidades deseja: ");
                quantity = input.nextInt();
            }while(quantity < 1);

            //calcula o valor total das vendas
            switch(product){
                case 1:
                    total = total + quantity * 2.98;
                    break;
                case 2:
                    total = total + quantity * 4.50;
                    break;
                case 3:
                    total = total + quantity * 9.98;
                    break;
                case 4:
                    total = total + quantity * 4.49;
                    break;
                case 5:
                    total = total + quantity * 6.87;
                    break;
            }
        }

        //exibe o valor total das vendas
        System.out.printf("o valor total das vendas foi de: %.2f%n", total);
    }
}