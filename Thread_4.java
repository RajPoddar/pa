//write a java program input name and display index form.
 
import java.util.Scanner;
class demoName
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Name:-");
		String s;
		s = obj.next();
		Thread t;
		t = Thread.currentThread();
		int len = s.length();
		try
		{
			for(int i=0;i<len;i++)
			{
				System.out.println(s.charAt(i));
				t.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("problem: "+ ex);
		}
	}
}