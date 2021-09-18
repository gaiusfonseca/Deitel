/* 
    (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
    System.out.print("* ");
    System.out.print(" ");
    System.out.println();
    para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com
    que o programa gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
*/

public class PrintProgram {

    public static void main(String[] args) {
        
        //configura as dimensões do desenho
        int width = 1;     //16 caracteres por linha
        int height = 1;     //8 linhas

        //repete para cada linha, enquanto houver linha
        while(height <= 8){
            
            //se a linha for impar, começa com um asterisco
            if(height % 2 == 1){

                //repete a impressão do caractere, enquanto houver caracter para ser impresso
                while(width <= 16){
                
                    //imprime "* " 8x.
                    System.out.print("* ");
                    width += 2;
                }
            }else{
                //repete a impressão do caractere, enquanto houver caracter para ser impresso
                while(width <= 16){
                
                    //se for uma linha impar, os caracteres de indice impar serão " " e os pares serão "*".
                    if(width == 1){
                        System.out.print(" ");
                        width++;
                    }else{
                        System.out.print("* ");
                        width += 2;
                    }
                }
            }

            System.out.println();
            height++;
            width = 1;
        }
    }
}