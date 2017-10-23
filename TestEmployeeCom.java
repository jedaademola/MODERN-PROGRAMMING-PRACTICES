package edu.mum.mpp.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEmployeeCom {

	public static void main(String[] args) {
		
		List<Manager> list1 = new ArrayList<>();
		
		List<? extends Employee> list2 = list1; 
		
		List<SubManager> list3 = new ArrayList<>();
		
		List<? extends Employee> list4 = list3; 
		
		List<Integer> ints = new ArrayList<Integer>();
	 	ints.add(1);
	 	ints.add(2);
	 	List<Number> nums = ints;    //compiler error
	 	nums.add(3.14);
	  	System.out.print(ints);  //output:  [1, 2, 3.14]
	  	
	  	List<Number> nums1 = new ArrayList<Number>();
		List<Integer> ints1 = Arrays.asList(1, 2);
		List<Double> doubles = Arrays.asList(2.78, 3.14);
		nums.addAll(ints);
		nums.addAll(doubles);
		System.out.println(nums);  //output:  [1, 2, 2.78, 3.14]


		

	}

}
