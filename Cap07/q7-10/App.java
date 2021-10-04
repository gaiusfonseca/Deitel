/* 
    7.10 (Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu 
    pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante 
    essa semana. Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou 
    um total de R$ 650. Escreva um aplicativo (utilizando um array de contadores) que determina quanto o pessoal de 
    vendas ganhou em cada um dos seguintes intervalos (suponha que o salário de cada vendedor foi truncado para uma 
    quantia inteira)

    a) $200–299
    b) $300–399
    c) $400–499
    d) $500–599
    e) $600–699
    f) $700–799
    g) $800–899
    h) $900–999
    i) R$ 1.000 e acima
    
    Resuma os resultados em formato tabular.
*/

public class App{

    public static void main(String[] args) {

        //armazena os valores máximo e mínimo de cada semana
        int[] sales =  new int[2];

        //configura os valores máximo e mínimo de cada semana
        for(int week = 2; week <= 10; week++){

            for(int index = 0; index < sales.length; index++){
                if(index == 0){
                    sales[index] = week * 100;
                }else{
                    sales[index] = week * 100 + 99;
                }
            }

            //imprime o cabeçalho
            if(week == 2){
                System.out.printf("%9s %9s%n", "Vendas", "Salário");
            }

            //imprime os valores
            for(int index = 0; index < sales.length; index++){
                System.out.printf("%9d %9d%n", sales[index], salary(sales[index]));
            }
        }
    }

    public static int salary(int sales) {
        
        int salary = 200 + (int) (0.09 * sales);

        return salary;
    }
}