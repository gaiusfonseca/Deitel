/* 
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
    a) Leia a declaração do problema.
    b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
    c) Escreva um programa Java.
    d) Teste, depure e execute o programa Java.
    e) Processe três conjuntos completos de dados.

    4.20 Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga as horas 
    normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 
    40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora
    de cada um. Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o 
    salário bruto do empregado. Utilize a classe Scanner para inserir os dados.
*/

//importa o Scanner para capturar as entradas do usuário
import java.util.Scanner;

public class Payroll{

    public static void main(String[] args) {
        
        //declara e inicializa as variáveis que simulam os atributos do Employee
        String name;
        int hours = 0;
        double bruteSalary = 0;
        double hourSalary = 0;

        //declara e inicializa o contador que controla o loop
        int countEmployee = 0;

        //declara e inicializa o Scanner
        Scanner input = new Scanner(System.in);

        //enquanto todos os 3 usuários não tiverem sido processados, repete a pergunta
        while(countEmployee < 3){

            //pergunta o nome do usuário
            System.out.print("qual o nome do empregado? ");
            name = input.next();

            //enquanto não for uma entrada válida, repete a pergunta
            while(hours <= 0){
                System.out.print("quantas horas ele trabalhou na semana passada? ");
                hours = input.nextInt();
            }

            //enquanto não for uma entrada válida, repete a pergunta
            while(hourSalary <= 0){
                System.out.print("qual o salário-hora? ");
                hourSalary = input.nextDouble();
            }

            //verifica se o funcionário trabalhou mais de 40 horas
            if(hours > 40){
                
                //calcula e imprime o salário bruto
                bruteSalary = 40 * hourSalary + (hours - 40) * hourSalary * 1.5;
                System.out.printf("%s seu salário bruto é de: R$ %.2f%n", name, bruteSalary);
                
                //reinicializa as variáveis para o próximo empregado
                hours = 0;
                hourSalary = 0;

                //incrementa o contador
                countEmployee++;
            }else{
                
                //calcula e imprime o salário bruto
                bruteSalary = hours * hourSalary ;
                System.out.printf("%s seu salário bruto é de: R$ %.2f%n", name, bruteSalary);

                //reinicializa as variáveis para o próximo empregado
                hours = 0;
                hourSalary = 0;

                //incrementa o contador
                countEmployee++;
            }

        }
    }
}