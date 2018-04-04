// package name
package edu.handong.csee.java.lab07.prob3;

/**
 * Attendance class checks the attendance for each student.
 * <p>
 * This class has various setter and getter methods for student id number, number of absence,
 * name and grade of the student. It also has 2 constructors for empty and with parameters.
 * @author Jun Seob Lee
 *
 */
// Attendance class
public class Attendance {
	// private methods can only be used through getter and setter methods
	private int student_id,absence; // private student_id and absence class variables are used to store the studentid number and the number of absences of a student
	private String name,grade; // private name and grade class variables are used to store the name of the student and his/her year of study

	/**
	 * This is main method.
	 * <p>
	 * This method creates various student objects and uses setter methods to set the information
	 * of each student. Also calls methods to assign random absence values and checks if the 
	 * student has made enough attendance to pass the course.
	 * @param args string input that can be read from use while executing
	 */
	// main method
	public static void main(String[] args) {
		// creates 4 student objects for the Attendance class
		Attendance student1 = new Attendance("Jess","4th grade",21400999); // object student1 is created with passing parameters with information about the student
		Attendance student2 = new Attendance(); // object student2 is created with an empty attendance constructor
		Attendance student3 = new Attendance("Lucas","1st grade",21833222); // object student3 is created with passing parameters with information about the student
		Attendance student4 = new Attendance(); // object student4 is created with an empty attendance constructor

		// calls setter methods to set values of student2 object
		student2.setName("Kent"); // sets the name of student2
		student2.setGrade("2nd grade"); // sets the grade of student2
		student2.setStudent_id(21700111); // sets the student id of student2

		// calls setter methods to set values of student4 object
		student4.setName("Martha"); // sets the name of student4
		student4.setGrade("2nd grade"); // sets the grade of student4
		student4.setStudent_id(21733444); // sets the student id of student4

		// sets the value of absence randomly to each student objects of Attendance class
		student1.setRandomAbsence(); // sets number of absence randomly for student1
		student2.setRandomAbsence(); // sets number of absence randomly for student2
		student3.setRandomAbsence(); // sets number of absence randomly for student3
		student4.setRandomAbsence(); // sets number of absence randomly for student4

		// checks the attendance of each student through static method of checkAbsence()
		checkAttendance(student1); // checks absence of student1 and prints some message
		checkAttendance(student2); // checks absence of student1 and prints some message
		checkAttendance(student3); // checks absence of student1 and prints some message
		checkAttendance(student4); // checks absence of student1 and prints some message
	}

	/**
	 * Empty class constructor for Attendance class.
	 * <p>
	 * This constructor initializes everything nothing or 0 since nothing is given or passed. 
	 */
	// empty constructor
	public Attendance() {
		name=""; // initializes the name of the student as nothing
		grade=""; // initializes the grade of the student as nothing
		student_id=0; // initializes the id of the student as 0
		absence=0; // initializes the number of absence of the student as 0
	}

	/**
	 * Constructor with 3 parameters for Attendance class
	 * <p>
	 * This constructor sets the values of name,grade,student id and initializes number of absence
	 * depending on the parameters passed. 
	 * @param name string that contains the name of the student
	 * @param grade string that stores the value of which year the student is studying in
	 * @param student_id integer value that has the id number of the student
	 */
	// constructor with 3 parameters
	public Attendance(String name,String grade,int student_id) {
		this.name=name; // sets the name of this particular object same as what parameters were passed when the object was created
		this.grade=grade; // sets the grade of this particular object same as what parameters were passed when the object was created
		this.student_id=student_id; // sets the student id of this particular object same as what parameters were passed when the object was created
		absence=0; // initializes absence to 0
	}

	/**
	 * Getter method for student_id.
	 * <p>
	 * This method returns or basically gives the value of the student id that is currently stored
	 * in the particular object.
	 * @return the student id number of the student
	 */
	// getter method for student id number
	public int getStudent_id() {
		return student_id; // returns the value of student_id of the particular object
	}

	/**
	 * Setter method for student_id.
	 * <p>
	 * This method sets the student id number as to what the parameter was passed. 
	 * @param student_id integer value of student id number of the student object
	 */
	// setter method for student id number
	public void setStudent_id(int student_id) {
		this.student_id = student_id; // sets the student id number as to what the parameter was passed
	}

	/**
	 * Getter method for absence.
	 * <p>
	 * This method returns or basically gives the value of the number of absence of 
	 * the student that is currently stored in the particular object.
	 * @return the number of absences of the student
	 */
	// getter method for absences
	public int getAbsence() {
		return absence; // returns the number of absence of the particular object
	}

	/**
	 * Setter method for random absence.
	 * <p>
	 * This method sets the number of absence randomly by using Math.random()
	 * from 0 to 10. 
	 */
	// setter method for setting random absence values to students
	public void setRandomAbsence() {
		absence = (int)(Math.random()*11) ; // sets the absence value as random by using Math.random to store random number between 0 to 10
	}

	/**
	 * Getter method for name.
	 * <p>
	 * This method returns or basically gives the name of the student that is currently stored
	 * in the particular object.
	 * @return the name of the student
	 */
	// getter method for name
	public String getName() {
		return name; // returns the name of student of the particular object
	}

	/**
	 * Setter method for name.
	 * <p>
	 * This method sets the name of student as to what the parameter was passed. 
	 * @param name string value of name of student object
	 */
	// setter method for name
	public void setName(String name) {
		this.name = name; // sets the name of student as to what the parameter was passed
	}

	/**
	 * Getter method for grade.
	 * <p>
	 * This method returns or basically gives the grade of the student that is currently stored
	 * in the particular object.
	 * @return the grade of the student
	 */
	// getter method for grade
	public String getGrade() {
		return grade; // returns the grade of student of the particular object
	}

	/**
	 * Setter method for grade.
	 * <p>
	 * This method sets the grade of the student as to what the parameter was passed. 
	 * @param grade string value of grade of the student object
	 */
	// setter method for grade
	public void setGrade(String grade) {
		this.grade = grade; // sets grade of student as to what the parameter was passed
	}

	/**
	 * This is the isFail() method.
	 * <p> 
	 * This method checks whether the number of absences that a particular student object
	 * has is a fail in the course or not.
	 * @return boolean value which is either true or false
	 */
	// isFail() method
	public boolean isFail() {
		return (absence > 6); // returns that it is true(Fail) if the random absence value of that particular student object is greater than 6
	}

	/**
	 * This is the checkAttendance() method.
	 * <p>
	 * this method checks if the student has failed or not by calling the isFail() method
	 * and prints the information accordingly through the use of getter methods.
	 * @param student Attendance class object that is passed to actually call the current student's getter methods 
	 */
	// checkAttendance() method
	public static void checkAttendance(Attendance student) {
		// if the student has failed
		if(student.isFail()) {
			System.out.println("Im sorry, " + student.getName() + ". You fail this course"); //prints out some message and the name is only gotten from its getter method
			System.out.println(student.getName() + " - Number of absence: " + student.getAbsence()); // prints out some message and the number of absence and the name is only gotten from its getter method
		}
		// if the student's absence is less than 6
		else {
			System.out.println("We'll see about the grade, " + student.getName()); // prints out some message while using getter method for name of student
		}
	}
}
