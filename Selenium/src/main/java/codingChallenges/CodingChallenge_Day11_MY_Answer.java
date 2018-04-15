/*Write a Java Program to find the percentage of Uppercase letters, lowercase letters, digits 
 * and other special characters (including space) in the given string.
 * For Ex: "Tiger Runs @ The Speed Of 100 km /hour."
 * 
 * Number of uppercase letters is 5. So percentage is 13.16%
 * Number of lowercase letters is 20. So percentage is 52.63%
 * Number of digits is 3. So percentage is 7.89%
 * Number of other characters is 10. So percentage is 26.32%
 *  */

/*Pseudo Code - 
 -------------------------------------------------------------------------------------------------------------
1. Initialize the required variables
		String str = "Tiger Runs @ The Speed Of 100 km /hour";
		int len=str.length(), a=0, b=0, c=0, d=0;
		float percentage;
2. Use for loop and count no of Uppercase, Lowercase and digits
		Character.isUpperCase(str.charAt(i))
		Character.isLowerCase(str.charAt(i))
		Character.isDigit(str.charAt(i))
3. Calculate percentage for each case and convert int to float
		percentage=((float)a/len)*100;
		percentage=((float)b/len)*100;
		percentage=((float)c/len)*100;
		d=len-(a+b+c);
		percentage=((float)d/len)*100;
4. Then convert only required decimal points for each case using
		String.format ("%.2f", percentage);
5. Print the values in the given format
---------------------------------------------------------------------------------------------------------------
*/

package codingChallenges;

public class CodingChallenge_Day11_MY_Answer {
	public static void main(String[] args) {
		
		String str = "Tiger Runs @ The Speed Of 100 km /hour";
		
		int len=str.length(), a=0, b=0, c=0, d=0;
		float percentage;
		for (int i = 0; i < str.length(); i++) {
		if(Character.isUpperCase(str.charAt(i)))
			a++;
		if(Character.isLowerCase(str.charAt(i)))
			b++;
		if(Character.isDigit(str.charAt(i)))
			c++;
		}
		percentage=((float)a/len)*100;
		String upperCase = String.format ("%.2f", percentage);
		System.out.println("Number of uppercase letters is "+a+". So percentage is "+upperCase +"%");
		
		percentage=((float)b/len)*100;
		String lowerCase = String.format ("%.2f", percentage);
		System.out.println("Number of lowercase letters is "+b+". So percentage is "+lowerCase +"%");
		
		percentage=((float)c/len)*100;
		String digitsCase = String.format ("%.2f", percentage);
		System.out.println("Number of digits is "+c+". So percentage is "+digitsCase +"%");
		
		d=len-(a+b+c);
		percentage=((float)d/len)*100;
		String otherCase = String.format ("%.2f", percentage);
		System.out.println("Number of other characters is "+d+". So percentage is "+otherCase +"%");
	}
}