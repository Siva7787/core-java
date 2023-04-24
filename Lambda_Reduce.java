package lambda_expressions;

import java.util.List;

public class Lambda_Reduce {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(2,4,8,75,45,12,32,1,6);
		
		try {
			int total=numbers.stream().filter(number->number<10).map(number->number*10).reduce((num1,num2)->(num1*num2)/0).get();
			System.out.println(total);
		} catch (ArithmeticException ae) {
		System.out.println(ae.getMessage().concat(" shiva plase find the error"));
		}
		
		
		System.out.println("***********************************************");

		System.out.println(numbers.stream().filter(number->number%2!=0).map(number->number*2).reduce((num1,num2)->num1+num2).get());
		
		System.out.println("***********************************************");
		
		List<String>names=List.of("one","two","three","four","five","six","seven","eight");
		String name_add=names.stream().filter(name->name.length()<=5).map(name->name+",").reduce((name1,name2)->name1+name2).get();
		System.out.println(name_add);

	}

}
