/* 
    7.16 (Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada para somar os 
    valores double passados pelos argumentos de linha de comando. [Dica: utilize o método static parseDouble da classe 
    Double para converter uma String em um valor double .]
*/

public class App{


    public static void main(String[] args) {
        
        //declara um array com o mesmo tamanho que o array args
        double[] values = new double[args.length];
        
        //inicializa o total para posterior utilização
        double total = 0;

        //inicializa o array o array values com os valores double passados como argumento
        for(int i = 0; i < args.length; i++){
            values[i] = Double.parseDouble(args[i]);
        }

        //soma os valores
        for(double value : values){
            total += value;
        }

        //exibe os valores
        System.out.printf("a soma dos argumentos é: %.2ff%n", total);
    }
}