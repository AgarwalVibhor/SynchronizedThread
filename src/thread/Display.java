package thread;

public class Display {
	
	public synchronized void wish(String name)
	/*
	 * Since synchronized is used here, no two threads will be able to
	 * access this method on the same object simultaneously.
	 * 
	 * For accessing synchronized method on an object, you need to 
	 * acquire the lock of the object which is unique and can be acquired 
	 * by just 1 thread.
	 */
	{
		for(int i = 0; i <= 5; i++)
		{
			System.out.print("Good Morning :");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
