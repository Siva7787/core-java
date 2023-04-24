package lambda_expressions;

import java.util.Arrays;
import java.util.List;

public class Lambda_sorted2 {

	public static void main(String[] args) {
		List<emp> emps=Arrays.asList(new emp(11, "shiva", 40000),
								new emp(12, "manikanta", 15000),
								new emp(13, "raju", 28000),
								new emp(14, "mahesh", 35000),
								new emp(15, "ravi", 41000));
		emps.sort((e1,e2)->e1.ename.compareTo(e2.ename));
		emps.forEach(emp->System.out.println(emp));
	}

}
