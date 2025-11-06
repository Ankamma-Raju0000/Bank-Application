package com;

public class BankAccountApp 
{
	public static void main(String[] args)
	{
		//read a csv file then create new accounts based on that data
		Checking checking=new Checking("raju","321435456",1500);
		
		Savings savings=new Savings("ashok","345465465",2500);
		savings.compound();
		
		savings.showInfo();
		System.out.println("************");
		checking.showInfo();
		
		
		
	}

}
