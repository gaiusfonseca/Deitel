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

//importa uma janela Swing na qual o painel com o desenho estará contido
import javax.swing.JFrame;

public class DrawPanelTest{

    public static void main(String[] args) {

        //cria um JPanel para conter o Desenho
        DrawPanel panel = new DrawPanel();

        //cria um JFrame para conter o JPanel
        JFrame application = new JFrame();

        //configura o JFrame para encerrar o programa quando a janela for fechada.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);                 //adicona o JPanel ao JFrame
        application.setSize(400, 400);          //define o tamanho da janela
        application.setVisible(true);           //define a janela como visível

    }
}