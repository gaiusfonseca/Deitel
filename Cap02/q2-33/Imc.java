/* 
    (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no 
    Exercício 1.10. As fórmulas para calcular o IMC são:
    IMC = pesoEmLibras × 703 / (alturaEmPolegadas * alturaEmPolegadas)
    ou
    IMC = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros)

    Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir,
    o peso em quilogramas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, 
    que exiba as seguintes informações do Department of Health and Human Services/National Institutes of Health, assim 
    o usuário pode avaliar o seu IMC:
     
    BMI VALUES
    Abaixo do peso: menor que 18.5
    Normal: entre 18.5 e 24.9
    Sobrepeso: entre 25 e 29.9
    Obeso: maior que 30

    Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar números inteiros. Os cálculos de IMC, 
    quando feitos com valores int , produzirão resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar
    o tipo double para representar números com pontos decimais. Quando os cálculos de IMC são realizados com doubles, 
    eles produzirão números com pontos decimais — esses são chamados de números de “ponto flutuante”.
*/


    /* 
    Por se tratar de um desafio e ainda considerando que no comando da questão o autor menciona que o tipo double
    seria mais adequado para representar as variáveis envolvidas (altura, peso e imc) e também que declarar uma variavel
    do tio double é tão simples quanto declarar uma variável do int, optei por utilizar variáveis double neste exercício
    */

import java.util.Scanner;

public class Imc {
    
    public static void main(String[] args){

        //declara duas variaǘeis do tipo double para armazenar as possíveis entradas do usuário
        double altura;
        double peso;

        //declara e instâcnia um Scanner para capturar as entradas do usuário
        Scanner entrada = new Scanner(System.in);

        //solicita ao usuário que informe o peso e armazena o valor na variável correspondente
        System.out.print("Digite o seu peso: ");
        peso = entrada.nextDouble();

        //solicita ao usuário que informe a altura e armazena o valor na variável correspondente
        System.out.print("Digite a sua altura: ");
        altura = entrada.nextDouble();

        //calcula e informa o IMC ao usuário
        System.out.printf("%no seu imc foi de: %f%n%n", peso / (altura * altura));
        
        //imprime as faixas  de valores para que o usuário saiba o enquadramento
        System.out.println("BMI:");
        System.out.println("Abaixo do peso: menor que 18.5");
        System.out.println("Normal: entre 18.5 e 24.9");
        System.out.println("Sobrepeso: entre 25 e 29.9");
        System.out.println("Obeso: maior que 30");
    }
}
