/* 
    4.1 Utilizar loops e instruções de controle para desenhar linhas pode levar a muitos projetos interessantes.

    a) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior 
    esquerdo, estendendo-as até que cubram a metade superior esquerda do painel. Uma abordagem é divir a largura em um 
    número igual de passos (descobrimos que 15 passos funcionam bem). A primeira extremidade de uma linha sempre estará
    no canto superior esquerdo (0,0).

    A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cma em um passo 
    vertical e para a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. Continue movendo-se
    para cima e para o passo à direita a fim de encontrar cada extremidada sucessiva. A figura deve ser dimensionada de 
    maneira correspondente à medida que você redimensiona a janela.
*/

import java.awt.Graphics;                   //permite desenhar
import javax.swing.JPanel;                  //cria uma Painel no qual iremos desenhar

//DrawPanel herda o comportamento básico de JPanel com isso poderemos invocar métodos que não criamos
public class DrawPanel extends JPanel{

    //o método paintComponent é quem cria o desenho de fato
    public void paintComponent(Graphics g){

        super.paintComponent(g);        //toda instrução paintComponent deve primeiramente chamar o paintComponent pai

        int height = getHeight();       //obtem a altura da janela em que foi chamado
        int width = getWidth();         //obtem a largura da janela em que foi chamado
        int count = 0;                  //inicializa a variável de controle do loop

        while(count < 15){
            /* 
                Uma nova linha será desenhada cada vez que o controle do programa passar pelo loop.
                A linha partirá sempre da origem (canto superior direito da janela) até um ponto que é função da altura 
                e largura da janela. A posição y do ponto é decrementada a cada iteração e a posição x é incrementada a
                cada iteração
            */
            g.drawLine(0, 0, height - (count * (height / 15)), (width / 15) * count);
            count++;
        }
    }
}