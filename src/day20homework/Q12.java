package day20homework;

public class Q12 {

	public static void main(String[] args) {

		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");

	}

	public static void replaceStr(String strOne, String oldStr, String newStr) {

		System.out.println(strOne.replace(oldStr, newStr));

	}

}