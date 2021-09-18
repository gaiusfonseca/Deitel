/* 
    4.31 Escreva um aplicativo que insere um número inteiro que contém somente 0s e 1s (isto é, um número inteiro 
    binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para pegar os dígitos do
    número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita 
    tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e 
    assim por diante. O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número 
    binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2,
    depois 4, depois 8 e assim por diante. O equivalente decimal do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 
    1 + 0 + 4 + 8 ou 13.]
*/

//No exercício não foi solicitada que fizéssemos a validação da entrada e nem que o aplicativo estivesse preparado para 
//qualquer tamanho de de dígitos, por isso vamos adotar uma abordagem simplificada já que até este ponto do livro, não
//temos ferramentas adequadas para tratar esses casos;

//importa o Scanner para capturar as entradas do usuário
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class ToBinary {

    public static void main(String[] args) {
        
        //instância um Scanner
        Scanner input = new Scanner(System.in);

        //declara as variáveis que armazenam os números decimais e binários
        int binaryNumber;
        int decimalNumber;

        //declara os números que armazenam as posições dos dígitos
        int first;
        int second;
        int third;
        int fourth;
        int fifth;

        //solicita ao usuário que informe um número binário de até 5 dígitos
        System.out.print("informe um número binário de até 5 dígitos: ");
        binaryNumber = input.nextInt();

        //desmembra o número em suas posicões decimais da esquerda para a direita
        first = binaryNumber / 10000;
        binaryNumber %= 10000;

        second = binaryNumber / 1000;
        binaryNumber %= 1000;

        third = binaryNumber / 100;
        binaryNumber %= 100;

        fourth = binaryNumber / 10;
        binaryNumber %= 10;

        fifth = binaryNumber;

        //calcula o decimal equivalente
        decimalNumber = fifth * 1 + fourth * 2 + third * 4 + second * 8 + first * 16;

        //imprime a saída
        System.out.printf("%d (binario) equivale a %d (decimal).%n", binaryNumber, decimalNumber);
    }
}