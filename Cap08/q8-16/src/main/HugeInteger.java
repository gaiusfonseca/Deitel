package main;

import java.util.Arrays;

public class HugeInteger {

	private int[] number = new int[40];
	
	public HugeInteger() {
		Arrays.fill(number, 0);
	}
	
	public void parse(String value) {
		
	}
	
	public HugeInteger add(HugeInteger value) {
		return new HugeInteger();
	}
	
	public HugeInteger subtract(HugeInteger value) {
		return new HugeInteger();
	}
	
	public boolean isEqualTo(HugeInteger value) {
		return false;
	}
	
	public boolean isNotEqualTo(HugeInteger value) {
		return false;
	}
	
	public boolean isGreaterThan(HugeInteger value) {
		return false;
	}
	
	public boolean isLessThan(HugeInteger value) {
		return false;
	}
	
	public boolean isGreaterThanOrEqualTo(HugeInteger value) {
		return false;
	}
	
	public boolean isLessThanOrEqualTo(HugeInteger value) {
		return false;
	}
	
	public boolean isZero() {
		int total = 0;
		
		for(int i = 0; i < 40; i++) {
			total += number[i];
		}
		
		if(total == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return "number to String";
	}
}
