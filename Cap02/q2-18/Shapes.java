
/*
    2.18 Escreva um aplicativo que exiba uma caixa, uam elipse, uma seta e um losango utilizando asteriscos, como segue:
*/

public class Shapes{

    public static void main(String[] args){

    /*
        com as técnicas que foram ensinadas no livro até o momento, não será possível escrever o programa de maneira 
        eficiente, ainda assim, podemos tomar algumas medidas para planejar a tarefa:

        1 - como não há variação de caracteres, ou seja, apenas asteriscos e espaços são utilizados para formar o 
        desenho, sabemos que podemos utilizar uma instrução print ou println. Nesse caso adotaremos a instrução println,
        pois ela já reposiciona o cursor no início da próxima linha.
    
        2 - observando a figura se pode notar que todas elas tem a mesma altura, ou seja, 9 linhas de altura.

        3 - podemos definir um espaçamento padrão entre as figuras, neste caso, vou adotar 2 espaços

        4 - vamos anotar a largura máxima de cada figura:
        quadrado - 9 caracteres
        círculo - 7 caracteres
        seta - 5 caracteres
        losango - 9 caracteres

        5 - agora vamos contruir o desenho, linha por linha
        '*********    ***      *        *    '
        '*       *   *   *    ***      * *   '
        '*       *  *     *  *****    *   *  '
        '*       *  *     *    *     *     * '
        '*       *  *     *    *    *       *'
        '*       *  *     *    *     *     * '
        '*       *  *     *    *      *   *  '
        '*       *   *   *     *       * *   '
        '*********    ***      *        *    '

        6 - agora basta printar cada uma das linhas
    */

    System.out.println("*********    ***      *        *    ");
    System.out.println("*       *   *   *    ***      * *   ");
    System.out.println("*       *  *     *  *****    *   *  ");
    System.out.println("*       *  *     *    *     *     * ");
    System.out.println("*       *  *     *    *    *       *");
    System.out.println("*       *  *     *    *     *     * ");
    System.out.println("*       *  *     *    *      *   *  ");
    System.out.println("*       *   *   *     *       * *   ");
    System.out.println("*********    ***      *        *    ");
    }
}