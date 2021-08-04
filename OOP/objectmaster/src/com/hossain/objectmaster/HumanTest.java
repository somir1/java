package com.hossain.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Samir = new Human();
		Human leo = new Human();
		Ninja jake = new Ninja();
		Samurai jack = new Samurai();
		Wizard john = new Wizard();
		
		Samir.displayHealth();
		leo.displayHealth();
		Samir.attack(leo);
		leo.displayHealth();
		leo.attack(Samir);
		leo.attack(Samir);
		Samir.displayHealth();
		john.heal(Samir);
		Samir.displayHealth();
		jake.steal(Samir);
		Samir.displayHealth();
		jack.deathBlow(leo);
		leo.displayHealth();
		jack.displayHealth();
		jack.meditate();
		jack.displayHealth();
		Samir.displayHealth();
		john.fireball(Samir);
		Samir.displayHealth();
		
		
		
	}

}
