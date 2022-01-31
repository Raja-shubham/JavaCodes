package Practice;
import java.util.*;
import java.util.Map.Entry;
public class Quest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(101,"shubham");
		mp.put(102,"raj");
		mp.put(103, "sinha");
		mp.put(104, "rahul");
		mp.put(105, "kunal");
		//mp.put(103, "sinha");
		//mp.put(103, "sinha");
		System.out.println(mp);
		for (Map.Entry<Integer, String> x : mp.entrySet()) {
			System.out.println(x);
		}
		for(int x:mp.keySet()) {
			if(x==101) {
				mp.put(x, "raja");
			}
		}
		System.out.println(mp);
	}

}
