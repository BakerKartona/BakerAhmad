package day9homework;

public class BrokenCodeTwo {

	private static int i;

	public static void   main(String[] args) {
		double tempOne= 84.7;
		 int tempTwo = 66;
		
		boolean result = true; 
		if (tempOne <= 0 && tempTwo <= 100) {
			result = true;
		}  else if  (tempOne >= 100 && tempTwo <= 0); {
			result = true;
		
		}
		
		System.out.println(result);
		
		String season = "Monday";

		switch (season) {
		case "Fall":
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 break;
		case "s":
			System.out.println("Recovering from cold weather");			
			break;
		case "Summer":
			System.out.println("Toooo hot");			
			 
		default:
			System.out.println("Season does not exist!");	
		}
		
		
		for (int i = 0; i <10; i++);{
			
			if (i == 5) {
				System.out.println("I equals to 5");
			} else {
				System.out.println("i not equals");
			}
		}

}

}




