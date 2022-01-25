package day22homework;

public class Q6 {

	public static void main(String[] args) {

		Q6 obj = new Q6();

		boolean result1 = obj.endsWithNG(null);
		boolean result2 = obj.endsWithNG("I like to practice");
		boolean result3 = obj.endsWithNG("Everyone is practicing");
		boolean result4 = obj.endsWithNG("I am studying");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

	public boolean endsWithNG(String strOne) {
		boolean result = false;

		if (strOne != null) {
			result = strOne.endsWith("ng");
		} else {
			result = false;
		}

		return result;

	}
}
