package Practice;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="TheQuickBrownFoxJumpsOverTheLazyDog";
		//ans(str);
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(5);
		hs.add(55);
		hs.removeAll(hs);
		System.out.println(hs);

	}
  
//	public static void ans(String str) {
//		//Write your code here
//        int z=0;
//        HashSet<Character> hs= new HashSet<Character>();
//        char[] ch="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM".toCharArray();
//        char[] arr=str.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            hs.add(ch[i]);
//        }
//        System.out.println(hs);
//        for(int i=0;i<arr.length;i++){
//            if(!hs.contains(arr[i])){
//                z++;
//            }
//        }
//        if(z==0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//	}
	
}
