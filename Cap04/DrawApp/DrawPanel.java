
import java.awt.Graphics;       //permite criar desenhos simples
import javax.swing.JPanel;      //fornece uma área para desenhar

public class DrawPanel extends JPanel{

    //deesenha um X a partir de um dos cantos do Painel
    public void paintComponent(Graphics g){

        //chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);        //chama um método no elemento pai (JPanel)

        int width = getWidth();         //chama o método getWidth() no elemento pai (JPanel), retorna largura da janela
        int height = getHeight();       //chama o método getHeight() no elemento pai (JPanel), retorna altura da janela

        //desenha uma linha a partir do canto superior esquerdo até o inferior direito
        g.drawLine(0, 0, width, height);

        //desenha uma linha a partir do canto inferior esquerdo até o superior direito
        g.drawLine(0, height, width, 0);
    }
}
