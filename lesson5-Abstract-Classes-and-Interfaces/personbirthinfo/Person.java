package edu.mum.mpp.lesson5.personbirthinfo;

public final class Person {
	private String name;
	private BirthInfo birthInfo;
	Person(String name) {
		this.name = name;
	}
	
	//setter
	void setBirthInfo(BirthInfo birthInfo)
	{
		this.birthInfo = birthInfo;
	}
	
	//getter
	public BirthInfo getBirthInfo()
	{
		return birthInfo;
	}
	public String getName()
	{
		return name;
	}
}
