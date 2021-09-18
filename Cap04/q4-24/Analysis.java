/* 
    4.24 Modifique o programa na Figura 4.12 para validar suas entradas. Para qualquer entrada, se o valor
    entrado for diferente de 1 ou 2, continue o loop até o usuário inserir um valor correto.
*/

import java.util.Scanner;

/**
 * Analysis
 */
public class Analysis {

    public static void main(String[] args) {
        
        //cria um Scanner para capturar as entradas do usuário
        Scanner input = new Scanner(System.in);

        //inicializa variáveis com os valores adequados
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        //enquanto não receber 10 entradas, repete
        while(studentCounter <= 10){

            //solicita ao usuário uma entrada e obtém valor fornecido pelo usuário
            System.out.print("informe o resultado (1 = passou, 2 = falhou): ");
            int result = input.nextInt();

            if(result == 1){
                passes++;
                studentCounter++;
            }else if(result == 2){
                failures++;
                studentCounter++;
            }
        }

        //prepara e exibe resultados
        System.out.printf("passaram: %d%nfalharam: %d%n", passes, failures);

        //determina se mais de 8 alunos foram aprovados
        if(passes > 8){
            System.out.println("bonus para o instrutor!");
        }
    }
}
