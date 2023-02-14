package mylamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicateDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,9,7,4,7,10);
		
		Predicate<Integer> predicate=
				(value) -> value%2==0;
				
			list.stream().filter(predicate).forEach(value->System.out.println("Even is:"+value));;
		
			
}
}
