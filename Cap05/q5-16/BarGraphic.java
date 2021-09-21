/* 
    5.16 Uma aplicação interessante dos computadores é exibir diagramas e gráficos de barras. Escreva um aplicativo que 
    leia cinco números entre 1 e 30. Para cada número que é lido, seu programa deve exibir o mesmo número de asteriscos 
    adjacentes. Por exemplo, se seu programa lê o número 7, ele deve exibir ******* . Exiba as barras dos asteriscos 
    depois de ler os cinco números.
*/

import java.util.Scanner;

public class BarGraphic{

    public static void main(String[] args) {
        
        //armazena as entradas do usuário
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int temp;

        //instância um Scanner para capturar as entradas dos usuários
        Scanner input = new Scanner(System.in);

        //solicita ao usuário que forneça 5 entradas
        for(int i = 0; i < 5; i++){
            
            System.out.print("digite um número entre 1 e 30: ");
            temp = input.nextInt();

            if(temp > 0 && temp <= 30){
                
                //identifica qual variável deve ser modificada
                switch (i){
                    case 0:
                        number1 = temp;
                        break;
                    case 1:
                        number2 = temp;
                        break;
                    case 2:
                        number3 = temp;
                        break;
                    case 3:
                        number4 = temp;
                        break;
                    case 4:
                        number5 = temp;
                        break;
                }
            }else{
                //se o input fornecido pelo usuário não for um input válido, decrementamos a variável de controle.
                //Assim o processo será repetido até que 5 entradas válidas sejam fornecidas.
                i--;
            }
        }

        //imprime o rótulo da pirmeira barra
        System.out.print("Barra 1: ");

        //imprime a barra correspondente a number1
        for(int j = 0; j < number1; j++){
            System.out.print('*');
        }

        //move o cursor para a próxima linha
        System.out.println();

        //imprime o rótulo da segunda linha
        System.out.print("Barra 2: ");

        //imprime a barra correspondente a number2
        for(int j = 0; j < number2; j++){
            System.out.print('*');
        }

        //move o cursor para a próxima linha
        System.out.println();

        //imprime o rótulo da terceira linha
        System.out.print("Barra 3: ");

        //imprime a barra correspondente a number3
        for(int j = 0; j < number3; j++){
            System.out.print('*');
        }

        //move o cursor para a próxima linha
        System.out.println();

        //imprime o rótulo da quarta linha
        System.out.print("Barra 4: ");

        //imprime a barra correspondente a number4
        for(int j = 0; j < number4; j++){
            System.out.print('*');
        }

        //move o cursor para a próxima linha
        System.out.println();

        //imprime o rótulo da quinta linha
        System.out.print("Barra 5: ");

        //imprime a barra correspondente a number5
        for(int j = 0; j < number5; j++){
            System.out.print('*');
        }

        //move o cursor para a próxima linha
        System.out.println();
            
    }
}