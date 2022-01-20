package day19homework;

public class ExersiceNine {
	public static void main(String[] args) {

		ExersiceNine obj = new ExersiceNine();
		boolean r1 = obj.isThere("java training", "ini");
		System.out.println(r1);
		boolean r2 = obj.isThere("java training", "ava");
		System.out.println(r2);
		boolean r3 = obj.isThere("java training", "AVA");
		System.out.println(r3);
		boolean r4 = obj.isThere("java training", "Java");
		System.out.println(r4);

	}

	private boolean isThere(String strOne, String value) {
		boolean result = false;

		if (strOne.contains(value)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}

/**
9. Write a method that takes two String parameters and the method checks if a given
String contains the specified sequence of character values. Return true if it contains the
value otherwise false
*/