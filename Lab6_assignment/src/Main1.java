/*
 * author : Amrutha R
 * desc : Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		SquareNumbers exerciseThree = new SquareNumbers();
		int[] array = new int[] {1,2,3,4,5};
		System.out.println(exerciseThree.getSquares(array));
	}
}