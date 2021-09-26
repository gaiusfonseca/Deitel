/* 
    6.15 (Cálculos de hipotenusa) Defina um método hypotenuse que calcula a hipotenusa de um triângulo retângulo quando 
    são dados os comprimentos dos outros dois lados. O método deve tomar dois argumentos do tipo double e retornar a 
    hipotenusa como um double. Incorpore esse método a um aplicativo que lê valores para side1 e side2 e realiza o 
    cálculo com o método hypotenuse. Utilize os métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada 
    um dos triângulos na Figura 6.15. [Observação: a classe Math também fornece o método hypot para realizar esse 
    cálculo.]

    triângulo       lado 1      lado 2
    1               3.0         4.0
    2               5.0         12.0
    3               8.0         15.0
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        double side1;        //armazena a entrada do usuário para side1
        double side2;        //armazena a entrada do usuário para side2

        //instânciaum Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita ao usuário uma entrada enquanto não fornecer um valor negativo ou zero
        do{
            //solicita o valor de side1 ao usuário
            System.out.print("informe o valor do primeiro lado (valores negativos para sair): ");
            side1 = input.nextDouble();

            //se o usuuário forneceu um valor negativo, encerra o programa
            if(side1 < 0){
                break;
            }

            //solicita o valor de side2 ao usuário
            System.out.print("informe o valor do primeiro lado (valores negativos para sair): ");
            side2 = input.nextDouble();

            //se o usuário forneceu um valor negativo, encerra o programa
            if(side2 < 0){
                break;
            }

            //calcula a hipotenusa e exibe o valor ao usuário
            System.out.printf("lado1 = %.2f\tlado2 = %.2f\thipotenusa = %.2f%n", side1, side2, hypotenuse(side1, side2));
        }while(side1 > 0 && side2 > 0);
    }

    public static double hypotenuse(double side1, double side2) {
        
        double hypotenuse;

        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        /* 
        Alternativamente se poderia substituir o corpo inteiro desse método por:
        return hypot(side1, side2);
        */

        return hypotenuse;
    }
}