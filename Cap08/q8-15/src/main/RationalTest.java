package main;

public class RationalTest {
	
	public static void main(String[] args) {

		shouldThrowEceptionWhenDenominatorIsZero();
		shouldThrowEceptionWhenAnyArgumentIsNegative();
		shouldSucceedToCreateARational();
		shouldSucceedToCreateARationalWithNoArgs();
		shouldPrintWithDecimalPlaces();
		shouldSumTwoRationalNumbers();
		shouldSumTwoRationalNumbersWithSameDenominator();
		shouldSubtractTwoRationalNumbers();
		shouldSubtractTwoRationalNumbersWithSameDenominator();
		shouldMultiplyTwoRationalNumbers();
	}
	
	public static void shouldThrowEceptionWhenDenominatorIsZero() {
		ArithmeticException error = null;
		
		System.out.print("Tenta criar um Rational com denominador 0: ");
		
		try {
			Rational myNum = new Rational(12, 0);
		}catch(ArithmeticException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
			error = e;
		}
		
		if(error == null) {
			System.out.print("não passou.\n");
		}
	}
	
	public static void shouldThrowEceptionWhenAnyArgumentIsNegative() {
		IllegalArgumentException error = null;
		
		System.out.print("Tenta criar um Rational com denominador -1: ");
		
		
		try {
			Rational myNum = new Rational(12, -1);
		}catch(IllegalArgumentException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
			error  = e;
		}
		
		System.out.print("Tenta criar um Rational com numerator -1: ");
		
		try {
			Rational myNum = new Rational(-1, 12);
		}catch(IllegalArgumentException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
			error  = e;
		}
		
		if(error == null) {
			System.out.print("não passou.\n");
		}
	}
	
	public static void shouldSucceedToCreateARational() {
		int num1 = 12;
		int num2 = 8;
		
		System.out.print("Tenta criar um Rational com numerator == 12 e denominator == 8: ");
		Rational myNum = new Rational(num1, num2);
		
		if(myNum.toRational().equals("3/2")) {
			System.out.printf("passou. A representação string é: %s%n", myNum.toRational());			
		}else {
			System.out.printf("não passou. A representação string é: %s%n", myNum.toRational());
		}
	}
	
	public static void shouldSucceedToCreateARationalWithNoArgs() {
		System.out.print("Tenta criar um Rational utilizando o construtor sem argumentos: ");
		
		Rational myNum = new Rational();
		
		if(myNum.toRational().equals("1/1")) {
			System.out.printf("passou. A representação string é: %s%n", myNum.toRational());
		}else {
			System.out.printf("não passou. A representação string é: %s%n", myNum.toRational());
		}
	}
	
	public static void shouldPrintWithDecimalPlaces() {
		int decimalPlaces = 2;
		int numerator = 8;
		int denominator = 6;
		Rational myNum = new Rational(numerator, denominator);
		
		System.out.printf("Cria um Rational com numerator == %d e denominator == %d e imprime sua forma decimal com %d casas: ", 
				numerator, denominator, decimalPlaces);
		
		if(myNum.toDecimal(decimalPlaces).equals("1.33")) {
			System.out.printf("passou. A representação decimal com %d casas decimais é: %s%n", 
					decimalPlaces, myNum.toDecimal(decimalPlaces));
		}else {
			System.out.printf("não passou.A representação decimal com %d casas decimais é: %s%n", 
					decimalPlaces, myNum.toDecimal(decimalPlaces));
		}	
	}
	
	public static void shouldSumTwoRationalNumbers() {
		Rational num1 = new Rational(1, 4);
		Rational num2 = new Rational(2, 3);
		
		System.out.printf("%s + %s = %s%n", num1.toRational(), num2.toRational(), Rational.sum(num1, num2).toRational());
		
		if(Rational.sum(num1, num2).toRational().equals("11/12")) {
			System.out.print("Tenta somar 1/4 com 2/3: passou\n");
		}else {
			System.out.print("Tenta somar 1/4 com 2/3: não passou\n");
		}
	}
	
	public static void shouldSumTwoRationalNumbersWithSameDenominator() {
		Rational num1 = new Rational(1, 4);
		Rational num2 = new Rational(1, 4);
		
		System.out.printf("%s + %s = %s%n", num1.toRational(), num2.toRational(), Rational.sum(num1, num2).toRational());
		
		if(Rational.sum(num1, num2).toRational().equals("1/2")) {
			System.out.print("Tenta somar 1/4 com 1/4: passou\n");
		}else {
			System.out.print("Tenta somar 1/4 com 1/4: não passou\n");
		}
	}
	
	public static void shouldSubtractTwoRationalNumbers() {
		Rational num1 = new Rational(2, 3);
		Rational num2 = new Rational(1, 4);
		
		System.out.printf("%s - %s = %s%n", num1.toRational(), num2.toRational(), Rational.subtraction(num1, num2).toRational());
		
		if(Rational.subtraction(num1, num2).toRational().equals("5/12")) {
			System.out.print("Tenta subtrair 1/4 de 2/3: passou\n");
		}else {
			System.out.print("Tenta somar 1/4 de 2/3: não passou\n");
		}
	}
	
	public static void shouldSubtractTwoRationalNumbersWithSameDenominator() {
		Rational num1 = new Rational(2, 4);
		Rational num2 = new Rational(1, 4);
		
		System.out.printf("%s - %s = %s%n", num1.toRational(), num2.toRational(), Rational.subtraction(num1, num2).toRational());
		
		if(Rational.subtraction(num1, num2).toRational().equals("1/4")) {
			System.out.print("Tenta subtrair 1/4 de 2/4: passou\n");
		}else {
			System.out.print("Tenta somar 1/4 de 2/4: não passou\n");
		}
	}

	public static void shouldMultiplyTwoRationalNumbers() {
		Rational num1 = new Rational(2, 4);
		Rational num2 = new Rational(3, 6);
		
		System.out.printf("%s * %s = %s%n", num1.toRational(), num2.toRational(), Rational.multiply(num1, num2).toRational());
		
		if(Rational.multiply(num1, num2).toRational().equals("1/4")) {
			System.out.print("Tenta multiplicar 2/4 por 3/6: passou\n");
		}else {
			System.out.print("Tenta multiplicar 2/4 por 3/6: não passou\n");
		}
	}
}


