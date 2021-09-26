/* 
    6.16 (Múltiplos) Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for um múltiplo 
    do primeiro. O método deve aceitar dois argumentos inteiros e retornar true se o segundo for um múltiplo do primeiro
    e false caso contrário. [Dica: utilize o operador de módulo.] Incorpore esse método a um aplicativo que insere uma 
    série de pares inteiros (um par por vez) e determina se o segundo valor em cada par é um múltiplo do primeiro.
*/

public class App{

    public static void main(String[] args) {
        
        //imprime o cabeçalho da tabela
        System.out.println("numberA\t\tnumberB\t\tIs Multiple?");

        //produz os valores da tabela
        for(int numberA = 1; numberA <= 10; numberA++){

            for(int numberB = 1; numberB <= 10; numberB++){
                System.out.printf("%d\t\t%d\t\t%b%n", numberA, numberB, isMultiple(numberA, numberB));
            }
        }
    }

    public static boolean isMultiple(int numberA, int numberB) {
        
        boolean isMultiple;

        isMultiple = numberB % numberA == 0;

        return isMultiple;
    }

}