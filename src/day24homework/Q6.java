package day24homework;

public class Q6 {
	public static void main(String[] args) {

		int[] n1 = { 6, 1, 2, 3 };
		int[] n2 = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int[] n3 = { 3, 3, 0, 1, 4, 3, 6 };
		int[] n4 = { 2, 6, 2 };

		boolean result = checkNum(n1);
		boolean result2 = checkNum(n2);
		boolean result3 = checkNum(n3);
		boolean result4 = checkNum(n4);

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

	protected static boolean checkNum(int[] number) {
		boolean result = false;

		int count2 = 0;
		int count5 = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == 2) {
				count2++;
			}
			if (number[i] == 5) {
				count5++;
			}
			if (count5 >= 5) {
				result = true;
			}
		}
		if (count2 >= 2) {

			result = true;

		}
		return result;
	}
}