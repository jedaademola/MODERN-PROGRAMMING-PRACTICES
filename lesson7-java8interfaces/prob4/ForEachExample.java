package edu.mum.mpp.lesson7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		list.forEach(consumer);
		
		list.forEach(s -> System.out.println(s.toUpperCase()));
		
	}
	
	static //implement a Consumer
	Consumer<String> consumer = new Consumer<String> () {
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		};
		
	};
	
	
}