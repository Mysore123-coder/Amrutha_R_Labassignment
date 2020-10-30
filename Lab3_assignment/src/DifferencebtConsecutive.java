/*
 * Author: Amrutha R
 * Desc: Difference between Consecutive Numbers
 * Date: 24/10/2020
 */
import java.util.*;
public class DifferencebtConsecutive
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);  
		 System.out.print("Enter the number of array elements : ");  
		 int length = sc.nextInt();  
		 int[] array = new int[length];  
		 System.out.println("Enter the array: ");  
		 for(int i = 0; i < length; i++)  
		 {  
				 array[i] = sc.nextInt(); 
				 sc.close(); 
		 }  
		 
		 difference(array, length);  
		 if(length % 2 != 0) // if last number is odd print the number
		 {
		  	System.out.println(array[length-1]);
		 }
	}
	public static void difference(int array[], int length)  
	{  
		int difference;  
		for(int i = 0; i < length - 1; i++)
		{  
			difference = Math.abs(array[i] - array[i + 1]);  
			System.out.print(difference+" ");  
		}  
	}  
}