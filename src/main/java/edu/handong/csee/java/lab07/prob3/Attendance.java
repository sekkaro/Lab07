package edu.handong.csee.java.lab07.prob3;

public class Attendance {
	private int student_id,absence;
	private String name,grade;
	public static void main(String[] args) {
		Attendance student1 = new Attendance("Jess","4th grade",21400999);
		Attendance student2 = new Attendance();
		Attendance student3 = new Attendance("Lucas","1st grade",21833222);
		Attendance student4 = new Attendance();
		
		student2.setName("Kent");
		student2.setGrade("2nd grade");
		student2.setStudent_id(21700111);
		
		student4.setName("Martha");
		student4.setGrade("2nd grade");
		student4.setStudent_id(21733444);
		
		student1.setRandomAbsence();
		student2.setRandomAbsence();
		student3.setRandomAbsence();
		student4.setRandomAbsence();
		
		checkAbsence(student1);
		checkAbsence(student2);
		checkAbsence(student3);
		checkAbsence(student4);
	}
	
	public Attendance() {
		name="";
		grade="";
		student_id=0;
		absence=0;
	}
	
	public Attendance(String name,String grade,int student_id) {
		this.name=name;
		this.grade=grade;
		this.student_id=student_id;
		absence=0;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getAbsence() {
		return absence;
	}

	public void setRandomAbsence() {
		absence = (int)(Math.random()*11) ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public boolean isFail() {
		return (absence > 6);
	}
	
	public static void checkAbsence(Attendance student) {
		if(student.isFail()) {
			System.out.println("Im sorry, " + student.getName() + ". You fail this course");
			System.out.println(student.getName() + " - Number of absence: " + student.getAbsence());
		}
		else {
			System.out.println("We'll see about the grade, " + student.getName());
		}
	}
}
