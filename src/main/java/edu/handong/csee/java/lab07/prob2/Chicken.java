// package name
package edu.handong.csee.java.lab07.prob2;

/**
 * Chicken class creates various chicken menus with price and rating and shows each menu information.
 * <p>
 * This class uses various setter and getter methods to set various values of chicken menu.
 * This class also has two constructors: one empty and one with 3 parameters passed. 
 * @author Jun Seob Lee
 *
 */
// Chicken class
public class Chicken {
	// private methods can only be used through getter and setter methods
	private String name; // private name class variable that stores the name of the chicken
	private double price; // private price class variable that stores the price of the chicken
	private int rating; // private rating class variable that is used to rate the chicken

	/**
	 * This is the main method.
	 * <p>
	 * This method creates 3 menu objects that are basically chicken menus.
	 * It calls setter methods to change the values of ratings and uses printInfo() method to 
	 * show the detail of each menu.
	 * @param args user input that can be read after compilation while calling
	 */
	// main method
	public static void main(String[] args) {
		// creates 3 objects of Chicken class
		Chicken menu1 = new Chicken("Cheese_mustard",16000.00,5); // first menu object of Chicken class is created with giving name,price and rating parameters to the constructor
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,1); // second menu object of Chicken class is created with giving name,price and rating parameters to the constructor
		Chicken menu3 = new Chicken("Spicy_chicken",16000.00,3); // third menu object of Chicken class is created with giving name,price and rating parameters to the constructor

		// calling setter method for rating
		menu1.setRating(3); // sets the value of rating of menu1 object as 3
		menu2.setRating(4); // sets the value of rating of menu2 object as 4
		menu3.setRating(1); // sets the value of rating of menu3 object as 1

		menu1.printInfo(); // prints the detailed information of menu1 through printInfo() method
		menu2.printInfo(); // prints the detailed information of menu2 through printInfo() method
		menu3.printInfo(); // prints the detailed information of menu3 through printInfo() method
	}

	/**
	 * Empty class constructor for Chicken class.
	 * <p>
	 * This constructor initializes all values of the chicken menu since nothing is passed.
	 */
	// empty class constructor
	public Chicken() {
		name = ""; // name of the Chicken initialized 
		price = 0.0; // price initialized to 0
		rating = 0; // rating initialized to 0
	}

	/**
	 * Chicken class constructor with 3 parameters.
	 * <p>
	 * This constructor sets all values of the chicken menu that has been passed.
	 * @param name string showing the name of the chicken menu
	 * @param price price of the chicken in double type
	 * @param rating rating out of 5 as integer type
	 */
	// class constructor with three parameters
	public Chicken(String name,double price,int rating){
		this.name = name; // the name of the object is set to the value passed by the user when creating the object as a parameter
		this.price = price; // the price of the object is set to the value passed by the user when creating the object as a parameter
		this.rating = rating; // the rating of the object is set to the value passed by the user when creating the object as a parameter
	}

	/**
	 * Getter method for name.
	 * <p>
	 * This method returns the name of the chicken when called.
	 * @return name of the chicken menu as string type.
	 */
	// getter method for name
	public String getName() {
		return name; // returns the name of the Chicken
	}

	/**
	 * Setter method for name.
	 * <p>
	 * This method sets the name of the Chicken to what the parameter has been passed.
	 * @param name string value that describes the name of the chicken
	 */
	// setter method for name
	public void setName(String name) {
		this.name = name; // sets the name of the Chicken to what the parameter has been passed
	}

	/**
	 * Getter method for price.
	 * <p>
	 * This method returns the price of the chicken when called.
	 * @return price of the chicken menu as double type.
	 */
	// getter method for price
	public double getPrice() {
		return price; // returns the price of the Chicken
	}

	/**
	 * Setter method for price.
	 * <p>
	 * This method sets the price of the Chicken to what the parameter has been passed.
	 * @param price double value that describes the price of the chicken
	 */
	// setter method for price
	public void setPrice(double price) {
		this.price = price; // sets the price of the Chicken to what the parameter has been passed
	}

	/**
	 * Getter method for rating.
	 * <p>
	 * This method returns the rating of the chicken when called.
	 * @return rating of the chicken menu out of 5 as integer type.
	 */
	// getter method for rating
	public int getRating() {
		return rating; // returns the rating of the Chicken
	}

	/**
	 * Setter method for rating.
	 * <p>
	 * This method sets the rating of the Chicken to what the parameter has been passed.
	 * @param rating integer value that shows the rating of the chicken out of 5
	 */
	// setter method for rating
	public void setRating(int rating) {
		this.rating = rating; // sets the rating of the Chicken to what the parameter has been passed
	}

	/**
	 * printInfo method to print detailed information of the chicken menu.
	 * <p>
	 * This method uses getter methods to get the name and rating of each of the chicken menu and prints them out.
	 */
	// printInfo method
	private void printInfo(){
		System.out.println(getName() + "'s rating is " + getRating()); // prints out the information of the rating of a particular chicken menu
	}

}
