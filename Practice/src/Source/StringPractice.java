package Source;
import java.util.*;
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="1fgr25fdg354hg25";
		for(int i=0;i<word.length();i++) {
			if(!Character.isDigit(word.charAt(i))){
				word=word.replaceAll("[a-z]"," ");
			}
		}
		String[] arr=word.split(" ");
//		//int x=Integer.parseInt(word);
//		Set<String> st=new LinkedHashSet<>();
////		st.add(word);
////		for (int i = 0; i < word.length(); i++) {
////			//st.add(Character.toString(word.charAt(i)));
////		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
