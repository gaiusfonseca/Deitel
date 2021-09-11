
/*
    2.16 Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o
    número maior seguido pelas palavras "É maior". Se os números forem iguais, imprima a mensagem "Esses números são 
    iguais". Utilize as técnicas mostradas na Figura 2.15
*/

import java.util.Scanner;

public class Compare {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite um numero: ");
        num1 = entrada.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = entrada.nextInt();

        // é possível escrever essas verificações maneira mais eficiente, mas estamos nos limitando as técnicas 
        // mostradas nolivro até esse momento
        if(num1 > num2){
            System.out.printf("%d e maior%n", num1);
        }

        if(num2 > num1){
            System.out.printf("%d e maior%n", num2);
        }

        if(num1 == num2){
            System.out.println("Esses numeros são iguais");
        }
    }
}
