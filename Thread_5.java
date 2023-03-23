//Use of isLive and Join method.

class ExThread extends Thread 
{
	String tname;
	ExThread(String name)
	{
		super(name);
		tname=name;
		System.out.println("MyThread:-"+this);
		start();
	}
	public void run()
	{
		
		int i;
		try
		{
			for(i=1;i<5;i++)
			{
				System.out.println(tname + "Exthread:-"+i);
				Thread.sleep(500);
				
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("child Thread Interrupted"+ex);
		}
		System.out.println("Child Thread Exit");
	}
}
class DemoMultiThread
{
	public static void main(String args[])
	{
		Thread obj;
		int i;
		MyThread T1=new MyThread("T1");
		MyThread T2=new MyThread("T2");
		obj= Thread.currentThread();
		System.out.println("T1.t.isAlive()="+T1.t.isAlive());
		System.out.println("T2.t.isAlive()="+T2.t.isAlive());

		try
		{
			T1.t.join();
			T2.t.join();
		}
		catch(InterruptedException ex)
		{
			System.out.println("Main Thread Interrupted "+ex);
		}
		System.out.println("T1.t.isAlive()="+T1.t.isAlive());
		System.out.println("T2.t.isAlive()="+T2.t.isAlive());
		System.out.println("main Thread exit");
	}
}