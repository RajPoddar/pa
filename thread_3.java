// Creatin Thread By Extending Thread Class.

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
class DemoExThread
{
	public static void main(String args[])
	{
		Thread obj;
		int i;
		ExThread T1=new ExThread("T1");
		ExThread T2=new ExThread("T2");

		obj = Thread.currentThread();
		try
		{
			for(i=1;i<5;i++)
			{
				System.out.println("Main Thread:-"+i);
				obj.sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("Maiin thread Interrupted="+ex);
		}
		System.out.println("Main Thread Exit");
	}
}