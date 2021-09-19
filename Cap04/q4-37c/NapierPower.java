/* 
    4.37 O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
    n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
    e
    n! = 1 (para n = 0)
    Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.

    c) Escreva um aplicativo que computa o valor de e^x utilizando a fórmula a seguir. Permita ao usuário inserir o 
    número de termos a calcular.

    e^x = 1 + x / 1! + x^2 / 2! + x^3 / 3!
*/

import java.util.Scanner;

public class NapierPower{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        
        int step = 1;           //termo atual do calculo iterativo
        double napierPower = 1;      //armazena o resultado a ser mostrado
        int counter;            //entrada do usuário
        int x;

        //solicita ao usuário que forneça um número
        System.out.print("informe o valor de x: ");
        x = input.nextInt();

        //enquanto o usuário fornecer um valor negativo, repete a pergunta
        while(x <= 0){
            
            //solicita ao usuário que forneça um número
            System.out.print("informe o valor de x: ");
            counter = input.nextInt();
        }

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
        while(step < counter){
            napierPower = napierPower + (double) power(x, step) / factorial(step);
            step++;
        }

        //imprime o resultado
        System.out.printf("e^%d = %.4f%n", x, napierPower);
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

    private static int power(int base, int power){

        int result = 1;

        while(power > 0){
            result *= base;
            power--;
        }

        return result;
    }
}

