package day8homework;

public class HomeworkQ4 {
	public static void main(String[] args) {

		int evenTotal = 0;
		int oddTotal = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				// even
				evenTotal = evenTotal + i;

			} else {
				// odd
				evenTotal = oddTotal + i;

			}
			System.out.println("Even Numbers: " + evenTotal);
			System.out.println("Odd Numbers: " + oddTotal);
			
			
		}

	}

}
