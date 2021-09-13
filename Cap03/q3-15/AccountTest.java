/* 
    Na classe AccountTest da Figura 3.9, o método main contém seis instruções (linhas 13 e 14, 15 e 16, 28 e 29, 30 e 
    31, 40 e 41 e 42 e 43) e cada uma exibe name e balance do objeto Account. Estude essas instruções e você perceberá 
    que elas só diferem no objeto Account sendo manipulado — account1 ou account2. Neste exercício, você definirá um 
    novo método displayAccount que contém uma cópia dessa instrução de saída. O parâmetro do método será um objeto 
    Account e o método irá gerar name e balance dele. Então você substituirá as seis instruções duplicadas em main por 
    chamadas para displayAccount passando como argumento o objeto específico Account para saída.

    Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte método displayAccount após a chave direita de 
    fechamento de main e antes da chave direita de fechamento da classe AccountTest.

    Substitua o comentário no corpo do método por uma instrução que exiba name e balance de accountToDisplay.

    Lembre-se de que main é um método static , assim pode ser chamado sem antes criar um objeto da classe em que é 
    declarado. Também declaramos o método displayAccount como um método static. Quando main tem de chamar outro método
    na mesma classe sem antes criar um objeto dela, o outro método também deve ser declarado static.

    Depois de concluir a declaração de displayAccount , modifique main para substituir as instruções que exibem name e 
    balance de cada Account pelas chamadas para displayAccount — cada uma recebendo como seu argumento o objeto account1 
    ou account2, como apropriado. Então, teste a classe AccountTest atualizada para garantir que ela produz a mesma 
    saída como mostrado na Figura 3.9.
*/

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args){

        //declara e instância duas variáveis do tipo AccountWithdraw
        Account account1 = new Account("Gaius Fonseca", 1000);
        Account account2 = new Account("Livio Fonseca", 2000);

        //declara a varaivel para armazenar o valor do deposito
        double depositAmount;

        //declara e instância um Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        //exibe o saldo inicial de cada objeto
        displayAccount(account1);
        displayAccount(account2);

        //solicita ao usuário que informe um valor de depósito para o account1
        System.out.print("informe o valor do depósito para o account1: ");
        depositAmount = entrada.nextDouble();

        //informa que está tentando adicionar o valor do depósito ao saldo da conta
        System.out.printf("Adicionando R$ %.2f ao saldo de account1. %n", depositAmount);

        //efetua o depósito
        account1.deposit(depositAmount);

        //exibe os saldos atualizados
        displayAccount(account1);
        displayAccount(account2);

        //solicita ao usuário que informe um valor de depósito para o account2
        System.out.print("informe o valor do depósito para o account2: ");
        depositAmount = entrada.nextDouble();

        //informa que está tentando adicionar o valor do depósito ao saldo da conta
        System.out.printf("Adicionando R$ %.2f ao saldo de account2. %n", depositAmount);

        //efetua o depósito
        account2.deposit(depositAmount);
        
        //exibe o saldo de cada objeto
        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s saldo: R$ %.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}