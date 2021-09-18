/* 
    4.30 Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a 
    esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611.
    Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número 
    não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
*/

//importa o Scanner para capturar a entrada do usuário
import java.util.Scanner;

public class Palindromes{

    public static void main(String[] args){

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara um int para armazenar a entrada do usuário
        int number = 0;
        int originalNumber;

        //declara as variáveis que guardam as posicoes dos numeros
        int first;
        int second;
        int third;
        int fourth;
        int fifth;

        //enquanto o numero fornecido não tiver 5 dígitos, repete a pergunta
        while(number == 0){
            
            //solicita ao usuário que forneça um número
            System.out.print("informe um número de 5 digitos: ");
            number = input.nextInt();
            
            if(number / 100000 >= 1){       //verifica se o númeto tem 6 ou mais dígitos
                number = 0;                     //redefinimos number para que uma nova entrada seja solicitada
            }else if(number / 10000 >= 1){       //verifica se o número tem 5 dígitos
                //guarda uma cópia do número orignal para comparar ao inverter a ordem dos números
                originalNumber = number;

                //desmembra os números
                first = number / 10000;
                number %= 10000;
                
                second = number / 1000;
                number %= 1000;

                third = number / 100;
                number %= 100;

                fourth = number / 10;
                number %= 10;

                fifth = number;

                //inverte a ordem dos números
                number = fifth * 10000 + fourth * 1000 + third * 100 + second * 10 + first;

                //se o número for iguar ao número invertido, é um palíndromo
                if(originalNumber == number){
                    System.out.printf("%d == %d É um palíndromo%n", originalNumber, number);
                }else{
                    System.out.printf("%d != %d Não é um palíndromo%n", originalNumber, number);
                }
            }else{                          //se o número tem 4 ou menos dígitos
                number = 0;                     //redefinimos number para que uma nova entrada seja solicitada
            }
        }
    }
}