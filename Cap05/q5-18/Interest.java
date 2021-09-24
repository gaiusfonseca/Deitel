/* 
    5.18 Modifique o aplicativo na Figura 5.6 para utilizar apenas inteiros para calcular os juros compostos. [Dica: 
    trate todas as quantidades monetárias como números inteiros em centavos. Então, divida o resultado em suas partes 
    dólar e centavos utilizando as operações divisão e resto, respectivamente. Insira uma vírgula entre as partes dólar 
    e centavos.]
*/

/* 
    Notem que o comando da questão pede que valores monetários sejam representados como inteiros e em centavos, mas não
    especifica que a taxa deve ser um inteiro, por isso entendemos que essa seja a solução que o autor pretendia, apesar
    de sabermos que está incorreta, pois no 6° ano o valor seria 1.340,09 e não 1340,90. Isso acontece porque com a 
    solução solicitada pelo autor (fazer a concatenação parte inteeira + "," + parte fracionária) não conseguimos 
    colocar os zeros a esquerda.
*/

public class Interest{

    public static void main(String[] args) {
        
       int amountDollars;               //armazena a parte inteira
       int amountCents;                 //armazena a parte fracionária
       int principal = 1000 * 100;      //valor do principal em centavos
       double rate = 0.05;              //taxa de juros
       String value;                    //valor que será apresentado ao final como String

       //imprime o cabeçalho
       System.out.printf("%4s %20s%n","Ano", "Valor Futuro");

       //calcula o valor do montante a cada ano
       for(int year = 1; year <=10; ++year){

            //calcula a parte decimal e inteira
            amountDollars = (int) (principal * Math.pow(1 + rate, year) / 100);
            amountCents = (int) (principal * Math.pow(1 + rate, year) % 100);

            //prepara a String com o valor do montante utilizando a solução dada pelo autor
            value = String.format("%d,%-4d", amountDollars, amountCents);

            //imprime o resultado para cada ano
            System.out.printf("%4d %20s%n",year, value);
       }
    }
}