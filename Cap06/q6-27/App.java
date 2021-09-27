/* 
    6.27 (Máximo divisor comum) O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível por cada
    um dos dois números. Escreva um método mdc que retorna o máximo divisor comum de dois inteiros. [Dica: você poderia 
    querer utilizar o algoritmo de Euclides. Você pode encontrar informações sobre isso em 
    en.wikipedia.org/wiki/Euclidean_algorithm .] Incorpore o método a um aplicativo que lê dois valores do usuário e 
    exibe o resultado.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int numberA;        //armazena o valor informado pelo usuário
        int numberB;        //armazena o valor informado pelo usuário
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita ao usuário uma entrada
        do{
            System.out.print("informe um inteiro positivo: ");
            numberA = input.nextInt();
        }while(numberA <= 0);

        //solicita ao usuário uma entrada
        do{
            System.out.print("informe um inteiro positivo: ");
            numberB = input.nextInt();
        }while(numberB <= 0);

        //apresenta os números e o mdc
        System.out.printf("numberA = %d\tnumberB = %d\tmdc = %d%n", numberA, numberB, mdc(numberA, numberB));
    }

    public static int mdc(int numberA, int numberB) {
        
        int bigger = Math.max(numberA, numberB);        //o maior entre os dois números
        int smaller = Math.min(numberA, numberB);       //o menor entre os dois números
        int rest = bigger % smaller;                    //inicializa com o resto da divisão entre os dois número
        int mdc = rest;                                 //inicializa com o valor do resto
        
        //a cada iteração atualiza o valor do mdc e do resto
        while(rest > 0){
            mdc = rest;
            rest = smaller % rest;
        }

        return mdc;
    }
}