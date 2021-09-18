/* 
    4.37 O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
    n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
    e
    n! = 1 (para n = 0)
    Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.

    a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
*/

import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        
        int number = -1;        //armazena a entrada do usuário
        int factorial;          //armazena o resultado a ser mostrado
        int numberDisplay;       //guarda a entrada do usuário para fazer o print no final

        //enquanto o usuário fornecer um valor negativo, repete a perunta
        while(number < 0){
            
            //solicita ao usuário que forneça um número
            System.out.print("informe um numero nao negativo: ");
            number = input.nextInt();
        }

        //guarda uma cópia do valor informado
        numberDisplay = number;

        //verifica se o valor informado é zero, se sim, inicializa factorial com 1. Caso contrário, inícia com number.
        if(number == 0){
            factorial = 1;
        }else{
            factorial = number;
        }

        //calcula o fatorial do valor informado
        while(number > 1){
            factorial = factorial * --number;
        }

        //imprime o fatorial do valor informado
        System.out.printf("%d! = %d%n", numberDisplay, factorial);
        
    }
}