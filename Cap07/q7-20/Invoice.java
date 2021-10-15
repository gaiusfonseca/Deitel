
import java.util.Random;

public class Invoice {
    
    private int seller;
    private int product;
    private int sales;

    private Random random = new Random();

    public Invoice(int seller, int product){
        this.seller = seller;
        this.product = product;
        this.sales = (random.nextInt(10) + 1) * 25;
    }

    public int getSeller(){
        return this.seller;
    }

    public int getProduct(){
        return this.product;
    }

    public int getSales(){
        return this.sales;
    }

    @Override
    public String toString(){
        return String.format("Seller: %d, Product: %d, Sales: %d", this.seller, this.product, this.sales);
    }
}
