/* 
    5.20 (Calculando o valor de S ) Calcule o valor de S a partir de uma série infinita
    
    Pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - ....

    Imprima uma tabela que mostre o valor aproximado de Pi calculando os 200.000 primeiros termos dessa série. Quantos 
    termos você tem de utilizar antes de primeiro obter um valor que começa com 3,14159?
*/

public class Pi {


    public static void main(String[] args) {
        
        double pi = 4;          //incializa pi com o valor 4 (cálculo de 0 termos)
        int step = 1;           //conta o número de iterações
        int isAccurate = 0;     //armazena o step em que Pi atinge o nível de precisão solicitado
        double difference = 0;  //armazena a diferença entre pi e 3.14159 a cada iteração

        //imprime o cabeçalho da tabela
        System.out.printf("%10s  %10s%n","Step", "Pi");

        //calcula o valor de pi
        for(int i = 3; i <= 400003; i += 2){

            //se o número da iteração for ímpar, o termo atual é subtraído do valor de pi
            if(step % 2 != 0){
                pi -= (double) 4/i;
            }else{
                pi += (double) 4/i;
            }

            //calcula a diferença entre pi e 3.14159
            difference = pi - 3.14159;

            //verifica se o step atual atingiu o valor de precisão solicitado
            if(isAccurate == 0 && difference > 0 && difference < 0.00001){
                isAccurate = step;
            }

            //imprime a linha atual da tabela
            System.out.printf("%10d  %10.5f%n", step, pi);

            step++;
        }

        System.out.printf("Pi atingiu o valor de 3.14159 no step: %d%n", isAccurate);
    }
}