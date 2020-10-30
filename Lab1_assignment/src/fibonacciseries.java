
/**
 * author: Amrutha R
 * desc: fibonacci series
 * date : 22/10/2020
 */
import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		s.close();
		for(int i=0; i<number;i++) {
			System.out.println(fibonacci(i) +  " ");
		}
	}
	private static int fibonacci(int n)  {
		if(n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
}
