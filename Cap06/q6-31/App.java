/* 
    6.31 (Adivinhe a modificação de número) Modifique o programa do Exercício 6.30 para contar o número de adivinhações 
    que o jogador faz. Se o número for 10 ou menos, exibe Either you know the secret or you got lucky! [Você sabe o 
    segredo ou tem muita sorte!]; se o jogador adivinhar o número em 10 tentativas, exiba Aha! You know the secret! 
    [Aha! Você sabe o segredo!]; se o jogador fizer mais que 10 adivinhações, exiba You should be able to do better! 
    [Você deve ser capaz de fazer melhor]. Por que esse jogo não deve precisar de mais que 10 suposições? Bem, com cada 
    “boa adivinhação” o jogador deve ser capaz de eliminar a metade dos números, depois a metade dos números restantes, 
    e assim por diante.
*/


import java.security.SecureRandom;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        //instância um gerador de números aleatórios
        SecureRandom random = new SecureRandom();
        
        int count = 0;                              //armazena a quantidade de palpites
        int guess;                                  //armazena o palpite do usuário
        int number = random.nextInt(1000) + 1;      //armazena o número sorteado
        
        System.out.println("digite -1 para sair");
        do{
            //solicita uma entrada ao usuário
            System.out.print("Advinhe um número entre 1 e 1000: ");
            guess = input.nextInt();

            //trata o palpite do usuário
            if(guess == -1){
                break;
            }else if(guess == number){
                System.out.println("Acertou Miserávi!");
                count++;

                //trata o número de tentativas
                if(count < 10){
                    System.out.println("Ou você sabe o segredo, ou teve sorte.");
                }else if(count == 10){
                    System.out.println("Ah ha! Você sabe o segredo!");
                }else{
                    System.out.println("Você deve ser capaz de fazer melhor.");
                }
                
                System.out.println("Deseja jogar novamente?(y/n)");
                
                //trata a opção do usuário
                if(input.next().charAt(0) == 'n'){
                    guess = number;
                }else{
                    guess = number + 1;
                    count = 0;
                }
                
            }else if(guess < number){
                System.out.println("Muito baixo. Tente novamente.");
                count++;
            }else{
                System.out.println("Muito alto. Tente novamente.");
                count++;
            }
        }while(guess != number);

        System.out.println("Encerrando o programa");
    }


}