/* 
    4.29 Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, então, exibe um
    quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos de 
    lado possíveis entre 1 e 20.
*/

/* 
    Este programa poderia ter sido escrito de maneira mais eficiente, mas tentei me limitar as técnicas, e intruções 
    ensinadas até este ponto do livro.
*/

import java.util.Scanner;

public class Square{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        
        int side = 0;                   //inicializa o tamanho do quadrado com o valor 0 (inválido)
        int width;                      //recebe o tamanho da linha em quantidade de caracteres
        int height;                     //recebe o tamanho da figura em quantidade de linhas
        String controller = "invalid";  //inicializa o controlador do loop de entrada com inválido

        //enquanto a entrada do usuário for inválida, solicitar uma nova entrada
        while(controller == "invalid"){

            //solicita uma entrada do usuário
            System.out.print("informe o tamanho do quadrado (1 ~ 20): ");
            side = input.nextInt();

            //verifica se a entrada é um valor válido
            if(side > 20){
                controller = "invalid";
            }else if(side < 1){
                controller = "invalid";
            }else{
                controller = "valid";
            }
        }

        //configura a largura e altura do quadrado, um quadrado vazio terá sempre um lado = n + 2;
        width = side + 2;
        height = side + 2;

        //enquanto ainda tiver linhas para imprimir, imprime
        while(height > 0){

            
            if(height == side + 2){     //verifica se é a primeira linha
                
                while(width > 0){                       //repete até que todos os caracteres tenham sido impressos
                    
                    System.out.print("*");
                    width--;                                    //decrementa width sempre que um caractere é impresso
                }

                System.out.println();                   
                height--;                               //decrementa height sempre que o cursor é movido para a próxima linha
                width = side + 2;                       //reconfigura width para que possa ser usada na próxima linha
            }else if(height == 1){      //verifica se é a ultima linha

                while(width > 0){                       //repete até que todos os caracteres tenham sido impressos
                    System.out.print("*");              
                    width--;                                    //decrementa width sempre que um caractere é impresso
                }

                System.out.println();
                height--;                               //decrementa height sempre que o cursor é movido para a próxima linha
                width = side + 2;                       //reconfigura width para que possa ser usada na próxima linha
            }else{                      //por óbvio, só pode ser uma linha intermediária
                
                while(width > 0){                   //repete enquanto houver caracter para ser impresso
                    
                    if(width == side + 2){                  //verifica se é o primeiro caractere
                        System.out.print("*");
                        width--;                                    //decrementa width sempre que um caractere é impresso
                    }else if(width == 1){                   //verifica se é o ultimo caractere
                        System.out.print("*");
                        width--;                                    //decrementa width sempre que um caractere é impresso
                    }else{                                  //por óbvio só pode ser um caracter intermediário
                        System.out.print(" ");
                        width--;                                    //decrementa width sempre que um caractere é impresso
                    }
                }

                System.out.println();
                height--;                           //decrementa height sempre que o cursor é movido para a próxima linha
                width = side + 2;                   //reconfigura width para que possa ser usada na próxima linha
            }
        }
    }
}