package functional;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functional.ImperativeDemo.Gender.*;

public class ImperativeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imperative programming
		
		List<Person> people= List.of(
				new Person("john",MALE),
				
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("alex", MALE),
				new Person("Alice", FEMALE)
				
				
				);
		
		
		//declarative approach
		
	List<Person> females2 =	people.stream().filter(person->FEMALE.equals(person.gender))
		.collect(Collectors.toList());
		females2.forEach(System.out::println);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	static class Person{
		private final String name;
		private final Gender gender;
		
		public Person(String name,Gender gender) {
			this.name=name;
			this.gender=gender;
		}
	

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
	}
	
	enum Gender{
		MALE,FEMALE
	}
	

}


