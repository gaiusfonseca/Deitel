package main;

import java.util.Arrays;

public class HugeInteger {

	private final static int SIZE = 40;
	private int[] number = new int[SIZE];
	
	public HugeInteger() {
		Arrays.fill(number, 0);
	}
	
	public HugeInteger(String value) {
		number = parse(value);
	}
	
	public static int[] parse(String value) {
		int length = value.length();
		int[] number = new int[SIZE];
		
		if(length > SIZE) {
			throw new IllegalArgumentException("Não é possível armazenar um número com mais de 40 dígitos.");
		}
		
		for(int i = SIZE - length; i < SIZE; i++) {
			number[i] = Character.getNumericValue(value.charAt(length - (SIZE - i)));
		}
		
		return number;
	}
	
	public int[] getNumber() {
		return number;
	}
	
	public void setNumber(String value) {
		if(value.length() > SIZE) {
			throw new IllegalArgumentException("Não é possível armazenar um número com mais de 40 dígitos.");
		}
		
		for(int i = 0; i < value.length(); i++) {
			if(!Character.isDigit(value.charAt(i))) {
				throw new IllegalArgumentException("a String fornecida não é um número decimal.");
			}
		}
		
		number = parse(value);
	}
	
	public HugeInteger add(HugeInteger value) {
		return new HugeInteger();
	}
	
	public HugeInteger subtract(HugeInteger value) {
		return new HugeInteger();
	}
	
	public boolean isEqualTo(HugeInteger value) {
		if(Arrays.equals(number, value.getNumber())) {
			return true;
		}
		
		return false;
	}
	
	public boolean isNotEqualTo(HugeInteger value) {
		return !isEqualTo(value);
	}
	
	public boolean isGreaterThan(HugeInteger value) {
		for(int i = 0; i < getNumber().length; i++) {
			if(getNumber()[i] > value.getNumber()[i]) {
				return true;
			}
		}
	
		return false;
	}
	
	public boolean isLessThan(HugeInteger value) {
		for(int i = 0; i < getNumber().length; i++) {
			if(getNumber()[i] < value.getNumber()[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isGreaterThanOrEqualTo(HugeInteger value) {
		return !isLessThan(value);
	}
	
	public boolean isLessThanOrEqualTo(HugeInteger value) {
		return !isGreaterThan(value);
	}
	
	public boolean isZero() {
		int total = 0;
		int[] value = getNumber();
		
		for(int i = 0; i < 40; i++) {
			total += value[i];
		}
		
		if(total == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void showValue() {
		System.out.print("Number value: ");
		for(int digit : getNumber()) {
			System.out.print(digit);
		}
		System.out.println("\n");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int x : getNumber()) {
			sb.append(x);
		}
		return sb.toString();
	}
}
