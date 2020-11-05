/*
 * author : Amrutha R
 * desc : Create a method that accepts a character array and count the number of times each character is present in the array.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		CharacterCount exerciseTwo = new CharacterCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println(exerciseTwo.countCharacter(str.toCharArray()));
		sc.close();
	}
}
		