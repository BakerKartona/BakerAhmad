package day19homework;

public class ExersiceThree {

	// static method
	public static void main(String[] args) {

		isEqualLength("pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
	}

	// static method
	public static void isEqualLength(String strOne, String strTwo) {

		if (strOne.length() == strTwo.length()) {

			String newstr = strOne.concat(strTwo);
			System.out.println(newstr);
			System.out.println(newstr.length());

		} else if (strOne.length() > strTwo.length()) {

			String newstr = strOne.toUpperCase();
			System.out.println(newstr);
			System.out.println(newstr.length());

		} else if (strOne.length() < strTwo.length()) {
			String newstr = strTwo.toLowerCase();
			System.out.println(newstr);
			System.out.println(newstr.length());

		}
	}

}

/**
 * 3. Write a method that takes two String parameter and checks if the length of
 * parameter one equal to the length of parameter two. a. If they are equal,
 * then concatenate parameter 1 with parameter two and print the new string
 * value with its length b. If parameter 1 length is greater than parameter 2
 * then print parameter 1 all in uppercase with its length c. If parameter 1
 * length is less than parameter 2 then print parameter2 all in lowercase with
 * its length
 */