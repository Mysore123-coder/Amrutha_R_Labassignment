/*
 * Author: Amrutha R
 * Desc:Display each line of Integer string and calculate the sum
 * Date:24/10/2020
 */

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string of integers :");
		String str=sc.nextLine();
		 //StringTokenizer is a class which is used to break the sentence to words
		StringTokenizer stringTokenizer=new StringTokenizer(str);
		while(stringTokenizer.hasMoreTokens()) {
			String string=stringTokenizer.nextToken();
			System.out.println(string);
			int number=Integer.parseInt(string); // parseInt() converts String to integer in order to calculate the sum 
		//	int sum=0;
			sum+=number;				
		}
		System.out.println("Sum of Integers is : "+sum);
				
	}

}