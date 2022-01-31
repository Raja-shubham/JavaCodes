package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,2,44,3,1,5,44,5};
		int j=0;
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
		int[] arr1=new int[hs.size()];
		for(int x:hs) {
			//System.out.print(x+" ");
			arr1[j]=x;
			System.out.print(arr1[j]+" ");
			j++;
			
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
