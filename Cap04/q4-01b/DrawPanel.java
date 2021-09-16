/* 
    4.1 Utilizar loops e instruções de controle para desenhar linhas pode levar a muitos projetos interessantes.

    b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura
    de tela da direita na Figura 4.21.
*/

import javax.swing.JPanel;      //importa JPanel, o painel em que o desenho será construído

import java.awt.Graphics;       //importa o Graphics para criar o desenho.

public class DrawPanel extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        //as chamadas para getWidth e getHeight são possíveis pois DrawPanel herda de JPanel
        int height = getHeight();       //captura a altura do painel
        int width = getWidth();         //captura a largura do painel
        int count = 0;                  //incializa a variável que controla os loops

        //desenha a partir do canto superior esquerdo
        while(count < 15){
            g.drawLine(0, 0, count * (width / 15), height - count * (height / 15));
            count++;
        }
        count = 0;  //após desenhar todas as linhas do canto superior direito, reinicializa a variável para o próximo

        //desenha a partir do canto inferior esquerdo
        while(count < 15){
            g.drawLine(0, height, width - count * (width / 15), height - count * (height / 15));
            count++;
        }
        count = 0;  //após desenhar todas as linhas do canto superior direito, reinicializa a variável para o próximo

        //desenha a partir do canto inferior direito
        while(count < 15){
            g.drawLine(width, height, count * (width / 15), height - count * (height / 15));
            count++;
        }
        count = 0;  //após desenhar todas as linhas do canto superior direito, reinicializa a variável para o próximo

        //desenha a partir do canto superior direito
        while(count < 15){
            g.drawLine(width, 0, width - count * (width / 15), height - count * (height / 15));
            count++;
        }
    }
}