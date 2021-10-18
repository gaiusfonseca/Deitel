import java.awt.Rectangle;

/* 
    8.04 (Classe Rectangle ) Crie uma classe Rectangle com os atributos length e width , cada um dos quais assume o 
    padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para 
    o comprimento ( length ) e a largura ( width ). Os métodos set devem verificar se length e width são, cada um, 
    números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Rectangle.
*/

public class Test{

    public static void main(String[] args) {
        
        //instância um retângulo
        MyRectangle rect = new MyRectangle();

        //demonstra os valores padrões do triângulo
        System.out.println(rect);

        //tenta atribuir um valores para width e length fora do intervalo permitido
        try{
            rect.setWidth(25);
            rect.setLength(-1);
        }catch(IllegalArgumentException e){
            System.err.printf("%s%n", e.getMessage());
        }

        //demonstra que o objeto não foi alterado
        System.out.println(rect);

        //redimensiona o retângulo para 10 x 10
        try{
            rect.setWidth(10);
            rect.setLength(10);
        }catch(IllegalArgumentException e){
            System.err.printf("%s%n", e.getMessage());
        }

        //exibe os dados do retângulo para comprovar que as alterações foram efetivas
        System.out.println(rect);

    }
}