
/* 
    3.1 Modifique o programa de adição na Figura 2.7 para utilizar entrada e saída baseadas em caixas de diálogo com os 
    métodos da classe JOptionPane. Uma vez que o método showInputDialog retorna uma String, você deve converter a String
    que o usuário insere em um int para utilização em cálculos. O método static parseInt da classe Integer (pacote java.
    lang) recebe um argumento String que representa um inteiro e retorna o valor como um int. Se a String não contiver
    um inteiro válido, o programa terminará com um erro.
*/

import javax.swing.JOptionPane;

public class AdditionSwing{

    public static void main(String[] args){

        //declara e inicializa duas variáveis do tipo inteiro para receber as entradas do usuário
        int num1 = 0;
        int num2 = 0;
        
        //declara uma String que armazenará o texto a ser exibido ao fim do programa
        String message;

        //solicita ao usuário que informe um valor
        //showInputDialog retorna um número como String, por isso precisamos conveter essa String em int com parseInt
        //Integer não precisa ser importado pois está no pacote java.lang
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro: "));

        //solicita ao usuário que informe um segundo valor
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro: "));

        //format é um méotodo estático similar a printf utilizado para criar uma String
        message = String.format("%d + %d = %d", num1, num2, num1 + num2);

        //exibe o valor da soma ao usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, message);
    }
}