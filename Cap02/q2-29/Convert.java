/* 
    2.29 Eis outra prévia do que virá adiante. Neste capitulo, você aprendeu sobre inteiros e o tipo int. O Java também
    pode representar letras maiúsculas, minúsculas e uma variedade considerável de símbolos especiais. Cada caractere 
    tem uma representação correspondente de inteiro. O conjunto de caracteres que um computador utiliza com as 
    respectivas representações na forma de inteiro desses caracteres é chamado de conjunto de caracteres dese 
    computador. Você pode indicar um valor de caractere em um programa simplesmente incluindo esse caractrere entre 
    aspas simples, como em 'A'.

    Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em (int) 'A'

    Um operador dessa forma é chamado operador de coerção. (você aprenderá sobre os operadores de coerção no Capitulo 4)
    A instrução a seguir gera uma saída de um caractere e seu equivalente de inteiro:

    System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));

    Quando a instrução precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode) como
    parte da string. O especificador de formato %c é um espaço reservado para um caractere (nesse caso, 'A').

    Utilizando  instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo que exiba os
    equivalentes inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes
    inteiros do seguinte: A B C a b c 0 1 2 * + / e o caractere em branco.
*/

public class Convert{

    public static void main(String[] args){

        //delcarando uma variável do tipo char para armazenar os valores.
        char c;

        //atualizando o valor de c
        c = 'A';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = 'B';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = 'C';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = 'a';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = 'b';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = 'c';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '0';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '1';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '2';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '*';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '+';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = '/';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));

        c = ' ';
        System.out.printf("O caracter %c tem o valor de %d%n", c, ((int) c));
    }
}