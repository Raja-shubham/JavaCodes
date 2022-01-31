package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;


public class Prac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Apple";
		s1=s1.toLowerCase();
		System.out.println(s1);
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = s1.length()-1; i >=0 ; i--) {
			hs.add(Character.toString(s1.charAt(i)));
		}
		//System.out.println(hs);
		String s4=hs.toString();
		System.out.println(s4);
		String s3="";
		for (String s:hs) {
			s3=s3+s;
		}
		System.out.println(s3);
		
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		for (int i = 0; i < s1.length(); i++) {
			if(!hm.containsKey(Character.toString(s1.charAt(i)))) {
				hm.put(Character.toString(s1.charAt(i)),1);
			}
			else {
				hm.put(Character.toString(s1.charAt(i)), hm.get(Character.toString(s1.charAt(i)))+1);
			}
		}
		//System.out.println(hm);
		for(Entry<String, Integer> em:hm.entrySet()) {
			System.out.print(em.getKey()+em.getValue());
		}
		
	}

}
