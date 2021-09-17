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

public class Customer {

    private int account;
    private int invoice;
    private int debit;
    private int payment;
    private int credit;

    public Customer(int account, int invoice, int debit, int payment, int credit){
        this.account = account;
        this.invoice = invoice;
        this.debit = debit;
        this.payment = payment;
        this.credit = credit;
    }

    public int getAccount(){
        return account;
    }

    public void setAccount(int account){
        this.account = account;
    }

    public int getInvoice(){
        return invoice;
    }

    public void setInvoice(int invoice){
        this.invoice = invoice;
    }

    public int getDebit(){
        return debit;
    }

    public void setDebit(int debit){
        this.debit = debit;
    }

    public int getPayment(){
        return payment;
    }

    public void setPayment(int payment){
        this.payment = payment;
    }

    public int getCredit(){
        return credit;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public int getCreditBalance(){
        return invoice + debit - payment;
    }

    public boolean isCreditExceeded(){
        if(getCreditBalance() >= getCredit()){
            return true;
        }else{
            return false;
        }
    }

    public String creditMessage(){

        if(isCreditExceeded()){
            return "limite indisponível";
        }else{
            return "limite disponível";
        }
    }
}