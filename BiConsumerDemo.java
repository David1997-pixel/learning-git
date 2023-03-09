package functional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer, Integer> biCom=(a,b)->{System.out.println(a+b);} ;
		biCom.accept(23, 24);
		
		BiConsumer<Integer, Integer> biConsumer= (x,y)-> System.out.println(x-y);
		biConsumer.accept(23, 34);
		
		BiConsumer<String,String> biConsumer2= (name1,name2) ->{
			System.out.println(name1+ " "+name2);		
		};
		
		biConsumer2.accept("David", "Murege");
		
		Map <Integer,String> programmingLangues= new LinkedHashMap<>();
		
		programmingLangues.put(1, "Java");
		programmingLangues.put(2, "C#");
		programmingLangues.put(3, "Python");
		programmingLangues.put(4, "JavaScript");
		programmingLangues.put(5, "Rust");
		
		programmingLangues.forEach((k,v) -> {
			System.out.println( k+ " -> "+ v);
		});
		
		System.out.println("Hello am learning git and gitHub...");
		System.out.println("This is san serif...");
	}

}
