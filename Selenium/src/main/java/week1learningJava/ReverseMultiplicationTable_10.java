package week1learningJava;

public class ReverseMultiplicationTable_10 {

	public static void main(String[] args) {
		
		//1. Repeat the following steps using for loop
		for(int i=10; i>0; i--)
		{
			System.out.println(i + "* 2 = "+ i*2);
		}
		
		//1. Repeat the following steps using while loop 
		int i=10;
		 while(i>0)
		 {
			 System.out.println(i + "* 2 = "+ i*2);
			 i=i-1; //i++ --> Incremental Operator //i += 1 --> Shorthand operator
		 }
	}
}