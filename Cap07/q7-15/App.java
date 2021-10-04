/* 
    7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja especificado pelo 
    primeiro argumento de linha de comando. Se nenhum argumento de linha de comando for fornecido, utilize 10 como o 
    tamanho padrão do array.
*/

//lembre-se de passar um argumento para que o array seja inicializado com o tamanho solicitado
public class App{

    public static void main(String[] args) {
        
        int size = 10;
        int[] array;

        if(args.length == 1){
            
            size = Integer.parseInt(args[0]);
            array = new int[size];
        }else{
            array = new int[size];
        }

        System.out.printf("%s%8s%n", "Index", "Values");

        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}