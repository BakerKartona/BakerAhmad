package day12homework;

public class MethodHwQ1 {
	public static void main(String[] args) {

		boolean myResult = posNeg(-2, 3, false);
		System.out.println(myResult);

		boolean myResult2 = posNeg(-2, -2, true);
		System.out.println(myResult2);
	}

	public static boolean posNeg(int n1, int n2, boolean negative) {

		boolean result = false;

		if (n1 < 0 && n2 > 0 && negative == false) {
			result = true;

		} else if (n1 > 0 && n2 < 0 && negative == true) {
			result = true;

		} else {
			result = false;
		}

		return result;
	}

}
