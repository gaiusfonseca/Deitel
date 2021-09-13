
/* 
    Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String ), um
    sobrenome (tipo String ) e um salário mensal ( double ). Forneça um construtor que inicializa as três variáveis de 
    instância. Forneça um método set e um get para cada variável de instância. Se o salário mensal não for positivo, não
    configure seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe 
    Employee. Crie dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um aumento de 
    10% e exiba novamente o salário anual de cada Employee.
*/

public class Employee{

    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        
        if(salary > 0){
            this.salary = salary;
        }
    }

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

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        
        if(salary > 0){
            this.salary = salary;
        }
    }

    public double getAnnualSalary(){
        return salary * 12;
    }

}