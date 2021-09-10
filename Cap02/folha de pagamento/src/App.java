/*  
    2.9 Escreva instruções Java que realizem cada uma das seguintes tarefas:
    a) Exibir a mensagem "Digite um inteiro: ", deixando o cursor na mesma linha.
    b) Atribuir o produto de variáveis 'b' e 'c' para a variável 'a'.
    c) Utilizar um comentário para afimar que um programa executa um cálculo de exemplo de folha de pagamento.
*/

// Esse programa executa um cálculo de exemplo de folha de pagamento.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        Scanner entrada = new Scanner(System.in);    //instancia um scanner a partir do teclado

        System.out.print("Digite um inteiro: ");
        b = entrada.nextInt();                      //armazena o valor digitado pelo usuário na variável 'b'

        System.out.print("Digite um inteiro: ");
        c = entrada.nextInt();                      //armazena o valor digitado pelo usuário na variável 'c'

        a = b * c;
        System.out.printf("O produto dos valores digitados é: %d%n", a);
    }
}
