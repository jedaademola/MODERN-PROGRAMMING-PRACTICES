package edu.mum.mpp.general;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import edu.mum.mpp.lesson8.Codes.methodreferences.Employee;
import edu.mum.mpp.lesson8.Codes.methodreferences.EmployeeNameComparator;


public class MethodReference {
	
	/*
	    A. (Employee e) -> e.getName()
		B. (Employee e,String s) -> e.setName(s)
		C. (String s1,String s2) -> s1.compareTo(s2)
		D. (Integer x,Integer y) -> Math.pow(x,y)
		E. (Apple a) -> a.getWeight()
		F. (String x) -> Integer.parseInt(x);
		G. EmployeeNameComparator comp = new EmployeeNameComparator(); (Employee e1, Employee e2) -> comp.compare(e1,e2)
	 */
	
	Function<Employee,String> getName= e -> e.getName();
	Function<Employee,String> getName2 = Employee :: getName;
	
	BiConsumer<Employee,String> setName= (e,s) -> e.setName(s);
	BiConsumer<Employee,String> setName2=Employee :: setName;
	
	Comparator<String> comp = (s1,s2) ->  s1.compareTo(s2);
	Comparator<String> comp2 = String :: compareTo;
	
	BiFunction<Integer,Integer,Double> mathPow = (x,y) ->  Math.pow(x,y);
	BiFunction<Integer,Integer,Double> mathPow2 =  Math:: pow;
	
	Function<String,Integer> convertToInt= x -> Integer.parseInt(x);
	Function<String,Integer> convertToInt2= Integer::parseInt;
	
    EmployeeNameComparator compare = new EmployeeNameComparator();
    Comparator<Employee> compEmployess =  (e1, e2) -> compare.compare(e1,e2);
    Comparator<Employee> compEmployess2 =  compare :: compare;
	 
	
    class EmployeegetName implements Function<Employee,String>{

		@Override
		public String apply(Employee e) {
			return e.getName();		
		}
		
	}
    
    class EmployeeSetName implements BiConsumer<Employee,String>{

		@Override
		public void accept(Employee e, String s) {
			e.setName(s);	
		}
		
	}
    
    class MathPow implements BiFunction<Integer,Integer,Double>{

		@Override
		public Double apply(Integer x,Integer y) {
			return Math.pow(x,y);		
		}
		
	}

    class ConvertToInt implements  Function<String,Integer>{

		@Override
		public Integer apply(String s) {
			return Integer.parseInt(s);		
		}
		
	}
    
    class CompareToString implements   Comparator<String>{

		
		@Override
		public int compare(String o1, String o2) {
			
			return o1.compareTo(o2);
		}
		
	}
    
  class CompareEmployee implements   Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

		
		
		
	}
    
    
    
  
	
	public void evaluator() {
	
		Employee testEmp = new Employee("Lukman", 100000);
		Employee testEmp2 = new Employee("Lukman", 100000);
		
		System.out.println("getName.apply(testEmp):" + getName.apply(testEmp));
		setName.accept(testEmp, "Farhan");
		System.out.println("setName.accept(testEmp, \"Farhan\"):"+testEmp.getName());
		
		System.out.println("comp.compare(\"Lukman\",\"LukmanA\"):" + comp.compare("Lukman","LukmanA"));
		System.out.println("mathPow.apply(2, 4):"+mathPow.apply(2, 4));
		
		System.out.println("convertToInt.apply(\"20\"):"+convertToInt.apply("20"));
		
		System.out.println("compEmployess.compare(testEmp, testEmp2):" + compEmployess.compare(testEmp, testEmp2));
		
		System.out.println("***INNER CLASS FUNCTIONS*******");
		
		System.out.println("getName.apply(testEmp):" + new EmployeegetName().apply(testEmp));
		new EmployeeSetName().accept(testEmp, "Farhan");
		System.out.println("setName.accept(testEmp, \"Farhan\"):"+testEmp.getName());
		
		System.out.println("comp.compare(\"Lukman\",\"LukmanA\"):" + new CompareToString().compare("Lukman","LukmanA"));
		System.out.println("mathPow.apply(2, 4):"+new MathPow().apply(2, 4));
		
		System.out.println("convertToInt.apply(\"20\"):"+new ConvertToInt().apply("20"));
		
		System.out.println("compEmployess.compare(testEmp, testEmp2):" + new CompareEmployee().compare(testEmp, testEmp2));
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		MethodReference e = new MethodReference();
		e.evaluator();

	}

}
