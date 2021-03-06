package com.hossain.bankaccount;

public class BankAccount {
	
	//member variables
	private double checkingBal;
	private double savingsBal;
	private static int accounts;
	private static double Total;
	
	
	//atatic varible for number of accounts
	public BankAccount() {
		accounts += 1;
	}

	//methods am i right 
	//depositing
	public void depositCheck(double money) {
		this.checkingBal += money;
		BankAccount.Total += money;
		System.out.println("Checkings: $" + this.checkingBal);
	}
	
	public void depositSave(double money) {
		this.savingsBal += money;
		BankAccount.Total += money;
		System.out.println("Savings: $" + this.savingsBal);
	}
	
	//withdrawing
	public void withdrawCheck(double money) {
		if(this.checkingBal < money) {
			System.out.println("Insufficent Funds");
		}
		else {
		this.checkingBal -= money;
		BankAccount.Total -= money;
		System.out.println("Checkings: $" + this.checkingBal);
		}
	}
	
	public void withdrawSave(double money) {
		if(this.savingsBal < money) {
			System.out.println("Insufficent Funds");
		}
		else {
		this.savingsBal -= money;
		BankAccount.Total -= money;
		System.out.println("Savings: $" + this.savingsBal);
		}
	}
	
	public static int allAccounts() {
		return accounts;
	}
	
	public void showmeMoney() {
		System.out.println("You grand total is $" + (this.checkingBal += this.savingsBal));

	}
	
	
	
	
}
