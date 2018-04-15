package week1learningJava;

public class FindSumOfDigits_1 {

	public static void main(String[] args) {
		//1. Get input number and store in a variable
		int inputNumber=432;
		//2. Initialize the variable
		int SumofDigits=0, reminder;
		int number = inputNumber;
		//3. Get each digits using while loop
		while(inputNumber!=0)
		{
			reminder = inputNumber%10;
			SumofDigits=SumofDigits+reminder;
			inputNumber = inputNumber/10;
		}
		//4. Print the value
		System.out.println("The sum of Digits of "+ number+ " is " + SumofDigits);
	}

}