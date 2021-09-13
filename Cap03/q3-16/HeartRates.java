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

public class HeartRates{

    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getFirsName(){
        return firstName;
    }

    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
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

    //considerando que ainda não foi ensinado como trabalhar com a classe Date de Java, assumiremos a data de 13/09/2021
    //para verificar a idade do usuário
    public int getAge(){
        
        int age = 2021 - birthYear;

        if(birthMonth > 9){
            age = age - 1;
        }

        if(birthMonth == 9){
            if(birthDay > 13){
                age = age - 1;
            }
        }

        return age;
    }

    public int getMaxHeartRate(){
        return 220 - getAge();
    }

    public String getTargetHeartRate(){

        double minimo = 0.5 * getMaxHeartRate();
        double maximo = 0.85 * getMaxHeartRate();

        return String.format("bpm alvo: %.2f ~ %.2f", minimo, maximo);
    }

    public String getBirthDate(){
        return String.format("nascido em: %d/%d/%d", birthDay, birthMonth, birthYear);
    }
}