package com;

public abstract class Account implements InterestRate
{
	//list the common properties of savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and initialize in account
	public Account(String name,String sSN,double initDeposit)
	{
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit ;
		
		
		//set account number
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
		
		
	
	}
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int randomNumber=(int)( Math.random() * Math.pow(10,3));
		return lastTwoSSN+uniqueID+randomNumber;
	}
	public void compound()
	{
		double accruedInterest=balance * (rate/100);
		balance=balance + accruedInterest;
		System.out.println("Accrued Interest $"+accruedInterest);
		printBalance();
	}
	
	
	
	//list common methods - transactions
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	public void withDraw(double amount)
	{
		balance=balance-amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount)
	{
		balance=balance-amount;
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalance();
	}
	public void printBalance()
	{
		System.out.println("Your Balance is Now : $"+balance);
	}
	
	
	public void showInfo()
	{
		System.out.println("NAME :"+name);
		System.out.println("ACCOUNT NUMBER :"+accountNumber);
		System.out.println("BALANCE :"+balance);
		System.out.println("RATE :"+rate +"%");
		
	}

}

