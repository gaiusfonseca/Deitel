/* 
    8.09 Reescreva o código na Figura 8.14 para utilizar uma declaração de importação separada para cada membro static 
    da classe Math que é utilizado no exemplo.
*/

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.PI;
import static java.lang.Math.E;

public class App{

    public static void main(String[] args) {
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0) );
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8) );
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    }
}