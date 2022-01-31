package Source;
import java.util.*;
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="11olkjhytflkj";
		String z=""; 
		int x=0;
		for (int i = 0; i < st.length(); i++) {
			if(Character.isDigit(st.charAt(i))) {
				z+=Character.toString(st.charAt(i));
				x++;
				//System.out.println(x);
			}
		}
		//System.out.println(z);
		int res=Integer.valueOf(z);
		
		System.out.println(res);
		int len=st.length()-x;
		if(res==len) {
			System.out.println("TRUE");
		}
	}

}
