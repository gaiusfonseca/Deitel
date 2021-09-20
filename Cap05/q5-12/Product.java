/* 
    5.12 Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.
*/

public class Product{

    public static void main(String[] args) {
        
        //inicializa produto com o valor 1
        int product = 1;

        //atualiza o valor de produto a cada iteração
        for(int i = 1; i <=15; i++){
            product *= i;
        }

        //mostra o resultado do produto
        System.out.printf("o produto dos nnúmeros de 1 a 15 é: %d%n", product;
    }
}