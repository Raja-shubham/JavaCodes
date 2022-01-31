package Practice;
import java.util.*;
public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size =sc.nextInt();
		int arr[]=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=maxDiff(arr);
		System.out.println("the maximum difference is :"+max);
	}
	static int maxDiff(int[] arr) {
		int diff[]=new int[arr.length-1];
		for (int i = 0; i < diff.length-1; i++) {
			diff[i]=arr[i+1]-arr[i];
		}
		int max_diff=diff[0];
		for (int i = 1; i < diff.length; i++) {
			if(diff[i-1]>0) {
				diff[i]=diff[i]+diff[i-1];
			}
			if(diff[i]>max_diff) {
				max_diff=diff[i];
			}
		}
		return max_diff;
	}

}
