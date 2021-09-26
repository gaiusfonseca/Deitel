/* 
    6.17 (Par ou ímpar) Escreva um método isEven que utiliza o operador de resto ( % ) para determinar se um inteiro é 
    par. O método deve levar um argumento inteiro e retornar true se o número inteiro for par, e false, caso contrário.
    Incorpore esse método a um aplicativo que insere uma sequência de inteiros (um por vez) e determina se cada um é par
    ou ímpar.
*/

public class App{

    public static void main(String[] args) {
        
        //imprime o cabeçalho da tabela
        System.out.println("Number\t\tIs Even?");
        
        //produz uma série de valores e testa quais deles são pares
        for(int number = 1; number <= 10; number++){
            System.out.printf("%d\t\t%b%n", number, isEven(number));
        }
    }

    public static boolean isEven(int number) {
        boolean isEven;
 
        isEven = number % 2 == 0;

        return isEven;
    }

}

