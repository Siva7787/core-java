package lambda_expressions;

interface greeting
{
	void greet();
}

public class Lambda_exp01 {

	public static void main(String[] args) {
		greeting g1=()->System.out.println("hii");
		g1.greet();
	}

}
