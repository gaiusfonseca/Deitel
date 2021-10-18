/* 
    8.05 (Modificando a representação interna de dados de uma classe) Seria perfeitamente razoável que a classe Time2 da
    Figura 8.5 represente a data/hora internamente como o número de segundos a partir da meia-noite em vez dos três 
    valores inteiros hour , minute e second. Os clientes poderiam utilizar os mesmos métodos public e obter os mesmos 
    resultados. Modifique a classe Time2 da Figura 8.5 para implementar Time2 como o número de segundos desde a 
    meia-noite e mostrar que não há alteração visível para os clientes da classe.
*/

public class TimeTest {
    
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Construído com:");
        displayTime("t1: construtor padrão", t1);
        displayTime("t2: informando apenas horas", t2);
        displayTime("t3: informando apenas horas e minutos", t3);
        displayTime("t4: informando horas, minutos e segundos", t4);
        displayTime("t5: passando t4 como referência", t5);

        //tenta inicializar t6 com valores inválidos
        try{
            Time2 t6 = new Time2(27, 74, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("%nExceção ao tentar inicializar t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t){
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }
}