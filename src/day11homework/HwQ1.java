package day11homework;

public class HwQ1 {
	public static void main(String[] args) {

		boolean isVication = true; 
		boolean isWeekday = true; 

		boolean result = sleepin(isWeekday, isVication); 
		System.out.println(result);

		boolean result2 = sleepin(false, false); 
		System.out.println(result2);

		boolean result3 = sleepin(true, false); 
		System.out.println(result3);

	}

	public static boolean sleepin(boolean isWeekday, boolean isVication) {

		boolean sleepin = false; 

		if (isWeekday == false || isVication == true) { 
			sleepin = true; 

		} else {
			sleepin = false; 

		}

		return sleepin; 
	}

}
