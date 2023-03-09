package functional;

import java.util.function.BiPredicate;
//import java.util.function.Predicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer, Integer> biPredicate= (a,b)-> (a.equals(b));
		
		System.out.println(biPredicate.test(1, 2));
		
		BiPredicate<String, String> biPredicate1= (name1,name2) -> name1.equals(name2);
		
		System.out.println(biPredicate1.test("Kimathi", "KimathI"));

		

	}

}
