/* 
    7.19 (Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou de comprar um computador para seu 
    novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um 
    aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).

    Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e Please type 2 for Economy.
    [Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]. Se o usuário digitar 1, seu aplicativo 
    deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, seu aplicativo deve atribuir um 
    assento na classe econômica (poltronas 6 a 10). Seu aplicativo deve exibir um cartão de embarque indicando o número 
    da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

    Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 
    Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. À medida 
    que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não 
    está mais disponível.

    Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada. Quando a classe econômica estiver lotada, seu 
    aplicativo deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição 
    apropriada de assento. Se não, exiba a mensagem "Next flight leaves in 3 hours" [O próximo voo parte em 3 horas].
*/

import java.util.Scanner;

public class App{

    //instância um Scanner para capturar a entrada do usuário
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        //declara um array de 10 posições para representar os lugares ocupados.
        boolean[] sits = new boolean[10];

        //declara um array de Strings com as opções do menu principal que será exibido ao usuário
        String[] mainMenu = {"0 - sair", "1 - primeira classe", "2 - classe econômica"};

        //declara um array de Strings com as opções do menu que será exibido ao ussuário quando o vôo estiver cheio.
        String[] noRoomMenu = {"0 - sair", "1 - trocar de classe"};
        
        int option;                                         //guarda a opção escolhida pelo usuário
        boolean isFirstClassAvailable = true;               //indica se existe assento disponível na primeira classe
        boolean isEconomicClassAvailable = true;            //indica se existe assento disponível na classe econômica

        //inicializa o array com lugares vazios (false).
        reset(sits);
        
        //repete enquanto houver vaga no vôo
        while(isFirstClassAvailable || isEconomicClassAvailable){
            
            //verifica se existem assentos disponíveis em cada uma das classes
            isFirstClassAvailable = isAvailable(0, 5, sits);
            isEconomicClassAvailable = isAvailable(5, 10, sits);
            
            //exibe as posições vazias
            displaySits(sits);
    
            //solicita que o usuário escolha uma opção
            option = requestOption(mainMenu);
            
            if(option == 0){
                break;
            }else if(option == 1 && isFirstClassAvailable){
                book(option, sits);
            }else if(option == 1 && !isFirstClassAvailable){
                System.out.println("Não temos mais lugares disponíveis nesta classe.");
                option = requestOption(noRoomMenu) == 1 ? 2 : 0;
                if(option == 0){
                    System.out.println("O próximo vôo sai em três horas");
                    break;
                }else{
                    book(option, sits);
                }
            }else if(option == 2 && isEconomicClassAvailable){
                book(option, sits);
            }else{
                System.out.println("Não temos mais lugares disponíveis nesta classe.");
                option = requestOption(noRoomMenu) == 1 ? 1 : 0;
                if(option == 0){
                    System.out.println("O próximo vôo sai em três horas");
                    break;
                }else{
                    book(option, sits);
                }
            }
        }

        //verifica se todos os assentos estão ocupados
        if(!isFirstClassAvailable && !isEconomicClassAvailable){
            System.out.println("Desculpe, não temos mais lugares disponíveis.");
            System.out.println("O próximo vôo sai em três horas.");
        }
    }
    
    /**
     * Recebe um array de Strings contendo as opções disponíveis e as exibe para o usuário.
     * @param menu Um array de Strings contendo as opções que serão exibidas ao usuário
     * @return Um inteiro que indica a opção escolhida pelo usuário.
     */
    public static int requestOption(String[] menu) {
        
        int option;     //guarda a opção do usuário

        //solicita uma entrada enquanto não for uma opção válida
        do{
            System.out.println("Escolha uma opção digitando o valor correspondente:");
            for(String menuEntry : menu){
                System.out.println(menuEntry);
            }
            option = input.nextInt();
        }while(option < 0 || option > menu.length - 1);

        //imprime uma linha extra para melhorar a legibilidade da saída
        System.out.println();

        //retorna a opção do usuário
        return option;
    }

    /**
     * Recebe um array de lugares em um voo e exibe graficamente as poltronas, indicando se estão ocupadas [X] ou vazias
     * [ ].
     * @param sits Um array boolean que representa os lugares ocupados em um voo. True indica um assento ocupado. False 
     * indica um assento livre.
     */
    public static void displaySits(boolean[] sits) {
        
        //pula uma linha para melhorar a legibilidade
        System.out.println();

        //imprime o estado de cada assento
        for(int i = 0; i < sits.length; i++){
            
            
            if(i != 0 && i % 2 == 1){   //se for um número ímpar (limite direito da linha), reposiciona o cursor na próxima linha.
                if(sits[i]){
                    System.out.println("[X]");
                }else{
                    System.out.println("[ ]");
                }
            }else{                      //se não for um número ímpar, imprime o estado assento e da um espaço extra.
                if(sits[i]){
                    System.out.print("[X]  ");
                }else{
                    System.out.print("[ ]  ");
                }
            }
        }

        //pula uma linha para melhorar a legibilidade
        System.out.println();
    }

    /**
     * Exibe o cartão de embarque do usuário quando ele consegue fazer a reserva.
     * @param sit Um inteiro que representa o indíce do array vinculado ao assento do passageiro.
     */
    public static void displayBoardingPass(int sit) {
        
        //imprime o cabeçalho do cartão de embarque
        System.out.println("BOARDING PASS");
        
        //imprime o número da poltrona
        System.out.printf("poltrona: %d%n", sit + 1);
        
        //imprime a classe do voo
        if(sit <= 4){    
            System.out.println("classe: primeira");
        }else{
            System.out.println("classe: economica");
        }
    }

    /**
     * Indica se existem assentos disponíveis em um determinado intervalo.
     * @param start Limite inferior, incluído, a partir do qual o array será pesquisado.
     * @param end Limite superior, não incluído, até o qual o array será pesquisado.
     * @param sits Um array de booleans que indica as posições ocupadas em um voo.
     * @return True se existe um lugar livre no intervalo dado, falso se não existir um lugar livre.
     */
    public static boolean isAvailable(int start, int end, boolean[] sits) {

        boolean isAvailable = false;

        for(int i = start; i < end; i++){
            if(!sits[i]){
                isAvailable = true;
            }
        }

        return isAvailable;
    }

    /**
     * Recebe um array de assentos disponíveis em um vôo e um intervalo de poltronas que satisfaz as necessidades do 
     * cliente, se encontrar um assento disponível dentro do intervalo, marca a poltrona como ocupada e imprime o cartão
     * de embarque do cliente.
     * @param option Um inteiro que representa a classe escolhida pelo usuário.
     * @param sits Um array boolean que representa os assentos ocupados em um vôo.
     */
    public static void book(int option, boolean[] sits) {
        
        //define o intervalo a ser pesquisado com base na opção do usuário
        int start;
        int end;

        if(option == 1){
            start = 0;
            end = 4;
        }else{
            start = 5;
            end = 9;
        }

        //percorre o array em busca de um lugar vazio
        for(int sit = start; sit <= end; sit++){
            
            //ao encontrar um assento livre no intervalo
            if(!sits[sit]){
                
                //registra como ocupado
                sits[sit] = true;
                
                //imprime o cartão de embarque
                displayBoardingPass(sit);
                
                //encerra o loop prematuramente
                break;
            }
        }
    }

    /**
     * Configura o valor inicial de um array de lugares no voo como false.
     * @param sits um array boolean que representa os assentos ocupados no voo. Assentos true estão ocupados. Assentos
     * false estão livres.
     */
    public static void reset(boolean[] sits) {
        
        for(int i = 0; i < sits.length; i++){
            sits[i] = false;
        }
    }

}