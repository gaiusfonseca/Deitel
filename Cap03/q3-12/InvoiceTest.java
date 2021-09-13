
//considerando que o autor deixa a nosso critério a construção da classe de teste, tentarei fazer de forma concisa e
//vou utilizar as caixas de diálogo swing ensinadas neste capítulo apenas para exercitar

import javax.swing.JOptionPane;

public class InvoiceTest{

    public static void main(String[] args){
        
        //cria as variáveis que irão armazenar as entradas do usuário
        String number;
        String description;
        int quantity;
        double price;
        String displayInvoiceMessage;

        //decalra uma fatura
        Invoice invoice;

        //captura as entradas do usuário
        number = JOptionPane.showInputDialog(null, "informe o valor da fatura: ");
        description = JOptionPane.showInputDialog(null, "informe a descrição da fatura: ");
        quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a quantidade desejada: "));  //converte o valor para int
        price = Double.parseDouble(JOptionPane.showInputDialog(null, "informe o preco do item: "));         //converte o valor para double

        //instância uma fatura
        invoice = new Invoice(number, description, quantity, price);

        //prepara a String que mostra os dados da fatura (poderia ser um método da Invoice)
        displayInvoiceMessage = String.format("ID Fatura: %s%nDescrição: %s%nQuantidade: %d%nPreco: R$ %.2f%nTotal: R$ %.2f",
            invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), invoice.getPrice(), invoice.getInvoiceAmount());

        //exibe os valores da fatura
        JOptionPane.showMessageDialog(null, displayInvoiceMessage);

        //solicita ao usuário que altere o preço e quantidade do item
        quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "altere a quantidade: "));  //converte o valor para int
        price = Double.parseDouble(JOptionPane.showInputDialog(null, "altere o preco: "));         //converte o valor para double

        //altera os valores da fatura
        invoice.setQuantity(quantity);
        invoice.setPrice(price);

        //prepara a String que mostra os dados da fatura (poderia ser um método da Invoice)
        displayInvoiceMessage = String.format("ID Fatura: %s%nDescrição: %s%nQuantidade: %d%nPreco: R$ %.2f%nTotal: R$ %.2f",
            invoice.getNumber(), invoice.getDescription(), invoice.getQuantity(), invoice.getPrice(), invoice.getInvoiceAmount());

        //exibe os novos valores da fatura
        JOptionPane.showMessageDialog(null, displayInvoiceMessage);
    }
}