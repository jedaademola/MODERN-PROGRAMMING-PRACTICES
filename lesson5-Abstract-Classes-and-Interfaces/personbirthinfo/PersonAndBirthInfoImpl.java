package edu.mum.mpp.lesson5.personbirthinfo;

//Immutable relative to its package studreport
final class PersonAndBirthInfoImpl implements PersonAndBirthInfo {
	private Person person;
	private BirthInfo birthInfo;
	PersonAndBirthInfoImpl(Person person, BirthInfo birthInfo) {
		this.person = person;
		this.birthInfo = birthInfo;
	}
	
	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return person;
	}
	@Override
	public BirthInfo getBirthInfo() {
		// TODO Auto-generated method stub
		return birthInfo;
	}
}
