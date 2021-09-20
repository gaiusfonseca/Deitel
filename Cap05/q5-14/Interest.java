/* 
    5.14 Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%, 
    7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.

        Somos solicitados a repetir os passos alterando apenas a taxa de juros, em incrementos de 1%, de 5% a 10%.
        A maneira simples de realizar essa tarefa é jogar o loop que calcula o valor futuro dentro de outro que altera a
        taxa de juros com base na sua variável de controle.
*/

public class Interest {
    public static void main(String[] args) {
        
        double amount;                  //armazena o valor futuro
        double principal = 1000.0;      //armazena o montante inicial
        double rate;                    //armaena a taxa de juros

        
        //incrementa a taxa de juros em 1% a cada iteração
        for(int j = 5; j <= 10; j++){
            
            //atualiza o valor de rate
            rate = (double) j / 100;

            //imprime os cabeçalhos
            System.out.printf("%4s   %20s   Taxa%n", "Ano", "Valor Futuro");

            //calcula o valor futuro com base no número de períodos, que é incrementado a cada iteração
            for(int year = 1; year <= 10; ++year){
    
                //calcula o valor futuro
                amount = principal * Math.pow(1.0 + rate, year);
    
                //exibe os valores futuros em formato de tabela
                System.out.printf("%4d   %,20.2f   %.2f%n", year, amount, rate);
            }

            //insere linhas vazias para melhorar a legibilidade
            System.out.println();
            System.out.println();
        }

    }
}
