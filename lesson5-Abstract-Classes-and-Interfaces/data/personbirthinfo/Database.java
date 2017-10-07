package edu.mum.mpp.lesson5.data.personbirthinfo;

import java.time.LocalDate;
import java.util.*;



public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();
	static {
		h.put("1", new DataRecord("1", "Bob Presley", LocalDate.of(2010, 1, 1)));
		h.put("2", new DataRecord("2", "Alan Bran", LocalDate.of(2000, 10, 12)));
		h.put("3", new DataRecord("3", "Balle Dave", LocalDate.of(1990, 11, 1)));
		h.put("4", new DataRecord("4", "Kate Perry", LocalDate.of(1998, 5, 3)));
	}
}
