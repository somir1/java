package com.hossain.bankaccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Samir = new BankAccount();
		BankAccount Leon = new BankAccount();
		Samir.printCheckingMoney();
		Samir.showmeMoney();
		Samir.depositCheck(50);
		Samir.depositCheck(50);
		Samir.depositSave(30);
		Samir.withdrawCheck(10);
		Samir.withdrawSave(10);
		Samir.withdrawCheck(100);
		Samir.withdrawCheck(20);
		Samir.withdrawSave(30);
		Samir.showmeMoney();
		
		Leon.depositCheck(100);
		Leon.depositSave(50);
		Leon.showmeMoney();
		
		System.out.println(BankAccount.allAccounts());
		
		
	}

}
