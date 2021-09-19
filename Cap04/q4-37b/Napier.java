/* 
    4.37 O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
    n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
    e
    n! = 1 (para n = 0)
    Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.

    a) Escreva um aplicativo que estima o valor da constante matemática e utilizando a fórmula a seguir. Permita ao 
    usuário inserir o número de termos a calcular.

    e = 1 + 1 / 1! + 1 / 2! + 1 / 3! ...
*/

import java.util.Scanner;

public class Napier{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        
        int number = 1;         //termo atual do calculo iterativo
        double napier = 1;      //armazena o resultado a ser mostrado
        int counter;            //entrada do usuário

         //solicita ao usuário que forneça um número
         System.out.print("informe quantos termos deseja calcular: ");
         counter = input.nextInt();

        //enquanto o usuário fornecer um valor negativo, repete a pergunta
        while(counter <= 0){
            
            //solicita ao usuário que forneça um número
            System.out.print("informe quantos termos deseja calcular: ");
            counter = input.nextInt();
        }

        //calcula o termo atual
        while(number <= counter){
            napier = napier + (double) 1 / factorial(number++);
        }
        
        System.out.printf("o valor de e para %d termos é: %.4f%n", counter, napier);
    }

    //considerando que o calculo do fatorial é demasiado longo para incluir no corpo do while, optamos por escrever essa
    //função
    private static int factorial(int number){
        
        int factorial;

        if(number == 0){
            factorial = 1;
        }else{
            factorial = number;
        }
    
        while(number > 1){
            factorial = factorial * --number;
        }

        return factorial;
    }
}

//3*2
//6 * 1