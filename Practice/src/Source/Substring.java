package Source;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
		String str="rajarajassraja";
		String check="ss",str2="";
		int count=0;
		for(int i=0;i<str.length()-check.length()+1;i++) {
			str2=str.substring(i, i+check.length());
			if(str2.equals(check))
				count++;
		}
		System.out.println(count);
	}

}
