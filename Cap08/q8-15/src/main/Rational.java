package main;

public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational(int numerator, int denominator) {
		//se o denominador for zero, deve lançar uma ArithmeticException
		if(denominator == 0) {
			throw new ArithmeticException("divisão por zero não é permitida.");
		}
		
		//se um dos números for negativo, deve lançar uma IllegalArgumentException
		if(numerator < 0 || denominator < 0) {
			throw new IllegalArgumentException("somente valores positivos são permitidos.");
		}
		
		this.numerator = numerator / findMDC(numerator, denominator);
		this.denominator = denominator / findMDC(numerator, denominator);
	}
	
	public Rational() {
		this(1,1);
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
		Rational result;
		int numeratorResult;
		int denominatorResult;
		int mmc;
		
		if(num1.getDenominator() == num2.getDenominator()) {
			numeratorResult = num1.getNumerator() + num2.getNumerator();
			denominatorResult = num1.getDenominator();
			result = new Rational(numeratorResult, denominatorResult);
		}else {
			mmc = findMMC(num1.getDenominator(), num2.getDenominator());
			denominatorResult = mmc;
			numeratorResult = mmc / num1.getDenominator() * num1.getNumerator() + 
							  mmc / num2.getDenominator() * num2.getNumerator();
			result = new Rational(numeratorResult, denominatorResult);
		}
		
		return result;
	}

	public static Rational subtraction(Rational num1, Rational num2) {
		Rational result;
		int numeratorResult;
		int denominatorResult;
		int mmc;
		
		if(num1.getDenominator() == num2.getDenominator()) {
			numeratorResult = num1.getNumerator() - num2.getNumerator();
			denominatorResult = num1.getDenominator();
			result = new Rational(numeratorResult, denominatorResult);
		}else {
			mmc = findMMC(num1.getDenominator(), num2.getDenominator());
			denominatorResult = mmc;
			numeratorResult = mmc / num1.getDenominator() * num1.getNumerator() - 
							  mmc / num2.getDenominator() * num2.getNumerator();
			result = new Rational(numeratorResult, denominatorResult);
		}
		
		return result;
	}
	
	public static Rational multiply(Rational num1, Rational num2) {
		int numeratorResult = num1.getNumerator() * num2.getNumerator();
		int denominatorResult = num2.getDenominator() * num2.getDenominator();
		Rational result = new Rational(numeratorResult, denominatorResult);
		return result;
	}
	
	public static Rational divide(Rational num1, Rational num2) {
		int numeratorResult = num1.getNumerator() * num2.getDenominator();
		int denominatorResult = num1.getDenominator() * num2.getNumerator();
		Rational result = new Rational(numeratorResult, denominatorResult);
		return result;
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
	
	public static int findMMC(int num1, int num2) {
		int start = 2;
		int mmc = 1;
		
		if(num1 == num2) {
			mmc = num1;
			return mmc;
		}
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			mmc = Math.max(num1, num2);
			return mmc;
		}
		
		while(start < num1 || start < num2) {
			if(num1 % start != 0 && num2 % start != 0) {
				start++;
			}
			
			if(num1 % start == 0 || num2 % start == 0) {
				mmc *= start;
			}
			
			if(num1 % start == 0) {
				num1 /= start;
			}
			
			if(num2 % start == 0) {
				num2 /= start;
			}
		}
		
		return mmc;
	}
	
	public String toRational() {
		return String.format("%d/%d", getNumerator(), getDenominator());
	}
	
	public String toDecimal(int decimalPlaces) {
		
		int integerPart = 1;
		int decimalPart = 1;
		int factor = 1;
		
		if(decimalPlaces > 9) {
			throw new IllegalArgumentException("não é possível solicitar mais que 9 casas decimais"
					+ " pois estoura o limite dos números inteiros");
		}

		while(decimalPlaces > 0) {
			factor *= 10;
			decimalPlaces--;
		}
		
		integerPart = getNumerator() / getDenominator();
		decimalPart = getNumerator() % getDenominator() * factor / getDenominator();
		
		return String.format("%d.%d", integerPart, decimalPart);
	}
}
