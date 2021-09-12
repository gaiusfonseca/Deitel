

/* 
    2.28 Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre inteiros e o tipo int. O Java
    também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159. Escreva um
    aplicatico que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do 
    círculo, circunferência e área utilizando o valor do ponto flutuante 3,14159 para Pi. Utilize as técnicas mostradas 
    na Figura 2.7.

    Observação: você também pode empregar a constante Math.PI predefinida para o valor de Pi. Essa constante é mais 
    precisa que o valor 3,14159. A classe Math é definidia no pacote java.lang. As classes nesse pacote são importadas
    automaticamente, portanto, você não precisa importar a classe Math para utilizá-la.

    Adote as seguintes fórmulas (r é o raio):
    diâmetro = 2r
    circunferência = 2PIr
    área = Pir²

    Não armazene os resultados de cada cálculo em uma variável. Em vez disso, especifique cada cálculo como o valor de 
    saída em uma instrução System.out.printf. Os valores produzidos pelos cálculos de circunferência e área são números
    de ponto flutuante. A saída desses valores pode ser gerada com o especificador de formato %f em uma instrução 
    System.out.printf. Você aprenderá mais sobre números de pontos flutuantes no Capítulo 3.
*/

import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args){

        //declara uma variável para armazenar a entrada do usuário
        int r;

        //declara e instância um Scanner para capturar a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para o raio do cículo: ");        //solicita ao usuário que digite um valor
        r = entrada.nextInt();                                              //armazena esse valor na variável r

        System.out.printf("o diâmetro do círculo de raio r = %d é: %d%n", r, 2 * r);                    //imprime o diâmetro
        System.out.printf("a circunferência do círculo de raio r = %d é: %f%n", r, 2 * Math.PI * r);    //imprime a circunferência
        System.out.printf("a área do círculo de raio r = %d é: %f%n", r, Math.PI * r * r);              //imprime a área
    }
}
