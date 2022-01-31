package Practice;

import java.util.*;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		quicksort(arr, 0, arr.length - 1);
		System.out.println("The sorted array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	static int partition(int[] arr1, int p, int r) {
		int key, i;
		i = p - 1;
		key = arr1[r];
		for (int j = p; j < r; j++) {
			if (arr1[j] <= key) {
				i = i + 1;
				int temp = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = temp;
			}
		}
		int temp = arr1[i + 1];
		arr1[i + 1] = arr1[r];
		arr1[r] = temp;
		return i + 1;

	}

	static void quicksort(int[] arr, int p, int r) {
		int q = 0;
		if (p < r) {
			q = partition(arr, p, r);
			quicksort(arr, p, q - 1);
			quicksort(arr, q + 1, r);
		}
	}

}
