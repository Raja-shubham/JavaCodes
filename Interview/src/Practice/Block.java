package Practice;
class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized(this){
			System.out.println("Child thread starts calculation ");
			for (int i = 0; i <5; i++) {
				total+=i;
			}
			System.out.println("Child thread starts notifing ");
			this.notify();
		}
	}
}
public class Block {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadB tb=new ThreadB();
		tb.start();
		synchronized(tb){
			System.out.println("Main thread trying to wait method ");
			tb.wait();
			System.out.println("main thread got notification:");
			System.out.println(tb.total);
		}
		
	}

}
