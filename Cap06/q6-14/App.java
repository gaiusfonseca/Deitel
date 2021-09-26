/* 
    6.14 (Exponenciação) Escreva um método integerPower(base, exponent) que retorne o valor de base exponente. Por 
    exemplo, integerPower(3, 4) calcula 3^4 (ou 3 * 3 * 3 * 3 ). Suponha que exponent seja um inteiro não zero, 
    positivo, e base, um inteiro. Use uma instrução for ou while para controlar o cálculo. Não utilize métodos da classe 
    Math . Incorpore esse método a um aplicativo que lê os valores inteiros para base e exponent e realiza o cálculo com
    o método integerPower.
*/

public class App {

    public static void main(String[] args) {
        
        //imprime o cabeçalho da tabela
        System.out.println("valor\t\tquadrado");

        //demonstra integer power mostrando os quadrados dos números de 1 a 10
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d\t\t%d%n", i, integerPower(i, 2));
        }
    }

    public static int integerPower(int base, int exponent) {
        
        int result = 1;

        for(int i = 1; i <= exponent; i++){
            result *= base;
        }

        return result;
    }
}