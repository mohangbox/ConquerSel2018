package week1learningJava;


public class BitwiseOperator_4 {

	public static void main(String[] args) {
		int a=3, b=10;
		System.out.println("a & b: " + (a & b)); //Bitwise AND
		System.out.println("a | b: " + (a | b)); //Bitwise OR
		System.out.println("a ^ b: " + (a ^ b)); //Bitwise logical XOR
		System.out.println("a ~ b: " + (~ (a&b))); //Bitwise compliment
		System.out.println("a << b: " + (a<<b)); //Left shift
		System.out.println("a >> b: " + (a>>b)); //Right shift
		System.out.println("a >>> b: " + (a>>>b)); //Zero fill right shift
		
	}
}