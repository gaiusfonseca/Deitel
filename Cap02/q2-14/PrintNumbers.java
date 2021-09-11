/*
    2.14 Escreva um aplicativo que exiba os números de 1 a 4 na mesma linha, com cada par de adjacentes separados por um
    espaço. Use as seguintes técnicas:

    a) Uma instrução System.out.println.
    b) Quatro instruções System.out.print.
    c) Uma instrução System.out.printf.

*/

public class PrintNumbers{

    public static void main(String[] args){
       
        System.out.println("imprimindo com o método println");
        System.out.println("1 2 3 4");

        System.out.println("imprimindo com 4 métodos print");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 \n");

        System.out.println("imprimindo com o método printf");
        System.out.printf("%d %d %d %d %n", 1, 2, 3, 4);
    }
}