package edu.mum.mpp.lesson5.personbirthinfo;

import java.time.LocalDate;

/** Typical use: Loading data from database into class model */
final public class PersonBirthInfoFactory {
	private PersonBirthInfoFactory(){}
	
	public static PersonAndBirthInfo createPersonAndBirthInfo(String name, LocalDate dateOfBirth) {
		BirthInfo b = new BirthInfo(dateOfBirth);
		Person p = new Person(name);
		b.setPerson(p);
		p.setBirthInfo(b);
		return new PersonAndBirthInfoImpl(p, b);
	}
}
