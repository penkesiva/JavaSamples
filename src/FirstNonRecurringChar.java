import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class FirstNonRecurringChar {

	public FirstNonRecurringChar() {
		
	}
	
	Character func(String str) {
		char[] cStr = str.toCharArray();
		HashMap<Character, Integer> charCount = new HashMap<>();

		for(int i=0; i<str.length(); i++) {
			int count = charCount.containsKey(cStr[i]) ? Integer.valueOf(charCount.get(cStr[i])) : 0;
			count++;
			charCount.put(cStr[i], count);
		}

		Set<Character> keySet = charCount.keySet();
		Iterator iterator = keySet.iterator();
		
		while (iterator.hasNext()){
			Character c = (Character)iterator.next();
			if(charCount.get(c) == 1)
				return c;
		}

		return null;
	}

}
