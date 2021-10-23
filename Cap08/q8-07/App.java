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

public class App{

    public static void main(String[] args) {
        
        //instância um objeto Time2
        Time2 time = new Time2(10, 30, 25);

        //mostra o valor atual de time
        System.out.printf("time antes: %s%n", time.toUniversalString());

        //incrementa os segundos com tick
        time.tick();

        //mostra o novo valor da hora
        System.out.printf("time depois de tick: %s%n", time.toUniversalString());

        //incrementa os minutos com incrementMinute
        time.incrementMinute();

        //mostra o novo valor da hora
        System.out.printf("time depois de incrementMinute: %s%n", time.toUniversalString());

        //incrementa as horas com incrementHour
        time.incrementHour();

        //mostra o novo valor da hora
        System.out.printf("time depois de incrementHour: %s%n", time.toUniversalString());


        //instância um novo objeto para testar os casos especiais
        time.setTime(23, 59, 59);

        //mostra o valor atual de time
        System.out.printf("time antes: %s%n", time.toUniversalString());

        //incrementa os segundos com tick
        time.tick();

        //mostra o novo valor da hora
        System.out.printf("time depois de tick: %s%n", time.toUniversalString());

        //incrementa os minutos com incrementMinute
        time.incrementMinute();

        //mostra o novo valor da hora
        System.out.printf("time depois de incrementMinute: %s%n", time.toUniversalString());

        //incrementa as horas com incrementHour
        time.incrementHour();

        //mostra o novo valor da hora
        System.out.printf("time depois de incrementHour: %s%n", time.toUniversalString());

    }
}