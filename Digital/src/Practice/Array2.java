package Practice;

import java.util.HashMap;
import java.util.Iterator;

public class Array2 {

	public static void main(String[] args) {

		String str = "aaabcdaaae";
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(Character.toString(str.charAt(i)), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(Character.toString(str.charAt(i)),1 );
			}
		}
		System.out.println(hm);

	}

}
