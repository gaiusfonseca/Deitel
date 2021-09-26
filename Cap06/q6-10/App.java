/* 
    6.10 (Arredondando números) Para arredondar números em casas decimais específicas, utilize uma instrução como:

    y = Math.floor(x * 10 + 0.5 ) / 10 ;

    que arredonda x para a casa decimal (isto é, a primeira posição à direita do ponto de fração decimal), ou:

    y = Math.floor(x * 100 + 0.5 ) / 100;

    que arredonda x para a casa centesimal (isto é, a segunda posição à direita do ponto de fração decimal). Escreva um 
    aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:

    a) roundToInteger(number)
    b) roundToTenths(number)
    c) roundToHundredths(number)
    d) roundToThousandths(number)

    Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado para o inteiro mais 
    próximo, o número arredondado para o décimo mais próximo, o número arredondado para o centésimo mais próximo e o 
    número arredondado para o milésimo mais próximo.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        double x;   //armazena o valor informado pelo usuário

        //instância um Scanner para capturar o valor informado pelo usuário
        Scanner input = new Scanner(System.in);

        //enquanto o usuário fornecer um valor positivo, solicita uma nova entrada e exibe os resultados
        do{
            //solicita ao usuário uma entrada
            System.out.print("informe um valor positivo com casas decimais (valor negativo para sair): ");
            x = input.nextDouble();
            
            //se for um valor positivo, exibe os resultados
            if(x >= 0){
                roundToInteger(x);
                roundToTenths(x);
                roundToHudredths(x);
                roundToThousandths(x);
            }
        }while(x >= 0);
    }

    public static void roundToInteger(double value) {
        
        int intValue;

        intValue = (int) Math.floor(value + 0.5);
        
        System.out.printf("valor original = %f\tvalor arredondado para inteiro = %d%n", value, intValue);
    }

    public static void roundToTenths(double value){

        double roundedToTenths;

        roundedToTenths = Math.floor(value * 10 + 0.5) / 10;

        System.out.printf("valor original = %f\tvalor arredondado para décimos = %f%n", value, roundedToTenths);
    }

    public static void roundToHudredths(double value){

        double roundedToHudredths;

        roundedToHudredths = Math.floor(value * 100 + 0.5) / 100;

        System.out.printf("valor original = %f\tvalor arredondado para centésimos = %f%n", value, roundedToHudredths);
    }

    public static void roundToThousandths(double value){

        double roundedToThousandths;

        roundedToThousandths = Math.floor(value * 1000 + 0.5) / 1000;

        System.out.printf("valor original = %f\tvalor arredondado para milésimos = %f%n", value, roundedToThousandths);
    }
}