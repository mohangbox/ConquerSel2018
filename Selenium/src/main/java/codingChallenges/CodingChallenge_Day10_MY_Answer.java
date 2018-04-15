/*Write a Java Method to Check whether a string is a valid password
 * Password Rules:
 * A password must have at least ten characters
 * A password consists of only letters and digits
 * A password must contains at least two digits and two letters
 * A password must contain at least One Capital letter
 *  */

/*Pseudo Code - 
 -------------------------------------------------------------------------------------------------------------
1. Check the string contains more than 10 chars using string length and use if -else statement to print the values
	password.length()>=10
2. Check matches for letters & digits and print the statement using if-else statement
	password.matches(".*[0-9].*") && password.matches(".*[A-Z].*")
3. Use for loop to find given string contains more than 2 digits & 2 letters and print the statement in If-else statement
	Character.isLetter(password.charAt(i))
	Character.isDigit(password.charAt(i))
4. Use for loop to find given string contains more than one capital letter and print the statement in If-else statement
	Character.isUpperCase(password.charAt(i)) 
---------------------------------------------------------------------------------------------------------------
*/

package codingChallenges;

public class CodingChallenge_Day10_MY_Answer {
	public static void main(String[] args) {
		String password = "Mohan Seerangan";
		charactersCount(password);
		combinations(password);
		combinationsCount(password);
		combinationsCap(password);
	}
	
public static void charactersCount(String password) {
	if(password.length()>=10)
		System.out.println("A password contains at least ten characters");
	else
		System.err.println("A password contains less than ten characters");
	}

public static void combinations(String password) {	
	if(password.matches(".*[0-9].*") && password.matches(".*[A-Z].*"))
		System.out.println("A password consists of only letters and digits");
	else
		System.err.println("A password is not consist of only letters and digits");
	}

public static void combinationsCount(String password) {	
    int a=0, b = 0;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isLetter(password.charAt(i)))
        a++;
      if (Character.isDigit(password.charAt(i)))
    	b++;
	}
  	if(a >= 2 && b >= 2)
		System.out.println("A password contains at least two digits and two letters");
	else
		System.err.println("A password is not contain at least two digits and two letters");
	}

public static void combinationsCap(String password) {
	int a=0;
	for (int i = 0; i < password.length(); i++) {
	if(Character.isUpperCase(password.charAt(i)))
		a++;
	}
	if(a>=1)
		System.out.println("A password contains at One Capital Letter");
	else
		System.err.println("A password doesn't contains at One Capital Letter");
	}
}