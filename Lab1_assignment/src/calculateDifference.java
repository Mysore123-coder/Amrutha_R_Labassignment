
/**
 * author: Amrutha R
 * desc: calculate difference
 * date : 22/10/2020
 */
import java.util.*;

public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner s=new Scanner(System.in);
		int number =s.nextInt();
		s.close();
		int result = sumOfSquare(number) - squareOfSum(number); //calculates the diference of sum of square and square of sum 
		System.out.println("The difference between sum of sqares of n number:" +result);
	}
	static int sumOfSquare(int n) {
		int sum=0;
		for(int i =1; i<= n;i++) {
			sum +=(i*i); //calculates the sum of square
		}
		return sum;
	}
	static int squareOfSum(int n) {
		int square=0, sum =0;
		for(int i =1; i<= n;i++) {
			sum +=i; // calculates the square of sum
		}
		return sum*sum;
}
}
