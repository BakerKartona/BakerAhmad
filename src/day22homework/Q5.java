package day22homework;

public class Q5 {

	public static void main(String[] args) {

		String result1 = removeSpace(null);
		String result2 = removeSpace(" Java Training ");
		String result3 = removeSpace(" I like to practice ");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	public static String removeSpace(String strOne) {
		String result = "";

		if (strOne != null) {
			result = strOne.trim();

		} else {
			result = null;

		}

		return result;

	}

}
