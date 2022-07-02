
import java.util.Arrays;

public class IntegerSet {

    private boolean[] set;

    public IntegerSet(){
        set = new boolean[101];
        Arrays.fill(set, false);
    }

    /**
     * Recebe dois conjuntos A e B retorna a união deles.
     * @param setA um conjunto arbitrário de inteiros entre 0 e 100
     * @param setB um conjunto arbitrário de inteiros entre 0 e 100
     * @return um conjunto contendo a união dos conjuntos A e B
     */
    public static IntegerSet union(IntegerSet setA, IntegerSet setB){
        //criar um novo array para armazenar o resultado da consulta
        IntegerSet unionSet = new IntegerSet();
       
        for(int i = 0; i < 101; i++){
            
            //se qualquer dos elementos for true, então o elemento união será true também
            if(setA.set[i] || setB.set[i]){
                unionSet.set[i] = true;
            }
        }

        return unionSet;
    }

    /**
     * Recebe dois conjuntos A e B retorna a interseção deles.
     * @param setA um conjunto arbitrário de inteiros entre 0 e 100
     * @param setB um conjunto arbitrário de inteiros entre 0 e 100
     * @return um conjunto contendo a interseção dos conjuntos A e B
     */
    public static IntegerSet intersection(IntegerSet setA, IntegerSet setB){
        IntegerSet intersectionSet = new IntegerSet();

        for(int i = 0; i < 101; i++){

            if(setA.set[i] && setB.set[i]){
                intersectionSet.set[i] = true;
            }
        }
        
        return intersectionSet;
    }

    /**
     * insere um elemento no conjunto
     * @param element um número arbitrário entre 0 e 100
     */
    public void insertElement(int element) {
        this.set[element] = true;
    }

    /**
     * elimina um elemento do conjunto
     * @param element um número arbitrário entre 0 e 100
     */
    public void deleteElement(int element) {
        this.set[element] = false;
    }

    /**
     * verifica se dois arrays são exatamente iguais levando em consideração a ordenação
     * @param setA um conjunto arbitrário de inteiros entre 0 e 100
     * @param setB um conjunto arbitrário de inteiros entre 0 e 100
     * @return verdaeiro se os dois conjuntos forem iguais
     */
    public static boolean isEqualTo(IntegerSet setA, IntegerSet setB){
        
        return Arrays.equals(setA.set, setB.set);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 101; i++){
            if(set[i]){
                sb.append(i + " ");
            }
        }
        
        if(sb.toString().equals("")){
            return "---";
        }

        return sb.toString();
    }
}