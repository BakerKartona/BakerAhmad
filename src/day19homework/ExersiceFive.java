package day19homework;

public class ExersiceFive {
	// static method
	public static void main(String[] args) {

		ExersiceFive obj = new ExersiceFive();

		String result1 = obj.toLower("espn");
			System.out.println(result1);
		String result2 = obj.toLower("SOCCER");
			System.out.println(result2);
		String result3 = obj.toLower("STRING CLASS");
			System.out.println(result3);

	}

	// non static
	protected String toLower(String strOne) {
		String result = "";

		String newstr = strOne.toLowerCase();
		result = newstr;

		return result;

	}

}
