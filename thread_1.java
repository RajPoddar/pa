// Write a java program control main thread.

class DemoMainThread
{
	public static  void main(String[] args)
	{
		int i;
		Thread t;
		t=Thread.currentThread();
		System.out.println("Thread Name:-"+ t.getName());
		System.out.println("thread Priority:-"+t.getPriority());
		System.out.println("Thread="+t);
		t.setName("MyThread");
		System.out.println("Thread Updated Name:-"+t.getName());

		try
		{
			for(i=1;i<5;i++)
			{
				System.out.println("i+"+i);
				t.sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("Main Thread Inerrtupted"+ex);
		}
	}
}