/* 
    6.34 (Tabela de números binários, octais e hexadecimais) Escreva um aplicativo que exibe uma tabela de equivalentes 
    binários, octais e hexadecimais dos números decimais no intervalo de 1 a 256. Se você não estiver familiarizado com 
    esses sistemas de números, leia primeiro o Apêndice J, em inglês, na Sala Virtual do Livro.
*/

public class App{

    public static void main(String[] args) {
        
        //imprime o cabeçalho
        System.out.printf("decimal\t\tbinario\t\toctal\t\thexadecimal\n");

        //imprime a tabela
        for(int decimal = 1; decimal <= 256; decimal++){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n",
                decimal, decimalToBinary(decimal), decimalToOctal(decimal), decimalToHexadecimal(decimal));
        }
    }

    //supondo entrada 10
    public static int decimalToBinary(int decimal) {
        
        int binary = 1;
        int digit;
        int rest = decimal;
        int total = 0;
        int count = 0;

        while(binary < decimal){
            binary *= 2;
            count++;
            //1     0
            //2     1
            //4     2
            //8     3
        }

        while(count >= 0){
            //3
            //2
            //1
            //0

            digit = rest / binary;
            //1
            //0
            //1
            //0

            rest = rest % binary;
            //2
            //2
            //0
            //0

            binary /= 2;
            //4
            //2
            //1
            //0

            total += digit * Math.pow(10, count--);
            //1000
            //1000
            //1010
            //1010
        }

        return total;
    }

    public static int decimalToOctal(int decimal) {
        
        int octal = 1;
        int digit;
        int rest = decimal;
        int total = 0;
        int count = 0;

        while(octal < decimal){
            octal *= 8;
            count++;
        }

        while(count >= 0){

            digit = rest / octal;

            rest = rest % octal;

            octal /= 8;

            total += digit * Math.pow(10, count--);
        }

        return total;
    }

    public static int decimalToHexadecimal(int decimal) {
        
        int hexadecimal = 1;
        int digit;
        int rest = decimal;
        int total = 0;
        int count = 0;

        while(hexadecimal < decimal){
            hexadecimal *= 16;
            count++;
        }

        while(count >= 0){

            digit = rest / hexadecimal;

            rest = rest % hexadecimal;

            hexadecimal /= 16;

            total += digit * Math.pow(10, count--);
        }

        return total;
    }
}