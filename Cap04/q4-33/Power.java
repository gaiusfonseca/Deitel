/* 
    4.33 Escreva um aplicativo que continue exibindo na janela de comando os múltiplos do inteiro 2 — a saber, 2, 4, 8, 
    16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um loop infinito). O que acontece 
    quando você executa esse programa?

        Em um determinado momento o programa, isso acontece porque number foi declarado como int e em algum momento o
        valor máximo que um int pode receber é ultrapassado, assim o loop não consegue calcular o valor da próxima 
        iteração.
*/

public class Power{

    public static void main(String[] args) {
        
        //declara um numero para servir como ponto de partida;
        int number = 2;

        while(number > 0){

            //imprime o valor de number
            System.out.println(number);

            //atualiza o valor de number
            number *= 2;
        }
        
    }
}