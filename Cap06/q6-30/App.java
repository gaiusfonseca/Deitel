/* 
    6.30 (Adivinhe o número) Escreva um aplicativo que execute “adivinhe o número” como mostrado a seguir: seu programa 
    escolhe o número a ser adivinhado selecionando um inteiro aleatório no intervalo de 1 a 1.000. O aplicativo exibe o 
    prompt Guess a number between 1 and 1000 [adivinhe um número entre 1 e 1000]. O jogador insere uma primeira 
    suposição. Se o palpite do jogador estiver incorreto, seu programa deve exibir Too high. Try again [Muito alto. 
    Tente novamente] ou Too low. Try again [Muito baixo. Tente novamente] para ajudar o jogador a alcançar a resposta 
    correta. O programa deve solicitar ao usuário o próximo palpite. Quando o usuário insere a resposta correta, exibe 
    Congratulations. You guessed the number. [Parabéns, você adivinhou o número!] e permite que o usuário escolha se 
    quer jogar novamente. [Observação: a técnica de adivinhação empregada nesse problema é semelhante a uma pesquisa 
    binária, discutida no Capítulo 19, "Pesquisa, classificação e Big O".]
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        //instância um gerador de números aleatórios
        SecureRandom random = new SecureRandom();
        
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
                
                System.out.println("Deseja jogar novamente?(y/n)");
                
                //trata a opção do usuário
                if(input.next().charAt(0) == 'n'){
                    guess = number;
                }else{
                    guess = number + 1;
                }
                
            }else if(guess < number){
                System.out.println("Muito baixo. Tente novamente.");
            }else{
                System.out.println("Muito alto. Tente novamente.");
            }
        }while(guess != number);

        System.out.println("Encerrando o programa");
    }


}