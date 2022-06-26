import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
	//using a while loop and letting the user decide when to quit the program.
		boolean quit = false;
		//capture input variable
		String toQuit;
		String model, make;
		int year = 0;
		Scanner scan = new Scanner(System.in);
		
		//create empty object-filling it with data inside the loop.
		//This is not the only way to do it, we could create a new object for each car that we are entering.(will re-factor)
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
			scan.nextLine();
			
			System.out.println("Here's the data you provided: " + car);
			System.out.println("press 'Q' to quit or any key to continue");
			//hold the value that the users enters
			toQuit = scan.next();
			
			if(toQuit.equalsIgnoreCase("Q"))
				quit = true;
			
			
		}
		
		scan.close();
		car.quitScanner();
		System.out.println("Good bye");
			

	}

}
