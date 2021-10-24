
import java.security.SecureRandom;

public class App{

    public static void main(String[] args) {
     
        //instância um gerador de núemros aleatórios
        SecureRandom random = new SecureRandom();

        //instâcnia dois número complexos aleatoriamente, com cada parte variando de 1 a 10
        Complex numberA = new Complex(random.nextFloat() * 10 + 1, random.nextFloat() * 10 + 1);
        Complex numberB = new Complex(random.nextFloat() * 10 + 1, random.nextFloat() * 10 + 1);

        //exibe o resultado da soma
        System.out.printf("%s + %s = %s%n", numberA, numberB, Complex.sum(numberA, numberB));

        //exibe o resultado da subtração
        System.out.printf("%s - %s = %s%n", numberA, numberB, Complex.subtract(numberA, numberB));
    }
}