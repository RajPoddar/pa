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

public class GroupCheckbox extends Applet implements  ItemListener {
    Checkbox cm,cf;
    String str;
    CheckboxGroup gender;
    
    public void init(){
    
    gender = new CheckboxGroup();
    cm=new Checkbox("Male",gender,true);
    cm.setBounds(20,220,100,30 );
    cm.addItemListener(this);
    add(cm);
    
    cf = new Checkbox("Female",gender,false);
    cf.setBounds(20,270,100,30);
    cf.addItemListener(this);
    add(cf);
    
    Checkbox c = gender.getSelectedCheckbox();
    str =str + c.getLabel();
    
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
}
