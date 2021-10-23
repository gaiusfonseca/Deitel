/* 
    (Aprimorando a classe Time2 ) Modifique a classe Time2 da Figura 8.5 para incluir um método tick que incrementa a 
    data/hora armazenada em um objeto Time2 em um segundo. Forneça um método incrementMinute para incrementar o minuto 
    por um e o método incrementHour para incrementar a hora por uma. Escreva um programa que testa o método tick, o 
    método incrementMinute e o método incrementHour para assegurar que eles funcionam corretamente. Certifique-se de 
    testar os seguintes casos:
    a) incrementar para o próximo minuto,
    b) incrementar para a próxima hora e
    c) incrementar para o próximo dia (isto é, 11:59:59 PM para 12:00:00 AM).
*/

public class Time2{

    private int hour;
    private int minute;
    private int second;

    /**
     * Cria um novo objeto Time2 com o valor 00:00:00
     */
    public Time2(){
        this(0, 0, 0);
    }

    /**
     * Cria um novo objeto Time2 definindo apenas as horas.
     * @param hour Um valor de hora no intervalo 0-23.
     */
    public Time2(int hour){
        this(hour, 0, 0);
    }

    /**
     * Cria um novo objeto Time2 definindo as horas e os minutos.
     * @param hour Um valor de hora no intervalo 0-23.
     * @param minute Um valor de minutos no intervalo 0-59.
     */
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }

    /**
     * Cria um novo objeto Time2 definindo as horas, minutos e segundos.
     * @param hour Um valor de hora no intervalo 0-23.
     * @param minute Um valor de minutos no intervalo 0-59.
     * @param second Um valor de segundos no intervalo 0-59.
     */
    public Time2(int hour, int minute, int second){

        //verifica se o valor de horas informado é um valor válido para horas
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("As horas devem estar no intervalo 0-23");
        }

        //verifica se o valor de minutos informado é um valor válido para minutos
        if(minute < 0 || minute >=60){
            throw new IllegalArgumentException("Os minutos devem estar no intervalo 0-59");
        }

        //verifica se o valor de segundos informado é um valor válido para segundos
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Os segundos devem estar no intervalo 0-59");
        }

        //define os valores de horas, minutos e segundos
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Cria um novo objeto Time2 a partir de um outro objeto Time2
     * @param time Uma referência a um objeto Time2.
     */
    public Time2(Time2 time){
        this(time.hour, time.minute, time.second);
    }

    /**
     * Define as horas para um instante específico no tempo
     * @param hour Um valor de hora no intervalo 0-23.
     * @param minute Um valor de minutos no intervalo 0-59.
     * @param second Um valor de segundos no intervalo 0-59.
     */
    public void setTime(int hour, int minute, int second){
        
        //verifica se o valor de horas informado é um valor válido para horas
        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("As horas devem estar no intervalo 0-23");
        }

        //verifica se o valor de minutos informado é um valor válido para minutos
        if(minute < 0 || minute >=60){
            throw new IllegalArgumentException("Os minutos devem estar no intervalo 0-59");
        }

        //verifica se o valor de segundos informado é um valor válido para segundos
        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Os segundos devem estar no intervalo 0-59");
        }

        //define os valores de horas, minutos e segundos
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Acessa a propriedade hora
     * @return O valor da hora
     */
    public int getHour(){
        return hour;
    }

    /**
     * Define a hora como um valor específico
     * @param hour Um valor de hora no intervalo 0-23.
     */
    public void setHour(int hour){

        if(hour < 0 || hour >= 24){
            throw new IllegalArgumentException("As horas devem estar no intervalo 0-23");
        }

        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute){

        if(minute < 0 || minute >= 60){
            throw new IllegalArgumentException("Os minutos devem estar no intervalo 0-59");
        }

        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){

        if(second < 0 || second >= 60){
            throw new IllegalArgumentException("Os segundos devem estar no intervalo 0-59");
        }

        this.second = second;
    }

    /**
     * Incrementa os segundos
     */
    public void tick(){

        int nextSecond = this.getSecond() + 1;

        if(nextSecond >= 60){
            this.setSecond(0);
            this.incrementMinute();
        }else{
            this.setSecond(nextSecond);
        }
    }

    /**
     * Incrementa os minutos
     */
    public void incrementMinute(){

        int nextMinute = this.getMinute() + 1;

        if(nextMinute >= 60){
            this.setMinute(0);
            this.incrementHour();
        }else{
            this.setMinute(nextMinute);
        }
    }

    /**
     * Incrementa as horas
     */
    public void incrementHour(){

        int nextHour = this.getHour() + 1;

        if(nextHour >= 24){
            this.setTime(0, 0, 0);
        }else{
            this.setHour(nextHour);
        }
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", getHour() == 0 || getHour() == 12 ? 12 : getHour() % 12, 
            getMinute(), getSecond(), getHour() < 12 ? "AM" : "PM");
    }
}