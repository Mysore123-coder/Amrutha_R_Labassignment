/**
 * author : Amrutha R
 * Desc: Create a method which accepts an array of integer elements and return the second smallest element in the array
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SecondSmallestAssign {
      
       public int getSecondSmallest(int[] arr){
              List<Integer> intList = new ArrayList<Integer>();
              for(int i: arr){
                     intList.add(i);
              }
              //sort the array list
              Collections.sort(intList);
              return intList.get(1);
       }
       public static void main(String[] args) {
    	   	  SecondSmallestAssign p = new SecondSmallestAssign();
              int arr[] = {43,54,65,76,32,76,87,43,66,7,32,54,43};
              int i = p.getSecondSmallest(arr);
              //print the second smallest
              System.out.println(i);
       }

}