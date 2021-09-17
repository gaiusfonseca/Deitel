/* 
    Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:

    N       N*10    N*100   N*1000
    1       10      100     1000
    2       20      200     2000
    3       30      300     3000
    4       40      400     4000
    5       50      500     5000

*/

public class App{

    public static void main(String[] args) {

        int count = 1;

        //imprime o cabeçalho
        System.out.println("N\tN*10\tN*100\tN*1000");

        //executa um loop para imprimir o corpo da tabela e utiliza count para gerar os valores
        while(count < 6){
            System.out.printf("%d\t%d\t%d\t%d%n", count, count * 10, count * 100, count * 1000);
            count++;
        }
    }
}