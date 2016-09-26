package thread;

public class Test {
	
	public static void main(String[] args) {
		
		Display d1 = new Display();
		Display d2 = new Display();
		
		MyThread t1 = new MyThread(d1, "Dhoni");
		MyThread t2 = new MyThread(d2, "Kohli");
		
		/*
		 * Note : For both the threads t1 and t2, we are using the
		 * same Display object d.
		 */
		
		t1.start();
		t2.start();
	}

}
