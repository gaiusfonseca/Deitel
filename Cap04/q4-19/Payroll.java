/* 
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
    a) Leia a declaração do problema.
    b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
    c) Escreva um programa Java.
    d) Teste, depure e execute o programa Java.
    e) Processe três conjuntos completos de dados.

    4.19 Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas recebe R$ 200 por semana 
    mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas de 
    mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma 
    lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:

    Item    Value:
    1       239.99
    2       129.75
    3        99.95
    4       350.89

    Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e 
    exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
*/

//importa o Scanner para capturar a entrada do usuário
import java.util.Scanner;

public class Payroll{

    public static void main(String[] args){

        double salary;                              //delcara salary para armazenar o valor da remuneração
        double price;                               //declara prince para capturar o preço dos itens
        double total = 0;                           //declara total para acumular o valor total de vendas
        Scanner input = new Scanner(System.in);     //declara Scanner para capturar a entrada do usuário

        //pergunta se o usuario deseja realizar uma entrada
        System.out.print("informe o valor da venda ou -1 para sair: ");
        price = input.nextDouble();

        //repete enquanto a o usuario não informar que deseja parar
        while(price != -1){

            //valida se a venda tem um valor maior que 0
            if(price > 0){
                
                //adiciona o valor da venda ao total
                total += price;
            }

            //pergunta se o usuario deseja realizar uma nova entrada?
            System.out.print("informe o valor da venda ou -1 para sair: ");
            price = input.nextDouble();
        }

        //calcula o valor da remuneração
        salary = 200 + 0.09 * total;

        //exibe o valor da remuneração
        System.out.printf("o valor da remuneracao e de: R$ %.2f%n", salary);
    }
}