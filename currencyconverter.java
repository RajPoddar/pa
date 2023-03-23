
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class currencyconverter extends Applet implements ItemListener {
    
    TextField T1;
    Checkbox c1,c2,c3,c4;
    
    Label L1,lbl_ans;
    
    
    public void init(){
        setLayout(null);
        L1 = new Label("Amount");
        L1.setBounds(20,20,50,30);
        add(L1);
        setLayout(null);
        T1 = new TextField();
        T1.setBounds(100,20,150,30);
        add(T1);
        
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c1 = new Checkbox();
        c1.setLabel(" US DOLLAR");
        c1.setBounds(20,70,350,30);
        c1.addItemListener(this);
        add(c1);
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c2 = new Checkbox();
        c2.setLabel(" Australian DOLLAR AUD");
        c2.setBounds(20,120,350,30);
        c2.addItemListener(this);
        add(c2);
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c3 = new Checkbox();
        c3.setLabel(" EURO");
        c3.setBounds(20,170,350,30);
        c3.addItemListener(this);
        add(c3);
        
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,16));
        c4 = new Checkbox();
        c4.setLabel(" UAE DIRHAM AED");
        c4.setBounds(20,220,350,30);
        c4.addItemListener(this);
        add(c4);
        
        lbl_ans = new Label();
        lbl_ans.setBounds(20,270,150,30);
        add(lbl_ans);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str;
        str = T1.getText();
        float answer;
        float amount;
        if(c1.getState())
        {
            amount = Float.parseFloat(str);
            answer = amount/82;
            lbl_ans.setText(answer+"");
        }
        if(c2.getState())
        {
            amount = Float.parseFloat(str);
            answer = amount/56;
            lbl_ans.setText(answer+"");
        }
        if(c3.getState())
        {
            amount = Float.parseFloat(str);
            answer = amount/88;
            lbl_ans.setText(answer+"");
        }
        if(c4.getState())
        {
            amount = Float.parseFloat(str);
            answer = amount/22;
            lbl_ans.setText(answer+"");
        }
    }
    

