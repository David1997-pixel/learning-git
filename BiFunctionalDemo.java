package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionalDemo {
	
	

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bfd= (u,t)-> (u+t);
		System.out.println(bfd.apply(2, 2));
		
		BiFunction<String, String, String> stringConcat= String::concat;
		
		
		
		System.out.println(stringConcat.apply("David", " Murege"));
		
		BiFunction<Integer, Integer, Integer> subta= Math::addExact;
		
		System.out.println(subta.apply(34, 34));
		
		Function<Integer, Integer> function = (number) -> (number*number);
		
	  Integer numberNew= bfd.andThen(function).apply(2,2);
	  System.out.println(numberNew);
		
		


	}

	

}
