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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;


public class tictactoe extends Applet implements ActionListener {
    
    Panel p;
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9;
    int i;
    
    public void init(){
        i=1;
        setLayout(null);
        setFont(new Font("Times New Roman",Font.BOLD,20));
        
        B1 = new Button("");
        B1.setBounds(20,20,100, 100);
        B1.addActionListener(this);
        
        B2 = new Button("");
        B2.setBounds(130,20,100, 100);
        B2.addActionListener(this);
        
        
        B3 = new Button("");
        B3.setBounds(250,20,100, 100);
        B3.addActionListener(this);
        
        B4 = new Button("");
        B4.setBounds(20,150,100, 100);
        B4.addActionListener(this);
        
        B5 = new Button("");
        B5.setBounds(130,150,100, 100);
        B5.addActionListener(this);
        
        B6 = new Button("");
        B6.setBounds(250,150,100, 100);
        B6.addActionListener(this);
        
        B7 = new Button("");
        B7.setBounds(20,280,100, 100);
        B7.addActionListener(this);
        
        B8 = new Button("");
        B8.setBounds(130,280,100, 100);
        B8.addActionListener(this);
        
        B9 = new Button("");
        B9.setBounds(250,280,100, 100);
        B9.addActionListener(this);
        
        
        
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        add(B5);
        add(B6);
        add(B7);
        add(B8);
        add(B9);
        
        
        
        
        
        
        
//        p = new Panel();
//        p.setBounds(10,10,500,500);
//       
//        p.setBackground(Color.RED);
//        
//        p.setLayout(new GridLayout(3,3,10,10));
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//         p.add(new Button());
//        
//        
//        
//        
//        add(p);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button B=(Button)e.getSource();
        if(i%2==0)
            B.setLabel("X");
        else
            B.setLabel("O");
        i++;
        
    }
    
}
