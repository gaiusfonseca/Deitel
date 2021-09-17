/* 
    4.21 processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um programa que 
    determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
    que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita 
    como entrada uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos 
    as três variáveis a seguir:

    a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos
    os 10 números foram processados).

    b) number: o inteiro mais recentemente inserido pelo usuário.

    c) largest: o maior número encontrado até agora.
*/

//importa o Scanner para que possamos capturar as entradas do usuaŕio
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        //declara e inicializa as variáveis
        int counter = 0;
        int number = 0;
        int largest = 0;
        
        //declara e inicializa um Scanner
        Scanner input = new Scanner(System.in);

        while(counter < 10){

            //solicita uma entrada do usuário
            System.out.print("Informe um inteiro: ");
            number = input.nextInt();

            //verifica se é necessário atualizar largest
            if(number > largest){
                largest = number;
            }

            counter++;
        }

        //imprime o maior número
        System.out.printf("o maior numero informado foi: %d%n", largest);
    }
}