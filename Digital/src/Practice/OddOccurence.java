package Practice;

import java.util.*;
import java.util.Map.Entry;

public class OddOccurence {

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
		int h = oddoccur(arr);
		System.out.println(h);
	}

	static int oddoccur(int arr[]) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		int max = Integer.MIN_VALUE;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ht.containsKey(arr[i])) {
				ht.put(arr[i], ht.get(arr[i]) + 1);
			} else {
				ht.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(ht.get(arr[i])%2!=0) {
				k=ht.get(arr[i]);
			}
		}
		for(Map.Entry<Integer,Integer> x : ht.entrySet()) {
			System.out.println(x+" ");
		}
		return k;
	}

}