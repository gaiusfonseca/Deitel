
/* 
    8.08 (Aprimorando a classe Date ) Modifique a classe Date da Figura 8.7 para realizar uma verificação de erros nos 
    valores inicializadores das variáveis de instância month, day e year (atualmente ela valida somente o mês e dia). 
    Forneça um método nextDay para incrementar o dia por um. Escreva um programa que testa o método nextDay em um loop 
    que imprime a data durante cada iteração para ilustrar que o método funciona corretamente. Teste os seguintes casos:
    a) incrementar para o próximo mês e
    b) incrementar para o próximo ano.
*/



public class App {

    public static void main(String[] args) {
        
        //inicializa a data como primeiro de fevereiro de um ano não bissexto
        Date date = new Date(1,2, 2021);
        
        //incrementa 28 dias para verificar a transição de mês
        iterate(date, 28);

        //altera a data para 31/12/2021
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2021);

        //incrementa um step para verificar a transição de ano
        iterate(date, 1);

        //altera a data para 28/02/2024
        date.setMonth(2);
        date.setDay(28);
        date.setYear(2024);

        //incrementa dois steps para verificar o caso especial do ano bissexto e a transição de mês
        iterate(date, 2);
    }

    public static void iterate(Date date, int steps) {
        
        //imprime o cabeçalho
        System.out.printf("%n%10s %10s %10s%n", "Step", "Antes", "Depois");

        for(int step = 1; step <= steps; step++){
            System.out.printf("%10d %10s ", step, date);
            date.nextDay();
            System.out.printf("%s%n", date);
        }
    }
}