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

public class choice extends Applet implements ItemListener,ActionListener {
    Choice cmb_city;
    Label lbl_ans;
    String str;
    Button btn_select;
    
    public void init()
    {
        str = "";
        setLayout(null);
        setFont(new Font("Times New Roman",Font.BOLD,20));
        lbl_ans = new Label("xyz");
        lbl_ans.setBounds(100,150,300,30);
        add(lbl_ans);
        
        cmb_city = new Choice();
        cmb_city.setBounds(100,200,150,30);
        cmb_city.add("Arial Black");
        cmb_city.add("Consolas");
        cmb_city.add("calibri");
        cmb_city.addItemListener(this);
        add(cmb_city);
        
        
        btn_select = new Button("select");
        btn_select.setBounds(300,200,200,30);
        btn_select.addActionListener(this);
        add(btn_select);
          
    }
    public void paint(Graphics g)
            
    {
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        str = cmb_city.getSelectedItem() + cmb_city.getItemCount();
        
        lbl_ans.setFont(new Font(cmb_city.getSelectedItem(),Font.BOLD,30));
        lbl_ans.setText(str);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        cmb_city.select("calibri");
    }
    
}
