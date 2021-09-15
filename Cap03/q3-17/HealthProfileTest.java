/* 
    Uma questão relacionada à assistência médica discutida ultimamente nos veículos de comunicação é a computadorização 
    dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações quanto
    à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em 
    exercícios posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus 
    perfis e históricos de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência 
    médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas.
    
    Neste exercício, você projetará uma classe HealthProfile “inicial” para uma pessoa. Os atributos da classe devem 
    incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para mês, dia e ano de 
    nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba 
    esses dados. Para cada atributo, forneça métodos set e get. 
    
    A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência 
    cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja o 
    Exercício 2.33). 
    
    Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
    ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e 
    peso da pessoa ––, e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e 
    frequência cardíaca alvo. Ele também deve exibir o gráfico de valores IMC do Exercício 2.33.
*/

import java.util.Scanner;

public class HealthProfileTest{

    public static void main(String[] args) {
        
        //decalra e instância um Scanner para capturar as entradas do usuário
        Scanner input = new Scanner(System.in);

        //declara as variáveis que irão armazenar as entradas do usuário
        String firstName;
        String lastName;
        char gender;
        int birthDay;
        int birthMonth;
        int birthYear;
        double height;
        double weight;

        //solcita as informações ao usuário
        System.out.print("informe o seu nome: ");
        firstName = input.next();

        System.out.print("informe o seu sobrenome: ");
        lastName = input.next();

        System.out.print("informe o seu genero (M/F): ");
        gender = input.next().charAt(0);

        System.out.print("informe o dia do seu aniversário: ");
        birthDay = input.nextInt();

        System.out.print("informe o mês do seu aniversário: ");
        birthMonth = input.nextInt();

        System.out.print("informe o ano do seu aniversário: ");
        birthYear = input.nextInt();

        System.out.print("informe a sua altura: ");
        height = input.nextDouble();

        System.out.print("informe o seu peso: ");
        weight = input.nextDouble();

        //instância um objeto HealthProfile
        HealthProfile hp = 
            new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, height, weight);

        //cria a mensagem com os dados básicos (nome, sobrenome, sexo, data de nascimento, altura e peso)
        String userInfo = String.format("%s %s (%c), nascido em: %s, altura: %.2f, peso: %.2f", 
            hp.getFirstName(), hp.getLastName(), hp.getGender(), hp.getBirthDate(), hp.getHeight(), hp.getWeight());

        //cria a mensagem com os dados calculados (idade, IMC, BPM Max, BPM Alvo)
        String userCalculatedData = String.format("idade: %d%nIMC: %.2f%nBPM Max: %d%nBPM alvo: %s",
            hp.getAge(), hp.getImc(), hp.getMaxHeartRate(), hp.getTargetHeartRate());

        //cira a mensagem com a faixa de valores do IMC
        String imcValues = String.format("Abaixo do peso: menor que 18.5%nNormal: entre 18.5 e 24.9%n"+
            "Sobrepeso: entre 25 e 29.9%nObeso: maior que 30");

        //exibe as sáidas ao usuário
        System.out.println();                       //pula uma linha
        System.out.println(userInfo);               //imprime os dados básicos
        System.out.println(userCalculatedData);     //pula uma linha
        System.out.println();                       //pula uma linha
        System.out.println(imcValues);              //imprime a tabela de resultados de IMC
        System.out.println();                       //pula uma linha
    }
}