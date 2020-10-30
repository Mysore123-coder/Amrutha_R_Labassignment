/**
 * author: Amrutha R
 * desc: sum of cube
 * date : 22/10/2020
 */
import java.util.*;

public class cubeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = s.nextInt();
		int result = cubeSum(number);
		System.out.println("sum of the cube of digits :" +result);
	}
	
	private static int cubeSum(int num) {
		int sum =0, digit;
		while(num != 0) {
			digit = num%10;
			sum=sum +(digit*digit*digit);
			num=num/10;
		}
		return sum;
	}

}

