package day20homework;

public class Q15 {
	public static void main(String[] args) {

		String result = removeSpace("Java Traing     ");
		System.out.println(result);
		String result2 = removeSpace("    I   like    to  practice     ");
		System.out.println(result2);

	}

	public static String removeSpace(String strOne) {

		String result = "";

		String str = strOne.trim();
		result = str;

		return result;
	}

}
