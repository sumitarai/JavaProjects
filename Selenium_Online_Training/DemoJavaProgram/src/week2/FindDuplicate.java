package week2;

import java.util.Scanner;

public class FindDuplicate {
// find duplicate characters in String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letters;
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word: ");
		letters = scan.nextLine();
		
		char ch;
		for(ch=(char)65; ch<=90; ch++)
		{
			count=0;
			
			for(int i=0; i<letters.length(); i++){
				if (ch==letters.charAt(i)||(ch+32)==letters.charAt(i)){
					count++;
				}
			}
			if (count>0){
				System.out.println(ch+ " "+ count);
			}
			
		}
		
scan.close();
	}

}
