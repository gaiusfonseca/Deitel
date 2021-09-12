/* 
    2.30 Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário, separe o número 
    em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
    digitar o número 42339, o programa deve imprimir: 4   2   3   3   9

    Suponha que o usuário insria o número correto de dígitos. O que acontece quando você insere um número com mais de 
    cinco dígitos?

        Ao inserir um número com mais de 5 dígitos os primeiros dígitos são agrupados no primeiro printf.

    O que acontece quando você insere um número com menos de cinco dígitos?

        Ao inserir um número com menos de 5 dígitos os primeiros dígitos recebem zeros para preencher as posicões
        que faltam.

    Dica: é possível fazer este exercício com as técnicas que aprendeu neste capítulo. Você precisará tanto das 
    operações de divisão com das de resto para "selecionar" cada dígito.
*/

import java.util.Scanner;

public class Separator{

    public static void main(String[] args){

        int numero;     //declara a variável que armazenará o número informado

        //declarando e instânciando um Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        //captura a entrada do usuário
        System.out.print("Digite um número de cinco dígitos: ");
        numero = entrada.nextInt();

        //o primeiro dígito está na casa da dezena de milhar, para achá-lo basta dividir por 10.000
        System.out.printf("%d   ", numero / 10000);

        numero = numero % 10000;                        //atualiza o numero despresando o primeiro dígito
        System.out.printf("%d   ", numero / 1000);      //imprime o segundo caractere

        numero = numero % 1000;                         //atualiza o numero despresando o segundo dígito
        System.out.printf("%d   ", numero / 100);       //imprime o terceiro caractere

        numero = numero % 100;                          //atualiza o numero desprezando o terceiro dígito
        System.out.printf("%d   ", numero / 10);        //imprime o quarto caractere

        numero = numero % 10;                           //atualiza o numero desprezando o quarto dígito
        System.out.printf("%d%n", numero);              //imprime o quinto caractere
    }
}