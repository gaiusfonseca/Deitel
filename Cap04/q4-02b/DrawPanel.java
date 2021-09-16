/* 
    4.2 A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine.

    b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura
    de tel ada direita na Figura 4.21
*/

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int width = getWidth();             //captura a largura da janela
        int height = getHeight();           //captura a altura da janela
        int count = 0;                          //inicializa o contador

        //desenha a linha deslocando y da origem e x do destino a cada iteração (a partir do canto superior esquerdo)
        while(count < 15){
            g.drawLine(0, count * height / 15, (count + 1) * width / 15, height);
            count++;
        }
        count = 0;

        //desenha a linha deslocando x da origem e y do destino a cada iteração (a partir do canto inferior esquerdo)
        while(count < 15){
            g.drawLine(count * width / 15, height, width, height - (count + 1) * height / 15);
            count++;
        }
        count = 0;

        //desenha a linha deslocando y da origem e x do destino a cada iteração (a partir do canto inferior direito)
        while(count < 15){
            g.drawLine(width, height - count * height / 15, width - (count + 1) * width / 15, 0);
            count++;
        }
        count = 0;

        //desenha a linha deslocando x da origem e y do destino a cada iteração (a partir do canto superior direito)
        while(count < 15){
            g.drawLine(width - count * width / 15, 0, 0, (count + 1) * height / 15);
            count++;
        }
        count = 0;
    }   
}