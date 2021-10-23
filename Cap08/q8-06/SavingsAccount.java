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

public class SavingsAccount{

    //taxa de rendimento anual aplicada à poupança
    private static double annualInterestRate;
    
    //saldo da poupança
    private double savingsBalance;

    //constrói um novo objeto savingsAccount com base em um saldo de poupança
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    //recupera o saldo da poupança
    public double getSavingsBalance(){
        return savingsBalance;
    }

    //modifica o valor da poupança
    public void setSavingsBalance(double savingsBalance){
        
        //verifica se o valor fornecido é um valor válido
        if(savingsBalance < 0){
            throw new IllegalArgumentException("O saldo da poupança não pode ser inferior a zero.");
        }
        
        //atualiza o saldo da poupança
        this.savingsBalance = savingsBalance;
    }

    /**
     * Modifica a taxa de juros anual aplicável as poupanças
     * @param annualInterestRate A taxa de juros anual, em valores decimais
     */
    public static void modifyInterestRate(double annualInterestRate){

        //verifica se a taxa de juros é inferior a zero
        if(annualInterestRate < 0){
            throw new IllegalArgumentException("A taxa de juros anual não pode ser inferior a zero.");
        }

        //atualiza o valor da taxa de juros se for um valor válido
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    /**
     * Calcula o rendimento mensal
     * @return O valor do rendimento de um mês da aplicação
     */
    public double calculateMonthlyInterest(){
        return savingsBalance * annualInterestRate / 12;
    }
}