/* 
    6.23 (Localize o mínimo) Escreva um método minimum3 que retorna o menor dos três números de ponto flutuante. Utilize 
    o método Math.min para implementar minimum3. Incorpore o método a um aplicativo que lê três valores do usuário, 
    determina o menor valor e exibe o resultado.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        double numberA = 0;
        double numberB = 0;
        double numberC = 0;
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita ao usuário 3 entradas
        for(int i = 1; i <= 3; i++){

            switch(i){
                case 1:
                    //solicita uma entrada ao usuário e armazena o valor em number A
                    System.out.print("informe um valor: ");
                    numberA = input.nextDouble();
                    break;
                case 2:
                    //solicita uma entrada ao usuário e armazena o valor em number B
                    System.out.print("informe um valor: ");
                    numberB = input.nextDouble();
                    break;
                case 3:
                    //solicita uma entrada ao usuário e armazena o valor em number C
                    System.out.print("informe um valor: ");
                    numberC = input.nextDouble();
            }
        }

        //exibe o menor valor ao usuário
        System.out.printf("o menor valor é: %.2f%n", minimum3(numberA, numberB, numberC));
    }

    public static double minimum3(double numberA, double numberB, double numberC) {
        return Math.min(numberA, Math.min(numberB, numberC));
    }
}
