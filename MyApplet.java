
import java.applet.Applet;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
//Draw Windmil in Applet.
public class MyApplet  extends Applet implements Runnable
{
    Thread t;
    int height,width;
    int midx,midy;
    int Sangle;
    Polygon p;
    public void init()
    {
        Sangle =0;
        t=new Thread(this);
        t.start();
    }
    
    public void paint(Graphics g)
    {
        p= new Polygon();
        p.addPoint(midx, midy);
        p.addPoint(midx+50, midy+300);
        p.addPoint(midx-50, midy+300);
        g.drawPolygon(p);
        height=getSize().height;
        width=getSize().width;
        midx = width/2;
        midy = height/2;
        g.fillArc(midx-150, midy-150, 300, 300, Sangle, 45);
        g.fillArc(midx-150, midy-150, 300, 300, Sangle+180, 45);
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                Sangle=Sangle+10;
                Thread.sleep(10);
                repaint();
            }
            }
        catch(InterruptedException ex)
        {
            
        }
        }
       
    }



