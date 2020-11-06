import java.util.*;

public class CharacterCount {
	public Map<Character,Integer> countCharacter(char[] charArray){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		//count the number of characters in a given string
		for(int i=0;i<charArray.length;i++) {
			if(map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i])+1);
			}
			else
				map.put(charArray[i], 1);
		}
		return map;
	}
}