package lambda_expressions;


@FunctionalInterface
interface service
{
	String voter_check(int age,String location);
}
public class Lmd_HW_01{
	public static void main(String[] args) {
		service s1=(age,location)->{return age>=18 && location.equalsIgnoreCase("vizag")?"voter is valid":"voter is not valid";};
		Object check=s1.voter_check(18, "vizag");
		System.out.println(check);
	}
}
