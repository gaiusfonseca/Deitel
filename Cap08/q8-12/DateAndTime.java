import java.sql.Date;

/* 
    8.12 (Classe DateAndTime ) Crie uma classe DateAndTime que combina a classe Time2 modificada do Exercício 8.7 e a 
    classe Date modificada do Exercício 8.8. Modifique o método incrementHour para chamar o método nextDay se a 
    data/hora for incrementada para o próximo dia. Modifique métodos toString e toUniversalString para gerar uma saída 
    da data além da hora. Escreva um programa para testar a nova classe DateAndTime . Especificamente, teste o 
    incremento de tempo para o próximo dia.
*/

public class DateAndTime{

    private int second;
    private int minute;
    private int hour;
    private int day;
    private int month;
    private int year;

    private static final int[] DAYS_PER_MONTH = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Constrói um objeto DateAndTime com os valores padrões (01/01/2021 00:00:00).
     */
    public DateAndTime(){
        this(2021, 1, 1, 0, 0, 0);
    }

    /**
     * Constrói um objeto DateAndTime a partir de um ano específico e assume valores padrões para os  demais dados.
     * @param year Um inteiro que representa um ano específico, deve ser um valor maior que 0.
     */
    public DateAndTime(int year){
        this(year, 1, 1, 0, 0, 0);
    }

    /**
     * Constrói um objeto DateAndTime a partir de mês e ano específico e assume valores padrões para os demais dados.
     * @param year Um inteiro que representa um ano específico, deve ser um valor maior que 0.
     * @param month Um inteiro que representa um mês específico, deve estar entre 1-12
     */
    public DateAndTime(int year, int month){
        this(year, month, 1, 0, 0, 0);
    }

    /**
     * Constrói um objeto DateAndTime a partir de um dia, mês e ano específico e assume valores padrões para os demais 
     * dados.
     * @param year Um inteiro que representa um ano específico, deve ser um valor maior que 0.
     * @param month Um inteiro que representa um mês específico, deve estar entre 1-12
     * @param day Um inteiro que representa um dia específico, deve estar entre 1 e o número máximo de dias do mês, no
     * ano específico.
     */
    public DateAndTime(int year, int month, int day){
        this(year, month, day, 0, 0, 0);
    }

    /**
     * Constrói um objeto DateAndTime a partir de outro objeto DateAndTime.
     * @param date Um objeto DateAndTime.
     */
    public DateAndTime(DateAndTime date){
        this(date.getYear(), date.getMonth(), date.getDay(), date.getHour(), date.getMinute(), date.getSecond());
    }

    /**
     * Constrói um objeto DateAndTime a partir de valores de ano, mês dia, hora, minuto e segundo
     * @param year Um inteiro que indica o ano, deve ser maior que zero.
     * @param month Um inteiro que indica o mês, deve estar entre 1-12.
     * @param day Um inteiro que indica o dia, deve repspeitar o número de dias do mês em questão.
     * @param hour Um inteiro que indica uma hora, deve estrar entre 0-23.
     * @param minute Um inteiro que indica um minuto, deve estrar entre 0-59.
     * @param second Um inteiro que indica um segundo, deve estrar entre 0-59.
     */
    public DateAndTime(int year, int month, int day, int hour, int minute, int second){
        //prepara as mensagens de erro
        String errorMessageYear = String.format("o valor do ano (%02d) deve ser maior que 0.", year);
        String errorMessageMonth = String.format("o valor de mês (%02d) deve estar entre 1-12.", month);
        String errorMessageDay = String.format("o valor de dia (%02d) fornecido é inválido para este ano (%4d) e mês (%02d).", 
            day, year, month);
        String errorMessageHour = String.format("horas (%02d) está fora do invervalo permitido 0-23.%n", hour);
        String errorMessageMinute = String.format("minutos (%02d) está fora do intervalo permitido 0-59.%n", minute);
        String errorMessageSecond = String.format("segundos (%02d) está fora do intervalo permitido 0-59.%n", second);

        //verifica se year é válido
        if(!isValidYear(year)){
            throw new IllegalArgumentException(errorMessageYear);
        }

        //verifica se mês está no intervalo válido
        if(!isValidMonth(month)){
            throw new IllegalArgumentException(errorMessageMonth);
        }

        //verifica se o dia informado é um valor válido
        if(!isValidDay(year, month, day)){
            throw new IllegalArgumentException(errorMessageDay);
        }

        //verifica se hour está no intervalo permitido
        if(!isHourInRange(hour)){
            throw new IllegalArgumentException(errorMessageHour);
        }

        //verifica se minute está no intervalo permitido
        if(!isMinuteInRange(minute)){
            throw new IllegalArgumentException(errorMessageMinute);
        }

        //verifica se second está no intervalo permitido
        if(!isSecondInRange(second)){
            throw new IllegalArgumentException(errorMessageSecond);
        }

        //atualiza o valor de year
        this.year = year;
        
        //atualiza o valor de month
        this.month = month;
        
        //atualiza o valor de day
        this.day = day;
        
        //atualiza o valor de hour
        this.hour = hour;
        
        //atualiza o valor de minute
        this.minute = minute;
        
        //atualiza o valor de second
        this.second = second;
    }

