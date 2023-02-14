package mylamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumerFunctionalDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> consumer=(t) -> System.out.println("Value to Print is:"+ t);
		consumer.accept(50);
		
		list.stream().forEach(consumer);
	}
}
