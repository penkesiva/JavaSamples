
//decrement and increment and perform swap half a through
public class ReverseString {
	
	String func(String str) {
		char[] cStr = str.toCharArray();
		int index = 0;
		char tmp;
		
		for(int i=str.length()-1; i>=str.length()/2; i--) {
			tmp = cStr[i];
			cStr[i] = cStr[index];
			cStr[index] = tmp;
			
			index++;
		}
		
		return new String(cStr);
	}

}
