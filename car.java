
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
public class car  extends Applet implements Runnable
{
    Thread t;
    int inc;
    
    public void init()
    {
        inc =10;
        t=new Thread(this);
        t.start();
    }
    
    public void paint(Graphics g)
    {
//        TRACK
        g.setColor(Color.black);
        g.fillRect(0, 170, 5000, 20);
        
        g.setColor(Color.red);
        g.fillRect(100+inc, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(110+inc, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(160+inc, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(110+inc, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(170+inc, 150, 20, 20);
        g.setColor(Color.black);
        g.setColor(Color.red);
        g.fillRect(210+inc, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(220+inc, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(270+inc, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(220+inc, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(280+inc, 150, 20, 20);
        
        g.setColor(Color.green);
        g.fillRect(320+inc, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(330+inc, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(380+inc, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(330+inc, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(400+inc, 150, 20, 20);
        
        g.setColor(Color.black);
        g.fillRect(385+inc,80,10,20);
        
//        2nd TRAIn
        g.setColor(Color.black);
        g.fillRect(0, 570, 5000, 20);
        
        g.setColor(Color.yellow);
        g.fillRect(1100-inc, 500, 100, 50);
        g.setColor(Color.white);
        g.fillRect(1110-inc, 510, 30, 30);
        g.setColor(Color.white);
        g.fillRect(1160-inc, 510, 30, 30);
        g.setColor(Color.black);
        g.fillOval(1110-inc, 550, 20, 20);
        g.setColor(Color.black);
        g.fillOval(1170-inc, 550, 20, 20);
        g.setColor(Color.black);
        g.setColor(Color.blue);
        g.fillRect(1210-inc, 500, 100, 50);
        g.setColor(Color.white);
        g.fillRect(1220-inc, 510, 30, 30);
        g.setColor(Color.white);
        g.fillRect(1270-inc, 510, 30, 30);
        g.setColor(Color.black);
        g.fillOval(1220-inc, 550, 20, 20);
        g.setColor(Color.black);
        g.fillOval(1280-inc, 550, 20, 20);
        
        g.setColor(Color.blue);
        g.fillRect(1320-inc, 500, 100, 50);
        g.setColor(Color.white);
        g.fillRect(1330-inc, 510, 30, 30);
        g.setColor(Color.white);
        g.fillRect(1380-inc, 510, 30, 30);
        g.setColor(Color.black);
        g.fillOval(1330-inc, 550, 20, 20);
        g.setColor(Color.black);
        g.fillOval(1400-inc, 550, 20, 20);
        
        g.setColor(Color.black);
        g.fillRect(1130-inc,480,10,20);
        
        
    }
    
    public void run()
    {
        try
        {
            while(true)
            {
                inc = inc +1;
                Thread.sleep(10);
                repaint();
            }
            }
        catch(InterruptedException ex)
        {
            
        }
        }
       
    }



