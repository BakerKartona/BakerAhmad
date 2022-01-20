package day19homework;

public class ExersiceSix {
	public static void main(String[] args) {

		String result0 = combineStr("day", "ONE", "work", "HOURS");
		System.out.println(result0);
		String result1 = combineStr("week", "weekend", "monday", "Tuesday");
		System.out.println(result1);
		String result2 = combineStr("restoN", "vA", "baltiMORE", "MD");
		System.out.println(result2);
		String result3 = combineStr("java", "is", "fun", "LEARNING");
		System.out.println(result3);

	}

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {

		String result = "";

		String newstr = strOne.toUpperCase() + strTwo.toLowerCase();
		String newstr2 = strThree.toUpperCase() + strFour.toLowerCase();
		result = (newstr.concat(newstr2));

		return result;

	}

}

/**
 * 
 * 6. Write a method that takes four String parameters, the method a. converts
 * parameter 1 and parameter 3 to Uppercase, b. converts parameter 2 and
 * parameter 4 to lower case c. Then the method concatenates all four parameters
 * and return the new String value.
 * 
 * 
 */