package week2;

import java.util.Scanner;

public class StringFunction {
// use different functions of Strings
	public static void main(String[] args) {
		// equals() method 2 strings
		
		String name;
		String anotherName;
		char aChar;
		String aString; 		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("COMPARE 2 names \nEnter first name: ");
		name= scan.nextLine();
		
		System.out.println("Enter second name: ");
		anotherName = scan.next();
		
		if (name.equalsIgnoreCase(anotherName)){
			System.out.println(name + " is equal to " + anotherName);
		}else{
			System.out.println(name + " is not equal to " + anotherName);
		}
		
		//charAt() method belongs to the String class
		System.out.println("Enter a character: ");
		aString=scan.next();
		aChar= aString.charAt(0);
		System.out.println("The character is "+ aChar);
		
		
		if (Character.isLetterOrDigit(aChar)){
			System.out.println(aChar + " is a letter or digit");
		}else{
			System.out.println(aChar + " is not a letter or digit");
		}
		
		//Integer.toString() method used to convert Integer to String
		int ageNum;
		System.out.println("Enter your age: ");
		ageNum = scan.nextInt();
		aString= Integer.toString(ageNum);
		System.out.println("Your age is "+ aString);
		
		//length() method
		int len = aString.length();
		System.out.println("Sting length is " + len);
		
		//valueOf() method to convert a string to integer		
		int hours;
		double rate;
		Integer integerHours; //Integer class
		String stringPay;
		Double doubleRates; //Double class
		System.out.println("Enter your hours of work for this week ");
		aString = scan.next();

		integerHours = Integer.valueOf(aString); //non-primitive
		hours = integerHours.intValue();// primitive 
		
		System.out.println("Enter your pay rate: ");
		stringPay = scan.next();
		doubleRates = Double.valueOf(stringPay);
		rate = doubleRates.doubleValue();
		System.out.println("You have worked "+ hours + " hours and earned $" + (hours*rate)+" this week. ");
					
		double x;
		System.out.println("Enter double value");
		x= scan.nextDouble();
		double y= 1.12;
		System.out.println((int)5.1);
		System.out.println((int)x);
		System.out.println((int)y);
		System.out.println("123"+1);
		System.out.println(Integer.parseInt("113")+1);		
		scan.close();
		
	}

}
