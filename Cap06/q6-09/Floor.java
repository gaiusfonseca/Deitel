/* 
    6.9 (Arredondando números) Math.floor pode ser utilizado para arredondar valores ao número inteiro mais próximo — 
    por exemplo,
    
    y = Math.floor(x + 0.5 );

    arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo que lê valores 
    double e utiliza a instrução anterior para arredondar cada um dos números para o inteiro mais próximo. Para cada 
    número processado, exiba ambos os números, o original e o arredondado.
*/

import java.util.Scanner;

public class Floor{

    public static void main(String[] args) {
        
        double number;      //armazena o valor informado pelo usuário

        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        do{
            //solicita ao usuário uma entrada
            System.out.print("informe um número com valores decimais (valores negativos para sair): ");
            number = input.nextDouble();
            
            if(number > 0){
                //exibe o valor original e o valor arredondado
                System.out.printf("orginal = %.2f\t arredondado = %d%n", number, (int) Math.floor(number));
            }
        }while(number > 0);
    }
}