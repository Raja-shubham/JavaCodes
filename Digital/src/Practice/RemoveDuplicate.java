package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
      System.out.println("the resolved array:");
      int[] z=removeDuplicates(arr);
      for (int i = 0; i <z.length; i++) {
			System.out.println(z[i]);
		}
	}
	static int[] removeDuplicates(int[] s) {
		// Write your code here
      
      Set<Integer>  st=new HashSet<>();
      
      ArrayList<Integer> al=new ArrayList<>();
      
       for (int i = 0; i < s.length; i++) {
		st.add(s[i]);
	   }
     
       System.out.println(st);
       int temp[]=new int[st.size()];
       al.addAll(st);
      // System.out.println("Printing Size of arrayList:"+al.size());
       //System.out.println("printing arraylist:"+al);
       for (int i = 0; i < al.size(); i++) {
		temp[i]=al.get(i);
		//System.out.println(temp[i]);
		//System.out.println("printing i:"+i);
	}
       return temp;
      
//      ArrayList<Integer> al= new ArrayList<Integer>();
//      int j=0;
//      for(int i=0;i<s.length-1;i++) {
//    	  if(s[i]!=s[i+1]) {
//    		 // temp[j++]=s[i];
//    		  al.add(s[i]);
//    	  }
//      }
//      al.add(s.length-1);
//     // temp[j++]=s[s.length-1];
//      int[] x=new int[al.size()];
//      for(int i=0;i<al.size();i++) {
//    	  x[i]=al.get(i);
//      }
//      return x;
      
//      for(int i=0;i<j;i++) {
//    	  s[i]=temp[i];
//      }
//      
//      return j;
	}

}
