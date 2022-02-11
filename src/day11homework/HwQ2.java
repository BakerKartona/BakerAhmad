package day11homework;

public class HwQ2 {
	public static void main(String[] args) {

		boolean areWeInTruble = monkeyTrouble(false, false);
		System.out.println(areWeInTruble);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		boolean result = false;

		if (aSmile && bSmile) {
			result = true;

		} else if (aSmile == false && bSmile == false) {
			result = true;

		} else {
			result = false;

		}
		return result;
	}

}
