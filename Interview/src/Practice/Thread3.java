package Practice;
class MyThread4 extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("child thread is running :");
		}
	}
}
public class Thread3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread4 t1=new MyThread4();
		MyThread4 t2=new MyThread4();
		t1.start();
		//t1.join();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}
