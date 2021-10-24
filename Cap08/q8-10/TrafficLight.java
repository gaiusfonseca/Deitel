public enum TrafficLight{

    //declara as constantes Enum com os seus respctivos valores de inicialização
    GREEN(10),
    YELLOW(10),
    RED(20);

    //declara a propriedade TIME_LAPSE como uma constante
    private final int TIME_LAPSE;

    //inicializa as constantes com seus respectivos valores de timeLapse
    private TrafficLight(int timeLapse){
        
        this.TIME_LAPSE = timeLapse;
    }

    //recupera a duração do sinal em segundos
    public int getTimeLapse(){
        return TIME_LAPSE;
    }
}