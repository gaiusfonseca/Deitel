/* 
    6.29 (Cara ou coroa) Escreva um aplicativo que simula o jogo de cara ou coroa. Deixe o programa lançar uma moeda 
    toda vez que o usuário escolher a opção " Toss Coin " no menu. Conte o número de vezes que cada lado da moeda 
    aparece. Exiba os resultados. O programa deve chamar um método flip separado que não aceita argumentos e retorna um 
    valor a partir de um Coin enum ( HEADS e TAILS ). [Observação: se o programa simular de modo realista o arremesso de
    moeda, cada lado da moeda deve aparecer aproximadamente metade das vezes.]
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class App{

    //define a enum Coin
    private enum Coin{ HEADS, TAILS};
    private static int countHeads = 0;
    private static int countTails = 0;

    public static void main(String[] args) {
        
        int option;             //armazena a opção informada pelo usuário
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        do{
            //solicita uma entrada ao usuário enquanto ele não finalizar o programa
            System.out.println("informe a opção desejada: ");
            System.out.println("1 - lançar uma moeda");
            System.out.println("2 - encerrar o programa");
            option = input.nextInt();

            //trata a opção do usuário
            if(option == 1){

                if(flip() == Coin.HEADS){
                    System.out.printf("CARA foi sorteado %d vez(es) em um total de %d arremessos%n", 
                        countHeads, countHeads + countTails);
                }else{
                    System.out.printf("COROA foi sorteado %d vez(es) em um total de %d arremessos%n", 
                        countTails, countHeads + countTails);
                }

            }else if(option == 2){
                System.out.println("programa encerrado");
                break;
            }else{
                System.out.println("opção inválida, tente novamente");
            }
        }while(option != 2);
    }

    public static Coin flip() {
        
        //instância um gerador de números aleatórios seguro
        SecureRandom random = new SecureRandom();

        //sorteia cara
        if(random.nextInt(2) == 1){
            countHeads++;
            return Coin.HEADS;
        }else{
            countTails++;
            return Coin.TAILS;
        }
    }

    
}