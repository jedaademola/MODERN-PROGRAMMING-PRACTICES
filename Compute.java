package edu.mum.mpp.quiz;

public interface Compute {
	
	default  int operation(int a,int b)
	{
		return a - b;
		
	}
	
	static  Integer add(Integer a,Integer b)
	{
		return a + b;
	}

}
