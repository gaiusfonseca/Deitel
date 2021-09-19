/* 
    5.1 Desenhe 12 círculos concêntricos no centro de um JPanel (Figura 5.29). O círculo mais interno deve ter um raio 
    de 10 pixels e cada círculo sucessivo deve ter um raio de 10 pixels maior que o anterior. Comece localizando o 
    centro do JPanel. Para obter o canto superior esquerdo de um círculo, mova-se um raio para cima e um raio para a 
    esquerda a partir do centro. A largura e a altura do retângulo delimitador têm o mesmo diâmetro do círculo (isto é, 
    duas vezes o raio).
*/

import javax.swing.JPanel;      //importa o painel em que o desenho será feito
import java.awt.Graphics;       //importa o graphics para fazer o desenho

//nossa classe herda de JPanel
public class Circle extends JPanel{

    private int radius;     //declara o raio como propriedade do cículo

    //define o construtor que inicializa o círculo
    public Circle(int radius){
        this.radius = radius;               //um valor que será fornecido pelo usuário ou programa
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    //retorna a coordenada x do centro da janela
    public int getXCenter(){
        return getWidth() / 2;
    }

    //retorna a coordenada y do centro da janela
    public int getYCenter(){
        return getHeight() / 2;
    }

    //desenha um círculo
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        //desenha 12 círculos concênctricos
        for(int i = 1; i <= 12; i++){
            
            //drawOval recebe como os dois primeiros argumentos, as coordernadas x e y do canto superior esquerdo do 
            //retângulo imaginário e como os dois ultimos argumentos, a largura e a altura do retângulo imaginário
            g.drawOval(getXCenter() - getRadius() * i, getYCenter() - getRadius() * i, 
            getRadius() * i * 2, getRadius() * i * 2);
        }
    }
}