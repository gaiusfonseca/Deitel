package main;

public class DateTest {

	public static void main(String[] args) {
		
		int day = 18;
		int month = -1;
		int year = 1989;
		int dayOfYear = -1;
		String monthName = "strawberry";
		String message;
		Date myBirthday;
		
		System.out.println("deve gerar uma exception chamando o construtor com month == -1");
		try {
			myBirthday = new Date(month, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			month = 13;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com month == 13");
		try {
			myBirthday = new Date(month, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			month = 10;
			day = -1;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com day == -1");
		try {
			myBirthday = new Date(month, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			day = 32;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com day == 32");
		try {
			myBirthday = new Date(month, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			day = 29;
			month = 2;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com day == 29 && month == 2 && year == 1989");
		try {
			myBirthday = new Date(month, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			year = 2024;
		}
		
		myBirthday = new Date(month, day, year);
		
		System.out.printf("testando o método toShortDate: %s%n", myBirthday.toShortDate());
		System.out.printf("testando o método toLongDate: %s%n", myBirthday.toLongDate());
		System.out.printf("testando o método toSpecialDate: %s%n", myBirthday.toSpecialDate());
		
		System.out.println("deve gerar uma exception chamando o construtor com month == 'strawberry'");
		try {
			myBirthday = new Date(monthName, day, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			monthName = "JUNE";
		}
		
		System.out.println("Chamando o construtor com month == 'JUNE' para demonstrar que é case insensitive");
		myBirthday = new Date(monthName, day, year);
		
		System.out.printf("testando o método toShortDate: %s%n", myBirthday.toShortDate());
		System.out.printf("testando o método toLongDate: %s%n", myBirthday.toLongDate());
		System.out.printf("testando o método toSpecialDate: %s%n", myBirthday.toSpecialDate());
		
		System.out.println("Chamando o construtor com month == 'december' para demonstrar que é case insensitive");
		monthName = "december";
		myBirthday = new Date(monthName, day, year);
		
		System.out.printf("testando o método toShortDate: %s%n", myBirthday.toShortDate());
		System.out.printf("testando o método toLongDate: %s%n", myBirthday.toLongDate());
		System.out.printf("testando o método toSpecialDate: %s%n", myBirthday.toSpecialDate());
		
		System.out.println("deve gerar uma exception chamando o construtor com dayOfYear == -1");
		try {
			myBirthday = new Date(dayOfYear, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			dayOfYear = 600;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com dayOfYear == 600");
		try {
			myBirthday = new Date(dayOfYear, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			dayOfYear = 366;
			year = 1989;
		}
		
		System.out.println("deve gerar uma exception chamando o construtor com dayOfYear == 366");
		try {
			myBirthday = new Date(dayOfYear, year);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}finally {
			dayOfYear = 180;
		}
		
		myBirthday = new Date(dayOfYear, year);
		
		System.out.printf("testando o método toShortDate: %s%n", myBirthday.toShortDate());
		System.out.printf("testando o método toLongDate: %s%n", myBirthday.toLongDate());
		System.out.printf("testando o método toSpecialDate: %s%n", myBirthday.toSpecialDate());
	}
}
