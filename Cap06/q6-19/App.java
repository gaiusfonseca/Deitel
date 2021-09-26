/* 
    6.19 (Exibindo um quadrado de qualquer caractere) Modifique o método criado no Exercício 6.18 para receber um 
    segundo parâmetro do tipo char chamado fillCharacter. Forme o quadrado utilizando o char fornecido como um 
    argumento. Portanto, se side for 5 e fillCharacter for # , o método deve exibir
    
    #####
    #####
    #####
    #####
    #####

    Utilize a seguinte instrução (em que input é um objeto Scanner ) para ler um caractere do usuário no teclado:
    char fill = input.next().charAt(0);
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int side;           //armazena o tamanho do lado
        char fillCharacter; //armazena o caractere de preenchimento

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //repete enquanto o usuário não fornecer um valor menor ou igual a zero
        do{
            //solicita uma entrada ao usuário
            System.out.print("informe o tamanho do lado do quadrado (valores negativos para sair): ");
            side = input.nextInt();

            //se o valor fornecido for menor ou igual a zero, encerra o programa
            if(side <= 0){
                break;
            }

            //solicita ao usuário o caractere de preenchimento
            System.out.print("digite o caractere de preenchimento: ");
            fillCharacter = input.next().charAt(0);

            //imrpime a figura
            squareOfAsterisks(side, fillCharacter);

        }while(side > 0);
    }

    public static void squareOfAsterisks(int side, char fillCharacter) {

        //imprime a figura
        for(int line = 1; line <= side; line++){

            for(int position = 1; position <= side; position++){
                
                System.out.print(fillCharacter);
            }

            System.out.println();
        }
    }
}