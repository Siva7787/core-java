package lambda_expressions;

interface operators
{
	void add(int a,int b);
}

public class Lambda_exp2 {

	public static void main(String[] args) {
		operators o1=(a,b)->System.out.println("the addition of two numbers is: "+(a+b));
		o1.add(10,20);
	}

}
