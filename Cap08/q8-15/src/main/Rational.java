package main;

public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational(int numerator, int denominator) {
		//se o denominador for zero, deve lançar uma ArithmeticException
		if(denominator == 0) {
			throw new ArithmeticException("divisão por zero não é permitida.");
		}
		
		this.numerator = numerator / findMDC(numerator, denominator);
		this.denominator = denominator / findMDC(numerator, denominator);
	}
	
	public Rational() {
		numerator = 1;
		denominator = 1;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public static Rational sum(Rational num1, Rational num2) {
		return new Rational();
	}

	public static Rational subtraction(Rational num1, Rational num2) {
		return new Rational();
	}
	
	public static Rational multiply(Rational num1, Rational num2) {
		return new Rational();
	}
	
	public static Rational divide(Rational num1, Rational num2) {
		return new Rational();
	}
	
	private int findMDC(int num1, int num2) {
		int start = 2;
		int stop = Math.min(num1, num2);
		int mdc = 1;
		
		while(start <= stop) {
			if(num1 % start == 0 && num2 % start == 0) {
				num1 = num1 / start;
				num2 = num2 / start;
				mdc *= start;
			}else {
				start++;
			}
		}
		
		return mdc;
	}
	
	public String toRational() {
		return String.format("%d/%d", getNumerator(), getDenominator());
	}
	
	public String toDecimal() {
		return String.format("something", null);
	}
}
