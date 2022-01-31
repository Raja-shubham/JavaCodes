package Practice;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator<Integer>{
	public int compare(Integer a,Integer b) {
		Integer x=(Integer)a;
		Integer y=(Integer)b;
		if(x<y)
			return +1;
		else if(x>y)
			return -1;
		else
			return 0;
	}
}
public class Stt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("kjh");
		ts.add("tfd");
		ts.add("agh");
		ts.add("tred");
		ts.add("resd");
		System.out.println(ts);
	}

}
