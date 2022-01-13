package day15homework;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {
		StaticRecapOne obj = new StaticRecapOne();

		obj.isJavaFun = true;
		obj.totalAmount = 1111;

		System.out.println(obj.isJavaFun);
		System.out.println(obj.totalAmount);

		StaticRecapOne.addNum(5, 8);

	}

	// non-static method
	public void statusUpdate() {

		StaticRecapOne obj = new StaticRecapOne();

		obj.month = "January";
		obj.iLikeJava = "Java Is Life";

		System.out.println(obj.month);
		System.out.println(obj.iLikeJava);

		obj.getCountry();

	}

	public static void main(String[] args) {

		StaticRecapTwo.getInfo();

	}

}
