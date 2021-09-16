/* 
    4.2A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine.

    a) Crie o projeto na capturald e tela esquerda na Figura 4.21. Comece dividindo cada borda em um número igual de
    incrementos (escolhemos 15 novamente). A primeira linha inicia no canto superior esquerdo e termina um passo à 
    direita na extremidade inferior. Continue desenhando linhas até alcançar o canto inferior direito. A figura deve ser
    dimensionada à medida que você redimensiona a janela, de modo que as extremidades sempre toque as bordas.
*/

import javax.swing.JFrame;

public class DrawPanelTest{

    public static void main(String[] args){

        //cria um painel para conter o desenho
        DrawPanel panel = new DrawPanel();

        //cria um frame para conter o painel;
        JFrame application = new JFrame();

        //deifne o comportamento padrão para o clique em fechar
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //configura a janela
        application.add(panel);         //adiciona o painel ao frame
        application.setSize(400, 400);  //define o tamanho da janela
        application.setVisible(true);   //renderiza a janela

    }
}