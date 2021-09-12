/* 
    2.32Escreva um programa que insira cinco números, além de determina e imprimir quantos negativos, quantos positivos e 
    quantos zeros foram inseridos.
*/

import java.util.Scanner;

public class Counter{

    public static void main(String[] args){

        int countPositivos = 0; //variavel que contará os positivos
        int countNegativos = 0; //variavel que contará os negativos
        int countZeros = 0;     //variável que contará os zeros
        int numero;         //variável que armazenará os valores digitados

        //declara e instância um Scanner para capturar as entradas do usuário
        Scanner entrada = new Scanner(System.in);

        //Este programa poderia ser escrito de maneira mais eficiente com um laço for, mas isso ainda não foi ensinado
        //neste capítulo.

        //primeiro número
        System.out.print("Digite um valor: ");  //solicita ao usuário que forneça um valor
        numero = entrada.nextInt();             //armazena o valor fornecido pelo usuário

        if(numero > 0){                             //verifica se é um valor positivo
            countPositivos = countPositivos + 1;    //incrementa o contador de positivos
        }

        if(numero == 0){                    //verifica se é um valor igual a zero
            countZeros = countZeros + 1;    //incrementa o contador de zeros
        }

        if(numero < 0){                             //verifica se é um valor negativo
            countNegativos = countNegativos + 1;    //incrementa o contador de negativos
        }

        //segundo número
        System.out.print("Digite um valor: ");  //solicita ao usuário que forneça um valor
        numero = entrada.nextInt();             //armazena o valor fornecido pelo usuário

        if(numero > 0){                             //verifica se é um valor positivo
            countPositivos = countPositivos + 1;    //incrementa o contador de positivos
        }

        if(numero == 0){                    //verifica se é um valor igual a zero
            countZeros = countZeros + 1;    //incrementa o contador de zeros
        }

        if(numero < 0){                             //verifica se é um valor negativo
            countNegativos = countNegativos + 1;    //incrementa o contador de negativos
        }

        //terceiro número
        System.out.print("Digite um valor: ");  //solicita ao usuário que forneça um valor
        numero = entrada.nextInt();             //armazena o valor fornecido pelo usuário

        if(numero > 0){                             //verifica se é um valor positivo
            countPositivos = countPositivos + 1;    //incrementa o contador de positivos
        }

        if(numero == 0){                    //verifica se é um valor igual a zero
            countZeros = countZeros + 1;    //incrementa o contador de zeros
        }

        if(numero < 0){                             //verifica se é um valor negativo
            countNegativos = countNegativos + 1;    //incrementa o contador de negativos
        }

        //quarto número
        System.out.print("Digite um valor: ");  //solicita ao usuário que forneça um valor
        numero = entrada.nextInt();             //armazena o valor fornecido pelo usuário

        if(numero > 0){                             //verifica se é um valor positivo
            countPositivos = countPositivos + 1;    //incrementa o contador de positivos
        }

        if(numero == 0){                    //verifica se é um valor igual a zero
            countZeros = countZeros + 1;    //incrementa o contador de zeros
        }

        if(numero < 0){                             //verifica se é um valor negativo
            countNegativos = countNegativos + 1;    //incrementa o contador de negativos
        }

        //quinto número
        System.out.print("Digite um valor: ");  //solicita ao usuário que forneça um valor
        numero = entrada.nextInt();             //armazena o valor fornecido pelo usuário

        if(numero > 0){                             //verifica se é um valor positivo
            countPositivos = countPositivos + 1;    //incrementa o contador de positivos
        }

        if(numero == 0){                    //verifica se é igual a zero
            countZeros = countZeros + 1;    //incrementa o contador de zeros
        }

        if(numero < 0){                             //verifica se é um valor negativo
            countNegativos = countNegativos + 1;    //incrementa o contador de negativos
        }

        //imprime os resultados
        System.out.printf("foram informados %d numeros positivos%n", countPositivos);
        System.out.printf("foram informados %d numeros zeros%n", countZeros);
        System.out.printf("foram informados %d numeros negativos%n", countNegativos);
    }
}