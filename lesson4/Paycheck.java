package edu.mum.mpp.lesson4;

public final class Paycheck 
{
		
	private final double grossPay;
	private final double fica = 0.23;
	private final double state =0.50;
	private final double local=0.01;
	private final double medicare =0.03;
	private final double socialSecurity = 0.75;
	
	
	Paycheck( double grossPay)
	{
		this.grossPay= grossPay;
	}
	
	public void print()
	{
		
	}
	
	public double getNetPay()
	{
		
		return grossPay - ( fica + state + local + medicare + socialSecurity);
				
	}

	@Override
	public String toString() {
		return "Paycheck [GrossPay=" + grossPay + ", FICA=" + fica + ", State tax=" + state + ", Local tax=" + local
				+ ", Medicare=" + medicare + ", Social Security=" + socialSecurity + ", NetPay1=" +  getNetPay() + "]";
	}

	
}
