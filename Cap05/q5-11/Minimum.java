/* 
    5.11 Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido 
    especifica o número de valores a serem inseridos pelo usuário.
*/

import java.util.Scanner;

public class Minimum{

    public static void main(String[] args) {
        
        int number;             //armazena os valores informados
        int minimum;            //armazena o menor valor dentre os informados
        int counter;            //conta o número de iterações

        //captura as entradas dos usuários
        Scanner input = new Scanner(System.in);

        //continua solicitando uma entrada ao usuário até que seja um inteiro positivo maior que zero
        do{
            //solicita ao usuário um número
            System.out.print("informe um numero: ");
            number = input.nextInt();
        }while(number <= 0);

        counter = number - 1;       //define o número de iterações que serão realizadas
        minimum = number;           //inicializa minimum

        for(int i = 0; i < counter; i++){
            
            //solicita uma entrada ao usuário
            System.out.print("informe um numero: ");
            number = input.nextInt();

            //se for um valor inválido, descarta o valor sem incrementar o contador
            if(number < 0){
                i--;
                continue;
            }

            //executa somente quando for um valor válido e verifica se o valor é menor que o mínimo
            if(minimum > number){
                minimum = number;
            }
        }

        System.out.printf("o menor valor é: %d%n", minimum);
    }
}