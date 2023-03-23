class LowHigh implements Runnable
{
	Thread t;
	long cnt;
	
private volatile boolean running;
LowHigh(int p)
{
	running = true;
	t = new Thread(this);
	cnt = 0;
	t.setPriority(p);
	System.out.println(t);
}
public void start()
{
	t.start();
}
public void run()
{
	while (running)
		cnt++;
}
public void stop()
{
	running = false;
}
}
class DemoLowHigh
{
	public static void main(String args[])
	{
		Thread m= Thread.currentThread();
		LowHigh lt = new LowHigh(Thread.NORM_PRIORITY+2);
		LowHigh ht = new LowHigh(Thread.NORM_PRIORITY-2);

		lt.start();
		ht.start();

		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Main Thread Interrupted");
		}
		ht.stop();
		lt.stop();
		System.out.println("ht.cnt="+ht.cnt);
		System.out.println("lt.cnt="+lt.cnt);
	}
}