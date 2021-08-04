package com.hossain.objectmaster;

public class Human {
	public int strength;
	public int stealth;
	public int inteligence;
	public int health;
	
	
	//constrcutors
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.inteligence = 3;
		this.health = 100;
	}
	
	//methods
	public void attack(Human man) {
		man.health -= this.strength;
	}
	
	public void displayHealth() {
		System.out.println(this.health);
	}
}
