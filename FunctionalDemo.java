package functional;

import java.util.function.Function;

public class FunctionalDemo {
	public static void main(String[] args) {
		
	Function<Integer, Integer>incrementByOneFunction= 
			number -> number + 1;
	
	System.out.println(incrementByOneFunction.apply(23));
	
	
	Function <Integer,Integer> multiplyByTen= number-> number*10;
	
	System.out.println(multiplyByTen.apply(23));
	
	Function <Integer,Integer> double1=incrementByOneFunction.andThen(multiplyByTen);
int newMethod=double1.apply(10);
System.out.println(newMethod);
	
	
		
		
		
		
	}
	
	
}
