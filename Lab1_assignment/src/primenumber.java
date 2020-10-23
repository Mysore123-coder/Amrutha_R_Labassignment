import java.util.*;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		int num=0;
		String primeNumbers ="";
		for (int i = 1; i <= number; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	            	 count = count + 1;
		     }
		  }
		  if (count ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }
	       System.out.println(primeNumbers);
	}

}
