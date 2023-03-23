import java.applet.Applet;
import java.awt.*;
/*
	<applet code="Applet_9.class" height="400" width="1000"></applet>
*/
	public class Applet_9 extends Applet implements Runnable
	{
		Thread t;
		boolean flag;
		int x,y;

		public void init()
		{
			x=450;
			y=200;
			flag = true;
			t = new Thread(this);
			t.start();
		}
		public void paint(Graphics g)
		{
			g.fillRect(100,100,x,y);
		}
		public void run()
		{
			try
			{
				while(flag)
				{
					if(x<1000)
					{
						x = x-10;
						y = y-10;
					}
					else 
						x = 0;
					repaint();
					Thread.sleep(1000);
				}
			}
			catch(InterruptedException ex)
			{

			}
		}
	}