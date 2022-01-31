package Practice;

import java.util.Scanner;

public class Equilibrium {

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
		Equilibrium.EquilibriumIndex(arr);

	}

	static void EquilibriumIndex(int[] arr) {
		int sum = 0, leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			//System.out.println(sum);
			sum = sum - arr[i];
			
			leftSum = leftSum + arr[i];
			if (sum==leftSum) {
				System.out.println("Yes we Got " + arr[i]);
			}
			
			
			
			//System.out.println(leftSum);
		}
	}

}
