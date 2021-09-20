/* 
    5.15 Escreva um aplicativo que exibe os seguintes padrões separadamente, um embaixo do outro. Utilize loops for para 
    gerar os padrões. Todos os asteriscos (*) devem ser impressos por uma única instrução na forma 
    System.out.print('*'); o que faz com que os asteriscos sejam impressos lado a lado. Uma instrução na forma 
    System.out.println(); pode ser utilizada para mover-se para a próxima linha. Uma instrução na forma 
    System.out.print(' '); pode ser utilizada para exibir um espaço para os últimos dois padrões. Não deve haver outras 
    instruções de saída no programa. [Dica: os dois últimos padrões requerem que cada linha inicie com um número 
    adequado de espaços em branco.]
*/

public class Patterns{

    public static void main(String[] args) {
        
        //printa a primeira figura
        for(int i = 1; i <= 10; i++){
            
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }

            System.out.println();
        }

        //separa as figuras para melhorar a legibilidade
        System.out.println();
        System.out.println();

        //printa a segunda figura
        for(int i = 1; i <= 9; i++){
            
            for(int j = 10; j > (i - 1); j--){
                System.out.print('*');
            }

            System.out.println();
        }

        //separa as figuras para melhorar a legibilidade
        System.out.println();
        System.out.println();

        //printa a terceira figura
        for(int i = 1; i <= 10; i++){
            
            for(int j = 10; j > 0; j--){
                
                if(j > 10 - (i - 1)){
                    System.out.print(' ');
                }else{
                    System.out.print('*');
                }
            }

            System.out.println();
        }

         //separa as figuras para melhorar a legibilidade
         System.out.println();
         System.out.println();

         //printa a quarta figura
        for(int i = 1; i <= 10; i++){
            
            for(int j = 1; j <= 10; j++){
                
                if(j > 10 - i){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
}

/* 
i = 1; j = 10 '*'' '


TERCEIRA FIGURA
1   10 = 10 - (i -1)
2   9  = 10 - (i -1)
3   8  = 10 - (i -1)
4   7  = 10 - (i -1)
5   6  = 10 - (i -1)
6   5  = 10 - (i -1)
7   4  = 10 - (i -1)
8   3  = 10 - (i -1)
9   2  = 10 - (i -1)
10  1  = 10 - (i -1)

QUARTA FIGURA
1   9   1
2   8   2
3   7   3
4   6   4
5   5   5
6   4   6   
7   3   7
8   2   8 
9   1   9
10  0   10

*/