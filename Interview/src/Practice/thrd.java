package Practice;

public class thrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(){
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
		
	};
	t.start();
	System.out.println(Thread.currentThread().getName());
	}
}
