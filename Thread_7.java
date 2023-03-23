// synchronization Program
class callme
{
	 void call(String msg)
	{
		System.out.println("msg Start["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			System.out.println("call Me Interrupted "+ex);
		}
		System.out.println("]msg Eng");
	} 	
}
class caller implements Runnable
{
	callme c;
	Thread t;
	String msg;

	caller(callme temp,String s)
	{
		c=temp;
		msg=s;
		t=new Thread(this);
		t.start();
	}
public void run()
{
	synchronized(c)
	{
		c.call(msg);
	}
}
}
class DemoSynchronization
{
	public static void main(String args[])
	{
		callme receiver = new callme();
		caller c1=new caller(receiver,"Hi");
		caller c2= new caller(receiver,"Hi How are you?");
		caller c3= new caller(receiver,"KBS");

	try
	{
		c1.t.join();
		c2.t.join();
		c3.t.join();
	}
	catch(InterruptedException ex)
	{
		System.out.println("Main Thread Interrupted"+ex);
	}
	System.out.println("Main Thread Exit");
	}
}

