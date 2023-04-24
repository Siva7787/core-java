package lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Lambda_ForEach { 

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,15,20,45,12,45,26,78);
		numbers.forEach(number->System.out.print(number +" "));
		
		System.out.println();
		System.out.println("********************************************");
		
		Set<String> names=Set.of("one","two","three","four","five","six");
		names.forEach(name-> System.out.print(name+" "));
		
		System.out.println();
		System.out.println("********************************************");
		
		Set<emp> set_emps=Set.of(new emp(11,"shiva",10000),
				                 new emp(12,"manikanta",15000),
				                 new emp(13,"pragada",12000));
		
		set_emps.forEach(set_emp->System.out.println(set_emp.eid+" |"+set_emp.ename+"| "+set_emp.e_salery));
		
		System.out.println();
		System.out.println("********************************************");
		
		Map<Integer,String>Stu_details=Map.of(1,"one",2,"two",3,"three",4,"four");
		Stu_details.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println();
		System.out.println("********************************************");
		
		Map<Integer,emp> pairs=Map.of(1,new emp(11,"shiva",10000),2,new emp(12,"manikanta",15000),3,new emp(13,"pragada",12000));
		pairs.forEach((k,v)-> System.out.println("key :" + k+" pair: "+v.eid+" "+v.ename+" "+v.e_salery));
		
		
	}
}
