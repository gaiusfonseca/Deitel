

public class DateAndTimeTest{

    public static void main(String[] args) {
        
        DateAndTime date = new DateAndTime();

        displayTime("testa os métodos toString:", date);

        //altera a hora para 23:59 e testa uma transição de dia
        resetTo(date, 23, 59, 59);

        //testa o incremento de segundo que implica em transição de dia comun
        displayTime("testa transição de dia comun (antes):", date);
        date.incrementSecond();
        displayTime("testa transição de dia comun (depois):", date);

        //altera a data para 28/02 de um ano bissexto
        date.setYear(2024);
        date.setMonth(2);
        date.setDay(28);
        
        //redefine as horas para o ultimo segundo do dia
        resetTo(date, 23, 59, 59);

        //testa o incremento de segundo que implica em transição de dia em 28/02 de um ano bissexto
        displayTime("testa transição de dia em 28/02 de um ano bissexto (antes):", date);
        date.incrementSecond();
        displayTime("testa transição de dia em 28/02 de um ano bissexto (depois):", date);

        //redefine as horas para o ultimo segundo do dia
        resetTo(date, 23, 59, 59);

        //testa o incremento de segundo que implica em transição de mês
        displayTime("testa transição de mês em função do incremento de segundo (antes):", date);
        date.incrementSecond();
        displayTime("testa transição de mês em função do incremento de segundo (depois):", date);

        //altera a data para 31/12/2021
        date.setYear(2021);
        date.setMonth(12);
        date.setDay(31);

        //redefine as horas para o ultimo segundo do dia
        resetTo(date, 23, 59, 59);
        
        //testa o incremento de segundo que implica em transição de ano
        displayTime("testa transição de ano em função do incremento de segundo (antes):", date);
        date.incrementSecond();
        displayTime("testa transição de ano em função do incremento de segundo (depois):", date);

    }

    public static void displayTime(String header, DateAndTime date) {
        System.out.printf("%n%s%n  %s  %s", header, date.toUniverSalString(), date);
    }

    public static void resetTo(DateAndTime date, int hour, int minute, int second) {
        date.setHour(hour);
        date.setMinute(minute);
        date.setSecond(second);
    }
}