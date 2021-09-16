/* 
    4.2 A Figura 4.21 exibe dois projetos adicionais criados utilizando-se loops while e drawLine.

    b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura
    de tel ada direita na Figura 4.21
*/

import javax.swing.JFrame;

public class DrawPanelTest{

    public static void main(String[] args){

        //cria um painel para conter o desenho
        DrawPanel panel = new DrawPanel();

        //cria um frame para conter o painel
        JFrame application = new JFrame();

        //configura a ação padrão para o clique no botão fechar
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //configura a janela
        application.add(panel);             //adiciona o painel a janela
        application.setSize(400, 400);      //define as dimensões da janela
        application.setVisible(true);       //renderiza a janela
    }
}