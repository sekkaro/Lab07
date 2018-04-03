package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class YearToCentury {
	private int year;
	private int century;
	public static void main(String[] args) {
		int year=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input year: ");
		year=input.nextInt();
		
		YearToCentury years = new YearToCentury(year);
		System.out.println(year + " is " + years.convertYeartoCentury() + years.findTrailingLetter() + " century.");
	}
	
	public YearToCentury(){
		year = 0;
	}
	
	public YearToCentury(int year) {
		this.year = year;
	}
	
	public int convertYeartoCentury() {
		return century=(year%100==0)?(year/100):((year/100)+1);
	}
	
	public String findTrailingLetter() {
		if(century>=10 && century<=20) {
			return "th";
		}
		else {
		switch(century%10) {
		case 1: return "st";
		case 2: return "nd";
		case 3: return "rd";
		default: return "th";
		}
		}
	}
}
