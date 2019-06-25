import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		//Variables
		Scanner in = new Scanner(System.in);//accept user input
		double length; //variable to store user input
		double width; // variable to store user input
		double height; //variable to store user input
		double area; //variable to store area calculation
		double perimeter; //variable to store perimeter calculation
		double volume; //variable to store volume calculation
		char choice; //store user choice
		String temp; //store temp variable to test user choice
		//Generic welcome phrase for user
		String welcome = "Welcome to Grand Circus' Room Detail Generator!";
		
		//Print welcome message for user
		System.out.println(welcome + "\n\n");
		
		//Start loop to allow code to repeat
		do {

			// Obtain user input for length and with
			System.out.println("Enter Length: ");
			length = in.nextDouble();
			System.out.println("Enter Width: ");
			width = in.nextDouble();
			System.out.println("Enter Height: ");
			height = in.nextDouble();
			
			// perform math calculations for area and perimeter
			area = length * width;
			perimeter = (2 * length) + (2 * width);
			volume = length * width * height;

			// Print calculated variables
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			//Test user decision to continue
			//also control user input for both upper or lower case char
			System.out.print("Continue? (y,n)");
			temp = in.next().toUpperCase(); 
			choice = temp.charAt(0);

		} while (choice != 'N');
		
		
	}

}
