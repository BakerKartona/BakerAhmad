package day15homework;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {
		
		StaticRecapOne.isJavaFun = true; // we calling a static variable 
		StaticRecapOne.totalAmount = 1111; // we calling a static variable 

		System.out.println(StaticRecapOne.isJavaFun); 
		System.out.println(StaticRecapOne.totalAmount);

		StaticRecapOne.addNum(5, 8);

	}

	// non-static method
	public void statusUpdate() {

		StaticRecapOne obj = new StaticRecapOne(); // created a new object so we can access an instance variables

		obj.month = "January";     // instance variable #1
		obj.iLikeJava = "Java Is Life"; //instance variable #1

		System.out.println(obj.month);
		System.out.println(obj.iLikeJava);

		obj.getCountry();

	}

	public static void main(String[] args) {

		getInfo();

	}

}
