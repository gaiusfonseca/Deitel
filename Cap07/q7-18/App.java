/* 
    7.18 (Jogo de dados Craps) Escreva um aplicativo que executa 1.000.000 de partidas do jogo de dados craps 
    (Figura 6.8) e responda às seguintes perguntas:

    a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?

    b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois da vigésima rolagem?

    c) Quais são as chances de ganhar no jogo de dados? [Observação: você deve descobrir que o craps é um dos jogos mais 
    comuns de cassino. O que você supõe que isso significa?]

        as chances de ganhar na primeira rodada são 8/36, enquanto que as de perder são 4/36, porém se na primeira 
        rodada tirarmos um resultado que faz o jogo continuar (24/36), nossas chances de perder mudam para 6/36 e na 
        melhor das hipóteses nossas chances de ganhar vão para 5/36, equanto que a chance de o jogo continuar vai para
        25/36. A cada rodada nossa chance de ganhar tende a diminuir já que aqui nesse exemplo tiramos o melhor número
        possível (6 ou 8) e é improvável repetirmos esse resultado.

    d) Qual é a duração média de um jogo de dados craps?

    e) As chances de ganhar aumentam com a duração do jogo?

        Quanto mais o jogo se extende, menor se torna a chance de ganhar.
*/

import java.security.SecureRandom;

public class App{

    public static void main(String[] args) {

        int[] won = new int[22];
        int[] lost = new int[22];
        CrapsResult result;
        int rounds = 0;

        //simula 1.000.000 de partidas de craps
        for(int play = 1; play <= 1000000; play++){
            result = playCraps();

            //agrupa o resultado das partidas conforme a rodada em que terminou
            if(result.getGameStatus() == Status.WON && result.getRounds() > 20){
                won[21]++;
            }else if(result.getGameStatus() == Status.WON){
                won[result.getRounds()]++;
            }else if(result.getGameStatus() == Status.LOST && result.getRounds() > 20){
                lost[21]++;
            }else{
                lost[result.getRounds()]++;
            }

            rounds += result.getRounds();
        }

        //exibe a quantidade de vitórias em cada rodada do jogo
        for(int i = 0; i < won.length; i++){
            if(won[i] != 0){
                System.out.printf("vitorias na %d° rodada = %d%n", i, won[i]);
            }
        }

        //exibe a quantidade de derrotas em cada rodada do jogo
        for(int i = 0; i < lost.length; i++){
            if(lost[i] != 0){
                System.out.printf("derrotas na %d° rodada = %d%n", i, lost[i]);
            }
        }

        //exibe a duração média de uma partida de craps
        System.out.printf("uma partida de craps dura em media: %.4f rodadas. %n", (double) rounds / 1000000);
    }

    /**
     * Simula o lançamento de dois dados de 6 faces
     * @return A soma dos números sorteados nos dados
     */
    public static int rollDices() {
        
        //intância um gerador de números verdadeiramente aleatórios
        SecureRandom random = new SecureRandom();

        //inicializa dice1 e dice2 com valores aleatórios de 1 a 6
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        //armazena a soma dos dados
        int sumOfDices = dice1 + dice2;

        //imprime os resultados da jogada
        System.out.printf("O jogador tirou %d + %d = %d%n",dice1, dice2, sumOfDices);

        //retorna o valor da soma dos dados
        return sumOfDices;
    }

    /**
     * Simula uma partida de craps
     * @return O resultado de uma partida de craps (CrapsResust) contendo o resultado (Status.WON ou Status.LOST) e um 
     * int que informa o número da rodada em que o jogo terminou.
     */
    public static CrapsResult playCraps() {
        
        //resultados que afetam o jogo
        final int SNAKE_EYES = 2;
        final int TREY = 3;
        final int SEVEN = 7;
        final int YO_ELEVEN = 11;
        final int BOX_CARS = 12;

        int myPoints = 0;               //guarda os pontos do jogador
        int sumOfDices = rollDices();   //guarda o resultado da jogada atual
        int rounds = 1;                 //guarda o número de lançamentos de dados
        
        Status gameStatus;              //guarda valores enum

        //determina o estado do jogo e a pontuação com base na primeira rodada
        switch(sumOfDices){
            case SEVEN:             //ganha com 7 na primeira rodada
            case YO_ELEVEN:         //ganha com 11 na primeira rodada
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:        //perde com 2 na primeira rodada
            case TREY:              //perde com 3 na primeira rodada
            case BOX_CARS:          //perde com 12 na primeira rodada
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;       //o jogo continua
                myPoints = sumOfDices;              //atribui e exibe a pontuação do jogador
                System.out.printf("Sua pontuacao foi de %d pts.%n", myPoints);
                break;
        }

        //enquanto não for obtido um resultado que encerre o jogo, o jogador deve continuar a lançar dados
        while(gameStatus == Status.CONTINUE){
            sumOfDices = rollDices();
            rounds++;

            if(sumOfDices == myPoints){
                gameStatus = Status.WON;
            }else if(sumOfDices == SEVEN){
                gameStatus = Status.LOST;
            }
        }

        //exibe o resultado do jogo
        if(gameStatus == Status.WON){
            System.out.println("Parabéns, você ganhou!");
        }else{
            System.out.println("Mais sorte da próxima vez, você perdeu.");
        }

        return new CrapsResult(gameStatus, rounds);
    }
}

//declara a enum com os status do jogo
enum Status{CONTINUE, WON, LOST};

class CrapsResult{

    private Status gameStatus;
    private int rounds;

    public CrapsResult(Status gameStatus, int rounds){
        this.gameStatus = gameStatus;
        this.rounds = rounds;
    }

    public Status getGameStatus(){
        return this.gameStatus;
    }

    public int getRounds(){
        return this.rounds;
    }
}