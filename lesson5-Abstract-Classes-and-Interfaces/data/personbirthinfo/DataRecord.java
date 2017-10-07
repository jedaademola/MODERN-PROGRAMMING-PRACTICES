package edu.mum.mpp.lesson5.data.personbirthinfo;

import java.time.LocalDate;

public class DataRecord {
	String id;
	String name;
	LocalDate dateOfBirth;
	public DataRecord(String id, String name, LocalDate dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
}
