package day24homework;

public class Q5 {
	public static void main(String[] args) {

		Q5 obj = new Q5();
		int[] n1 = { 6, 3, 2, 3 };
		int[] n2 = { 13, 3 };
		int[] result = obj.getDouble(n1);
		int[] result2 = obj.getDouble(n2);
		System.out.println("[" + result[0] + "," + result[1] + "," + result[2] + "," + result[3] + "," + result[4] + ","
				+ result[5] + "," + result[6] + "," + result[7] + "]");
		System.out.println("[" + result2[0] + "," + result2[1] + "," + result2[2] + "," + result2[3] + "]");
	}

	private int[] getDouble(int[] number) {

		int[] result = new int[(number.length) * 2];

		for (int i = 0; i < number.length; i++) {
			if (result.length < (result.length - 1)) {
				result[i] = 0;

			}
		}

		result[result.length - 1] = number[number.length - 1];

		return result;

	}

}

/**
 * 
 * Write a method that takes an array of int parameter and return a new array
 * with double the size/length, where its last element value is the same as the
 * original array last element, and all the other element values are 0.
 * 
 */
