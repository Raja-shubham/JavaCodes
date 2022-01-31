package Source;

import java.util.*;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 3, 5, 4, 8, 6, 7, 1, 1, 5, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String>();
		String str="ghj";
		al2.add(str);
		if(al2.contains("gh")) {
			System.out.println("true");
		}
		else
			System.out.println("false");
//		for (int i = 0; i < arr.length; i++) {
//			al.add(arr[i]);
//		}
//		Set<Integer> st = new LinkedHashSet<Integer>(al);
//		
//		//st.addAll(al); 
//	
		
		//System.out.println(st);
	}

}
