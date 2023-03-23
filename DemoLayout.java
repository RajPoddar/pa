/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
import java.awt.*;
import java.applet.Applet;
import javax.swing.BoxLayout;


public class DemoLayout extends Applet {
    
    Panel p;
    Button B1,B2,B3,B4,B5;
    
    public void init(){
        setLayout(null);
        setFont(new Font("Times New Roman",Font.BOLD,20));
        
        p = new Panel();
        p.setBounds(10,10,500,500);
        p.setBackground(Color.RED);
//        p.setLayout(new BorderLayout(10,10));
//        p.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
//        p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
        p.setLayout(new GridLayout(4,2,10,10));
       
        
        B1 = new Button("NORTH");
        p.add(B1, BorderLayout.NORTH);
        
        B2 = new Button("SOUTH");
        p.add(B2, BorderLayout.SOUTH);
        
        B3 = new Button("EAST");
        p.add(B3, BorderLayout.EAST);
        
        B4 = new Button("WEST");
        p.add(B4, BorderLayout.WEST);
        
        B5 = new Button("CENTER");
        p.add(B5, BorderLayout.CENTER);
        
        
        add(p);
    }
    
}

