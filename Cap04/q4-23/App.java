/* 
    4.23 Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois maiores valores
    entre os 10 valores inseridos. [Observação: você só pode inserir cada número uma vez.]

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

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        
        
        int counter = 0;    //declara e inicializa counter para fazer o controle do loop
        int number = 0;     //declara number para capturar a entrada mais recente do usuário
        int big1 = 0;       //o mairo número
        int big2 = 0;       //o segundo maior número

        Scanner input = new Scanner(System.in);     //instância um Scanner para capturar a entrada do usuário

        //executa enquanto não tiver recebido 10 entradas
        while(counter < 10){

            //solicita ao usuário que insira um valor
            System.out.print("informe um numero: ");
            number = input.nextInt();

            //verifica se o numero atual é maior que number
            if(number > big1){      //no caso de os numeros serem inseridos em ordem crescente
                big2 = big1;        //big2 recebe o antigo maior número
                big1 = number;      //atualiza big1 com o novo maior número
            }else if(number > big2){//para o caso de serem inseridos em ordem decrescente
                big2 = number;
            }

            counter++;              //incrementa o contador
        }

        System.out.printf("maior 1: %d%nmaior 2: %d%n", big1, big2);
    }
}