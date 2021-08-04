package com.hossain.objectmaster;

public class Wizard extends Human{
	public Wizard() {
		this.health = 50;
		this.inteligence = 8;
	}
	
	public void heal(Human injured) {
		injured.health += this.inteligence;
	}
	
	public void fireball(Human injured) {
		injured.health -= this.inteligence * 3;
	}
}
