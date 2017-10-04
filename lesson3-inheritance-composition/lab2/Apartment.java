package edu.mm.lesson3;

public class Apartment {
	
	private int apartmentId;
	private double rent;
	
	public double getRent() {
		return rent;
	}

	@Override
	public String toString() {
		return "Apartment [apartmentId=" + apartmentId + ", rent=" + rent + "]";
	}

	Apartment(int apartmentId,double rent)
	{
		this.apartmentId = apartmentId;
		this.rent = rent;
	}
	

}
