package lambda_expressions;

interface services{
	String login(String username,String password);
}

public class Lambda_exp3 {

	public static void main(String[] args) {
		services s1=(username,password)->{return username.equalsIgnoreCase("Shiva")&&password.equals("Shiva@1234")?"login success":"login fail";};
		String status=s1.login("Shiva", "Shiva@1234");
		System.out.println("login status is; "+status);
		
		String status1=s1.login("Shiva", "Shiva@123");
		System.out.println("login status is; "+status1);
	}
}