    /**
     * Recupera o valor do atributo second
     * @return Um inteiro que representa os segundos configurados no objeto DateAndTime.
     */
    public int getSecond() {
        return second;
    }

    /**
     * Valida e atualiza o valor do atributo second
     * @param second Um inteiro que representa o valor para o qual se quer definir o atributo second, deve estar entre 
     * 0-59.
     */
    public void setSecond(int second) {

        //prepara a mensagem de erro
        String errorMessage = String.format("segundos (%02d) está fora do intervalo permitido 0-59.%n", second);

        //verifica se second está no intervalo permitido
        if(!isSecondInRange(second)){
            throw new IllegalArgumentException(errorMessage);
        }

        //atualiza o valor de second
        this.second = second;
    }

    /**
     * Recupera o valor do atributo minute
     * @return Um inteiro que representa os minutos configurados no objeto DateAndTime.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Valida e atualiza o valor do atributo minute
     * @param minute Um inteiro que representa o valor para o qual se quer definir o atributo minute, deve estar entre 
     * 0-59.
     */
    public void setMinute(int minute) {
        
        //prepara a mensagem de erro
        String errorMessage = String.format("minutos (%02d) está fora do intervalo permitido 0-59.%n", minute);

        //verifica se minute está no intervalo permitido
        if(!isMinuteInRange(minute)){
            throw new IllegalArgumentException(errorMessage);
        }

        //atualiza o valor de minute
        this.minute = minute;
    }

    /**
     * Recupera o valor do atributo hour
     * @return Um inteiro que representa as horas configuradas no objeto DateAndTime.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Valida e atualiza o valor do atributo hour
     * @param hour Um inteiro que representa o valor para o qual se quer definir o atributo hour, deve estar entre 
     * 0-23.
     */
    public void setHour(int hour) {
        
        //prepara a mensagem de erro
        String errorMessage = String.format("horas (%02d) está fora do invervalo permitido 0-23.%n", hour);

        //verifica se hour está no intervalo permitido
        if(!isHourInRange(hour)){
            throw new IllegalArgumentException(errorMessage);
        }
        
        //atualiza o valor de hour
        this.hour = hour;
    }

    /**
     * Recupera o valor do atributo day
     * @return Um inteiro que representa o dia configurado no objeto DateAndTime.
     */
    public int getDay() {
        return day;
    }

    /**
     * Valida e atualiza o valor do atributo day
     * @param day Um inteiro que representa o valor para o qual se quer definir o atributo day, deve estar entre 
     * 1 e o maior dia dentro do mês que está configurado no objeto DateAndTime.
     */
    public void setDay(int day) {
        
        //prepara a mensagem de erro
        String errorMessage = String.format("o valor de dia (%02d) fornecido é inválido para este ano (%4d) e mês (%02d).", 
            day, getYear(), getMonth());

        //verifica se o dia informado é um valor válido
        if(!isValidDay(getYear(), getMonth(), day)){
            throw new IllegalArgumentException(errorMessage);
        }
        
        //atualiza o valor de day
        this.day = day;
    }

    /**
     * Recupera o valor do atributo month
     * @return Um inteiro que representa o mês configurado no objeto DateAndTime.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Valida e atualiza o valor do atributo month
     * @param month Um inteiro que representa o valor para o qual se quer definir o atributo month, deve estar 
     * entre 1-12.
     */
    public void setMonth(int month) {
        
        //prepara a mensagem de erro
        String errorMessage = String.format("o valor de mês (%02d) deve estar entre 1-12.", month);

        //verifica se mês está no intervalo válido
        if(!isValidMonth(month)){
            throw new IllegalArgumentException(errorMessage);
        }
        
        //atualiza o valor de month
        this.month = month;
    }

    /**
     * Recupera o valor do atributo year
     * @return Um inteiro que representa o ano configurado no objeto DateAndTime.
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Valida e atualiza o valor do atributo year
     * @param year Um inteiro que representa o valor para o qual se quer definir o atributo year, deve ser maior que 0.
     */
    public void setYear(int year) {
        
        //preapara a mensagem de erro
        String errorMessage = String.format("o valor do ano (%02d) deve ser maior que 0.", year);
        
        //verifica se year é válido
        if(!isValidYear(year)){
            throw new IllegalArgumentException(errorMessage);
        }
        
        //atualiza o valor de year
        this.year = year;
    }

    /**
     * Incrementa um segundo ao objeto atual.
     */
    public void incrementSecond(){
        //define qual seria o próximo segundo
        int nextSecond = getSecond() + 1;

        //verifica se o próximo segundo causa uma transição de minuto
        if(nextSecond >= 60){
            setSecond(0);
            incrementMinute();
        }else{
            setSecond(nextSecond);
        }
    }

