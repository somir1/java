package com.hossain.phone;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone Samir = new Iphone("12", 50, "T-mobile", "Blah Blah Blah");
		Galaxy Leon = new Galaxy("s21 ultra", 100, "T-mobile", "RINGGGGGG");
		
		Samir.displayInfo();
		System.out.println(Samir.unlock());
		System.out.println(Samir.ring());
		
		Leon.displayInfo();
		System.out.println(Leon.unlock());
		System.out.println(Leon.ring());
		
	}

}
