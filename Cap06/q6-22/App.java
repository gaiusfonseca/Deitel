/* 
    6.22 (Conversões de temperatura) Implemente os seguintes métodos inteiros:
    
    a) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo 
    celsius = 5.0 / 9.0 * (fahrenheit - 32);

    b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo 
    fahrenheit = 9.0 / 5.0 * celsius + 32;

    c) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo que permite ao usuário inserir uma 
    temperatura em Fahrenheit e exibir o equivalente em Celsius ou inserir uma temperatura em Celsius e exibir o 
    equivalente em Fahrenheit.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        double fahrenheit;      //armazena um temperatura em farenheit fornecida pelo usuário

        //insTância um Sacnner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //enquanto não for 0, solicita ao usuário uma nova entrada
        do{
            //solicita uma entrada ao usuário
            System.out.print("informe uma temperatura em fahrenheit (0 para sair): ");
            fahrenheit = input.nextDouble();

            if(fahrenheit == 0){
                break;
            }

            //exibe o valor convertido ao usuário
            System.out.printf("fahrenheit = %.2f\t\t celsius = %.2f%n", fahrenheit, celsius(fahrenheit));

        }while(fahrenheit != 0);
    }

    public static double celsius(double temperature) {
        double celsius;
        
        celsius = (double) 5 / 9 * (temperature - 32);
        
        return celsius;
    }

    public static double fahrenheit(double temperature) {
        double fahrenheit;

        fahrenheit = (double) 9 / 5 * temperature + 32;

        return fahrenheit;
    }
}