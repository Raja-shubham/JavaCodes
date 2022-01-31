package Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the element of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}


		System.out.println("enter the difference to be find:");
		int diff=sc.nextInt();
		int n=Pairs(arr,diff);
		System.out.println("the numbers are:"+n);
	}
	static int Pairs(int[] arr,int diff) {
		int temp=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if(hs.contains(arr[i]+diff)||hs.contains(arr[i]-diff)) {
				temp++;
				hs.remove(arr[i]);
			}
		}
		return temp;
	}

}
