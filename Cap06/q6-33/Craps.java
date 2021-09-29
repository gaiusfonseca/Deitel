/* 
    6.33 (Modificação do jogo Craps) Modifique o programa de jogo de dados craps da Figura 6.8 para permitir apostas. 
    Inicialize a variável bankBalance como 1.000 dólares. 
    
    Peça ao jogador que insira um wager. 
    
    Verifique se wager é menor ou igual a bankBalance e, se não for, faça o usuário reinserir wager até um wager válido 
    ser inserido.
    
    Então, execute um jogo de dados. Se o jogador ganhar, aumente bankBalance por wager e exiba o novo bankBalance. 
    
    Se o jogador perder, diminua bankBalance por wager, exiba o novo bankBalance, verifique se bankBalance tornou-se zero e, 
    se isso tiver ocorrido, exiba a mensagem "Sorry. You busted!" ["Desculpe, mas você faliu!"]. 
    
    À medida que o jogo se desenvolve, exiba várias mensagens para criar uma “conversa”, como "Oh, you're going for 
    broke, huh?" ["Oh, parece que você vai quebrar, hein?"] ou "Aw c'mon, take a chance!" ["Ah, vamos lá, dê uma chance 
    para sua sorte"] ou "You're up big. Now's the time to cash in your chips!" [Você está montado na grana. Agora é hora 
    de trocar essas fichas e embolsar o dinheiro!"]. 
    
    Implemente a “conversa” como um método separado que escolhe aleatoriamente a string a ser exibida.
*/
import java.security.SecureRandom;
import java.util.Scanner;

public class Craps{

    //instância um gerador de números aleatórios
    private static final SecureRandom randomNumbers = new SecureRandom();

    //define as constantes enum
    private enum Status{CONTINUE, WON, LOST};

    //define constantes que representam valores chave do jogo
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        
        int myPoint = 0;            //pontos, caso não ganhe ou perca na primeira rodada
        Status gameStatus;          //status do jogo
        
        int bankBalance = 1000;     //saldo inicial do jogador
        int wager = 0;              //valor da aposta

        boolean playAgain = true;   //informa se o jogador deseja fazer uma nova aposta
        char option = 'z';          //respota do jogador

        int sumOfDice;              //resultado do lançamento de um par de dados

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        while(playAgain){

            //enquanto a aposta for maior que o saldo, solicita uma nova aposta
            do{
    
                //verifica se o palpite anterior foi um palpite inválido e exibe uma mensagem
                if(wager >= bankBalance){
                    System.out.print("Senhor, tem certeza que deseja manter a aposta, não prefere verificar o seu saldo?");
                }
                
                //solicita o valor da aposta ao jogador
                System.out.print("Quanto gostaria de apostar? ");
                wager = input.nextInt();
            }while(wager >= bankBalance);
            
            //executa um lançamento de dados
            sumOfDice = rollDice();
            
            //determina o resultado do jogo e a pontuação caso o jogo não termine no primeiro lançamento
            switch(sumOfDice){
                case SEVEN:
                case YO_ELEVEN:
                    gameStatus = Status.WON;
                    bankBalance += wager;           //incrementa o saldo
                    System.out.printf("Você ganhou! seu novo saldo é de: %d%n", bankBalance);  //exibe o novo saldo
                    System.out.printf("%s%n", talk());
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    bankBalance -= wager;
                    if(bankBalance == 0){
                        System.out.println("Desculpe, mas você faliu!");
                    }else{
                        System.out.printf("Você perdeu! seu novo saldo é de: %d%n", bankBalance);
                        System.out.printf("%s%n", talk());
                    }
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Sua pontuação foi de: %d pontos%n", myPoint);
                    break;    
            }

            //enquanto o jogo não estiver completo
            while(gameStatus == Status.CONTINUE){
                
                //lança os dados
                sumOfDice = rollDice();
    
                //verifica se o jogo terminou
                if(sumOfDice == myPoint){
                    gameStatus = Status.WON;
                    bankBalance += wager;           //incrementa o saldo
                }else if(sumOfDice == SEVEN){
                    gameStatus = Status.LOST;
                    bankBalance -= wager;           //decrementa o saldo
                }
            }
    
            //exibe uma mensagem informando se o jogo terminou
            if(gameStatus == Status.WON){
                System.out.printf("Você ganhou! seu novo saldo é de: %d%n", bankBalance);  //exibe o novo saldo
                System.out.printf("%s%n", talk());
            }else if(bankBalance == 0){
                System.out.println("Desculpe, mas você faliu!");
            }else{
                System.out.printf("Você perdeu! seu novo saldo é de: %d%n", bankBalance);
                System.out.printf("%s%n", talk());
            }

            option = 'z';
            //enquanto o jogador tiver saldo, pergunta se ele deseja jogar uma nova partida
            while(bankBalance > 0 && option != 's' && option != 'n'){
                System.out.print("Desjea jogar uma nova partida? (s/n)");
                option = input.next().charAt(0);

                if(option == 's'){
                    playAgain = true;
                    System.out.printf("%s%n", talk());
                }else if(option == 'n'){
                    playAgain = false;
                }else{
                    System.out.println("Opção inválida, tente novamente");
                }
            }
        }
    }

    //lança os dados e exibe os resultados
    public static int rollDice() {
        
        //seleciona valores aleatórios do dado
        int dice1 = 1 + randomNumbers.nextInt(6);
        int dice2 = 1 + randomNumbers.nextInt(6);

        //exibe os resultados desse lançamento
        System.out.printf("o jogador rolou %d + %d = %d%n", dice1, dice2, dice1 + dice2);

        return dice1 + dice2;
    }

    /* 
    À medida que o jogo se desenvolve, exiba várias mensagens para criar uma “conversa”, como "Oh, you're going for 
    broke, huh?" ["Oh, parece que você vai quebrar, hein?"] ou "Aw c'mon, take a chance!" ["Ah, vamos lá, dê uma chance 
    para sua sorte"] ou "You're up big. Now's the time to cash in your chips!" [Você está montado na grana. Agora é hora 
    de trocar essas fichas e embolsar o dinheiro!"]. 
    
    Implemente a “conversa” como um método separado que escolhe aleatoriamente a string a ser exibida.
    */
    public static String talk() {
        //gera 1 entre 3 possíveis valores aleatórios
        int option = randomNumbers.nextInt(3) + 1;
        
        String message;     //declara a mensagem de retorno

        //prepara a mensagem
        switch(option){
            case 1:
                message = "Oh, parece que você vai quebrar, hein?";
                break;
            case 2:
                message = "Ah, vamos lá, dê uma chance para sua sorte";
                break;
            default:
                message = "Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!";
                break;
        }

        //retorna a mensagem
        return message;
    }

}