/* 
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
    a) Leia a declaração do problema.
    b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
    c) Escreva um programa Java.
    d) Teste, depure e execute o programa Java.
    e) Processe três conjuntos completos de dados.

    4.17 Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou várias viagens 
    registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio. 
    Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos 
    (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada 
    viagem e imprimir a quilometragem total e a soma total de litros de combustível consumidos até esse ponto para todas as 
    viagens. Todos os cálculos de média devem produzir resultados de ponto flutuante. Utilize classe Scanner e repetição 
    controlada por sentinela para obter os dados do usuário.

    c)
*/

import java.util.Scanner;

public class Efficiency{

    public static void main(String[] args){

        //declara as variáveis acumuladoras
        double countDistance = 0;
        double countConsumption = 0;

        //declara as variaǘeis que capturam as entradas do usuário
        double distance;
        double consumption;
        char option;

        //declara a variável calculada
        double efficiency = 0;

        //decalra o Scanner para capturar as entradas do usuário
        Scanner input = new Scanner(System.in);

        //pergunta se o usuádio deseja registrar uma nova viagem
        System.out.println("deseja registrar uma nova viagem? (S/N)");
        option = input.next().charAt(0);

        //enquanto o usuário não inserir a sentinela, continua capturando dados
        while(option != 'N'){
            
            //solicita que o usuário informe a quilometragem
            System.out.printf("quantos quilometros foram percorridos na ultima viagem? ");
            distance = input.nextDouble();

            //solicita que o usuário informe o consumo
            System.out.printf("quantos litros foram consumidos na ultima viagem? ");
            consumption = input.nextDouble();

            //registra o rendimento da ultima viagem
            efficiency = distance / consumption;

            //incrementa os acumuladores
            countDistance += distance;
            countConsumption += consumption;

            //pergunta se o usuário deseja registrar uma nova viagem
            System.out.println("deseja registrar uma nova viagem? (S/N)");
            option = input.next().charAt(0);
        }

        //imprime o rendimento da ultima viagem
        System.out.printf("o rendimento da ultima viagem foi de %.2f km/l%n", efficiency);
        
        //imprime a distância percorrida total
        System.out.printf("você percorreu: %.2f km%n", countDistance);                          

        //imprime o consumo total
        System.out.printf("para percorrer essa distância você consumiu: %.2f l%n", countConsumption);
    }
}