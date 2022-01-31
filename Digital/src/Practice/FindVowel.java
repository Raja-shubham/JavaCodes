package Practice;

import java.util.LinkedHashSet;

public class FindVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="ewdghjakeiouvfbdneiovndxua";
	String vowel="aeiou";
	int count=0;
	LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	for(char s:vowel.toCharArray()) {
		lhs.add(s);
	}
	for (int i = 0; i < str.length(); i++) {
		if(lhs.contains(str.charAt(i))) {			
			count++;
		}
	}
	System.out.println(count);
	}

}
