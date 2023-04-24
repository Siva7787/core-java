package lambda_expressions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda_Filter { 

	public static void main(String[] args) {
		
		List<Integer>numbers=List.of(2,6,7,5,4,7,6,8,4,6);
		numbers.stream().filter(i->i%2==0).forEach(even->System.out.println(even));
		
		System.out.println();
		System.out.println("******************************");
		
		List<Integer> list_even=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list_even);
		
		System.out.println();
		System.out.println("******************************");
		
		Set<Integer>Set_even=numbers.stream().filter(i->i%2==0).collect(Collectors.toSet());
		System.out.println(Set_even);
		
		System.out.println();
		System.out.println("******************************");
		
		long count=numbers.stream().filter(i->i%2==0).count();
		System.out.println(count);
		
		System.out.println();
		System.out.println("******************************");
		
		int First_number=numbers.stream().filter(i->i%2==0).findFirst().get();
		System.out.println(First_number);
		  
		System.out.println();
		System.out.println("******************************");
		
		int exptd_number=numbers.stream().filter(i->i%2==0).skip(3).findFirst().get();
		System.out.println(exptd_number);
	}
}
