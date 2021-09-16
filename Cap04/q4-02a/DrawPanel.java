/* 
    4.2A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine.

    a) Crie o projeto na capturald e tela esquerda na Figura 4.21. Comece dividindo cada borda em um número igual de
    incrementos (escolhemos 15 novamente). A primeira linha inicia no canto superior esquerdo e termina um passo à 
    direita na extremidade inferior. Continue desenhando linhas até alcançar o canto inferior direito. A figura deve ser
    dimensionada à medida que você redimensiona a janela, de modo que as extremidades sempre toque as bordas.
*/

import javax.swing.JPanel;          //importa o painel onde o desenho será criado
import java.awt.Graphics;           //importa o elemento que cria os desenhos

public class DrawPanel extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int width = getWidth();     //recebe o a largura da janela
        int height = getHeight();   //recebe a altura da janela
        int count = 0;              //inicializa o contador

        //desenha uma linha a partir do canto superior direito deslocando o y do ponto de origem e o x do ponto destino
        while(count < 15){
            g.drawLine(0, count * (height / 15), (count + 1) * (width / 15), height);
            count++;
        }
    }
}