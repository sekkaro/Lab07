package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	private String name;
	private double price;
	private int rating;
	
	public static void main(String[] args) {
		Chicken menu1 = new Chicken("Cheese_mustard",16000.00,5);
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,1);
		Chicken menu3 = new Chicken("Spicy_chicken",16000.00,3);
		
		menu1.setRating(3);
		menu2.setRating(4);
		menu3.setRating(1);
		
		menu1.printInfo();
		menu2.printInfo();
		menu3.printInfo();
	}
	
	public Chicken() {
		name = "";
		price = 0.0;
		rating = 0;
	}
	
	public Chicken(String name,double price,int rating){
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	private void printInfo(){
		 System.out.println(name + "'s rating is " + rating);
	}

}
