
/**
 * author: Amrutha R
 * desc: calculate difference
 */
import java.util.*;

public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner s=new Scanner(System.in);
		int number =s.nextInt();
		int result = sumofsquare(number) - squareofsum(number);
		System.out.println("The difference between sum of sqares of n number:" +result);;
	}
	static int sumofsquare(int n) {
		int sum=0;
		for(int i =1; i<= n;i++) {
			sum +=(i*i);
		}
		return sum;
	}
	static int squareofsum(int n) {
		int square=0, sum =0;
		for(int i =1; i<= n;i++) {
			sum +=i;
		}
		return sum*sum;
}
}
