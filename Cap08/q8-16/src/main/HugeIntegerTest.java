package main;

import java.util.Scanner;

public class HugeIntegerTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 40;
		int[] numberFromString = new int[size];
		
		System.out.println("Cria um HugeInteger com o construtor padrão");
		HugeInteger number = new HugeInteger();
		
		number.showValue();
		
		System.out.print("Informe um número com até 40 caracteres: ");
		if(input.hasNext()) {
			numberFromString = HugeInteger.parse(input.next());
			number.setNumber(numberFromString);
			number.showValue();
		}
		
		System.out.println("cria um novo array com o valor 100 e verifica se ele é igual a 'number'.\n");
		HugeInteger number2 = new HugeInteger();
		number2.setNumber(numberFromString);
		if(number2.isEqualTo(number)) {
			System.out.println("os arrays são iguais.");
			System.out.printf("number: %s%n", number.toString());
			System.out.printf("number2: %s%n", number2.toString());
		}else {
			System.out.println("os arrays não são iguais.");
			System.out.printf("number: %s%n", number.toString());
			System.out.printf("number2: %s%n", number2.toString());
		}
		
		System.out.println("\naltera 'number2' para 2000 e verifica se ele é igual a 'number'.");
		numberFromString = HugeInteger.parse("2000");
		number2.setNumber(numberFromString);
		if(number2.isNotEqualTo(number)) {
			System.out.println("os arrays não são iguais.");
			System.out.printf("number: %s%n", number.toString());
			System.out.printf("number2: %s%n", number2.toString());
		}else {
			System.out.println("os arrays são iguais.");
			System.out.printf("number: %s%n", number.toString());
			System.out.printf("number2: %s%n", number2.toString());
		}
		
		System.out.println("\ncompara number2 > number.");
		if(number2.isGreaterThan(number)) {
			System.out.println("number2 > number1");
		}else {
			System.out.println("number2 <= number1");
		}
		
		System.out.println("\naltera number para 2500 e repete o teste");
		number = new HugeInteger("2500");
		if(number2.isGreaterThan(number)) {
			System.out.println("number2 > number1");
		}else {
			System.out.println("number2 <= number1");
		}
	}
}
