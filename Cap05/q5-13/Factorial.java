/* 
    5.13 Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito 
    como n! e pronunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um 
    aplicativo que calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que 
    dificuldade poderia impedir você de calcular o fatorial de 100?
*/

public class Factorial{

    public static void main(String[] args) {
        
        long factorial = 1;

        //imprime o cabeçalho da tabela
        System.out.printf("%5s   %25s%n", "n", "fatorial");

        for(int i = 1; i <= 20; i++){
            System.out.printf("%5d! = ", i);
            factorial *= i;
            System.out.printf("%25d%n", factorial);
        }
    }
}