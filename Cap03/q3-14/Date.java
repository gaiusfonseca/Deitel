
/* 
    Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int ), dia (tipo int ) e ano 
    (tipo int ). Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos 
    estejam corretos. Ofereça um método set e um get para cada variável de instância. Apresente um método displayDate 
    que exiba mês, dia e ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DateTest que 
    demonstre as capacidades da classe Date .
*/

public class Date{

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String displayDate(){
        return String.format("Hoje: %d/%d/%d", day, month, year);
    }
}