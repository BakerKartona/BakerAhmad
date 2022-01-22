package day20homework;

public class Q8 {

	/**
	 * 8- Write a method that takes two parameters, one String parameter and one
	 * integer parameter. The method should return the character at the given index
	 * within the String. If the indexNum more than the length of String then return
	 * ‘?’ mark
	 */

	public static void main(String[] args) {

		char result = getCharacter("java training", 2);
		System.out.println(result);
		char result2 = getCharacter("java training", 5);
		System.out.println(result2);
		char result3 = getCharacter("java training", 8);
		System.out.println(result3);
		char result4 = getCharacter("java training", 22);
		System.out.println(result4);

	}

	public static char getCharacter(String strOne, int indexNum) {
		char result = ' ';

		if (indexNum > strOne.length()) {
			result = '?';
		
		}else{
			result = strOne.charAt(indexNum);
			
		}

		return result;
	}

}
