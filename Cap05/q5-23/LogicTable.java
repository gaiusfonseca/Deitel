
//!( condição1 || condição2 ) = (! condição1 && ! condição2 )

public class LogicTable{

    private boolean condition1 = false;
    private boolean condition2 = false;
    private String expression1;
    private String expression2;

    //Construtor
    public LogicTable(String expression1, String expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    //Getters e Setters
    public boolean getCondition1(){
        return condition1;
    }

    public void setCondition1(boolean logicValue){
        condition1 = logicValue;
    }

    public boolean getCondition2(){
        return condition2;
    }

    public void setCondition2(boolean logicValue){
        condition2 = logicValue;
    }

    public String getExpression1() {
        return expression1;
    }

    public void setExpression1(String expression1) {
        this.expression1 = expression1;
    }

    public String getExpression2() {
        return expression2;
    }

    public void setExpression2(String expression2) {
        this.expression2 = expression2;
    }

    //!( condição1 && condição2 ) = (! condição1 || ! condição2 ) - Equivalent 1
    public void printTable(String clause, int flag){
        
        //imprime o cabeçalho da tabela
        System.out.printf("%10s %10s %30s)%n", expression1, expression2, clause);

        //cria um for para iterar por todas as possíveis combinações
        for(int i = 1; i <=4; i++){

            //utiliza o switch para parametrizar as linhas da tabela verdade (podemos reutilizar nas outras expressões)
            switch(i){
                case 1:
                    condition1 = true;
                    condition2 = true;
                    break;
                case 2:
                    condition1 = true;
                    condition2 = false;
                    break;
                case 3:
                    condition1 = false;
                    condition2 = true;
                    break;
                case 4:
                    condition1 = false;
                    condition2 = false;
                    break;
            }

            // 1 - !(condição1 && condição2)
            // 2 - (! condição1 || ! condição2)
            // 3 - !(condição1 || condição2)
            // 4 - (! condição1 && ! condição2)
            //imprime o conteúdo da tabela verdade
            System.out.printf("%10b %10b %10b%n", condition1, condition2, this.evaluate(flag));
        }
    }

    public boolean evaluate(int flag){
        
        switch(flag){
            case 1:
                //!(condição1 && condição2)
                return !(condition1 && condition2);
            case 2:
                //(! condição1 || ! condição2)
                return !condition1 || !condition2;
            case 3:
                //!(condição1 || condição2)
                return !(condition1 || condition2);
            case 4:
                //(! condição1 && ! condição2)
                return !condition1 && !condition2;
            default:
                System.out.println("Ocorreu um erro!");
                return false;
        }
    }
}