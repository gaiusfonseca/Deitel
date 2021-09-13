/* 
    Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar uma 
    fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de 
    instância — o número (tipo String ), a descrição (tipo String ), a quantidade comprada de um item (tipo int ) e o 
    preço por item ( double ). Sua classe deve ter um construtor que inicializa as quatro variáveis de instância. 
    Forneça um método set e um get para cada variável de instância. Além disso, forneça um método chamado 
    getInvoiceAmount que calcula o valor de fatura (isto é, multiplica a quantidade pelo preço por item) e depois 
    retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por 
    item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que 
    demonstra as capacidades da classe Invoice.
*/

public class Invoice{

    private String number;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String number, String description, int quantity, double price){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getInvoiceAmount(){
        
        if(getQuantity() < 0){
            setQuantity(0);
        }

        if(getPrice() < 0){
            setPrice(0);
        }

        return getQuantity() * getPrice();
    }
}