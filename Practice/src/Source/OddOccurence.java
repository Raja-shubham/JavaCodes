package Source;
import java.util.*;
public class OddOccurence {

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
		int h = oddOccur(arr);
		System.out.println(h);
	}
	public static int oddOccur(int arr[]) {
		Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(ht.containsKey(arr[i])) {
				ht.put(arr[i], ht.get(arr[i])+1);
			}
			else {
				ht.put(arr[i],1);
			}
		}
		for (int i = 0; i <arr.length; i++) {
			if(ht.get(arr[i])%2!=0) {
				k=ht.get(arr[i]);
			}
		}
		return k;
	}
}
