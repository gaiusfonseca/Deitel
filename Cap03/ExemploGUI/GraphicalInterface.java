
//importa JOptionPane para podermos usar as caixas de diálogo do Swing
import javax.swing.JOptionPane;

public class GraphicalInterface{

    public static void main(String[] args){

        String name;        //declara uma variável String para armazenar o nome fornecido pelo usuário
        String message;     //declara uma variável String para armazenar o texto da ultima caixa de diálogo
        
        //utiliza uma caixa de diálogo de entrada para solicitar o nome do usuário
        name = JOptionPane.showInputDialog(null, "Qual o seu nome?");

        //cria uma String formatada que contém a mensagem que será exeibida ao usuário
        message = String.format("Bem-vindo a programação em Java, %s", name);

        //exibe a String formatada ao usuário em uma Caixa de Diálogo de Mensagem
        JOptionPane.showMessageDialog(null, message);
    }
}