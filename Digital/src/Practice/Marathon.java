package Practice;

import java.util.*;

public class Marathon {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		float d = (float) 42.729; int count=0,k=0;
		ArrayList<Float> fl=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		float arr[] = new float[size];
		System.out.println("Enter the elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > d) {
				System.out.println("Invalid input");
			}
        }
		Arrays.sort(arr);
		for (int i = arr.length-1; i>=0; i--) {
			if(arr[i]<d && count<3) {
				count++;
				 //System.out.println(arr[i]);
				fl.add(arr[i]);
			}
		}
		System.out.println(fl);
	
	}

}
