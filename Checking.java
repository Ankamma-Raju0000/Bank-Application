package com;

public class Checking extends Account
{
	//list the properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor to initialize checking account properties	
	public Checking(String name,String sSN,double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber="1"+accountNumber;
		setDebitCard();
		
		
	}
	@Override
	public void setRate()
	{
		rate=getBaseRate()*.15;
	}
	
	//list any methods specific to the checking account
	private void setDebitCard()
	{
		debitCardNumber=(int)(Math.random() * Math.pow(10,12));
		debitCardPin=(int)(Math.random() * Math.pow(10, 4));
		
	}
	
	public void showInfo()
	{
		
		super.showInfo();
		System.out.println("Your Checking Account Features"
				+ "\nDebitCard Number :"+debitCardNumber
				+ "\nDebitCard Pin :"+debitCardPin);
		
	}

}
