
/*
    2.17 Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
    números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. 
    Observação: o cálculo da média neste exercício deve resultar em uma representação de inteiro. Assim, se a soma dos 
    valores for 7, a média deverá ser 2, não 2,333...
*/

import java.util.Scanner;

public class MoreAritmetics{

    public static void main(String[]args){

        //declarando e instanciando um Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        //declarando as variáveis que vão receber as entradas do usuário
        int num1;
        int num2;
        int num3;

        //solicitando e capturando a primeira entrada
        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextInt();

        //solicitando e capturando a segunda entrada
        System.out.print("Digite o segundo numero: ");
        num2 = entrada.nextInt();

        //solicitando e capturando a terceira entrada
        System.out.print("Digite o terceiro numero: ");
        num3 = entrada.nextInt();

        //exibe a soma
        System.out.printf("a soma dos valores digitados e: %d%n", num1 + num2 + num3);

        //exibe a média (de inteiros)
        System.out.printf("a media (de inteiros) dos valores digitados e: %d%n", (num1 + num2 + num3) / 3);

        //exibe o produto
        System.out.printf("o produto dos valores digitados e: %d%n", num1 * num2 * num3);

        //exibe os menores
        /*
            É possível escrever isso de forma mais eficiente, mas vamos nos limitar ao foi mostrado no livro.
            O entendimento aqui é de que o autor menciona "os menores" e não foi mostrado no livro algumas técncias
            como escada if-else-if, operadores lógicos, variáveis booleanas, estrutura switch e, ele ainda referencia a
            Figura 2.15, entendemos que a comparação deve ser feita para cada par, para todas as possíveis combinações e
            seu resultado deve ser impresso no console.
        */

        //verifica se num1 é menor que os outros dois números
        if(num1 < num2){
            System.out.printf("%d e menor que %d%n", num1, num2);
        }

        if(num1 < num3){
            System.out.printf("%d e menor que %d%n", num1, num3);
        }

        //verifica se num2 é menor que os outros dois números
        if(num2 < num1){
            System.out.printf("%d e menor que %d%n", num2, num1);
        }

        if(num2 < num3){
            System.out.printf("%d e menor que %d%n", num2, num3);
        }

        //verifica se num3 é menor que os outros dois números
        if(num3 < num1){
            System.out.printf("%d e menor que %d%n", num3, num1);
        }

        if(num3 < num2){
            System.out.printf("%d e menor que %d%n", num3, num2);
        }

        //exibe o maior

        //verifica se num1 é maior que os outros dois números
        if(num1 > num2){
            System.out.printf("%d e maior que %d%n", num1, num2);
        }

        if(num1 > num3){
            System.out.printf("%d e maior que %d%n", num1, num3);
        }

        //verifica se num2 é maior que os outros dois números
        if(num2 > num1){
            System.out.printf("%d e maior que %d%n", num2, num1);
        }

        if(num2 > num3){
            System.out.printf("%d e maior que %d%n", num2, num3);
        }

        //verifica se num3 é maior que os outros dois números
        if(num3 > num1){
            System.out.printf("%d e maior que %d%n", num3, num1);
        }

        if(num3 > num2){
            System.out.printf("%d e maior que %d%n", num3, num2);
        }
    }
}