/* 
    5.21 Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros. O conjunto de três valores 
    inteiros para os comprimentos dos lados de um triângulo retângulo é chamado de triplo de Pitágoras. Os comprimentos 
    dos três lados devem satisfazer a relação de que a soma dos quadrados de dois dos lados é igual ao quadrado da 
    hipotenusa. Escreva um aplicativo para exibir uma tabela dos triplos de Pitágoras para side1, side2 e hypotenuse, 
    todos não maiores que 500. Utilize um loop for triplamente aninhado que tenta todas as possibilidades. Esse é um 
    método de computação de “força bruta”. Você aprenderá nos cursos de ciência da computação mais avançados que para 
    muitos problemas interessantes não há uma abordagem algorítmica conhecida além do uso de força bruta absoluta.
*/

public class App{

    public static void main(String[] args) {

        //armazena o resultado da propriedade do triângulo pitagórico, inicializada com false
        boolean isPitagoric = false;

        //imprime o cabeçalho da tabela
        System.out.printf("%10s  %10s  %10s%n","lado 1", "lado 2", "hipotenusa");

        //varia o lado 1, neste ponto apenas o lado 1 é conhecido
        for(int side1 = 1; side1 <= 500; side1++){

            //varia o lado 2, neste ponto lado 1 e lado 2 são conhecidos
            for(int side2 = 1; side2 <= 500; side2++){

                //varia a hipotenusa, neste ponto os três lados são conhecidos e podemos avaliar a propriedade
                for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++){

                    //avalia se a propriedade do triângulo pitagórico é válida
                    isPitagoric = (hypotenuse * hypotenuse == side1 * side1 + side2 * side2) ? true : false;

                    //se for um triângulo pitagórico, imprime os valores na linha atual da tabela
                    if(isPitagoric){
                        System.out.printf("%10d  %10d  %10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}