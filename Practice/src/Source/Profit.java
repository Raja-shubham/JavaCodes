package Source;
import java.util.*;

public class Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the elements of array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=maxProfit(arr);
		System.out.println("MAximum profit is: "+ max);
	}
	
	public static int maxProfit(int arr[]) {
		int diff[]=new int[arr.length-1];
		for (int i = 0; i < arr.length-1; i++) {
			diff[i]=arr[i+1]-arr[i];
		}
		int maxDiff=diff[0];
		for (int i = 1; i < diff.length; i++) {
			if(diff[i-1]>0) {
				diff[i]=diff[i-1]+diff[i];
			}
			if(diff[i]>maxDiff) {
				maxDiff=diff[i];
			}
		}
		return maxDiff;
	}
	
}
