/* 
    6.28 Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 se 80 a 89, 2 se 
    70 a 79, 1 se 60 a 69 e 0 se menor que 60. Incorpore o método a um aplicativo que lê um valor a partir do usuário e 
    exibe o resultado.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        int average;        //armazena a média informada pelo usuuário

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //solicita ao usuário uma entrada
        do{
            System.out.print("informe a média: ");
            average = input.nextInt();
        }while(average < 0);

        System.out.printf("media = %d\tpontos = %d%n", average, qualityPoints(average));
    }

    public static int qualityPoints(int average) {
        
        int quality;

        switch(average / 10){
            case 9:
            case 10:
                quality = 4;
                break;
            case 8:
                quality = 3;
                break;
            case 7:
                quality = 2;
                break;
            case 6:
                quality = 1;
                break;
            default:
                quality = 0;
        }

        return quality;
    }
}