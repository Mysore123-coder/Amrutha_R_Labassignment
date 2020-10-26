/*
 * author : Amrutha R
 * Desc : Check for positive String
 * Date : 24/10/2020
 */
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s= sc.nextLine();
		if (isAlphabaticOrder(s))  // check whether the string is in alphabetical order or not 
			System.out.println("String is positive");  
		else
		    System.out.println("String is negative");  
		            
	} 
	static boolean isAlphabaticOrder(String s)  {  
		int n = s.length();  // length of the string  
		char c[] = new char [n];  // create a character array of the length of the string  
		        
		 // assign the string to character array  
		 for (int i = 0; i < n; i++) {  
			 c[i] = s.charAt(i);  
		 }  
		 Arrays.sort(c);  // sort the character array        
		         
		// check if the character array is equal to the string or not       
		 for (int i = 0; i < n; i++)  
			if (c[i] != s.charAt(i))   
				 return false;  
	                
	     	return true;      
	    }  
	             
}


