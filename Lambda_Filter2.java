package lambda_expressions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda_Filter2 { 

	public static void main(String[] args) {
		List<String> names=List.of("devi","raju","rani","ravi","krishna","raju","rani","king","deyyam","ratan");
		names.stream().filter(i->i.startsWith("k")).forEach(name_k->System.out.println(name_k));
		
		System.out.println("************************************************");
		
		List<String> list_names =names.stream().filter(i->i.startsWith("r") && i.length()==4).collect(Collectors.toList());
		System.out.println(list_names);
		
		System.out.println("************************************************");
		
		Set<String> set_names =names.stream().filter(i->i.startsWith("r") && i.length()==4).collect(Collectors.toSet());
		System.out.println(set_names);
		
		System.out.println("************************************************");
		
		long count=names.stream().filter(i->i.startsWith("r")).count();
		System.out.println(count);
		
		System.out.println("************************************************");
		
		String first_name=names.stream().filter(i->i.startsWith("d")).findFirst().get();
		System.out.println(first_name);
		
		System.out.println("************************************************");
		
		String exptd_name=names.stream().filter(i->i.startsWith("r")).skip(2).findFirst().get();
		System.out.println(exptd_name);
	}
}
