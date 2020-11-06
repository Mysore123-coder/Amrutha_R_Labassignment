import java.util.ArrayList;
	import java.util.Collections;
import java.util.HashMap;
import java.util.List;
	import java.util.Map;

public class SortMap {
		public List<Integer> sortMapToList(Map<Integer, Integer> map){
			List<Integer> list = new ArrayList<Integer>(map.values());
			Collections.sort(list);
			return list;
		}

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
	
				
