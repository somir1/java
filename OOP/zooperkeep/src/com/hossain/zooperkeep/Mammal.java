package com.hossain.zooperkeep;

public class Mammal {
	public int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
	return energyLevel;
	}
	
	public void displayStats() {
		String stats = String.format("Energy Level is %d",this.energyLevel );
	}
	
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}

