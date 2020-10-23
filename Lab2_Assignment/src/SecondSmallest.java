/*
 * author : Amrutha R
 * Desc : Second smallest in the array
 * Date : 23/10/2020
 */
import java.util.*;

public class SecondSmallest {

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
		getSecondSmallest(arr,size);
		System.out.println("Second smallest element is :"+arr[size-2]);
	}
	
	private static int getSecondSmallest(int[] arr, int size) {
		for(int j=0;j<(size-1);j++) {
			for(int k=0;k<size-j-1;k++) {
				if(arr[k]<arr[k+1]) {
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
			System.out.println("\n");
		}
		return arr[size];
	}

}
