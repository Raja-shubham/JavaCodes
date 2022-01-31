package Practice;
class A extends Thread{
	String name;
	public A(String name) {
		this.name=name;
	}
	public synchronized void method() {
		System.out.println("methos m1():"+name);
	}
}
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A("shubham");
		A b=new A("shivam");
		a.method();
		b.method();
	}

}
