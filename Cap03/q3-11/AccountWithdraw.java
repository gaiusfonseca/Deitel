/* 
    3.11 Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira dinheiro de uma 
    Account. Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o saldo deve ser deixado 
    inalterado e o método deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance". Modifique 
    a classe AccountTest (Figura 3.9) para testar o método withdraw.
*/

public class AccountWithdraw {
    
    private String name;
    private double balance;

    public AccountWithdraw(String name, double balance){
        this.name = name;
        
        if(balance > 0){
            this.balance = balance;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double depositAmount){
        
        if(depositAmount > 0){
            balance = balance + depositAmount;
        }
    }

    //como ainda não foi ensinado o bloco esle, optei por escrever desta forma.
    public void withdraw(double withdrawAmount){

        if(withdrawAmount > 0){                     //verifica se o valor da retirada é maior que 0
            if(balance - withdrawAmount < 0){       //verifica se o saldo após a retirada é negativo
                System.out.printf("O valor da retirada excede o seu saldo. Nao foi possivel realizar a operacao.");
            }
        }

        if(withdrawAmount > 0){
            balance = balance - withdrawAmount;     //atualiza o saldo
        }
    }
}
