/* 
6.8 Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. Um adicional de R$ 0,50 por
hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período de 
24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que 
calcule e exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as 
horas de estacionamento para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o 
total dos recibos de ontem. Ele deve utilizar o método calculateCharges para determinar a tarifa para cada cliente.
*/

import java.util.Scanner;

public class Parking{

    public static void main(String[] args) {
        
        double total = 0;
        double hours;

        Scanner input = new Scanner(System.in);

        do{
            //solicita ao usuário uam entrada
            System.out.print("informe o valor de horas utilizadas pelo cliente (valor negativo para encerrar): ");
            hours = input.nextDouble();

            //informa o valor a ser pago pelo cliente atual
            System.out.printf("tempo = %.2f\tvalor cobrado = %.2f%n", hours, calculateCharges(hours));

            //adiciona o valor do cliente atual a receita do dia
            total += calculateCharges(hours);
        }while(hours > 0);

        //após finalizar as entradas, informa a receita do dia
        System.out.printf("receita total = %.2f%n", total);

    }

    public static double calculateCharges(double hours){

        //define o valor mínimo
        double charge = 2;
        double extraTime;

        //calcula o total de horas excedentes
        if(hours - 3 > 0){
            extraTime = Math.ceil(hours -3);
        }else{
            extraTime = 0;
        }   

        /* sabendo que o valor máximo cobrado por um período de 24 horas é de R$ 10.00 , não faria sentido o cliente 
           permanecer um período de tempo menor e pagar mais do que se tivesse um período de 24 horas, sendo assim, 
           vamos identificar em que momento a conta atinge o valor de 10 reais:
           
           fatura = 2 + horas_excedentes * 0.5

           podemos notar que assumindo um valor de 16 horas excedentes o cliente pagaria 10 reais, então cobraremos 
           sempre 10 reais quando o total de horas excedentes for maior ou igual a 16 horas.                         */

        //se o cliente permaneceu 16 horas ou mais, cobra o valor máximo. Caso contrário, calcula o valor justo.
        if(extraTime >= 16){
            charge = 10;
        }else{
            charge = 2 + extraTime * 0.5;
        }

        return charge;
    }
}