package com.hossain.phone;

public class Iphone extends Phone implements Ringable{
	
	public Iphone (String verNumInput, int battPercentInput, String carrierInput, String ringtoneInput) {
		super(verNumInput, battPercentInput, carrierInput, ringtoneInput);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Iphone is not the superior phone");
		String info = String.format("Details: \n Version Number: %s, \n Battery Percentage: %s, \n Carrier: %s, \n Ringtone: %s", this.getVerNum(), this.getBattPercent(), this.getCarrier(), this.getRingTone());
		System.out.println(info);
	}
	
	@Override
	public String ring() {
		return "Ring Ring Ring ";
	}

	@Override
	public String unlock() {
		return "Unlocking using an old boring not so cool facial recognition!";
	}
	
}
