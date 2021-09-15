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

public class HealthProfile{

    //declara os atributos da classe
    private String firstName;
    private String lastName;
    private char gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double height;
    private double weight;

    //nao faremos validacao das entradas pois isso ainda não foi ensinado neste ponto do livro
    public HealthProfile(String firstName, String lastName, char gender, int birthDay, int birthMonth, int birthYear,
        double height, double weight){
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.birthDay = birthDay;
            this.birthMonth = birthMonth;
            this.birthYear = birthYear;
            this.height = height;
            this.weight = weight;
        }

    //declaração dos métodos de acesso
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public int getBirthDay(){
        return birthDay;
    }

    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }

    public int getBirthMonth(){
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    //declaração dos métodos que retornam valores calculados a partir dos atributos da classe
    //calcularemos a idade tomando como referência a data de hoje 14/09/2021 pois neste ponto ainda não estamos 
    //trabalhando com a classe Date
    public int getAge(){
        int age = 2021 - getBirthYear();

        if(getBirthMonth() > 9){        //se o mes de aniversário ainda não chegou, então não fez aniversário esse ano
            age = age - 1;
        }

        if(getBirthMonth() == 9){       //se estamos no mes de aniversário, é necessário verificar o dia
            if(getBirthDay() > 14){     //se o dia do aniversário ainda não chegou, então não fez aniversário esse ano
                age = age - 1;
            }
        }

        return age;
    }

    //calcula o bpm máximo
    public int getMaxHeartRate(){
        return 220 - getAge();
    }

    //calcula a faixa bpm alvo
    public String getTargetHeartRate(){
        
        double minRate = 0.50 * getMaxHeartRate();      //limite inferior do bpm
        double maxRate = 0.85 * getMaxHeartRate();      //limite superior do bpm
        
        return String.format("bpm alvo: %.2f ~ %.2f", minRate, maxRate);
    }

    //calcula o IMC da pessoa
    public double getImc(){
        return weight / (height * height);
    }

    public String getBirthDate(){
        return String.format("%d/%d/%d", birthDay, birthMonth, birthYear);
    }

}