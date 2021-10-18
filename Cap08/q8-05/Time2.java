/* 
    8.05 (Modificando a representação interna de dados de uma classe) Seria perfeitamente razoável que a classe Time2 da
    Figura 8.5 represente a data/hora internamente como o número de segundos a partir da meia-noite em vez dos três 
    valores inteiros hour , minute e second. Os clientes poderiam utilizar os mesmos métodos public e obter os mesmos 
    resultados. Modifique a classe Time2 da Figura 8.5 para implementar Time2 como o número de segundos desde a 
    meia-noite e mostrar que não há alteração visível para os clientes da classe.
*/

public class Time2{

    private int seconds;

    public Time2(){
        this(0, 0, 0);
    }

    public Time2(int hours){
        this(hours, 0, 0);
    }

    public Time2(int hours, int minutes){
        this(hours, minutes, 0);
    }

    public Time2(int hours, int minutes, int seconds){

        //valida se o valor de hora está em um intervalo válido
        if(hours < 0 || hours >= 24){
            throw new IllegalArgumentException("horas devem estar em um intervalo de 0 à 24 horas.");
        }

        //valida se o valor de minutes está em um intervalo válido
        if(minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("minutos devem estar em um intervalo de 0 à 59 minutos.");
        }

        //valida se o valor de seconds está em um intervalo válido
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("segundos devem estar em um intervalo de 0 à 59 segundos.");
        }

        //inicializa as variáveis de instância
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    public Time2(Time2 time){
        seconds = time.seconds;
    }

    public void setTime(int hours, int minutes, int seconds){
        //valida se o valor de hora está em um intervalo válido
        if(hours < 0 || hours >= 24){
            throw new IllegalArgumentException("horas devem estar em um intervalo de 0 à 24 horas.");
        }

        //valida se o valor de minutes está em um intervalo válido
        if(minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("minutos devem estar em um intervalo de 0 à 59 minutos.");
        }

        //valida se o valor de seconds está em um intervalo válido
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("segundos devem estar em um intervalo de 0 à 59 segundos.");
        }

        //inicializa as variáveis de instância
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    public void setHour(int hours){
        //valida se o valor de hours está em um intervalo válido
        if(hours < 0 || hours >= 24){
            throw new IllegalArgumentException("horas devem estar em um intervalo de 0 à 24 horas.");
        }

        seconds = hours * 3600;
    }

    public void setMinute(int minutes){
        //valida se o valor de minutes está em um intervalo válido
        if(minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("minutos devem estar em um intervalo de 0 à 59 minutos.");
        }

        seconds = minutes * 60;
    }

    public void setSecond(int seconds){
        //valida se o valor de seconds está em um intervalo válido
        if(seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("segundos devem estar em um intervalo de 0 à 59 segundos.");
        }
        
        this.seconds = seconds;
    }

    public int getHour(){
        return seconds / 3600;
    }

    public int getMinute(){
        int minutes = seconds % 3600;
        return minutes / 60;
    }

    public int getSecond(){
        int minutes = seconds % 3600;
        return minutes % 60;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s", (getHour() == 0 || getHour() == 12 ? 12 : getHour() % 12), 
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}