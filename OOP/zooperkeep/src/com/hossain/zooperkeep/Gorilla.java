package com.hossain.zooperkeep;

public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		this.setEnergy(energyLevel);
	}
	
	public Gorilla() {
		this.setEnergy(100);
	}
	
	public void throwSomething() {
		System.out.println("throwing stuff");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("eating some bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("climbing over things");
		energyLevel -= 10;
	}
}