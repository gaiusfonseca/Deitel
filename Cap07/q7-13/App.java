/* 
    7.13 Rotule os elementos do array bidimensional três por cinco sales para indicar a ordem em que eles são configurados como zero pelo
    seguinte segmento de programa:
    for(int row = 0; row < sales.length; row++){
        for ( int col = 0 ; col < sales[row].length; col++){
            sales[row][col] = 0;
        }
    }
*/

public class App{

    public static void main(String[] args) {
     
        int[][] sales = new int[3][5];


        for(int row = 0; row < sales.length; row++){
            for ( int col = 0 ; col < sales[row].length; col++){
                sales[row][col] = 0;

                //imprimindo o rótulo do elemento
                System.out.printf("linha %d, coluna %d = 0%n", row, col);
            }
        }

    }
}