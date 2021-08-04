package com.hossain.objectmaster;

public class Samurai extends Human{
	public Samurai() {
		this.health = 200;
	}
	
	public static int total = 0;
	
	public void deathBlow(Human enemey) {
		enemey.health = 0;
		this.health/=2;
	}
	
	public void meditate() {
		this.health += (this.health/2);
	}
	
	public void howMany() {
		System.out.println(total);
	}
}
