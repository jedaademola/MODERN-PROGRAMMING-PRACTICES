package edu.mum.mpp.quiz;

public class MyNumber implements Compute{
	
	private int firstNumber;
    private int secondNumber;
    

	private int result;
	public Compute compute;
	
	MyNumber(int firstNumber,int secondNumber)
	{
		this.secondNumber=firstNumber;
		this.secondNumber=secondNumber;
		
		//copute.operation(this.firstNumber,this.secondNumber);
	}
	
    
    public int getFirstNumber() {
		return firstNumber;
	}



	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}



	public int getSecondNumber() {
		return secondNumber;
	}



	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}



	
	
	int add(Integer x, Integer y)
	{
		return Compute.add(this.firstNumber,this.secondNumber);
	}
	
	int subract(Integer x, Integer y)
	{
		return operation(this.firstNumber,this.secondNumber);
	}
	
	int multiply(Integer x, Integer y)
	{
		compute = new Multiply();
		return compute.operation(this.firstNumber,this.secondNumber);
	}
	
	int divide(Integer x, Integer y)
	{
		compute = new Divide();
		return compute.operation(this.firstNumber,this.secondNumber);
	}
	

}
