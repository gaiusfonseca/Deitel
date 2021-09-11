
/*
    2.24 Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro no
    grupo. Utilize somente as técnicas de programação que você aprrendeu neste capítulo.
*/

import java.util.Scanner;

public class Minimo {
    
    public static void main(String[] args){

        //declara as variáveis que vão receber os valore do usuário.
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        //declara e instância um scanner para capturar as entradas dos usuários
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite um numero: ");             //solicita que o usuario forneça um número
        num1 = entrada.nextInt();                           //armazena o valor fornecido em uma variável

        System.out.print("Digite um numero: ");             //solicita que o usuario forneça um número
        num2 = entrada.nextInt();                           //armazena o valor fornecido em uma variável

        System.out.print("Digite um numero: ");             //solicita que o usuario forneça um número
        num3 = entrada.nextInt();                           //armazena o valor fornecido em uma variável

        System.out.print("Digite um numero: ");             //solicita que o usuario forneça um número
        num4 = entrada.nextInt();                           //armazena o valor fornecido em uma variável

        System.out.print("Digite um numero: ");             //solicita que o usuario forneça um número
        num5 = entrada.nextInt();                           //armazena o valor fornecido em uma variável

        /*
            Essa é a parte polêmica desse exercício, pois o meu entendimento é de que para sabermos qual é o mínimo 
            entre 3 ou mais valores precisamos do operador lógico 'E', que ainda não foi ensinado neste ponto do livro.
            A única estrutura de decisão ensinada até aqui foi o 'if' sem o bloco 'else', vou assumir que utilizando 
            apenas essa estrutura o autor queria que o estudante chegasse a conclusão de que seria possível aninhar essa
            estrutura para verificar duas condições (a < b e a < c).
        */

        //verifica se o num1 é o menor valor dentre todos
        if(num1 < num2){
            if(num1 < num3){
                if(num1 < num4){
                    if(num1 < num5){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num1);
                    }
                }
            }
        }

        //verifica se o num2 é o menor valor dentre todos
        if(num2 < num1){
            if(num2 < num3){
                if(num2 < num4){
                    if(num2 < num5){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num2);
                    }
                }
            }
        }

         //verifica se o num3 é o menor valor dentre todos
         if(num3 < num1){
            if(num3 < num2){
                if(num3 < num4){
                    if(num3 < num5){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num3);
                    }
                }
            }
        }

        //verifica se o num4 é o menor valor dentre todos
        if(num4 < num1){
            if(num4 < num2){
                if(num4 < num3){
                    if(num4 < num5){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num4);
                    }
                }
            }
        }

        //verifica se o num5 é o menor valor dentre todos
        if(num5 < num1){
            if(num5 < num2){
                if(num5 < num3){
                    if(num5 < num4){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num5);
                    }
                }
            }
        }

        //verifica se o num1 é o maior valor dentre todos
        if(num1 > num2){
            if(num1 > num3){
                if(num1 > num4){
                    if(num1 > num5){
                        System.out.printf("%d e o maior valor dentre os valores fornecidos.%n", num1);
                    }
                }
            }
        }

        //verifica se o num2 é o maior valor dentre todos
        if(num2 > num1){
            if(num2 > num3){
                if(num2 > num4){
                    if(num2 > num5){
                        System.out.printf("%d e o maior valor dentre os valores fornecidos.%n", num2);
                    }
                }
            }
        }

         //verifica se o num3 é o maior valor dentre todos
         if(num3 > num1){
            if(num3 > num2){
                if(num3 > num4){
                    if(num3 > num5){
                        System.out.printf("%d e o maior valor dentre os valores fornecidos.%n", num3);
                    }
                }
            }
        }

        //verifica se o num4 é o maior valor dentre todos
        if(num4 > num1){
            if(num4 > num2){
                if(num4 > num3){
                    if(num4 > num5){
                        System.out.printf("%d e menor valor dentre os valores fornecidos.%n", num4);
                    }
                }
            }
        }

        //verifica se o num5 é o maior valor dentre todos
        if(num5 > num1){
            if(num5 > num2){
                if(num5 > num3){
                    if(num5 > num4){
                        System.out.printf("%d e o maior valor dentre os valores fornecidos.%n", num5);
                    }
                }
            }
        }
    }
}
