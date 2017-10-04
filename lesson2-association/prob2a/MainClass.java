package edu.mum.mpp.prob2a;

public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Bob");
		
		GradeReport grade = new GradeReport();
		grade.setStudent(student);
		
		student.setGradeReport(grade);
		
	}

}
