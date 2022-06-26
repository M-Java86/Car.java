import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
	//using a while loop and letting the user decide when to quit the program.
		boolean quit = false;
		String model, make;
		int year = 0;
		Scanner scan = new Scanner(System.in);
		
		//create empty object-filling it with data inside the loop
		Car car = new Car(" ", " ", 0); //initialized to nothing empty strings and 0 for the year
		
		//loop
		while(!quit) 
		{
			System.out.println("Please enter the Car Make, Model and year :");
			make = scan.next();
			model = scan.next();
			year = scan.nextInt();
			
			//assign data to object-Setters come into play
			car .setMake(make);
			car .setModel(model);
			car .setYear(year);
			
			
		}
			

	}

}
