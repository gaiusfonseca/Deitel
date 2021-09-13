/* 
    Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência 
    permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart 
    Association (AHA) ( www.americanheart.org/presenter.jhtml?identifier=4736 ), a fórmula para calcular a frequência 
    cardíaca máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da 
    sua frequência cardíaca máxima. 
    
    Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar
    com base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde 
    qualificado antes de começar ou modificar um programa de exercícios físicos.
    
    Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da 
    pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um construtor que
    receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um 
    método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que 
    calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da 
    pessoa, instancie um objeto da classe HeartRates e imprima as informações a partir desse objeto — incluindo nome, 
    sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu intervalo de 
    frequência cardíaca máxima e sua frequência cardíaca alvo.
*/

import java.util.Scanner;

public class HeartRatesTest{

    public static void main(String[] args){

        //declara e instância um Scanner para capturar as entradas do usuário
        Scanner input = new Scanner(System.in);

        //declara as variáveis que irão armazenas as entradas do usuário
        String firstName;
        String lastName;
        int birthDay;
        int birthMonth;
        int birthYear;

        //solicita ao  usuário as informações
        System.out.print(" informe o seu primeiro nome: ");
        firstName = input.next();

        System.out.print(" informe o seu ultimo nome: ");
        lastName = input.next();

        System.out.print(" informe o dia do seu aniversário: ");
        birthDay = input.nextInt();

        System.out.print(" informe o mês do seu aniversário: ");
        birthMonth = input.nextInt();

        System.out.print(" informe o ano do seu aniversário: ");
        birthYear = input.nextInt();

        //instância um objeto HeartRate
        HeartRates hr = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);

        //exibe os dados do objeto
        System.out.printf(" %s %s%n %s%n", hr.getFirsName(), hr.getLastName(), 
            hr.getBirthDate());

        System.out.printf(" idade: %d anos%n bpm maximo: %d%n %s%n", hr.getAge(), hr.getMaxHeartRate(),
            hr.getTargetHeartRate());
    }
}