
import java.util.Scanner;

public class AccountWithdrawTest {

    public static void main(String[] args){

        //declara e instância duas variáveis do tipo AccountWithdraw
        AccountWithdraw account1 = new AccountWithdraw("Gaius Fonseca", 1000);
        AccountWithdraw account2 = new AccountWithdraw("Livio Fonseca", 2000);

        //declara os valores de depósito e retirada
        double depositAmount;
        double withdrawAmount;

        //declara e instância um Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        //exibe o saldo de cada objeto
        System.out.printf("%s saldo: R$ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s saldo: R$ %.2f %n", account2.getName(), account2.getBalance());

        //solicita ao usuário que informe um valor de depósito para o account1
        System.out.print("informe o valor do depósito para o account1: ");
        depositAmount = entrada.nextDouble();

        //informa que está tentando adicionar o valor do depósito ao saldo da conta
        System.out.printf("Adicionando R$ %.2f ao saldo de account1. %n", depositAmount);

        //efetua o depósito
        account1.deposit(depositAmount);

        //exibe os saldos atualizados
        System.out.printf("%s saldo: R$ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s saldo: R$ %.2f %n", account2.getName(), account2.getBalance());

        //solicita ao usuário que informe um valor de depósito para o account2
        System.out.print("informe o valor do depósito para o account2: ");
        depositAmount = entrada.nextDouble();

        //informa que está tentando adicionar o valor do depósito ao saldo da conta
        System.out.printf("Adicionando R$ %.2f ao saldo de account2. %n", depositAmount);

        //efetua o depósito
        account2.deposit(depositAmount);
        
        //exibe o saldo de cada objeto
        System.out.printf("%s saldo: R$ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s saldo: R$ %.2f %n", account2.getName(), account2.getBalance());

        //solicita ao usuário que informe um valor de retirada para o account1
        System.out.print("informe o valor da retirada para o account1: ");
        withdrawAmount = entrada.nextDouble();

        //informa que está tentando retirar o valor da retirada do saldo da conta
        System.out.printf("Retirando R$ %.2f do saldo de account1. %n", withdrawAmount);

        //efetua a retirada
        account1.withdraw(withdrawAmount);

        //exibe o saldo de cada objeto
        System.out.printf("%s saldo: R$ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s saldo: R$ %.2f %n", account2.getName(), account2.getBalance());

        //solicita ao usuário que informe um valor de retirada para o account2
        System.out.print("informe o valor da retirada para o account2: ");
        withdrawAmount = entrada.nextDouble();

        //informa que está tentando retirar o valor da retirada do saldo da conta
        System.out.printf("Retirando R$ %.2f do saldo de account2. %n", withdrawAmount);

        //efetua a retirada
        account2.withdraw(withdrawAmount);

        //exibe o saldo de cada objeto
        System.out.printf("%s saldo: R$ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s saldo: R$ %.2f %n", account2.getName(), account2.getBalance());
    }
}