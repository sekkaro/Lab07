// package name
package edu.handong.csee.java.lab07.prob1;
// import the java.util.Scanner for using Scanner object for reading input from user
import java.util.Scanner;

// YearToCentury class
public class YearToCentury {
	// private variables can only be accessed through setter and getter methods
	private int year; // private year class variable that is used for reading the year from user  
	private int century; // private century class variable that is used to store the conversion from year to century
	
	//main method
	public static void main(String[] args) {
		int year=0; // year variable defined to store the user input
		Scanner input = new Scanner(System.in); // Scanner object input is created to use the methods defined in the Scanner to read user's inputs
		
		System.out.println("Input year: "); // guides the user to enter the year
		year=input.nextInt(); // stores the int value entered by the use in the year variable
		
		YearToCentury years = new YearToCentury(year); // years object created from YearToCentury class by giving the parameter of year to the class constructor
		System.out.println(year + " is " + years.convertYeartoCentury() + years.findTrailingLetter() + " century."); // prints out the century value converted from year
	}
	
	// empty(no parameters) class constructor 
	public YearToCentury(){
		year = 0; // initializes the private class variable year to 0 since no value of year is given
	}
	
	// class constructor with parameter
	public YearToCentury(int year) {
		this.year = year; // sets the value of year to what the user has given through passing of parameter in the constructor
	}
	
	// method convertYeartoCentury
	public int convertYeartoCentury() {
		// uses a ? conditional statement where century gets the value year/100 if the last two digits of year is 00 or else adds 1 to it
		return century=(year%100==0)?(year/100):((year/100)+1); // returns the value of century converted
	}
	
	// method findTrailingLetter
	public String findTrailingLetter() {
		// if century is between 10 and 20
		if(century>=10 && century<=20) {
			return "th"; // returns th since between 10 to 20 only "th" is used after number
		}
		else {
		// returns trailing letter depending on the last digit of century
		switch(century%10) {
		case 1: return "st"; // returns st since all numbers ending with 1 goes "st" except when last two digits is 10-20
		case 2: return "nd"; // returns nd since all numbers ending with 2 goes "nd" except when last two digits is 10-20
		case 3: return "rd"; // returns rd since all numbers ending with 2 goes "rd" except when last two digits is 10-20
		default: return "th"; // except last digit being 1,2,3 the default "th" is used
		}
		}
	}
}
