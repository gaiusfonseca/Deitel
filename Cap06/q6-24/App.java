/* 
    6.24 (Números perfeitos) Dizemos que um número inteiro é um número perfeito se a soma de seus fatores, incluindo 1 
    (mas não o próprio número), for igual ao número. Por exemplo, 6 é um número perfeito porque 6 = 1 + 2 + 3. Escreva 
    um método isPerfect que determina se parâmetro number é um número perfeito. Utilize esse método em um applet que 
    determina e exibe todos os números perfeitos entre 1 e 1.000. Exiba os fatores de cada número perfeito confirmando 
    que ele é de fato perfeito. Desafie o poder de computação do seu computador testando números bem maiores que 1.000. 
    Exiba os resultados.
*/

public class App{

    public static void main(String[] args) {

        //testa os números de 1 a 1000
        for(int number = 1; number <= 100000; number++){
            
            //se o número for perfeito, imprimimos a prova
            if(isPerfect(number)){
                
                //começamos imprimindo o próprio número
                System.out.printf("%d = ", number);

                //imprimos os divisores desse número
                for(int i = number - 1; i > 0; i--){

                    if(number % i == 0 && i != 1){
                        System.out.printf("%d + ", i);        //imprime os divisores diferentes de 1
                    }else if(i == 1){
                        System.out.printf("%d%n", i);         //imprime o ultimo divisor (sempre 1)
                    }
                }
            }
        }

    }

    public static boolean isPerfect(int number) {
        
        boolean isPerfect = false;
        int total = 0;

        for(int divisor = number - 1; divisor > 0; divisor--){

            if(number % divisor == 0){
                total = total + divisor;
            }
        }

        if(total == number){
            isPerfect = true;
        }

        return isPerfect;
    }
}