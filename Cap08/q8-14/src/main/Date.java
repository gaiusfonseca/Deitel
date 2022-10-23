package main;

import java.util.Arrays;

public class Date {

	int month;
	int day;
	int year;
	
	private final static int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final static String[] monthNames = {"", 
			"January", "February", "March",
			"April", "May", "June",
			"July", "August", "September",
			"October", "November", "December"};
	
	public Date(int month, int day, int year) {
		System.out.printf("Invocando o Construtor Date(month, day, year) com os valores %02d/%02d/%04d.%n", month, day, year);
		
		String errorMessage;
		
		if(!isMonthInRange(month)) {
			errorMessage = String.format("O mês deve ser um valor entre 01 e 12. %d não é um valor permitido.", month);
			throw new IllegalArgumentException(errorMessage);
		}
		
		if(!isDayInRange(month, day)) {
			errorMessage = String.format("O dia %d não existe no mês %d. a data informada é inválida.", day, month);
			throw new IllegalArgumentException(errorMessage);
		}
		
		if(day == 29 && month == 2 && !isLeapYear(year)) {
			errorMessage = String.format("29/02 só é considerada uma data válida em anos bissestos. %d não é um ano bissexto", year);
			throw new IllegalArgumentException(errorMessage);
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public Date(String month, int day, int year) {
		System.out.printf("Invocando o Construtor Date(month, day, year) com os valores %s %02d, %04d.%n", month, day, year);
		
		String errorMessage;
		int monthIndex = findMonthIndex(month);
		
		if(monthIndex == -1) {
			errorMessage = String.format("Os nomes dos meses devem ser informados em inglês ou você não informou um nome de mês válido. informado: %s%n", month);
			throw new IllegalArgumentException(errorMessage);
		}
		
		if(!isDayInRange(monthIndex, day)) {
			errorMessage = String.format("O dia %d não existe no mês %d. a data informada é inválida.", day, monthIndex);
			throw new IllegalArgumentException(errorMessage);
		}
		
		if(day == 29 && monthIndex == 2 && !isLeapYear(year)) {
			errorMessage = String.format("29/02 só é considerada uma data válida em anos bissestos. %d não é um ano bissexto", year);
			throw new IllegalArgumentException(errorMessage);
		}
		
		this.year = year;
		this.month = monthIndex;
		this.day = day;
	}
	
	public Date(int dayOfYear, int year) {
		String errorMessage;
		int index = 0;
		

		System.out.printf("Chamando o Construtor Date(dayOfYear, year com (%d, %d)%n", dayOfYear, year);
		
		if(dayOfYear < 0 ) {
			errorMessage = String.format("%d é negativo. O dia precisa ser um número positivo.", dayOfYear);
			throw new IllegalArgumentException("errorMessage");
		}
		
		if(!isLeapYear(year) && dayOfYear > 365) {
			errorMessage = String.format("%d não é um ano bissexto. O valor máximo de dias no ano são 365 dias.", year);
			throw new IllegalArgumentException(errorMessage);
		}
		
		if(isLeapYear(year) && dayOfYear > 366) {
			errorMessage = String.format("%d é um ano bissexto. O valor máximo de dias no ano são 366.", year);
			throw new IllegalArgumentException(errorMessage);
		}
		
		while(dayOfYear > daysPerMonth[index]) {
			if(dayOfYear == 0) {
				break;
			}
		
			if(isLeapYear(year) && index == 2) {
				dayOfYear -= 29;
				index++;
			}else {
				dayOfYear -= daysPerMonth[index];
				index++;
			}
		}
		
		month = index;
		day = dayOfYear;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public String toShortDate() {
		return String.format("%02d/%02d/%04d;", getMonth(), getDay(), getYear());
	}
	
	public String toLongDate() {
		return String.format("%s %02d, %04d", monthNames[getMonth()], getDay(), getYear());
	}
	
	public String toSpecialDate() {
		return String.format("%03d %04d", toDayOfYear(), getYear()); 
	}
	
	private static boolean isDayInRange(int month, int day) {
		int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(day <= 0 || day > daysPerMonth[month] && !(day == 29 && month == 2)) {
			return false;
		}
		
		return true;
	}
	
	private static boolean isMonthInRange(int month) {
		if(month <= 0 || month > 12) {
			return false;
		}
		
		return true;
	}
	
	private static boolean isLeapYear(int year) {
		if(year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
			return false;
		}
		
		return true;
	}
	
	private int toDayOfYear() {
		int dayOfYear = 0;
		int completeMonths = getMonth() - 1;
		int monthIndex = 0;
		
		
		while(monthIndex <= completeMonths) {
			dayOfYear += daysPerMonth[monthIndex];
			monthIndex++;
		}
		
		dayOfYear += getDay();
		
		if(completeMonths >= 2 && isLeapYear(getYear())) {
			dayOfYear++;
		}
		
		return dayOfYear;
		
	}
	
	private static int findMonthIndex(String month) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(Character.toUpperCase(month.charAt(0)));
		sb.append(month.toLowerCase().substring(1));
		
		for(int i = 0; i < monthNames.length; i++) {
			if(monthNames[i].equals(sb.toString())) {
				return i;
			}
		}
		
		return -1;
	}
	
}
