/* 
    6.18 (Exibindo um quadrado de asteriscos) Escreva um método squareOfAsterisks que exibe um quadrado sólido (o mesmo 
    número de linhas e colunas) de asteriscos cujo lado é especificado no parâmetro inteiro side. Por exemplo, se side 
    for 4 , o método deverá exibir:

    ****
    ****
    ****
    ****

    Incorpore esse método a um aplicativo que lê um valor inteiro para side a partir da entrada fornecida pelo usuário e
    gera saída dos asteriscos com o método squareOfAsterisks .
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int side;       //armazena o tamanho do lado

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

            //imrpime a figura
            squareOfAsterisks(side);

        }while(side > 0);
    }

    public static void squareOfAsterisks(int side) {
        
        //imprime a figura
        for(int line = 1; line <= side; line++){

            for(int position = 1; position <= side; position++){
                
                System.out.print("*");
            }

            System.out.println();
        }
    }
}