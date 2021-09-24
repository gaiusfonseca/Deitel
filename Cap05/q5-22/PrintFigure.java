/* 
    5.22 Modifique a Questão 5.15 para combinar seu código dos quatro triângulos de asteriscos separados, de modo que 
    todos os quatro padrões sejam impressos lado a lado. [Dica: faça uso inteligente de loops for aninhados.]
*/

/* 
    Sabendo que precisamos imprimir as figura lado a lado e que estamos trabalhando com a linha de comando, ou seja, não
    podemos descer uma linha e voltar depois, então sabemos que temos que imprimir uma linha do começo ao fim. Também 
    sabemos que teremos 10 linhas (altura das figuras) e que a figura 2 tem uma particularidade na ultima linha.

    Vamos convencionar um espaçamento de dois espaços vazios entre cada figura. Vamos convencionar também que cada 
    figura terá uma largura, representada pela quantidade de caracteres em sua linha mais completa (10).

    Utilizaremos os loops for para controlar a quantidade de caracteres a serem inseridos na linha atual de cada figura.

    Podemos notar também que a quantidade de caracteres é sempre uma função da altura e/ou largura de cada figura.
*/

public class PrintFigure{

    public static void main(String[] args) {
        
        int width = 10;     //armazena a largura da figura
        int height = 10;    //armazena a altura da figura

        //esse loop representa as linhas
        for(int line = 1; line <= height; line++){

            //imprime os * da PRIMEIRA figura
            for(int star = line; star > 0; star--){
                System.out.print("*");
            }

            //imrpime os ' ' da PRIMEIRA figura
            for(int blank = width - line; blank > 0; blank--){
                System.out.print(" ");
            }

            //insere dois espaços para separar as figuras
            System.out.print("  ");

            //imprime os * da SEGUNDA figura
            for(int star = width - line + 1; star > 0; star--){
                
                //só não imprime na ultima linha
                if(line < 10){
                    System.out.print("*");
                }
            }

            //imrpime os ' ' da SEGUNDA figura
            for(int blank = line - 1; blank > 0; blank--){
                System.out.print(" ");

                //se estivermos no ultimo caractere da ultima linha, incluimos um espaço adicional
                if(line == 10 && blank == 1){
                    System.out.print(" ");
                }
            }

            //insere dois espaços para separar as figuras
            System.out.print("  ");

            //imrpime os ' ' da TERCEIRA figura
            for(int blank = line - 1; blank > 0; blank--){
                System.out.print(" ");
            }

            //imprime os * da TERCEIRA figura
            for(int star = width - line + 1; star > 0; star--){
                System.out.print("*");
            }

            //insere dois espaços para separar as figuras
            System.out.print("  ");

            //imrpime os ' ' da QUARTA figura
            for(int blank = width - line; blank > 0; blank--){
                System.out.print(" ");
            }

            //imprime os * da QUARTA figura
            for(int star = line; star > 0; star--){
                System.out.print("*");
            }

            //insere dois espaços para separar as figuras
            System.out.print("  ");

            System.out.println();
        }
    }
}