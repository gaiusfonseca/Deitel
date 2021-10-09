/* 
    7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar um 
    objeto de classe Random, uma vez para lançar o primeiro dado e novamente para lançar o segundo dado. A soma dos dois
    valores deve então ser calculada. Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá 
    variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. A Figura 7.28 mostra as 36 
    possíveis combinações de dois dados. Seu aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array 
    unidimensional para contar o número de vezes que cada possível soma aparece. Exiba os resultados em formato tabular.
*/

import java.util.Random;

public class App{

    public static void main(String[] args) {
        
        int[] results = new int[13];        //declara um array que armazenará os resultados dos dados
        int total = 0;                      //inicializa o total (soma dos dados)

        //rola dois dadaos 36.000.000 de vezes e conta os resultados
        for(int i = 0; i < 36000000; i++){
            total = rollDice() + rollDice();
            results[total]++;
        }

        //exibe os resultados
        for(int i = 2; i <= 12; i++){
            System.out.printf("total de resultados %d: %d%n", i, results[i]);
        }
    }

    /**
     * Rola um dado de 6 faces
     * @return um inteiro representando o valor de uma das faces do dado de seis lados
     */
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}