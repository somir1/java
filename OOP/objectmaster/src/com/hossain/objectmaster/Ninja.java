package com.hossain.objectmaster;

public class Ninja extends Human{
	
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human enemey) {
		enemey.health -= this.stealth;
		
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
