package edu.mum.mpp.lesson5.main.personbirthinfo;
import java.util.*;

import edu.mum.mpp.lesson5.data.personbirthinfo.DataRecord;
import edu.mum.mpp.lesson5.data.personbirthinfo.Database;
import edu.mum.mpp.lesson5.personbirthinfo.BirthInfo;
import edu.mum.mpp.lesson5.personbirthinfo.PersonAndBirthInfo;
import edu.mum.mpp.lesson5.personbirthinfo.PersonBirthInfoFactory;



public class Main {

	public static void main(String[] args) 
	{
		//two setters
		printTopStudents();
		
			
		
	}
	public static void printTopStudents() 
	{
		Collection<DataRecord> data = Database.h.values();
		List<BirthInfo> lstBirthInfo = new ArrayList<>();
		for(DataRecord d : data) 
		{
			PersonAndBirthInfo pb = PersonBirthInfoFactory.createPersonAndBirthInfo(d.getName(), d.getDateOfBirth());
			lstBirthInfo.add(pb.getBirthInfo());	
		}
		
		//Collections.sort(reports);
		/*Iterator<BirthInfo> it = lstBirthInfo.iterator();
		//System.out.println("A Students:");
		BirthInfo next = null;
		while((next =it.next()) != null ) {
			System.out.println(next.getPerson().getName() + " ");
		}
		*/
		
		for(BirthInfo b : lstBirthInfo)
		{
			System.out.println(b.getPerson().getName() + "\t"+ b.getDateOfBirth());
		}
	}
	

}
