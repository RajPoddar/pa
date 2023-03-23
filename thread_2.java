// Create Multiple thread using implement.

class MyThread implements Runnable 
{
	Thread t;
	MyThread(String Tname)
	{
		t=new Thread (this,Tname);
		System.out.println("MyThread:-"+t);
		t.start();
	}
	public void run()
	{
		int i;
		try
		{
			for(i=1;i<5;i++)
			{
				System.out.println(t.getName()+"Thread:-"+i);
				t.sleep(500);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("child Thread Interrupted="+ex);
		}
	}
}
class DemoMultiThread
{
	public static void main(String agrs[])
	{
		Thread obj;
		int i;
		MyThread t1=new MyThread("T1");
		MyThread t2=new MyThread("T2");
		obj=Thread.currentThread();
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
			System.out.println("Main Thread Interrupted "+ex);
		}
		System.out.println("Main Thread Exit");
	}
}