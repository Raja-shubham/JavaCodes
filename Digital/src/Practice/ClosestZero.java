package Practice;

import java.util.Scanner;

public class ClosestZero {

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
		ClosestSet(arr);
	}

	static void ClosestSet(int[] arr) {
		int LI = 0, RI = arr.length - 1;
		int min_sum = Integer.MAX_VALUE,curr_sum=0, L_I = 0, R_I = arr.length - 1;
		quicksort(arr, 0, arr.length - 1);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		while(LI<RI) {
			curr_sum=arr[LI]+arr[RI];
			if(Math.abs(curr_sum)<Math.abs(min_sum)) {
				min_sum=curr_sum;
				L_I=LI;
				R_I=RI;
			}
			if(curr_sum<0)
				LI++;
			else
				RI--;
		}
   System.out.println(min_sum);
	}

	static int partition(int[] arr, int p, int r) {
		int key,i;
		 i = p - 1;
		 key=arr[r];
		for (int j = p; j < r; j++) {
			if (arr[j]<= key) {
				i = i + 1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = temp;
		return i + 1;
	}

	static void quicksort(int arr[], int p, int r) {  }
}
