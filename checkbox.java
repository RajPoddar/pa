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
import java.awt.event.*;


public class checkbox extends Applet implements  ItemListener{
    
    Checkbox c1,c2,c3;
    Label lbl_ans;
    
    public void init()
    {
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c1 = new Checkbox();
        c1.setLabel(" Male");
        c1.setBounds(20,20,100,30);
        c1.addItemListener(this);
        add(c1);
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c2 = new Checkbox();
        c2.setLabel(" Female");
        c2.setBounds(20,70,100,30);
        c2.addItemListener(this);
        add(c2);
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c3 = new Checkbox();
        c3.setLabel(" Other");
        c3.setBounds(20,120,100,30);
        c3.addItemListener(this);
        add(c3);
        
        lbl_ans = new Label();
        lbl_ans.setBounds(20,170,100,30);
        add(lbl_ans); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
         
        String str = new String();
        if(c1.getState()==true)
            str = str + c1.getLabel();
        if(c2.getState()==true)
            str = str + c2.getLabel();
        if(c3.getState()==true)
            str = str + c3.getLabel();
        lbl_ans.setText(str);
    
    }
    
    
}
