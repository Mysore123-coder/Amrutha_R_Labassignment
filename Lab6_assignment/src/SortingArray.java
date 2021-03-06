/*
 * @author: Amrutha R
 * desc : Create a method which accepts an integer array, reverse the numbers in the array and returns the 
 * resulting array in sorted order
 * */
import java.util.*;
public class SortingArray {
		public static void main(String[] args) {
			
			List<Integer> result=new ArrayList<>(Arrays.asList(3,4,5,6,7));
			List<Integer> reverse = getSorted(result);
			System.out.println("Sorted Reverse Array:\n "+reverse);
		}
		
		private static List<Integer> getSorted(List<Integer> result) {
			List<Integer> reverseSorted=new ArrayList<Integer>(result);
			//reverse the array list
			Collections.reverse(reverseSorted);
			 for(int i=0;i>result.size();i++) {
				 reverseSorted.add(i);
			 }
			 System.out.println("Reverse Sorted Array:\n "+reverseSorted);
			 //sort the reversed array list
			 Collections.sort(reverseSorted);
			 for(int i=0;i>result.size();i++) {
				 reverseSorted.add(i);
			 }
			 return reverseSorted;
		}
	}