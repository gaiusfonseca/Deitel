/* 
    4.18 Desenvolva um aplicativo Java que determina se um cliente de uma loja de departamentos excedeu o limite de
    crédio em uma conta-correte. Para cada cliente, os seguintes dados estão disponíveis:

    a) Número da conta (int account)
    b) Saldo no início do mês (int invoice)
    c) Total de todos os itens cobrados desse cliente no mês (int debit)
    d) Total de créditos aplicados ao cliente no mês (int payment)
    e) Limite de crédito autorizado (int credit)

    O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (= saldo inicial + despesas - 
    créditos), exibir o novo saldo e detemerminar se o novo saldo excede ao limite de crédito do cliente. para aqueles
    cliente cujo limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".
*/

public class CustomerTest{

    public static void main(String[] args){

        //declara e instância um cliente com saldo positivo
        Customer aCustomer = new Customer(1, 100, 900, 500, 2000);

        //exibe a mensagem do saldo de acordo com a situação do cliente
        System.out.println(aCustomer.creditMessage());

        //modifica os dados do cliente para que o limite disponível seja 0
        aCustomer.setDebit(2400);

        //exibe a mensagem do saldo de acordo com a situação do cliente
        System.out.println(aCustomer.creditMessage());
        
        //modifica os dados do cliente para que o limite disponível seja negativo
        aCustomer.setDebit(3000);
        
        //exibe a mensagem do saldo de acordo com a situação do cliente
        System.out.println(aCustomer.creditMessage());
    }
}