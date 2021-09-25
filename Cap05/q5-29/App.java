/* 
    5.29 Escreva um aplicativo que utiliza instruções de repetição e switch para imprimir a canção “The Twelve Days of 
    Christmas”. Uma instrução switch deve ser utilizada para imprimir o dia (“primeiro”, “segundo” etc.). Uma instrução 
    switch separada deve ser utilizada para imprimir o restante de cada verso. Visite o site 
    en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song) para obter a letra da música.
*/

public class App{

    public static void main(String[] args) {
        
        //considerando que se trata de uma canção cumultativa, precisaremos de uma estrutura de repetição
        for(int line = 1; line <= 12; line++){

            //imrpime o começo do verso de abertura
            System.out.print("On the ");

            //imprime o dia
            switch(line){
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eigth ");
                    break;
                case 9:
                    System.out.print("nineth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                default:
                    System.out.print("twelfth ");
                    break;
            }

            //imprime o fechamento do verso de abertura
            System.out.println("day of Christmas my true love sent to me");

            //imprime os demais versos
            for(int verse = line; verse >= 1; verse--){

                switch(verse){
                    case 1:
                        System.out.println("a partridge in a pear tree.\n");
                        break;
                    case 2:
                        System.out.println("two turtle doves,");
                        System.out.print("And ");
                        break;
                    case 3:
                        System.out.println("three frech hens,");
                        break;
                    case 4:
                        System.out.println("four calling birds,");
                        break;
                    case 5:
                        System.out.println("five gold rings,");
                        break;
                    case 6:
                        System.out.println("six geese a-laying");
                        break;
                    case 7:
                        System.out.println("seven swans a-swimming,");
                        break;
                    case 8:
                        System.out.println("eight maids a-milking,");
                        break;
                    case 9:
                        System.out.println("nine ladies dancing,");
                        break;
                    case 10:
                        System.out.println("ten lords a-leaping,");
                        break;
                    case 11:
                        System.out.println("eleven pipers piping,");
                        break;
                    default:
                        System.out.println("twelve drummmers drumming,");
                        break;
                }
            }
        }
    }
}