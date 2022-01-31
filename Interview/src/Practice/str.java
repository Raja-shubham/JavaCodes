package Practice;

import java.util.ArrayList;
 
class notAllowedException extends RuntimeException{
	notAllowedException() {
		super();
	}
}
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		int x=6;
		int z=addElement(x);
		System.out.println(z);
	}
	static int addElement(int a) {
		int sum=0;
		for(int i=0;i<a;i++) {
			sum+=i;
		}
		if(sum>6) {
			throw new notAllowedException();
		}
		 return sum;
	}

}
