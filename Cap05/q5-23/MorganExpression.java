/* 
    5.23 Neste capítulo, discutimos os operadores lógicos && , & , || , | , ^ e ! . As leis de De Morgan às vezes podem 
    tornar mais convenientes para expressar uma expressão lógica. Essas leis afirmam que a expressão 
    !( condição1 && condição2 ) é logicamente equivalente à expressão (! condição1 || ! condição2 ). Além disso, a 
    expressão !( condição1 || condição2 ) é logicamente equivalente à expressão (! condição1 && ! condição2 ). Utilize 
    as leis de De Morgan para escrever expressões equivalentes para cada uma das expressões a seguir, então escreva um 
    aplicativo para mostrar que tanto a expressão original como a nova expressão em cada caso produzem o mesmo valor:
    a) !(x < 5) && !(y >= 7)
    b) !(a == b) || !(g != 5)
    c) !((x <= 8) && (y > 4))
    d) !((i > 4) || (j <= 6))
*/

public class MorganExpression{

    public static void main(String[] args) {

        //instância uma tabela com as expressões informadas
        LogicTable logic = new LogicTable("(x < 5)", "(y>=7)");

        //prepara o cabeçalho da tabela 1 !(x < 5) && !(y >= 7)
        String header = String.format("!%10s && !%10s", logic.getExpression1(), logic.getExpression2());

        //declara a expressão
        System.out.println("a)");

        //imprime a tabela 1

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 4);

        //declara que as tabelas são equivalentes
        System.out.println("\ne equivalente a: ");

        //prepara o cabeçalho da tabela 2
        header = String.format("!(%10s || %10s)", logic.getExpression1(), logic.getExpression2());

        //imprime a tabela equivalente

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 3);

        //pula uma linha para melhorar a legibilidade
        System.out.println();




        //reconfigura a tabela com os valores da nova expressão b) !(a == b) || !(g != 5)
        logic.setExpression1("(a == b)");
        logic.setExpression2("(g != 5)");

        //prepara o cabeçalho da tabela 1
        header = String.format("! %10s || ! %10s)", logic.getExpression1(), logic.getExpression2());

        //declara a expressão
        System.out.println("b)");

        //imprime a tabela 1

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 2);

        //declara que as tabelas são equivalentes
        System.out.println("\ne equivalente a: ");

        //prepara o cabeçalho da tabela 2
        header = String.format("! (%10s && %10s)", logic.getExpression1(), logic.getExpression2());

        //imprime a tabela 2

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 1);
        
        //pula uma linha para melhorar a legibilidade
        System.out.println();




        //reconfigura a tabela com os valores da nova expressão !((x <= 8) && (y > 4))
        logic.setExpression1("(x <= 8)");
        logic.setExpression2("(y > 4)");

        //prepara o cabeçalho da tabela 1
        header = String.format("! (%10s && %10s)", logic.getExpression1(), logic.getExpression2());

        //declara a expressão
        System.out.println("c)");

        //imprime a tabela 1

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 1);

        //declara que as tabelas são equivalentes
        System.out.println("\ne equivalente a: ");

        //prepara o cabeçalho da tabela 2
        header = String.format("! %10s || ! %10s)", logic.getExpression1(), logic.getExpression2());

        //imprime a tabela 2

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 1);
        
        //pula uma linha para melhorar a legibilidade
        System.out.println();




        //reconfigura a tabela com os valores da nova expressão !((i > 4) || (j <= 6))
        logic.setExpression1("(i > 4)");
        logic.setExpression2("(j <= 6)");

        //prepara o cabeçalho da tabela 1
        header = String.format("! (%10s || %10s)", logic.getExpression1(), logic.getExpression2());

        //declara a expressão
        System.out.println("d)");

        //imprime a tabela 1

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 3);

        //declara que as tabelas são equivalentes
        System.out.println("\ne equivalente a: ");

        //prepara o cabeçalho da tabela 2
        header = String.format("! %10s && ! %10s)", logic.getExpression1(), logic.getExpression2());

        //imprime a tabela 2

        // 1 - !(condição1 && condição2)
        // 2 - (! condição1 || ! condição2)
        
        // 3 - !(condição1 || condição2)
        // 4 - (! condição1 && ! condição2)
        logic.printTable(header, 4);
    }
}