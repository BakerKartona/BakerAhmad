package day20homework;

public class Q14 {
	public static void main(String[] args) {

		String result1 = getSubStr("java training", 2, 6);
		String result2 = getSubStr("Software Development Engineer in TEST", 11, 23);
		String result3 = getSubStr("Software Development Engineer in TEST", 21, 29);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = "";

		String newstr = str.substring(startingIndex, endingIndex);
		result = newstr;

		return result;

	}

}
