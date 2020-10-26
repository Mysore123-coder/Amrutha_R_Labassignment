/*
 * author : Amrutha R
 * Desc : Print duration in days, months and years
 * Date : 24/10/2020
 */
import java.util.*;
import java.time.*;
public class DateDuration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year, month, date :");
		String dayInput=sc.nextLine();
		String monthInput=sc.nextLine();
		String yearInput=sc.nextLine();
		int d = Integer.parseInt( yearInput ); // enter year[ie. 1996]
		int m = Integer.parseInt( monthInput );  // 1-12 for January-December.
		int y = Integer.parseInt( dayInput );  //1-28/31 

		LocalDate date = LocalDate.of( y , m , d );
	    LocalDate now = LocalDate.now();
	     Period diff = Period.between(date, now);
	 
	     System.out.println("Difference is " + diff.getYears()+" " +"years"+ " "+
	                    diff.getMonths()+" "+"months"+" "+ diff.getDays()+" "+"days");
		 }

}
