package lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda_sorted {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
		
		Collections.sort(names);
		System.out.println(names);
		
		System.out.println();
		System.out.println("*************************1**************************************");

		names.sort((name1,name2)->-name1.compareTo(name2));
		System.out.println(names);
		
		System.out.println();
		System.out.println("****************************2***********************************");
		
		names.stream().sorted().forEach(name->System.out.print(name+" "));

		System.out.println();
		System.out.println("****************************3***********************************");

		names.stream().filter(name->name.contains("i")).map(name->name+"*").sorted().forEach(name->System.out.print(name+" "));

		System.out.println();
		System.out.println("****************************4***********************************");

		Set<String>name_set=names.stream().filter(name->name.contains("e")).map(name->name+"*")
					.sorted((name1,name2)->-name1.compareTo(name2)).collect(Collectors.toSet());
		System.out.println(name_set);
		
		System.out.println();
		System.out.println("****************************5***********************************");

		
		
	}
}
