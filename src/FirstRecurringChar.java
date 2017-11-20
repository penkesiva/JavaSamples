import java.util.HashMap;

public class FirstRecurringChar {

	public FirstRecurringChar() {
		
	}
	
	Character func(String str) {
		char[] cStr = str.toCharArray();
		HashMap<Character, Integer> charCount = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			int count = charCount.containsKey(cStr[i]) ? Integer.valueOf(charCount.get(cStr[i])) : 0;
			count++;
			charCount.put(cStr[i], count);
			if(count == 2)
				return cStr[i];
		
		}
		return null;
	}

}
