package edu.mum.mpp.prob2c;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		//create student object and add student name
		Student student1 = new Student();
		student1.setName("Lukman");
		
		Student student2= new Student();
		student2.setName("Stanley");
		
		Student student3 = new Student();
		student3.setName("Bob");
		
		//create section object and add section number
		Section sections1 = new Section();
		sections1.setSecNum(1);
		
		Section sections2 = new Section();
		sections2.setSecNum(2);
		
		Section sections3 = new Section();
		sections3.setSecNum(3);
		
		//ADD SECTION TO STUDENT OBJECTS
		List<Section> setionList = new ArrayList<>();
		setionList.add(sections1);
		setionList.add(sections2);
		setionList.add(sections3);
		
		student1.setSection(setionList);
		student2.setSection(setionList);
		student3.setSection(setionList);
		
		//ADD STUDENT TO SECTION OBJECTS
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		sections1.setStudents(studentList);
		sections2.setStudents(studentList);
		sections3.setStudents(studentList);

	}

}
