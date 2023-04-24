package lambda_expressions;

import java.util.List;

public class Lambda_map2{

	public static void main(String[] args) {
		List<emp> emps=List.of(new emp(11, "shiva", 40000),
								new emp(12, "manikanta", 15000),
								new emp(13, "raju", 28000),
								new emp(14, "mahesh", 35000),
								new emp(15, "ravi", 41000));
		emps.stream().map(emp->emp.getEname()+" pragada").forEach(name->System.out.println(name));

		System.out.println("************************************");

		emps.stream().filter(salery->salery.getE_salery()>25000).map(salery->salery.e_salery+1000)
																.forEach(salery->System.out.println(salery));
		
		System.out.println("************************************");
		
		emps.stream().filter(salery->salery.getE_salery()>25000)
					.map(salery->{salery.setE_salery(salery.getE_salery()+1000);return salery;})
					.forEach(i->System.out.println(i));
	}
}
