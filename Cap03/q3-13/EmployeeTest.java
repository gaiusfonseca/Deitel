
/* 
    Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String ), um
    sobrenome (tipo String ) e um salário mensal ( double ). Forneça um construtor que inicializa as três variáveis de 
    instância. Forneça um método set e um get para cada variável de instância. Se o salário mensal não for positivo, não
    configure seu valor. Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe 
    Employee. Crie dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um aumento de 
    10% e exiba novamente o salário anual de cada Employee.
*/

public class EmployeeTest{

    public static void main(String[] args){

        //declara dois objetos employee
        Employee emp1 = new Employee("Gaius", "Fonseca", 4000);
        Employee emp2 = new Employee("João", "das Neves", 5000);

        //imprime as propriedades dos objetos
        System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", emp1.getFirstName(), emp1.getLastName(),
         emp1.getAnnualSalary());
        
        System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", emp2.getFirstName(), emp2.getLastName(),
         emp2.getAnnualSalary());

        //concede um aumento de 10% para cada funcionário
        emp1.setSalary(emp1.getSalary() * 1.1);
        emp2.setSalary(emp2.getSalary() * 1.1);

        //imprime as propriedades dos objetos
        System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", emp1.getFirstName(), emp1.getLastName(),
         emp1.getAnnualSalary());
        
        System.out.printf("O salário anual de %s %s é de: R$ %.2f%n", emp2.getFirstName(), emp2.getLastName(),
         emp2.getAnnualSalary());
    }
}