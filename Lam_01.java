package lambda_expressions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lam_01 {

	public static void main(String[] args) {
		
		List<Integer> names=List.of(10,25,45,78,96,45,26,47,652,56,8,45,2,12,3154);
		List<Integer> name1=List.of(15,25,45,16,5,262,54,56,42,62,32,52,2);
		List<List<Integer>> final_num=List.of(names,name1);
		names.forEach(name->System.out.print(name+" "));
		
		System.out.println();
		names.stream().filter(num->num<50).forEach(name->System.out.print(name+" "));
		
		System.out.println();
		names.stream().filter(num->num%5==0).map(num->num*2).forEach(num->System.out.print(num+" "));
		
		System.out.println();
		int total=names.stream().reduce((num1,num2)->(num1+num2)/num1).get();
		System.out.println(total);
		
		final_num.forEach(num->System.out.println(num));
		List<Integer> flat=final_num.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(flat);
		
		Set<Integer>set= flat.stream().filter(num->num%5==0).map(num->num*1000).collect(Collectors.toSet());
		System.out.println(set);
	}

}
