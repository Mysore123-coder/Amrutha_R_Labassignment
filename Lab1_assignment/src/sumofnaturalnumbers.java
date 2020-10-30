/**
 * author: Amrutha R
 * desc: sum of natural numbers
 */
import java.util.*;

public class sumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.close();
		calculateSum(number);
				
			}
	
	private static void calculateSum(int num) {
		int sum=0;
		for(int i=1; i <= num; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
}
}
