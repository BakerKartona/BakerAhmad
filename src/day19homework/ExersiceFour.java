package day19homework;

public class ExersiceFour {

	// static method
	public static void main(String[] args) {

		// make an OBJECT
		ExersiceFour obj = new ExersiceFour();

		String result1 = obj.toUpper("pro");
		System.out.println(result1);
		String result2 = obj.toUpper("java");
		System.out.println(result2);
		String result3 = obj.toUpper("java training");
		System.out.println(result3);

	}

	// non-static
	String toUpper(String strOne) {

		String result = "";

		String newstr = strOne.toUpperCase();
		result = newstr;

		return result;
	}
}

/**
 * /**Write a method that takes one String parameter and the method converts the
 * parameter to uppercase and return the new String value
 */
