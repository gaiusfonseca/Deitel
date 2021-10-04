/* 
    7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula o produto de uma série de 
    inteiros que são passados para método product utilizando uma lista de argumentos de comprimento variável. Teste seu 
    método com várias chamadas, cada uma com um número diferente de argumentos.
*/

import java.security.SecureRandom;

public class App{

    public static void main(String[] args) {
        
        //testa 5x
        for(int test = 1; test <= 5; test++){
            
            //recebe um array de tamanho e valores aleatórios
            int[] numbers = generateArray();
    
            for(int i = 0; i < numbers.length; i++){
                if(i != numbers.length - 1){
                    System.out.printf("%d * ", numbers[i]);
                }else{
                    System.out.printf("%d = ", numbers[i]);
                }
            }
    
            System.out.printf("%d%n", product(numbers));
        }

    }

    /**
     * Recebe uma lista de valores inteiros e retorna o seu produto.
     * @param numbers Uma lista de valores inteiros.
     * @return O produto dos valores da lista.
     */
    public static int product(int... numbers) {
        
        //product é inicializado com o valor neutro da multiplicação
        int product = 1;

        //multiplica por product por cada valor do array
        for(int value : numbers){
            product *= value;
        }

        //retorna product
        return product;
    }

    /**
     * Gera um arratey de tamanho aleatório (até 5 elementos), com valores aleatórios no intervalo de 1 a 5.
     * @return  Retorna um array de inteiros gerado aleatóriamente.
     */
    public static int[] generateArray() {
 
        //instância um gerador de números aleatórios
        SecureRandom random = new SecureRandom();

        //gera um array de tamanho aleatório até 10 elementos
        int[] values = new int[random.nextInt(5) + 1];

        //atribui valores aleatórios entre 1 e 20 para cada elemento do array
        for(int i = 0; i < values.length; i++){
            values[i] = random.nextInt(5) + 1;
        }

        //retona o array gerado aleatoriamente
        return values;
    }
}