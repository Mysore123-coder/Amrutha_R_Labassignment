
import java.util.*;

public class SquareNumbers {
	public Map<Integer,Integer> getSquares(int[] array) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		//returns square of a number
		for(int i=0;i<array.length;i++) {
			map.put(array[i], (int) Math.pow(array[i], 2));
		}
		return map;
	}
}