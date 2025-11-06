package com;

public interface InterestRate 
{
	//write a method that return base rate
	default double getBaseRate()
	{
		return 2.5;
	}

}
