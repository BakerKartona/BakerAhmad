package day12homework;

public class MethodHwQ2 {
	public static void main(String[] args) {

		boolean result = multipleOf(-5);
		System.out.println(result);
		boolean result2 = multipleOf(3);
		System.out.println(result2);
		boolean result3 = multipleOf(8);
		System.out.println(result3);

	}

	public static boolean multipleOf(int n1) {

		boolean result = false;

		if ((n1 > 0) && (n1 % 3 == 0 || n1 % 5 == 0)) {
			result = true;

		} else
			result = false;

		return result;
	}
}
