/* 
    5.30 Modifique a classe AutoPolicy na Figura 5.11 para validar os códigos de estado de duas letras para os estados 
    do nordeste dos EUA. Os códigos são: CT para Connecticut, MA para Massachusetts, ME para Maine, NH para New 
    Hampshire, NJ para New Jersey, NY para Nova York, PA para Pensilvânia e VT para Vermont. No método AutoPolicy 
    setState use o operador lógico OU ( || ) (Seção 5.9) para criar uma condição composta em uma instrução if...else que 
    compara o argumento do método com cada código de duas letras. Se o código estiver incorreto, a parte else da 
    instrução if...else deve exibir uma mensagem de erro. Nos próximos capítulos, você aprenderá a usar o tratamento de 
    exceções para indicar que um método recebeu um valor inválido.
*/

public class AutoPolicy{
    
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    //Os códigos são: CT para Connecticut, MA para Massachusetts, ME para Maine, NH para New Hampshire, 
    //NJ para New Jersey, NY para Nova York, PA para Pensilvânia e VT para Vermont.
    //validação dos estados
    public void setState(String state) {
        
        if(state == "CT" || state == "MA" || state == "ME" || state == "NH" || state == "NJ" || state == "NY" || 
            state == "PA" || state == "VT"){
                this.state = state;
        }else{
            System.out.println("the informed state is not valid");
        }
    }

    public boolean isNoFaultState(){
        
        boolean noFaultState;

        switch(getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}