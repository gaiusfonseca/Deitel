/* 
    5.28 Descreva de maneira geral como você removeria qualquer instrução continue de um loop em um programa e a 
    substituiria por alguma equivalente estruturada. Utilize a técnica que você desenvolve aqui para remover a instrução 
    continue do programa na Figura 5.14.

    A instrução continue pode ser representada por uma equivalente estruturada colocando um bloco if-else dentro do loop,
    dessa forma, o bloco if deverá executar somente quando a condição para que o continue ocorra for verdadeira e a 
    porção else executará o trecho de código posterior ao continue.
*/

/*  PROGRAMA ORIGINAL
    public class App{

    public static void main(String[] args) {
        
        for(int count = 1; count <= 10; count++){

            if(count == 5){
                continue;
            }

            System.out.printf("%d ", count);
        }

        System.out.printf("%no continue pulou a impressao %d%n", count);
    }
} */

public class App{

    public static void main(String[] args) {
        
        for(int count = 1; count <= 10; count++){

            if(count == 5){
                ;
            }else{
                System.out.printf("%d ", count);
            }
        }

        System.out.printf("%no continue pulou a impressao 5%n");
    }
}