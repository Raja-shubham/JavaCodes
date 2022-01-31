package Source;
import java.util.*;

public class ClosestSum {

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
		ClosestZero(arr);

	}
	static void ClosestZero(int[] arr) {
		int LI=0,RI=arr.length-1,curr_sum=0,min_sum=Integer.MAX_VALUE,L_I=0,R_I=arr.length-1;
		Arrays.sort(arr);
		while (LI<RI) {
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
	}


