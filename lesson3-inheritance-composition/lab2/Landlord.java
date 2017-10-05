package lab2;

import java.util.List;

public class Landlord {
	private String name;
	private String ssn;
	private List<Building> building;
	
	Landlord(String name,String ssn,List<Building> building)
	{
		this.name= name;
		this.ssn= ssn;
		this.building=building;	
	}

	@Override
	public String toString() {
		return "Landlord [name=" + name + ", ssn=" + ssn + ", building=" + building + "]";
	}

	public List<Building> getBuilding() {
		return building;
	}
	
	
	public double monthlyProfit()
	{
		double totalProfit=0.0;
		
		if (getBuilding() != null)
		{
			for (Building b: getBuilding())
				totalProfit+= b.profit();
		}
		
		return totalProfit;
	}
	
}
