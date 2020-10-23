import java.util.*;
public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		boolean result= checkNumber(number);
		if(result==true)
			System.out.println("It is a power of two");
		else
			System.out.println("It is not a power of two");

	}
	public static boolean checkNumber(int n) {
		if(n <= 0) {
			return false;
		}
		while(n > 1) {
			if(n % 2 != 0) {
				return false;
			}
			n = n/2;
		}
			return true;	
	}
}

