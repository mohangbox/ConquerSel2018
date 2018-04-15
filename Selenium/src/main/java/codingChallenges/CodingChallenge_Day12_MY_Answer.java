/* Write a Simple Java Program to illustrate multi- level inheritance
 	Create classes like Vehicle, Car and Audi. Vehicle is Supper class.
 	Car extends Vehicle. Audi extends Car.
 	Create default contractors in each class to print the class name.
 	Create an object for the Audi class and check if all the class name are printed*/

/*Pseudo Code
1. Create Vehicle class and contractor in vehicle class
	class Vehicle{  
		void vehicle() {
			//Print statement
		}}
 2. Create Car class with extends of vehicle and contractor in car class
	class Car{  
		void car() {
			//Print statement
		}}
 3. Create Audi class with extends of car and contractor in audi class
	class Audi{  
		void audi() {
			//Print statement
		}}
4.  Create Main class and create object from Audi class and 
	public static void main(String args[]){  
		Audi obj=new Audi();  
		obj.vehicle();
		obj.car();
		obj.audi();
*/

package codingChallenges;

		class Vehicle{  
		void vehicle()
		{
			System.out.println("I am Vehicle class which is super class..");
		}  
		}
		
		class Car extends Vehicle{  
		void car(){System.out.println("I am Car class which is extends of Vehicle..");}  
		}  
		
		class Audi extends Car{  
		void audi(){System.out.println("I am Car class which is extends of Car...");}  
		}  
		
		class CodingChallenge_Day12_MY_Answer{  
		public static void main(String args[]){  
		Audi obj=new Audi();  
		System.out.println("I am Main Class");
		obj.vehicle();
		obj.car();
		obj.audi();
		}  
}