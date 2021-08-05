package com.hossain.phone;

public class Galaxy extends Phone implements Ringable{
	
	public Galaxy (String verNumInput, int battPercentInput, String carrierInput, String ringtoneInput) {
		super(verNumInput, battPercentInput, carrierInput, ringtoneInput);
	}

	@Override
	public void displayInfo() {
		System.out.println("This is the superior phone");
		String info = String.format("Details: \n Version Number: %s, \n Battery Percentage: %s, \n Carrier: %s, \n Ringtone: %s", this.getVerNum(), this.getBattPercent(), this.getCarrier(), this.getRingTone());
		System.out.println(info);
	}
	
	@Override
	public String ring() {
		return "Answer the phone sunshine my beloved user";
	}

	@Override
	public String unlock() {
		return "Fingerprint recognized with an under display fingerprint reader ";
	}
	
}
