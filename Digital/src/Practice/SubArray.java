package Practice;
import java.util.*;
public class SubArray {

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
		System.out.println("Enter the sum value to be find:");
		int sum=sc.nextInt();
		boolean x=SubArraySum(arr,sum);
		System.out.println(x);
	}
	static boolean SubArraySum(int[] arr, int sum) {
		int curr_sum=arr[0],LI=0,RI=0;
		while(LI<=RI) {
			if(curr_sum==sum) {
				return true;
			}
			else if(curr_sum<sum) {
				RI++;
				curr_sum=curr_sum+arr[RI];
			}
			else if(curr_sum>sum) {
				curr_sum=curr_sum-arr[LI];
				LI++;
			}
		}
		return false;
	}

}
