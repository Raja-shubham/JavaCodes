package Practice;
class ThreadB1 extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread starts calculating:");
			for(int i=0;i<5;i++) {
				total+=i;
			}
			System.out.println("child thread calculation end giving notification call :");
			this.notify();
		}
	}
}
public class ThreadNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadB1 tb=new ThreadB1();
		tb.start();
		synchronized(tb) {
			System.out.println("main thread is calling wait()");
			tb.wait();
			System.out.println("child thread is notifing :");
			
		}
		System.out.println(tb.total);
	}

}
