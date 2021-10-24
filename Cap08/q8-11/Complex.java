/* 
    8.11 (Números complexos) Crie uma classe chamada Complex para realizar aritmética com números complexos. Os números 
    complexos têm a forma:
    
    parteReal + parteImaginária * i
    onde i é Math.sqrt(-1);

    Escreva um programa para testar sua classe. Utilize variáveis de ponto flutuante para representar os dados private 
    da classe. Forneça um construtor que permita que um objeto dessa classe seja inicializado quando ele for declarado. 
    Forneça um construtor sem argumento com valores padrão caso nenhum inicializador seja fornecido. Forneça métodos 
    public que realizam as seguintes operações:

    a) Somar dois números Complex : as partes reais são somadas de um lado e as partes imaginárias, de outro.
    b) Subtrair dois números Complex : a parte real do operando direito é subtraída da parte real do operando esquerdo e a parte imaginária
    do operando direito é subtraída da parte imaginária do operando esquerdo.
    c) Imprima números Complex na forma ( parteReal , parteImaginária ) .
*/

public class Complex{

    private float realPart;
    private float imaginaryPart;

    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(float realPart, float imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public float getRealPart() {
        return realPart;
    }

    public void setRealPart(float realPart) {
        this.realPart = realPart;
    }

    public float getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(float imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex sum(Complex numberA, Complex numberB){
        return new Complex(numberA.realPart + numberB.realPart, numberA.imaginaryPart + numberB.imaginaryPart);
    }

    public static Complex subtract(Complex numberA, Complex numberB){
        return new Complex(numberA.realPart - numberB.realPart, numberA.imaginaryPart - numberB.imaginaryPart);
    }

    @Override
    public String toString(){
        return String.format("(%.2f, %.2f)", getRealPart(), getImaginaryPart());
    }
}