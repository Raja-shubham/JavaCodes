package Practice;
class Display{
	public  void wish(String name) {
		synchronized(this) {
			System.out.println("Happy B'Day "+name);
		}
	}
}
class MyThread3 extends Thread{
	Display d;
	String name;
	public MyThread3(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
	
}
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new Display();
		//Display d2=new Display();
		MyThread3 mt1=new MyThread3(d1,"Shivam");
		MyThread3 mt2=new MyThread3(d1,"Shubham");
		mt1.start();
		mt2.start();

	}

}
