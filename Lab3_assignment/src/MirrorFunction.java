/*
 * Author: Amrutha R
 * Desc:Reverse string mirror image
 * Date:24/10/2020
 */
import java.util.Scanner;
public class MirrorFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		string=sc.nextLine();
		
	    
	    System.out.println(" "+string+"|"+" "+getImage(string));
	}

	private static String getImage(String string) {
		// TODO Auto-generated method stub
		StringBuffer reverseString = new StringBuffer(string);
	    String reverse=reverseString.reverse().toString(); //reverse the string
	    return reverse;
	}

}

