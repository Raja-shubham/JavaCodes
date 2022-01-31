package Practice;
import java.util.*;
public class Separate {

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
		int[] arr2=Separate(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	static int [] Separate(int[] arr) {
		int LI=0,RI=arr.length-1;
		while(LI<RI) {
			while(arr[LI]==0&&LI<RI) {
				LI++;
			}
			while(arr[RI]==1&&LI<RI) {
				RI--;
			}
			if(LI<RI) {
				arr[LI++]=0;
				arr[RI--]=1;
			}
		}
		return arr;
	}

}
