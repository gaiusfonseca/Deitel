/* 
    6.32 (Distância entre pontos) Escreva um método distance para calcular a distância entre dois pontos (x1, y1) e 
    (x2, y2). Todos os números e valores de retorno devem ser do tipo double. Incorpore esse método a um aplicativo que 
    permite que o usuário insira as coordenadas de pontos.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        //declara as variáveis que armazenam as coordenadas
        double x1;
        double x2;
        double y1;
        double y2;

        //instância um Scanner para capturar as entradas do usuário
        Scanner input = new Scanner(System.in);

        //solicita um conjunto de entradas ao usuário
        System.out.print("informe a coordenada x do ponto 1: ");
        x1 = input.nextDouble();

        System.out.print("informe a coordenada y do ponto 1: ");
        y1 = input.nextDouble();

        System.out.print("informe a coordenada x do ponto 2: ");
        x2 = input.nextDouble();

        System.out.print("informe a coordenada y do ponto 2: ");
        y2 = input.nextDouble();

        //exibe a saída ao usuário
        System.out.printf("a distancia entre p1(%.2f, %.2f) e p2(%.2f, %.2f) = %.2f%n", 
            x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        
        return Math.hypot(x2 - x1, y2 - y1);
    }
}