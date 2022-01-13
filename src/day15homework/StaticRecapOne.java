package day15homework;

public class StaticRecapOne {

	// static variable
	public static boolean isJavaFun;
	String month;

	public static int totalAmount;
	String iLikeJava;

	String country;
	int age;
	char gender;
	public static double temperature;

	public void setCountry() {

		country = "USA";
		System.out.println(country);

	}

	public void getCountry() {

	}
	
	public static void addNum(int a, int b) {
		int result = a + b;
		System.out.println(result);

		temperature = 55.55;
		System.out.println(temperature);

	}

	public static void divNum(int a, int b) {
		addNum(5, 8);
		System.out.println(a + b);

	}
}
