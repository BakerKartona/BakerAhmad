package day10homework;

public class HomeworkQ1 {
	public static void main(String[] args) {

		calculate(3.0, 5.0, '*');

	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		if (mathOperationSign == '+') {
			System.out.println(numOne + " + " + numTwo);

		} else if (mathOperationSign == '-') {
			System.out.println(numOne + " - " + numTwo);

		} else if (mathOperationSign == '/') {
			System.out.println(numOne + " / " + numTwo);

		} else if (mathOperationSign == '*') {
			System.out.println(numOne + " * " + numTwo);

		} else if (mathOperationSign == '%') {
			System.out.println(numOne + " % " + numTwo);

		} else {
			System.out.println("Erorr");

		}

	}
}
