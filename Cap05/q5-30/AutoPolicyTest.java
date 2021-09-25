/* 
    5.30 Modifique a classe AutoPolicy na Figura 5.11 para validar os códigos de estado de duas letras para os estados 
    do nordeste dos EUA. Os códigos são: CT para Connecticut, MA para Massachusetts, ME para Maine, NH para New 
    Hampshire, NJ para New Jersey, NY para Nova York, PA para Pensilvânia e VT para Vermont. No método AutoPolicy 
    setState use o operador lógico OU ( || ) (Seção 5.9) para criar uma condição composta em uma instrução if...else que 
    compara o argumento do método com cada código de duas letras. Se o código estiver incorreto, a parte else da 
    instrução if...else deve exibir uma mensagem de erro. Nos próximos capítulos, você aprenderá a usar o tratamento de 
    exceções para indicar que um método recebeu um valor inválido.
*/

public class AutoPolicyTest {
    

    public static void main(String[] args) {
        
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

        //tenta alterar policy1 para um valor inválido (RS), mensagem de erro esperada
        policy1.setState("RS");

        //altera o state para um estaado válido (CT) e realiza um print
        policy1.setState("CT");
        System.out.printf("new state is:  %s%n", policy1.getState());
    }

    public static void policyInNoFaultState(AutoPolicy policy){

        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
            policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), 
            (policy.isNoFaultState() ? "is" : "is not"));
    }
}
