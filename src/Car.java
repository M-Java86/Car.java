import java.util.Scanner;

public class Car {
	
	
	//private fields
	private String _model;
	private String _make;
	private int _year;
	Scanner scan = new Scanner(System.in);
	
	//Constructor 
	public Car(String make, String model, int year)
	{
		//assign values to = to constructor
		_model = model;
		_make = make;
		_year = year;
	}
      //getters -simply return model
	public String getModel() { return _model; }
	public String getMake() { return _make; }
	public int getYear() { return _year; } 
	
	//setters- take the string of a model as an argument and it will set it to the model.
	//I have set a value to my model and passing the value as an argument.
	//I use the _ under my private class variables so I can distinguish which one is my private variable and which one is an 
	//argument that I'm passing 
	
	public void setModel(String model) { _model = model; }
	public void setMake(String make) { _make = make; }
	public void setYear(int year) 
	{ 
		//year cannot be less than 1900 < 1900 or more than 2015
		_year = year; 
		while (year <1900 || year > 2015)
		{ //this will be looping until user enters correct year. 
			System.out.println("Please enter valid year");
			year = scan.nextInt();
		}
		_year = year;
  }
	public String toString()
	{
      //toString method will simply return the make, model and the year.
	return _make + " " + _model + " " + Integer.toString(_year);
	}
}
