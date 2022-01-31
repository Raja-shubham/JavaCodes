package Tree;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2 {

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


		System.out.println("enter the sum t be find:");
		int sum=sc.nextInt();
		int n=Pairs(arr,sum);
		System.out.println("the numbers are:"+n);

	}
	static int Pairs(int[]arr,int sum) {
		int temp=0,count=0;
		int li=0,ri=arr.length-1;
		while(li<ri) {
			temp=arr[ri]-arr[li];
			if(temp>sum)
				li++;
			else if(temp<sum)
				ri--;
			else if(temp==sum) {
				count++;
				li++;
			}
		}
		return count;
	}

}
