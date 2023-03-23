
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
import java.applet.Applet;
import java.awt.*;

public class MyApplet2 extends Applet 
{
    int ;
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 170, 5000, 20);
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(110, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(160, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(110, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(170, 150, 20, 20);
        
        g.setColor(Color.red);
        g.fillRect(210, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(220, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(270, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(220, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(280, 150, 20, 20);
        
        g.setColor(Color.green);
        g.fillRect(320, 100, 100, 50);
        g.setColor(Color.white);
        g.fillRect(330, 110, 30, 30);
        g.setColor(Color.white);
        g.fillRect(380, 110, 30, 30);
        g.setColor(Color.black);
        g.fillOval(330, 150, 20, 20);
        g.setColor(Color.black);
        g.fillOval(400, 150, 20, 20);
        
        g.setColor(Color.black);
        g.fillRect(385,80,10,20);
        
        for(int i=0;i<1;i++){
            repaint();
        }
        
        
   
        }
    public void run(){
                 try{
                while(true){
                    Thread.sleep(1000);
                }
            
            }
            catch(Exception ex)
            {
                    
         }
    }
        
        
        
    }




