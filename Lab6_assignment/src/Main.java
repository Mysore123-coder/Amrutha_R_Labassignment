/*
 * author : Amrutha R
 * desc : Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		SortMap sort = new SortMap();
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 15);
		map.put(2, 10);
		map.put(3, 24);
		map.put(4, 1);
		map.put(5, 98);
		map.put(6, 78);
		System.out.println(sort.sortMapToList(map));
	}
}