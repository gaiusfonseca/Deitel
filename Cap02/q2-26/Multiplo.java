/*
    2.26 Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e 
    imprimir o resultado.
    Dica: utilize o operador de resto.
*/

import java.util.Scanner;

public class Multiplo{

    public static void main(String[] args){

        //declarar as variáveis que armazanarão os valores digitados pelo usuário.
        int num1;
        int num2;

        //declara e instância um Scanner para capturar as entradas do usuário.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");             //solicita ao usuário que forneça um número
        num1 = entrada.nextInt();                           //captura a entrada do usuário e armazena

        System.out.print("Digite um numero: ");             //solicita ao usuário que forneça um número
        num2 = entrada.nextInt();                           //captura a entrada do usuário e armazena

        //verifica se num1 e divisivel por num2
        if(num1 % num2 == 0){
            System.out.printf("%d e divisivel por %d%n", num1, num2);
        }

        //verifica se num1 nao e divisivel por num2
        if(num1 % num2 != 0){
            System.out.printf("%d nao e divisivel por %d%n", num1, num2);
        }
    }
}