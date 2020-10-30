/*
 * author : Amrutha R
 * Desc : Array for storing salutations and names
 * Date : 23/10/2020
 */
import java.util.*;

public class SalutationNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String arr1[] = {"Mr. ", "Mrs. ", "Ms. "};
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name : ");
			String name = s.nextLine();
			System.out.println("Enter the gender : ");
			String gender = s.nextLine();
			String temp1= "female";
			System.out.println("Enter the marital status : ");
			String ms = s.nextLine();
			s.close();
			String temp2= "unmarried";
			if(gender.equalsIgnoreCase(temp1)) {
					if(ms.equalsIgnoreCase(temp2)) {
						System.out.println(arr1[2] + name);
					}
					else {
						System.out.println(arr1[1] + name);
					}
						
				}
				else {
					System.out.println(arr1[0] + name);
				}
			}
	}
		
			
			
	        

