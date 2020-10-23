/*
 * author : Amrutha R
 * Desc : Remove duplicate from the array
 * Date : 23/10/2020
 */
import java.util.*;
public class RemoveDuplicate {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int length = array.length;
		System.out.println("Enter the array elements : ");
		for(int i = 0;i < length;i++)
		{
			array[i] = sc.nextInt();
		}
		length = RemoveDuplicate(array,length);
		DescendingOrder(array,length);		
	}
	public static int RemoveDuplicate(int array[],int length)
	{
		if(length == 0 || length == 1)
		{
			return length;
		}
			int j = 0;
			for(int i = 0;i < length - 1;i++)
			{
				if(array[i] != array[i + 1])
				{
					array[j++] = array[i];
				}
			}
			array[j++] = array[length - 1];
			return array[j];
		}
		public static void DescendingOrder(int array[],int length)
		{
			int temp = 0;
			for(int i = 0;i < length;i++)
			{
				for(int j = i;j < length;length++)
				{
					if(array[i] < array[j])
					{
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("Array in descending order : ");
			for(int i = 0; i < length; i++)
			{
				System.out.println(array[i]+" ,");
			}
		}}
