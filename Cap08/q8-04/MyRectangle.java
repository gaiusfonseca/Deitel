/* 
    8.04 (Classe Rectangle ) Crie uma classe Rectangle com os atributos length e width , cada um dos quais assume o 
    padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para 
    o comprimento ( length ) e a largura ( width ). Os métodos set devem verificar se length e width são, cada um, 
    números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Rectangle.
*/

public class MyRectangle{

    private float width;
    private float length;

    public MyRectangle(){
        width = 1;
        length = 1;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        //verifica se o valor fornecido está fora do intervalo válido, se estiver lança uma exceção
        if(width < 0 || width > 20){
            throw new IllegalArgumentException("você tentou atribuir uma largura menor que 0 ou maior que 20.");
        }

        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        //verifica se o valor fornecido está fora do intervalo válido, se estiver lança uma exceção
        if(length  < 0 || length > 20){
            throw new IllegalArgumentException("você tentou atribuir um comprimento menor que 0 ou maior que 20.");
        }

        this.length = length;
    }

    public float area(){
        return width * length;
    }

    public float perimeter(){
        return width * 2 + length * 2;
    }

    @Override
    public String toString(){
        return String.format("width: %.2f, length: %.2f, area: %.2f, perimeter: %.2f",
            getWidth(), getLength(), area(), perimeter());
    }
}