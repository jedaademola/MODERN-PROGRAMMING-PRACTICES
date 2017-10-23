package edu.mum.mpp.lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassOccurance {
	

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("lukman");
		list.add("lukman");
		list.add("ademola");
		list.add("ademola");
		System.out.println("checkOccurance(list,lukman):" + checkOccurance(list,"lukman"));
		
		
		List<Integer> listIntegers = new ArrayList<>();
		listIntegers.add(2);
		listIntegers.add(1);
		listIntegers.add(4);
		listIntegers.add(3);
		System.out.println("checkOccurance(listIntegers,2):" + checkOccurance(listIntegers,2));
		System.out.println("max:" + max(listIntegers));
		
	}
	
	public static <T> Long checkOccurance(List<T> list, T name)
	{
		return list.stream()
				.filter( n -> n.equals(name)).count();
		
	}
	
	
	public static <T extends Comparable<T>> T max(List<T> list)
	{
		
		//return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		return list.stream().max( (a,b) -> a.compareTo(b)).get();		
	}

}
