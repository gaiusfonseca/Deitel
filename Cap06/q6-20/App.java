/* 
    6.20 (Área de círculo) Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um método 
    chamado circleArea para calcular a área do círculo.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        double radius;      //armazena o raio fornecido pelo usuário

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita ao usuário uma entrada enquanto ele fornecer um valor positivo
        do{
            //solicita o valor do raio
            System.out.print("informe o valor do raio (valor negativo ou zero para sair): ");
            radius = input.nextDouble();

            //verifica se o usuário deseja sair
            if( radius <= 0){
                break;
            }

            //imprime o valor da área
            System.out.printf("raio = %.4f\t\tárea = %.4f%n", radius, circleArea(radius));
        }while(radius > 0);
    }

    public static double circleArea(double radius) {
        
        double area;

        area = Math.PI * Math.pow(radius, 2);

        return area;
    }
}