/* 
    5.24 Escreva um aplicativo que imprime a seguinte forma de um losango. Você pode utilizar instruções de saída que 
    imprimem um único asterisco "*", um único " " ou um único caractere "\n". Maximize sua utilização de repetição (com 
    instruções for aninhadas) e minimize o número de instruções de saída.

        Primeira mente devemos notar que se trata de uma figura simétrica cuja largura máxima é de 9 caracteres e a 
        altura também é de 9 linhas. Faremos a impressão como se fosse um quadrado 9 por 9, mas com alguma lógica para 
        definir se devemos imprimir um espao ou asterisco.
*/

public class App{

    public static void main(String[] args) {
        
        int width = 9;      //largura da figura

        //imprime a metade crescente do desenho
        for(int line = 1; line <= 5; line++){

            int asterisk = 1 + 2 * (line -1);
            int blank = width - asterisk;
            int breakPoint = blank / 2;

            //imrpime os caracteres de " " antes da figura
            for(;blank > breakPoint; blank--){
                System.out.print(" ");
            }

            //imprime os caracteres de "*" para formar a figura
            for(;asterisk > 0; asterisk--){
                System.out.print("*");
            }

            //imprime os caracteres de " " depois da figura
            for(; blank > 0;blank--){
                System.out.print(" ");
            }

            //move o cursor para a próxima linha
            System.out.println();
        }

        //imprime a metade decrescente do desenho
        for(int line = 1; line <= 4; line++){

            int asterisk = width - 2 * line;
            int blank = width - asterisk;
            int breakPoint = blank / 2;

            //imrpime os caracteres de " " antes da figura
            for(;blank > breakPoint; blank--){
                System.out.print(" ");
            }

            //imprime os caracteres de "*" para formar a figura
            for(;asterisk > 0; asterisk--){
                System.out.print("*");
            }

            //imprime os caracteres de " " depois da figura
            for(; blank > 0;blank--){
                System.out.print(" ");
            }

            //move o cursor para a próxima linha
            System.out.println();
        }
    }
}