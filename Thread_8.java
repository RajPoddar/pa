// daemon Thread in java
class MyDaemon extends Thread 
{
	MyDaemon(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().isDaemon());
	}
}
class DemoDaemon
{
	public static void main(String args[])
	{
		MyDaemon T1=new MyDaemon("T1");
		MyDaemon T2=new MyDaemon("T2");
		MyDaemon T3=new MyDaemon("T3");
		T1.start();
		T2.setDaemon(true);
		T2.start();
		T3.start();

	}
}