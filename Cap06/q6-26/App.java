/* 
    6.26 (Invertendo dígitos) Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos 
    invertidos. Por exemplo, dado o número 7.631, o método deve retornar 1.367. Incorpore o método a um aplicativo que 
    lê um valor a partir da entrada fornecida pelo usuário e exibe o resultado.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;

        do{
            //solicita uma entrada ao usuário
            System.out.print("informe um inteiro positivo para ser invertido: ");
            number = input.nextInt();
        }while(number < 0);

        //imprime o numero e mostra o número invertido
        System.out.printf("o inverso de %d é: %d%n", number, invert(number));
    }

    public static int invert(int number) {
        
        int inverted = 0;
        int magnitude = 1;
        int integerPart = number;
        int rest;
        int count = 0;

        //identificar a magnitude do número
        while(number / magnitude > 1){
            magnitude = magnitude * 10;
            
        }

        //tranformar o número de maior ordem no de menor ordem
        while(magnitude >= 1){

            //recebe o número sem o seu algarismo de maior ordem
            rest = integerPart % magnitude;
            //2345
            //345
            //45
            //5
            //0
            
            //seleciona o algarismo de maior ordem
            integerPart = integerPart / magnitude;
            //1
            //2
            //3
            //4
            //5

            //soma o algarismo de maior ordem ao valor inverted depois de ser convertido em um algarismo de ordem simétrica
            inverted = inverted + integerPart * (int) Math.pow(10, count++);
            //1
            //21
            //321
            //4321
            //54321

            //reconfigura integer part para a próxima iteração
            integerPart = rest;
            //2345
            //345
            //45
            //5
            //0

            //decrementa a magnitude em uma ordem
            if(rest == 0){
                magnitude = 0;
            }else{
                magnitude /= 10;
                //1000
                //100
                //10
                //1
            }
        }

        return inverted;
    }
}