

public class App{

    public static void main(String[] args) {

        //percorre todas os sinais declarados na Enum e exibe a duração de cada um
        for(TrafficLight tl : TrafficLight.values()){
            System.out.printf("O sinal está: %s%nduração: %d segundos.%n%n", tl, tl.getTimeLapse());
        }
    }
}