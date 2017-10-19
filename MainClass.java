package edu.mum.mpp.quiz;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import edu.mum.lessson8.methodreferences.Employee;





public class MainClass {

	public static void main(String[] args) {
		
		MyNumber myNumber = new MyNumber(5,2);
		
		//BiConsumer<MyNumber, Integer> firstNumber = MyNumber::setFirstNumber;
		//BiConsumer<MyNumber, Integer> secondNumber = MyNumber::setSecondNumber;
		
		//firstNumber.accept(myNumber,10);
		//secondNumber.accept(myNumber,5);
		
		//Function<MyNumber, Integer> firstNumber1 = MyNumber::getFirstNumber;
		//System.out.println(firstNumber1.apply(myNumber));
		
		//Function<MyNumber, Integer> secondNumber1 = MyNumber::getSecondNumber;
		//System.out.println(secondNumber1.apply(myNumber));
		
		
		BiConsumer<MyNumber, Integer> firstNumber = MyNumber::setFirstNumber;
		BiConsumer<MyNumber, Integer> secondNumber = MyNumber::setSecondNumber;
		firstNumber.accept(myNumber,10);
		secondNumber.accept(myNumber,5);
	
		
		System.out.println(myNumber.getFirstNumber());
		System.out.println(myNumber.getSecondNumber());
		//(x,y) -> Math.min(x,y)
		//BiFunction<Integer, Integer, Integer> add = (x,y) -> myNumber.add(x,y);
		BiFunction<Integer, Integer, Integer> add =  myNumber::add;
		
		BiFunction<Integer, Integer, Integer> multiply =  myNumber::multiply;
		BiFunction<Integer, Integer, Integer> divide =  myNumber::divide;
		BiFunction<Integer, Integer, Integer> subract =  myNumber::subract;
		
		int f = myNumber.getFirstNumber();
		int s = myNumber.getFirstNumber();
		
		System.out.println(add.apply(f,s));
		System.out.println(multiply.apply(f,s));
		System.out.println(divide.apply(f,s));
		System.out.println(subract.apply(f,s));
		
		
		

	}

}