    /**
     * Incrementa um minuto ao objeto atual.
     */
    public void incrementMinute(){
        //define qual seria o próximo minuto
        int nextMinute = getMinute() + 1;

        //verifica se o próximo minuto causa uma transição de horas
        if(nextMinute >= 60){
            setMinute(0);
            incrementHour();
        }else{
            setMinute(nextMinute);
        }

    }

    /**
     * Incrementa uma hora ao objeto atual.
     */
    public void incrementHour(){
        //define qual seria a próxima hora
        int nextHour = getHour() + 1;

        //verifica se a próxima hora causa uma transição de dia
        if(nextHour >= 24){
            setHour(0);
            incrementDay();
        }else{
            setHour(nextHour);
        }
    }

    /**
     * Incrementa um dia ao objeto atual.
     */
    public void incrementDay(){
        //define qual seria o próximo dia
        int nextDay = getDay() + 1;

        //verifica se o próximo dia causa uma transição de mês
        if(isLeapYear(getYear()) && getMonth() == 2 && nextDay == 29){
            setDay(nextDay);
        }else if(nextDay > DAYS_PER_MONTH[getMonth()]){
            setDay(1);
            incrementMonth();
        }else{
            setDay(nextDay);
        }
    }
    
    /**
     * Incrementa um mês ao objeto atual
     */
    public void incrementMonth(){
        //define qual seria o próximo mês
        int nextMonth = getMonth() + 1;

        //verifica se o próximo mês causa uma transição de nao
        if(nextMonth > 12){
            setMonth(1);
            incrementYear();
        }else{
            setMonth(nextMonth);
        }
    }

    /**
     * Incrementa um ano ao objeto atual
     */
    public void incrementYear(){
        //define qual seria o próximo ano
        int nextYear = getYear() + 1;

        //atualiza o valor de year
        setYear(nextYear);
    }
    
    /**
     * Converte o objeto em uma String utilizando a formatação americana.
     * @return Uma String que representa a data e hora no formato americano.
     */
    @Override
    public String toString(){
        return String.format("%d/%d/%d %d:%02d:%02d %s%n", 
            getDay(), getMonth(), getYear(), hourToAmericanTime(), getMinute(), getSecond(), amPm());
    }

    /**
     * Converte o objeto em uma String utilizando a formatação internacional.
     * @return Uma String que representa a data e hora no formato internacional
     */
    public String toUniverSalString(){
        return String.format("%02d/%02d/%4d %02d:%02d:%02d%n", 
            getDay(), getMonth(), getYear(), getHour(), getMinute(), getSecond());
    }

    /**
     * Valida o argumento second informado
     * @param second Um inteiro que representa um segundo.
     * @return True, se second estiver em um intervalo válido para segundos. False, caso contrário.
     */
    private boolean isSecondInRange(int second){
        
        if(second < 0 || second >= 60){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Valida o argumento minute informado
     * @param minute Um inteiro que representa um minuto.
     * @return True, se second estiver em um intervalo válido para minutos. False, caso contrário.
     */
    private boolean isMinuteInRange(int minute){
        
        if(minute < 0 || minute >= 60){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Valida o argumento hour informado
     * @param hour Um inteiro que representa uma hora.
     * @return True, se hour estiver em um intervalo válido para horas. False, caso contrário.
     */
    private boolean isHourInRange(int hour){
        
        if(hour < 0 || hour >= 24){
            return false;
        }else{
            return true;
        }
    }

    /**
     * Valida o argumento year informado é um ano bissexto.
     * @param year Um inteiro que representa um ano.
     * @return True, se year for um ano bissexto. False, caso contrário.
     */
    private boolean isLeapYear(int year){
    
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Valida o argumento year informado.
     * @param year Um inteiro que representa um ano.
     * @return True, se year for maior que 0. False, caso contrário.
     */
    private boolean isValidYear(int year){

        if(year > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Valida o argumento month informado.
     * @param month Um inteiro que representa um mês.
     * @return True, se month estiver no intervalo 1-12. False, caso contrário.
     */
    private boolean isValidMonth(int month){

        if(month > 0 && month <= 12){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Valida o argumento day informado.
     * @param day Um inteiro que representa um dia.
     * @return True, se day estiver entre 1 e o número máximo de dias do mês para o ano informado. False, caso contrário.
     */
    private boolean isValidDay(int year, int month, int day){

        if(isLeapYear(year) && month == 2 && day <= 29){
            return true;
        }else if(day <= DAYS_PER_MONTH[month]){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Define, a partir das horas, em que ciclo do dia está e retorna a String correspondente.
     * @return A String "AM", se estiver no primeiro ciclo do dia. A String "PM", se estiver no segundo ciclo.
     */
    private String amPm(){
        return getHour() < 12 ? "AM" : "PM";
    }

    /**
     * Converte as horas na representação internacional (0-24) para o formato americano (12AM-12PM).
     * @return A representação das horas no formato americano (12AM-12PM) como um inteiro.
     */
    private int hourToAmericanTime(){
        return getHour() == 0 || getHour() == 12 ? 12 : getHour() % 12;
    }

}