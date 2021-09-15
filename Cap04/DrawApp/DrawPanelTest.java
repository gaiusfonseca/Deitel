
import javax.swing.JFrame;

public class DrawPanelTest{

    public static void main(String[] args){

        //cria um painel para conter o desenho
        DrawPanel panel = new DrawPanel();

        //cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        //configura o frame papra ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);             //adiciona o painel ao frame
        application.setSize(250, 250);      //configra o tamanho do frame
        application.setVisible(true);       //torna o frame visível
    }
}