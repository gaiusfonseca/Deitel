
/*
    2.15 Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua
    soma, produto, diferença e quociente (divisão). Utiliza as técnicas mostradas na Figura 2.7.
*/

import java.util.Scanner;

public class Aritmetics{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Por favor, digite um número: ");
        num1 = entrada.nextInt();

        System.out.print("Por favor, digite outro número: ");
        num2 = entrada.nextInt();

        System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
        System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
        System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
        System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
    }
}