package functional;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		
		Optional<Object> emptyOptional= Optional.empty();
		System.out.println(emptyOptional);
		
		
		String email=null;
		String name=null;

		
		Optional<String> nameOptional= Optional.ofNullable(name);
		
		Optional<String> emailOptional= Optional.ofNullable(email);
		
	
		
		String defaultOptional= nameOptional.orElse("David");
		System.out.println(defaultOptional);
		
		if(emailOptional.isPresent()) {
			System.out.println(emailOptional.get());
		}
		else {
			System.out.println(emailOptional.orElse("No email present"));
		}
		
		if(emailOptional.isPresent()) {
			System.out.println(emailOptional.get());
		}
		
		else {
			System.out.println(emailOptional.orElseGet(()->"named not"));
		}
		
		
		
	}

}
