package day22homework;

public class Q3 {
	public static void main(String[] args) {

		Q3 obj = new Q3();

		String result1 = obj.threeEqual(null, 'P', 'B');
		String result2 = obj.threeEqual("Java Pro", 'P', 'B');
		String result3 = obj.threeEqual("Lazy mode", 'm', 'C');
		String result4 = obj.threeEqual("Training", 'T', ' ');

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

	protected String threeEqual(String str, char oldChar, char newchar) {
		String result = "";

		if (str != null) {
			result = str.replace(oldChar, newchar);
		} else {
			result = null;

		}

		return result;

	}

}
