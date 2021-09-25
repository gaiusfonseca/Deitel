/* 
    5.26 Uma crítica à instrução break e à instrução continue é que cada uma é desestruturada. Na verdade, essas 
    instruções sempre podem ser substituídas por instruções estruturadas, embora fazer isso possa ser difícil. Descreva 
    de maneira geral como você removeria qualquer instrução break de um loop em um programa e a substituiria por alguma 
    equivalente estruturada. [Dica: a instrução break sai de um loop do corpo do loop. A outra maneira de sair de um 
    loop é falhando no teste de continuação do loop. Considere a possibilidade de utilizar no teste de continuação do 
    loop um segundo teste que indica “saída prévia por causa de uma condição ‘break’ ”.] Utilize a técnica que você 
    desenvolve aqui para remover a instrução break do aplicativo na Figura 5.13.
*/

/* 
    Para substituir a instrução break por uma estruturada equivalente, o autor sugere que criemos uma sedunda condição
    para forçar a saída. Mas também devemos lembrar que todas as instruções posteriores ao Break não serão executadas
    quando a instrução break for alcançada, por isso vamos encapsular esse trecho de código em um if que só executa
    quando break é false.
*/

//programa original
/* public class BreakTest{

    public static void main(String[] args) {
        
        int count;

        for(count = 1; count <= 10; count++){

            if(count == 5){
                break;
            }

            System.out.printf("%d ", count);
        }
        
        System.out.printf("%nsaiu do loop no count = %d%n", count);
    }
} */

public class BreakTest{

    public static void main(String[] args) {
        
        int count;
        boolean forceStop = false;  //indica se o programa deve saltar para fora do loop

        for(count = 1; count <= 10 && forceStop == false; count++){

            if(count == 5){
                //quando a condição para o break for satisfeita, alteramos o valor da variável que controla a parada forçada
                forceStop = true;
                System.out.printf("%nsaiu do loop no count = %d%n", count);
            }else{
                System.out.printf("%d ", count);
            }
        }
    }
}
