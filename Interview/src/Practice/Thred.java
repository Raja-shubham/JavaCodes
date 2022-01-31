package Practice;
class MyThread extends Thread{
	MyThread2 t2;
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 1 executing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Thread 2 executing");
		}
	}
}
public class Thred {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		MyThread2 t2=new MyThread2();
		t1.start();
		//t2.start();
		t1.join(1000);
		//t2.start();
		//t1.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
		//t2.start();
		
		//t1.start();
		

	}

}
