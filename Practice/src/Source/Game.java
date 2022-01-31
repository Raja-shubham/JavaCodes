package Source;

import java.util.*;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = maxPoints(arr);
		System.out.println("The points you got: " + max);

	}

	public static int maxPoints(int arr[]) {
		int max = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
			if ((i - 1 < 0 || arr[i - 1] < arr[i]) && (i + 1 >= arr.length || arr[i] > arr[i + 1])) {
				max = sum > max ? sum : max;
				//console.log(sum);
				sum = 0;
			}
		}
		return max;
	}
}
