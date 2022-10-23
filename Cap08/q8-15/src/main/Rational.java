package main;

public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational(int numerator, int denominator) {
		System.out.println("Hello World");
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
	
	public String toRational() {
		return String.format("%d/%d", getNumerator(), getDenominator());
	}
	
	public String toDecimal() {
		return String.format("something", null);
	}
}
