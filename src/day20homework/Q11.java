package day20homework;

public class Q11 {

	public static void main(String[] args) {

		Q11 obj = new Q11();

		String result = obj.threeEqual("Java Pro", 'P', 'B');
		System.out.println(result);
		String result2 = obj.threeEqual("Lazy mode", 'm', 'C');
		System.out.println(result2);
		String result3 = obj.threeEqual("Training", 'T', ' ');
		System.out.println(result3);
	}

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";

		String newstr = str.replace(oldChar, newChar);
		
		result = newstr;

		return result;

	}

}
