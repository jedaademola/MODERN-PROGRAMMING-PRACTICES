package edu.mum.mpp.lesson5.personbirthinfo;

import java.time.LocalDate;

public final class BirthInfo {
	private LocalDate dateOfBirth;	
	private Person person;
	
	BirthInfo(LocalDate dob) {
		dateOfBirth = dob;
	}
	//getter
	public LocalDate getDateOfBirth()
	{
		return dateOfBirth;
	}
	public Person getPerson()
	{
		return person;
	}
	//setter
	void setPerson(Person person)
	{
		this.person = person;
	}
	
}
