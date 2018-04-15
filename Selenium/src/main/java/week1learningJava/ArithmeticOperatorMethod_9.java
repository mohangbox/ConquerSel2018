package week1learningJava;

public class ArithmeticOperatorMethod_9 {

	public static void main(String[] args) {
		int a=20;
		int b=11;
		
		int sum=addition (a, b);
		System.out.println("The addition of two number is : " + sum);
		
		int sub=substract (a, b);
		System.out.println("The subtarction of two number is : " + sub);
		
		int mul=multiplication (a, b);
		System.out.println("The Multiplication of two number is : " + mul);
		
		int div=quotient (a, b);
		System.out.println("The Division-quotient two number is : " + div);
		
		int reminder=reminder (a, b);
		System.out.println("The Division-reminder two number is : " + reminder);
	}

private static int addition (int a, int b) 
{
	int c=a+b;
	return c;
}

private static int substract(int a, int b) 
{
	int d=a-b;
	return d;
}

private static int multiplication (int a, int b) 
{
	int m=a*b;
	return m;
}

private static int quotient (int a, int b) 
{
	int div=a+b;
	return div;
}

private static int reminder(int a, int b) 
{
	int rem=a%b;
	return rem;
}
}