import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.Map;

public class SortMap {
		public List<Integer> sortMapToList(Map<Integer, Integer> map){
			List<Integer> list = new ArrayList<Integer>(map.values());
			//sort the list
			Collections.sort(list);
			return list;
		}
	}

