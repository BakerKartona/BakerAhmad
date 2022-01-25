package day22homework;

public class Q1 {

	public static void main(String[] args) {
		Q1 obj = new Q1();

		String result1 = obj.toUpper("Pro");
		String result2 = obj.toUpper("java");
		String result3 = obj.toUpper(null);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

	String toUpper(String strOne) {
		String result = "";

		if (strOne != null) {

			result = strOne.toUpperCase();
		} else {
			result = null;
		}

		return result;

	}

}
