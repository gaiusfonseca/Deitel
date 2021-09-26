/* 
    6.25 (Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 
    2, 3, 5 e 7 são primos, mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
    
    a) Escreva um método que determina se um número é primo.

    b) Utilize esse método em um aplicativo que determina e exibe todos os números primos menores que 10.000. Quantos 
    números até 10.000 você precisa testar a fim de assegurar que encontrou todos os primos?
*/

public class App{

    public static void main(String[] args) {
        
        int count = 0;

        //exibe os números primos de 2 a 10.000
        for(int number = 1; number <= 10000; number++){

            //se for primo, imprime o número
            if(isPrimeNumber(number)){
                
                //verifica se é o décimo número primo que encontramos
                if(++count % 10 == 0){
                    System.out.printf("%d%n", number);      //se for, imprime o número e pula uma linha
                }else{
                    System.out.printf("%d ", number);       //se não for, imprime o número e da um espaço
                }
            }
        }

        //marca o fim do programa
        System.out.printf("%nforam encontrados %d numeros primos.%n", count);
    }

    public static boolean isPrimeNumber(int number) {

        //se o número informado for 1, sabemos que por definição não é primo
        if(number == 1){
            return false;
        }

        //testa se o número é divísel por todos os números de dois até o número informado
        for(int i = 2; i < number; i++){

            if(number % i == 0){
                return false;
            }
        }

        //se não houve saída em nenhum dos pontos de checagem anterior, só pode ser primo
        return true;
    }
}