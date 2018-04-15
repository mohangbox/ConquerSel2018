package week1learningJava;

public class MultiplicationTable_8 {

	public static void main(String[] args) {
		
		//1. Repeat the following steps using for loop
		for(int i=1; i<=10; i++)
		{
			System.out.println(i + "* 2 = "+ i*2);
		}
		
		//1. Repeat the following steps using while loop 
		int i=1;
		 while(i<=10)
		 {
			 System.out.println(i + "* 2 = "+ i*2);
			 i=i+1; //i++ --> Incremental Operator //i += 1 --> Shorthand operator
		 } 

	}
}