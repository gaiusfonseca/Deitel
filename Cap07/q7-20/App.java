/* 
    7.20 (Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem quatro 
    equipes de vendas (1 a 4) que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma 
    nota de cada tipo de produto diferente vendido.
    
    Cada nota contém o seguinte:
    a) O número do vendedor
    b) O número do produto
    c) O valor total em reais desse produto vendido nesse dia
    
    Portanto, cada vendedor passa entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de todas as 
    notas durante o último mês estejam disponíveis. Escreva um aplicativo que leia todas essas informações sobre as 
    vendas do último mês e resuma as vendas totais por vendedor e por produto. Todos os totais devem ser armazenados no 
    array bidimensional sales. Depois de processar todas as informações do último mês, exiba os resultados em formato 
    tabular, com cada coluna representando um vendedor particular e cada linha representando um produto particular. Some
    cada linha para obter o total das vendas de cada produto no último mês. Some cada coluna para obter o total de 
    vendas por vendedor no último mês. Sua saída tabular deve incluir esses totais cruzados à direita das linhas 
    totalizadas e na parte inferior das colunas totalizadas.
*/

import java.util.Random;
import java.util.ArrayList;

public class App{

    public static void main(String[] args) {
        
        //prepara um ArrayList de Invoices
        ArrayList<Invoice> invoices = new ArrayList<>();
        
        //prepara um array bidimensional para sumarizar as vendas
        int[][] sales = new int[5][6];

        //gera um volume de notas aleatório para 30 dias considerando a regras do problema
        generateNotes(invoices);

        //percorre o ArrayList para sumarizar os valores
        for(Invoice inv : invoices){
            sales[inv.getSeller()][inv.getProduct()] += inv.getSales();
        }

        //imprime a tabela
        displaySummary(sales);
    }

    /**
     * Gera um número aleatório de notas considerando as restrições do problema e as insere no ArrayList<Invoice> 
     * fornecido.
     * @param invoices Um ArrayList<Invoice> que armazenará as notas gearadas.
     */
    public static void generateNotes(ArrayList<Invoice> invoices) {
        
        Random random = new Random();
        Invoice inv;

        //para cada dia do mês
        for(int day = 1; day <= 30; day++){
            
            //cada vendedor
            for(int seller = 1; seller <= 4; seller++){
                
                //para cada produto
                for(int product = 1; product <= 5; product++){
                    
                    //gera um número de notas entre 0 e 5
                    for(int note = 0; note < random.nextInt(7); note++){
                        inv = new Invoice(seller, product);
                        invoices.add(inv);
                    }
                }
            }
        }
    }

    /**
     * Imprime os totais vendidos de cada produto, por cada um dos vendedores.
     * @param sales um array bidimensional de inteiros em que as linhas são os vendedores e as colunas são os
     * produtos e os valores armazenados representam o total de vendas da combinação (vendedor, produto) em um dado mês.
     */
    public static void displaySummary(int[][] sales) {
        
        //inicializa as variáveis que vão acumular o total de vendas do vendedor e por produto
        int totalBySeller = 0;
        int totalByProduct = 0;

        //imprime o cabeçalho da tabela
        System.out.printf("%15s", "Sellers");
        System.out.printf("%15s", "Product 1");
        System.out.printf("%15s", "Product 2");
        System.out.printf("%15s", "Product 3");
        System.out.printf("%15s", "Product 4");
        System.out.printf("%15s", "Product 5");
        System.out.printf("%15s%n", "Total Seller");
        
        //para cada vendedor
        for(int seller = 1; seller <= 4; seller++){

            //imprime rótulo da linha
            System.out.printf("Seller %7d ", seller);

            //imprime o total para cada combinação (venderdor, produto)
            for(int product = 1; product <= 5; product++){
                totalBySeller += sales[seller][product];
                System.out.printf("%14d ",sales[seller][product]);
            }

            //imprime o total vendido pelo vendedor e reseta o acumulador para a próxima iteração
            System.out.printf("%14d %n", totalBySeller);
            totalBySeller = 0;
        }

        //imprime a linha com os totais dos produtos
        System.out.printf("%s ", "Total Products");

        //imprime a linha dos totais após o fim da tabela
        for(int product = 1; product <= 5; product++){

            //sumariza o valor total vendido de um produto
            for(int seller = 1; seller <= 4; seller++){
                totalByProduct += sales[seller][product];
            }

            //imprime o valor total vendido de um produto e reseta o acumulador para a próxima iteração
            System.out.printf("%14d ", totalByProduct);
            totalByProduct = 0;
        }

        System.out.println();
    }
}
