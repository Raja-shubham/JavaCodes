package Practice;
import java.util.*;
public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the sum which have to find:");
		int sum=sc.nextInt();
		Pairs(arr,sum);
		//List<Boolean> bl=new ArrayList<Boolean>();
		
	}
	static void Pairs(int[] arr,int sum) {
		int temp=0,count=0,temp1=0;
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			temp=sum-arr[i];
			//temp1=arr[i]-diff;
			if( hs.contains(temp)) {
//				System.out.println("yes");
//				System.out.println(sum+" "+arr[i]+" "+temp);
				count++;
			}
//			if( hs.contains(temp1)) {
////				System.out.println("yes");
////				System.out.println(sum+" "+arr[i]+" "+temp);
//				count++;
//			}
			hs.add(arr[i]);
			
		}
		System.out.println(count);
	}

}
