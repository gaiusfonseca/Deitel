/* 
    2.31 Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que calcule os 
    quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir

    number      square      cube
    0           0           0
    1           1           1
    2           2           8
    3           9           27
    4           16          64
    5           25          125
    6           36          216
    7           49          343
    8           64          512
    9           81          729
    10          100         1000
*/

public class Table{

    public static void main(String[] args){

        int valor;        //declara uma variável int para armazenar o valor da linha atual

        //vamos começar imprimindo o cabeçalho da tabela
        System.out.println("numero\t\t\tquadrado\t\tcubo");       // \t representa um tab

        //fica mais simples imprimir os valores utilizando uma varíavel que atualizamos a cada linha
        valor = 0;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 1;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 2;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 3;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 4;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 5;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 6;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 7;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 8;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 9;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);

        valor = 10;
        System.out.printf("%d\t\t\t%d\t\t\t%d%n",valor, valor * valor, valor * valor * valor);
    }
}