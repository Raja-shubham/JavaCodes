
package Practice;

import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		
	for(int i=0;i<5;i++) {
		for(int j=0;j<5-2*i;j++) {
			for(int k=0;k<5-(5-2*j);k++) {
				System.out.print(" ");
			}
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}

}
