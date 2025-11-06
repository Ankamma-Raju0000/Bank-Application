package com;

public class Savings extends Account
{
	//list of properties with specific savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	//constructor with initialize setting for the savings account
	public Savings(String name,String sSN,double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
		
	}
	@Override
	public void setRate() 
	{
		rate=getBaseRate()-.25;
		
		
	}
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxKey= (int) (Math.random() * Math.pow(10,4));
	}
	
	//list any methods to specific to savings account
	public void showInfo()
	{
		super.showInfo();
		System.out.println(""
				+ "Your Savings Account Features"
				+ "\nSafety Depopsit Box ID :"+ safetyDepositBoxID
				+" \nSafety Deposit Box Key :"+safetyDepositBoxKey);
	}
}
