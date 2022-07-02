

public class IntegerSetTest {

    public static void main(String[] args){

        IntegerSet firstSet = new IntegerSet();
        IntegerSet secondSet = new IntegerSet();

        //demonstra que os conjuntos estão vazios
        System.out.printf("firstSet contem: %s%n", firstSet);
        System.out.printf("secondSet contem: %s%n", secondSet);
        
        //insere os números pares no primeiro conjunto
        System.out.printf("inserindo valores pares em firstSet...%n");
        for(int i = 0; i < 101; i++){
            if(i % 2 == 0){
                firstSet.insertElement(i);
            }
        }

        //demonstra que foram incluídos os números pares no conjunto
        System.out.printf("firstSet contem: %s%n", firstSet);

        //deleta os multiplos de 4 entre 0 e 40
        System.out.printf("removendo os multiplos de 4 entre 0 e 40 de firstSet...%n");
        for(int i = 0; i < 41; i++){
            if(i % 4 == 0){
                firstSet.deleteElement(i);
            }
        }

        //demonstra que foram eliminados os multiplos de 4 de 0 a 40
        System.out.printf("firstSet contem: %s%n", firstSet);

        //popula o secondSet com números ímpares
        System.out.printf("inserindo valores ímpares em secondSet...%n");
        for(int i = 0; i < 101; i++){
            if(i % 2 != 0){
                secondSet.insertElement(i);
            }
        }
        
        System.out.printf("secondSet contem: %s%n", secondSet);

        //encontra o conjunto união entre o primeiro e o segundo conjuntos
        System.out.printf("conjunto uniao: %s%n", IntegerSet.union(firstSet, secondSet));
        System.out.printf("conjunto interseção: %s%n", IntegerSet.intersection(firstSet, secondSet));

        //verifica se os conjuntos são iguais
        if(IntegerSet.isEqualTo(firstSet, secondSet)){
                System.out.printf("os conjuntos são iguais");
        }else{
            System.out.printf("os conjuntos não são iguais");
        }

        secondSet = firstSet;
        if(IntegerSet.isEqualTo(firstSet, secondSet)){
            System.out.printf("os conjuntos são iguais%n");
        }else{
            System.out.printf("os conjuntos não são iguais%n");
        }
    }
}
