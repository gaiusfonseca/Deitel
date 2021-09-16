
import javax.swing.JFrame;  //importa o JFrame para conter o JPanel

public class DrawPanelTest{

    public static void main(String[] args){

        //cria um JPanel para conter o desenho
        DrawPanel panel = new DrawPanel();

        //cria um JFrame para conter o painel
        JFrame application = new JFrame();

        //define o comprotamento padrão ao clicar no botão fechar
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //configura o JFrame
        application.add(panel);         //adicona o painel ao JFrame
        application.setSize(400, 400);  //define o tamanho da janela
        application.setVisible(true);   //define a janela como visível
    }
}