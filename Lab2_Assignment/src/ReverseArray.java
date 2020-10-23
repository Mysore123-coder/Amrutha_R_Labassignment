/*
 * author : Amrutha R
 * Desc :  Reverse the number in array
 * Date : 23/10/2020
 */
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100 ];
		System.out.println("Enter the size of an array :");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter the array elements :");
		for(int i=0; i<size; i++) {
			arr[i]=s.nextInt();
		}
		getSorted(arr, size);
	
		
	}
	private static void getSorted(int[] arr, int size) {
		int[] b = new int[size]; 
        int j = size; 
        for (int i = 0; i < size; i++) { 
            b[j - 1] = arr[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array elements :");
        for (int k = 0; k < size; k++) { 
            System.out.println(b[k]); 
        } 
        int temp=0;
        for (int k = 0; k < size; k++) {
        	
        	for(int l = k; l <size; l++) {
        	if(b[k] > b[l])
        	{
        		temp = b[k];
        		b[k] = b[l];
        		b[l] = temp;
        		
        	}
        }
    } 
        System.out.println("Reversed sorted array elements :");
        for (int k = 0; k < size; k++) { 
            System.out.println(b[k]); 
        }  
}
}


