package main;

public class RationalTest {
	
	public static void main(String[] args) {

		shouldThrowEceptionWhenDenominatorIsZero();
		shouldThrowEceptionWhenAnyArgumentIsNegative();
		shouldSucceedToCreateARational();
	}
	
	public static void shouldThrowEceptionWhenDenominatorIsZero() {
		System.out.print("Tenta criar um Rational com denominador 0: ");
		
		try {
			Rational myNum = new Rational(12, 0);
		}catch(ArithmeticException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
		}
		
		System.out.print("não passou.\n");
	}
	
	public static void shouldThrowEceptionWhenAnyArgumentIsNegative() {
		System.out.print("Tenta criar um Rational com denominador -1: ");
		
		try {
			Rational myNum = new Rational(12, -1);
		}catch(IllegalArgumentException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
		}
		
		System.out.print("não passou.\n");
		
		System.out.print("Tenta criar um Rational com numerator -1: ");
		
		try {
			Rational myNum = new Rational(-1, 12);
		}catch(IllegalArgumentException e) {
			System.out.printf("passou. falhou com a mensagem: %s%n", e.getMessage());
		}
		
		System.out.print("não passou.\n");
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
}
