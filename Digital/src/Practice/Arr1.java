package Practice;

import java.util.Arrays;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,9,7,5,10};
		int size=11,count=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1])
				count+=1;
		}
		System.out.println(count);
	}

}
