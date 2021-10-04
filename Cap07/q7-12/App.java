/* 
    7.12 (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um 
    aplicativo que insere cinco números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente
    se ele não tiver uma duplicata de um número já lido. Cuide de tratar o “pior caso”, em que todos os cinco números 
    são diferentes. Utilize o menor array possível para resolver esse problema. Exiba o conjunto completo de valores 
    únicos inseridos depois que o usuário inserir cada valor novo.
*/

import java.util.Scanner;

public class App{

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        int[] numbers = new int[1];
        int number;
        
        for(int i = 0; i < 5; i++){
            number = requireInput();

            //verifica se não está duplicado
            if(!isDuplicated(number, numbers)){

                //se não está duplicado, verifica se tem espaço disponível para o novo número
                if(i == 0){
                    numbers[i] = number;

                //se não tiver espaço disponível para o novo número, redimensiona o array e insere o número
                }else{
                    numbers = redim(numbers);
                    numbers[i] = number;
                }
            }

            displayNumbers(numbers);
        }
    }

    /**
     * Solicita ao usuário que forneça uma entrada e repete a pergunta enquanto não estiver dentro de um intervalo 
     * válido.
     * @return um valor inteiro dentro do intervalo válido.
     */
    public static int requireInput() {
        
        int temp;
        
        //solicita uma entrada do usuário enquanto o valor não estiver dentro do intervalo válido
        do{
            System.out.print("informe um número entre 10 e 100: ");
            temp = input.nextInt();
        }while(temp < 10 || temp > 100);

        return temp;
    }

    /**
     * Verifica se um valor já existe no array dado, se já existir, então trata-se de um valor duplicado.
     * @param number O valor que se pretende verificar.
     * @param numbers O array de inteiros em que se vai pesquisar.
     * @return Retorna true se o valor informado já existir no array, false caso contrário.
     */
    public static boolean isDuplicated(int number, int[] numbers) {
        
        boolean duplicated = false;     //assume que não é um valor duplicado

        for(int value : numbers){
            if(value == number){
                duplicated = true;
            }
        }

        return duplicated;
    }

    /**
     * Imprime os valores diferentes de zero.
     * @param numbers Um array de inteiros.
     */
    public static void displayNumbers(int[] numbers) {
        
        System.out.println("\nEstes são os valores que não estão duplicados: ");

        for(int value : numbers){
            if(value != 0){
                System.out.println(value);
            }
        }

        System.out.printf("tamanho do array: %d%n", numbers.length);
    }

    /**
     * Redimensiona um array acrescentando mais uma posição e copia os valores do array atual para o novo array
     * @param numbers Um array de inteiros que se deseja expandir;
     * @return Retorna um array de inteiros com uma cópia de todos os valore e uma posição adicional
     */
    public static int[] redim(int[] numbers) {
        
        //recria o array com uma posição adicional para acomodar o novo valor
        int[] newNumbers = new int[numbers.length + 1];

        //copia os elementos de numbers para newNumbers
        for(int i = 0; i < numbers.length; i++){
            newNumbers[i] = numbers[i];
        }

        return newNumbers;
    }
}