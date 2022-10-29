package main;

import java.util.Scanner;

public class HugeIntegerTest {
	
	public static void main(String[] args) {
		HugeInteger number1;
		HugeInteger number2;
		boolean test = false;
		
		System.out.println("Testa o construtor sem argumentos.");
		number1 = new HugeInteger();
		System.out.printf("number1: %s%n", number1.toString());
		
		System.out.println("Testa o construtor com argumento.");
		number2 = new HugeInteger("1000");
		System.out.printf("number2: %s%n", number2.toString());
		
		System.out.println("Tenta definir o valor de number2 com uma string que não é um número.");
		try {
			number2.setNumber("1000A");
		}catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Tenta definir o valor de number2 para um número com mais de 40 dígitos.");
		try {
			number2.setNumber("99999999999999999999999999999999999999999999999999999999999999999999");
		}catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("define number1 e number2 para 5000 e inicia os testes");
		number1.setNumber("5000");
		number2.setNumber("5000");
		test = number1.isEqualTo(number2);
		System.out.printf("%s == %s ? %b%n", number1.toString(), number2.toString(), test);
		
		System.out.println("define number2 para 6000 e repete o teste");
		number1.setNumber("5000");
		number2.setNumber("6000");
		test = number1.isEqualTo(number2);
		System.out.printf("%s == %s ? %b%n", number1.toString(), number2.toString(), test);
		
		System.out.println("testa o método isNotEqual");
		test = number1.isNotEqualTo(number2);
		System.out.printf("%s != %s ? %b%n", number1.toString(), number2.toString(), test);
		
		System.out.println("define number1 para 6000 e testa novamente isNotEqualTo");
		number1.setNumber("6000");
		test = number1.isNotEqualTo(number2);
		System.out.printf("%s != %s ? %b%n", number1.toString(), number2.toString(), test);
		
		System.out.println("define number1 para 7000 e testa isGreaterThan");
		number1.setNumber("7000");
		
		test = number1.isGreaterThan(number2);
		System.out.printf("number1: %s > number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isGreaterThan(number1);
		System.out.printf("number2: %s > number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("testa isLessThan");
		
		test = number1.isLessThan(number2);
		System.out.printf("number1: %s < number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isLessThan(number1);
		System.out.printf("number2: %s < number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("testa isLessThanOrEqualTo");
		
		test = number1.isLessThanOrEqualTo(number2);
		System.out.printf("number1: %s <= number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isLessThanOrEqualTo(number1);
		System.out.printf("number2: %s <= number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("atribui 7000 a number2 e testa novamente isLessThanOrEqualTo");
		number2.setNumber("7000");
		
		test = number1.isLessThanOrEqualTo(number2);
		System.out.printf("number1: %s <= number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isLessThanOrEqualTo(number1);
		System.out.printf("number2: %s <= number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("testa isGreaterThanOrEqualTo");
		
		test = number1.isGreaterThanOrEqualTo(number2);
		System.out.printf("number1: %s >= number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isGreaterThanOrEqualTo(number1);
		System.out.printf("number2: %s >= number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("atribui 8000 a number1 e testa novamente isGreaterThanOrEqualTo");
		number1.setNumber("8000");
		
		test = number1.isGreaterThanOrEqualTo(number2);
		System.out.printf("number1: %s >= number2: %s ? %b%n", number1.toString(), number2.toString(), test);
		
		test = number2.isGreaterThanOrEqualTo(number1);
		System.out.printf("number2: %s >= number1: %s ? %b%n", number2.toString(), number1.toString(), test);
		
		System.out.println("testa isZero");
		
		test = number1.isZero();
		System.out.printf("number1: %s == 0 ? %b%n", number1.toString(), test);
		
		System.out.println("altera o valor de number1 para zero e testa novamente");
		number1.setNumber("0");
		
		test = number1.isZero();
		System.out.printf("number1: %s == 0 ? %b%n", number1.toString(), test);
	}
}
