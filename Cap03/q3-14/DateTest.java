
/* 
    Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int ), dia (tipo int ) e ano 
    (tipo int ). Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos 
    estejam corretos. Ofereça um método set e um get para cada variável de instância. Apresente um método displayDate 
    que exiba mês, dia e ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DateTest que 
    demonstre as capacidades da classe Date .
*/

//utilizaremos as caixas de diálogo Swing para entrada e saída a fim de exercitar

import javax.swing.JOptionPane;

public class DateTest{

    public static void main(String[] args){

        //declara variaveis para armazenar as entradas do usuario
        int day;
        int month;
        int year;

        //declara um objeto Date
        Date data;

        //solicita ao usuario que forneça um valor para o dia, mes e ano
        day = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o dia de hoje: "));
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o mes atual: "));
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "informe o ano corrente: "));

        //instância um objeto Date
        data = new Date(day, month, year);

        //exibe a data atual
        JOptionPane.showMessageDialog(null, data.displayDate());

        //solicita ao usuário que altere o dia
        day = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um novo dia: "));
        data.setDay(day);

        //exibe a nova data
        JOptionPane.showMessageDialog(null, data.displayDate());

        //algo inesperado aconteceu
        data.setYear(data.getYear() + 100);
        JOptionPane.showMessageDialog(null, String.format("Oops, algo deu errado e você viajou 100 anos no futuro!! %s",
            data.displayDate()));
    }
}