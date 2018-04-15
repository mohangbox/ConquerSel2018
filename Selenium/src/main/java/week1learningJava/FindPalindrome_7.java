package week1learningJava;

public class FindPalindrome_7 {

	public static void main(String[] args) {
		//1. Get input number and store a variable
		int InputNumber=454;
		
		//2. Initialize sum value
		int reminder, sum=0, number= InputNumber;
		
		//3.Get each digits and convert into values
		while(InputNumber>0)
		{
			reminder = InputNumber%10;
			sum = (sum*10)+reminder;
			InputNumber=InputNumber/10;			
		}
		
		//4. Check the conditions whether it is palindrome or not and Print the values
		if(number==sum)
		{
			System.out.println("The given number " + number + " is Palindrome");
		}
		else
		{
			System.out.println("The given number " + number + " is NOT Palindrome");
		}
	}
}