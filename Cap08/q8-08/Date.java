import javax.lang.model.util.ElementScanner6;

public class Date {
    
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = 
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year){
        
        //verifica se o mês está em um intervalo de 0-12
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("mês (" + month + ") deve estar no intervalo 0-12.");
        }

        //verifica se o dia está em um intervalo válido de acordo com o mês informado, permitindo como exceção 29/02
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)){
            throw new IllegalArgumentException("dia (" + day + ") fora do intervalo para mês e ano especificado");
        }

        //para o caso de informarem o dia 29/02, verifica se o ano informado é divisível por 4 mas não por 100.
        //a utilização da expressão year % 400 == 0 é um forma de encurtar a velocidade da avaliação
        if(month == 2 && day == 29 && !(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)){
            throw new IllegalArgumentException("dia (" + day + ") fora do intervalo para mês e ano especificado");
        }

        //verifica se year é um valor entre 0 e 9999
        if(year < 0){
            throw new IllegalArgumentException("ano (" + year + ") deve ser um valor positivo");
        }

        this.day = day;
        this.month = month;
        this.year = year;

        System.out.printf("Construtor Date para data %s%n", this);
    }
    
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        //verifica se o mês está em um intervalo de 0-12
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("mês (" + month + ") deve estar no intervalo 0-12.");
        }
        
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        //verifica se o dia está em um intervalo válido de acordo com o mês informado, permitindo como exceção 29/02
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)){
            throw new IllegalArgumentException("dia (" + day + ") fora do intervalo para mês e ano especificado");
        }

        //para o caso de informarem o dia 29/02, verifica se o ano informado é bissexto, se não for, lança o erro
        if(month == 2 && day == 29 && !(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)){
            throw new IllegalArgumentException("dia (" + day + ") fora do intervalo para mês e ano especificado");
        }
        
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        //verifica se year é um valor entre 0 e 9999
        if(year < 0){
            throw new IllegalArgumentException("ano (" + year + ") deve ser um valor positivo");
        }
        
        this.year = year;
    }

    public void nextDay(){
        
        int nextDay = getDay() + 1;
        
        //se for um ano bissexto e o mês for dois
        if(month == 2 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)){
            if(nextDay > 29){
                setDay(1);
                nextMonth();
            }else{
                setDay(nextDay);
            }
        }else if(nextDay > daysPerMonth[getMonth()]){
            setDay(1);
            nextMonth();
        }else{
            setDay(nextDay);
        }
    }

    public void nextMonth(){

        int nextMonth = getMonth() + 1;

        if(nextMonth > 12){
            setMonth(1);
            nextYear();
        }else{
            setMonth(nextMonth);
        }
    }

    public void nextYear(){

        int nextYear = getYear() + 1;

        setYear(nextYear);
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
