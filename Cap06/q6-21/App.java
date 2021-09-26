/* 
    6.21 (Separando dígitos) Escreva métodos que realizam cada uma das seguintes tarefas:
    a) Calcule a parte inteiro do quociente quando o inteiro a é dividido pelo inteiro b .
    b) Calcule o resto inteiro quando o inteiro a é dividido por inteiro b .
    c) Utilize métodos desenvolvidos nas partes (a) e (b) para escrever um método displayDigits que recebe um inteiro 
    entre 1 e 99999 e o exibe como uma sequência de dígitos, separando cada par de dígitos por dois espaços. Por 
    exemplo, o inteiro 4562 deve aparecer como:
    
    4  5  6  2

    Incorpore os métodos em um aplicativo que insere um número inteiro e chama displayDigits passando para o método o 
    número inteiro inserido. Exiba os resultados.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int number;     //armazena o valor fornecido pelo usuário

        //instância um Scanner papra capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita uma entrada enquanto o usuário fornecer um valor válido
        do{
            //solicita ao usuário uma entrada
            System.out.print("informe um número entre 0 e 99999 (valor fora desse intervalo para sair): ");
            number = input.nextInt();

            //se o valor fornecido for inválido, termina o programa
            if(number < 0 || number > 99999){
                break;
            }

            //exibe o valor formatado ao usuário
            displayDigits(number);

        }while(number >= 0 || number <= 99999);
    }

    public static int integerPart(int numberA, int numberB) {
        int integerPart;

        integerPart = numberA / numberB;

        return integerPart;
    }

    public static int rest(int numberA, int numberB) {
        int decimalPart;

        decimalPart = numberA % numberB;

        return decimalPart;
    }

    public static void displayDigits(int number) {
        
        int dozenThousands;
        int thousands;
        int hundreds;
        int dozens;
        int units;
        int value = number;

        //calcula a casa das dezenas de milhares e atualiza o valor de value
        dozenThousands = integerPart(value, 10000);
        value = rest(value, 10000);

        //calcula a casa dos milhares e atualiza o valor de value
        thousands = integerPart(value, 1000);
        value = rest(value, 1000);

        //calcula a casa das centenas e atualiza o valor de value
        hundreds = integerPart(value, 100);
        value = rest(value, 100);

        //calcula a casa das dezenas e atualiza o valor de value
        dozens = integerPart(value, 10);
        value = rest(value, 10);

        //calcula a casa das unidades
        units = value;

        //exibe o resultado
        System.out.printf("%d  %d  %d  %d  %d%n", dozenThousands, thousands, hundreds, dozens, units);
    }


}