package Practice;
class Parents{
	public void Walk() {
		System.out.println("Please walk slowly Parents");
	}
	public void Run() {
		System.out.println("Please run Parents:");
		Walk();
	}
}
class Child extends Parents{
	public void Walk() {
		super.Walk();
		System.out.println("Please Walk Quickly Child");
	}
	public void Run() {
		super.Run();
		System.out.println("Please run Child");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p=new Child();
		Parents p1=new Parents();
		//p1.Run();
		
		p.Run();
		
	}

}
