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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends Applet implements ActionListener{
    
    Label lbl1;
    Button btn_ok,btn_cancel;
    TextField txt_name;
    
    public void init()
    {
        setLayout(null);
        setFont(new Font("Georgia",Font.BOLD,20));
        lbl1 = new Label("welcome");
        lbl1 = new Label("TY BSC",Label.CENTER);
        lbl1.setBounds(10,10,200,30);
        
        btn_ok = new Button("ENTER");
        btn_ok.setBounds(230,60,100,30);
        btn_cancel = new Button("CANCEL");
        btn_cancel.setBounds(300,120,100,30);
        
        
        txt_name = new TextField();
        txt_name.setBounds(230, 10, 500, 30);
        
        add(lbl1);
        add(btn_ok);
        add(btn_cancel);
        add(txt_name);
        btn_ok.addActionListener(this);
        btn_cancel.addActionListener(this);
    }
    
        public void actionperformed(ActionEvent e){
        txt_name.setText("");
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equals("ENTER"))
        {
            txt_name.setText("you have clicked: ENTER");
        }
    if(e.getActionCommand().equals("CANCEL"))
        {
            txt_name.setText("you have clicked: CANCEL");
        }
    }
        
}
