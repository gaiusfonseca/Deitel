/* 
    5.1 Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O círculo mais interno deve ter um raio 
    de 10 pixels e cada círculo sucessivo deve ter um raio de 10 pixels maior que o anterior. Comece localizando o 
    centro do JPanel. Para obter o canto superior esquerdo de um círculo, mova-se um raio para cima e um raio para a 
    esquerda a partir do centro. A largura e a altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, 
    duas vezes o raio).
*/

import javax.swing.JFrame;

public class CircleTest {

    public static void main(String[] args) {
        
        //isntância um JFrame para conter o JPanel
        JFrame application = new JFrame();

        //instância um circle
        Circle panel = new Circle(10);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //encerra o programa ao fechar a janela
        application.add(panel);                                         //adiciona o desenho à janela
        application.setSize(400, 400);                                  //dimensiona a janela
        application.setVisible(true);                                   //exibe a janela
    }
}