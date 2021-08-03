package com.hossain.zooperkeep;

public class Bat extends Mammal {
	
	public Bat(int energyLevel) {
		this.setEnergy(energyLevel);
	}
	
	public Bat() {
		this.setEnergy(100);
	}
	
	public void fly() {
		System.out.println("The sound of a bat taking off");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Well, nevermind");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The sound of a town on fire");
		energyLevel -= 100;
	}
}