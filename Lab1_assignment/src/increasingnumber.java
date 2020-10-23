import java.util.*;
public class increasingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		boolean check= increasingnumber(number);
		if(check == true)
			System.out.println("In increasing order");
		else
			System.out.println("Not in increasing order");

	}
	public static boolean increasingnumber(int n) {
		int temp1, temp2, temp3,count = 0;
		while(n != 0) {
			temp1 = n % 10;
			temp3 = n;
			temp3 /= 10;
			temp2 = temp3 % 10;
			if(temp1 >= temp2)
			{
				count ++;
			}
			else {
				return false;
			}
		
		n /= 10 ;
	}
	if(count >0) {
		return true;
	}
	else {
		return false;
	}
	}
}
