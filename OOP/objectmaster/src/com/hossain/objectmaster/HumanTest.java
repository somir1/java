package com.hossain.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Samir = new Human();
		Human leo = new Human();
		
		Samir.displayHealth();
		leo.displayHealth();
		Samir.attack(leo);
		leo.displayHealth();
		leo.attack(Samir);
		leo.attack(Samir);
		Samir.displayHealth();
	}

}
