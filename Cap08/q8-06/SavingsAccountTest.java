/* 
    8.06 (Classe Savings Account ) Crie uma classe SavingsAccount . Utilize uma variável static annualInterestRate para 
    armazenar a taxa de juros anual para todos os correntistas. Cada objeto da classe contém uma variável de instância 
    private savingsBalance para indicar a quantidade que o poupador atualmente tem em depósito. Forneça o método 
    calculateMonthlyInterest para calcular os juros mensais multiplicando o savingsBalance por annualInterestRate 
    dividido por 12 — esses juros devem ser adicionados ao savingsBalance. Forneça um método static modifyInterestRate 
    que configure o annualInterestRate com um novo valor. Escreva um programa para testar a classe SavingsAccount. 
    Instancie dois objetos savingsAccount , saver1 e saver2 , com saldos de R$ 2.000,00 e R$ 3.000,00, respectivamente. 
    Configure annualInterestRate como 4% e então calcule o juro mensal de cada um dos 12 meses e imprima os novos saldos
    para os dois poupadores. Em seguida, configure annualInterestRate para 5%, calcule a taxa do próximo mês e imprima 
    os novos saldos para os dois poupadores.
*/

public class SavingsAccountTest{

    public static void main(String[] args) {
        
        //instância dois poupadores com saldos distintos
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        //define a taxa de juros anual com 4%
        SavingsAccount.modifyInterestRate(0.04);

        //exibe os saldos de cada um dos poupadores
        System.out.println("Poupador 1");
        displayBalance(saver1, 12);

        System.out.println("\nPoupador 2");
        displayBalance(saver2, 12);

        //atualiza a taxa de juros anual com 5%
        SavingsAccount.modifyInterestRate(0.05);

        //exibe o saldo de cada um dos poupadores para o próximo mês
        System.out.println("\nPoupador 1");
        displayBalance(saver1, 1);

        System.out.println("\nPoupador 2");
        displayBalance(saver2, 1);
    }

    /**
     * Exibe o saldo e rendimento atual de um poupador.
     * @param saver Um poupador.
     * @param periods O total de períodos para o qual se deseja calcular os juros.
     */
    public static void displayBalance(SavingsAccount saver, int periods) {
        
        //para cada um dos meses
        for(int month = 1; month <= periods; month++){

            //exibe o saldo autal e o rendimento mensal
            System.out.printf("saldo atual: %.2f rendimento mensal: %.2f ", 
                saver.getSavingsBalance(), saver.calculateMonthlyInterest());

            //atualiza o saldo do poupador
            saver.setSavingsBalance(saver.calculateMonthlyInterest() + saver.getSavingsBalance());

            //complementa a mensagem com o saldo após a apropriação dos juros
            System.out.printf("saldo corrigido: %.2f%n", saver.getSavingsBalance());
        }
    }
}