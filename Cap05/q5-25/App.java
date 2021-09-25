/* 
    5.25 Modifique o aplicativo que você escreveu na Questão 5.24 para ler um número ímpar no intervalo 1 a 19 para 
    especificar o número de linhas no losango. Seu programa então deve exibir um losango do tamanho apropriado.
*/

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        //instância um scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        int height;     //armazena a altura da figura
        int width;      //armazena a largura da figura
        
        int half1;      //armazena o tamanho da primeira metade da figura
        int half2;      //armazena o tamanho da segunda metade da figura

        int asterisk;   //armazena a quantidade de caracteres "*" a ser inserida na linha atual
        int blank;      //armazena a quantidade de caracteres " " a ser inserida na linha atual
        int breakPoint; //armazena o fim da primera parte em branco

        //repete enquanto o usuário não fornecer um valor válido
        do{
            //solicita uma entrada ao usuário
            System.out.print("informe a altura do losango (somente números ímpares entre 1 e 19): ");
            height = input.nextInt();
        }while(height < 1 || height > 19 || height % 2 == 0);
    
        //define a largura máxima da figura
        width = height;
        
        //inicializa hal1 e half2 a partir do tamanho da figura;
        half1 = height / 2;
        half2 = height / 2;

        //imprime a primeira metade da figura
        for(int line = 1; line <= half1; line++){

            //define o a quantidade de caracteres de cada tipo e o ponto de parada
            asterisk = 1 + (line -1) * 2;
            blank = width - asterisk;
            breakPoint = blank / 2;

            //imprime a parte em branco anterior a figura
            for(;blank > breakPoint; blank--){
                System.out.print(" ");
            }

            //imprime os  asteriscos que compõem a figura
            for(;asterisk > 0; asterisk--){
                System.out.print("*");
            }

            //imprime a parte em branco posterior a figura
            for(;blank > 0; blank--){
                System.out.print(" ");
            }

            //posiciona o cursor na próxima linha
            System.out.println();
        }

        //imprime a linha média da fiugra
        for(int line = 1; line <=1; line++){
            
            //define o a quantidade de caracteres de cada tipo e o ponto de parada
            asterisk = width;

            for(;asterisk > 0; asterisk--){
                System.out.print("*");
            }

            //posiciona o cursor na próxima linha
            System.out.println();
        }

        //imprime a segunda metade da figura
        for(int line = 1; line <= half2; line++){
            
            //define o a quantidade de caracteres de cada tipo e o ponto de parada
            asterisk = width - 2 * line;
            blank = width - asterisk;
            breakPoint = blank / 2;

            //imprime a parte em branco anterior a figura
            for(;blank > breakPoint; blank--){
                System.out.print(" ");
            }

            //imprime os  asteriscos que compõem a figura
            for(;asterisk > 0; asterisk--){
                System.out.print("*");
            }

            //imprime a parte em branco posterior a figura
            for(;blank > 0; blank--){
                System.out.print(" ");
            }

            //posiciona o cursor na próxima linha
            System.out.println();
        }

    }
}