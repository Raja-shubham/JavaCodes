package Practice;
import java.util.*;
public class TripleSum {

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
		System.out.println("Enter the triple sum to be find: ");
		int sum=sc.nextInt();
		boolean res=Triple(arr,sum);
		System.out.println(res);
	}
	static boolean Triple(int[] arr,int sum) {
		int Triple=0;
		for (int i = 0; i < arr.length-1; i++) {
			int LI=i+1,RI=arr.length-1;
			while(LI<RI) {
				Triple=arr[i]+arr[LI]+arr[RI];
				if(Triple==sum) {
					return true;
				}
				if(Triple>sum) {
					RI--;
				}
				else {
					LI++;
				}
			}
		}
		return false;
	}
}
