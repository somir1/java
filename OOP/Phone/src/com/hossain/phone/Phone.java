package com.hossain.phone;

public abstract class Phone {
	private String verNum;
    private int battPercent;
    private String carrier;
    private String ringTone;
    
public Phone(String verNumInput, int battPercentInput, String carrierInput, String ringtoneInput) {
	  this.verNum = verNumInput;
	  this.battPercent = battPercentInput;
	  this.carrier = carrierInput;
	  this.ringTone = ringtoneInput;
  }
  
  public abstract void displayInfo();

public String getVerNum() {
	return verNum;
}

public void setVerNum(String verNum) {
	this.verNum = verNum;
}

public int getBattPercent() {
	return battPercent;
}

public void setBattPercent(int battPercent) {
	this.battPercent = battPercent;
}

public String getCarrier() {
	return carrier;
}

public void setCarrier(String carrier) {
	this.carrier = carrier;
}

public String getRingTone() {
	return ringTone;
}

public void setRingTone(String ringTone) {
	this.ringTone = ringTone;
}
  
  
  
}
