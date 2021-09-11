
/*
    2.25 Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir se ele é ímpar ou par. 
    Dica: utilize o operador de resto. Um número par é um múltiplo de 2 deixa um resto 0 quando dividido por 2.
*/

import java.util.Scanner;

public class ParImpar{

    public static void main(String[] args){

        //declara as variáveis que irão armazenar as entradas do usuário
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        //declara e instância um Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");     //solicita ao usuário que digite um número
        num1 = entrada.nextInt();                   //captura o valor e armazena na variável

        System.out.print("Digite um numero: ");     //solicita ao usuário que digite um número
        num2 = entrada.nextInt();                   //captura o valor e armazena na variável

        System.out.print("Digite um numero: ");     //solicita ao usuário que digite um número
        num3 = entrada.nextInt();                   //captura o valor e armazena na variável
        
        System.out.print("Digite um numero: ");     //solicita ao usuário que digite um número
        num4 = entrada.nextInt();                   //captura o valor e armazena na variável
        
        System.out.print("Digite um numero: ");     //solicita ao usuário que digite um número
        num5 = entrada.nextInt();                   //captura o valor e armazena na variável

        //verifica se num1 é par
        if(num1 % 2 == 0){
            System.out.printf("%d e par %n", num1);
        }

        //verifica se num1 é ímpar
        if(num1 % 2 != 0){
            System.out.printf("%d e impar %n", num1);
        }

        //verifica se num2 é par
        if(num2 % 2 == 0){
            System.out.printf("%d e par %n", num2);
        }

        //verifica se num2 é ímpar
        if(num2 % 2 != 0){
            System.out.printf("%d e impar %n", num2);
        }

        //verifica se num3 é par
        if(num3 % 2 == 0){
            System.out.printf("%d e par %n", num3);
        }

        //verifica se num3 é ímpar
        if(num3 % 2 != 0){
            System.out.printf("%d e impar %n", num3);
        }

        //verifica se num4 é par
        if (num4 % 2 == 0){
            System.out.printf("%d e par %n", num4);
        }

        //verifica se num4 é ímpar
        if (num4 % 2 != 0){
            System.out.printf("%d e impar %n", num4);
        }

        //verifica se num5 é par
        if (num5 % 2 == 0){
            System.out.printf("%d e par %n", num5);
        }

        //verifica se num5 é ímpar
        if (num5 % 2 != 0){
            System.out.printf("%d e impar %n", num5);
        }

    }
}