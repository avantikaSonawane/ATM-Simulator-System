/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class Signup1 extends JFrame implements ActionListener
{
    JLabel formno, personDetails,name, sname, dob,pincode, gender,city,state, email,address, marital;
    String random;
    JButton next;
    JTextField nametxtfld,snametxtfld, pintxtfld, cttxtfld,
            sttxtfld, etxtfld,addtxtfld;
    JDateChooser dtchooser;
    ButtonGroup gendergrp, marriedgrp;
    JRadioButton male, female, gothers, married, unmarried, mdothers;
    Signup1()
    {
        setLayout(null);
        Random ran = new Random();
        random = "" + Math.abs((ran.nextLong()%9000L) + 1000L);
        formno = new JLabel("APPLICATION FORM NO. : " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 30));  
        formno.setBounds(140,20,600,40);
        add(formno);
        
        personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22 ));  
        personDetails.setBounds(270,80,400,30);
        add(personDetails);
        
        name = new JLabel("First Name : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));  
        name.setBounds(100,140,150,30);
        add(name);
        
        nametxtfld = new JTextField();
        nametxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        nametxtfld.setBounds(300,140,400,30);
        add(nametxtfld);
        
        sname = new JLabel("Surname : ");
        sname.setFont(new Font("Raleway", Font.BOLD, 20));  
        sname.setBounds(100,190,200,30);
        add(sname);
        
        snametxtfld = new JTextField();
        snametxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        snametxtfld.setBounds(300,190,400,30);
        add(snametxtfld);
        
        dob = new JLabel("Date of birth : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));  
        dob.setBounds(100,240,200,30);
        add(dob);
        
        
        dtchooser = new JDateChooser();
        dtchooser.setBounds(300,240,400,30);
        dtchooser.setFont(new Font("Raleway", Font.BOLD, 15));
        dtchooser.setForeground(new Color(105,105,105));
        add(dtchooser);
        
        gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));  
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290, 120,30);
        male.setFont(new Font("Raleway", Font.BOLD, 20));  
        male.setBackground(Color.white);
        add(male);
                
                
        female = new JRadioButton("Female");
        female.setBounds(450,290, 120,30);
        female.setFont(new Font("Raleway", Font.BOLD, 20));  
        female.setBackground(Color.white);
        add(female);
         
        
        gothers = new JRadioButton("Others");
        gothers.setBounds(600,290, 120,30);
        gothers.setFont(new Font("Raleway", Font.BOLD, 20));  
        gothers.setBackground(Color.white);
        add(gothers);
        
        gendergrp = new ButtonGroup();
        gendergrp.add(male);
        gendergrp.add(female);
        gendergrp.add(gothers);
        
        email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));  
        email.setBounds(100,340,200,30);
        add(email);
        
        etxtfld = new JTextField();
        etxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        etxtfld.setBounds(300,340,400,30);
        add(etxtfld);
        
        
        marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));  
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        married = new JRadioButton("Married");
        married.setBounds(300,390, 120,30);
        married.setFont(new Font("Raleway", Font.BOLD, 20));  
        married.setBackground(Color.white);
        add(married);
                
         
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390, 150,30);
        unmarried.setFont(new Font("Raleway", Font.BOLD, 20));  
        unmarried.setBackground(Color.white);
        add(unmarried);
         
        mdothers = new JRadioButton("Others");
        mdothers.setBounds(600,390, 120,30);
        mdothers.setFont(new Font("Raleway", Font.BOLD, 20));  
        mdothers.setBackground(Color.white);
        add(mdothers);
        
        marriedgrp = new ButtonGroup();
        marriedgrp.add(married);
        marriedgrp.add(unmarried);
        marriedgrp.add(mdothers);
        
        address = new JLabel("Address : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));  
        address.setBounds(100,440,200,30);
        add(address);
        
        addtxtfld = new JTextField();
        addtxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        addtxtfld.setBounds(300,440,400,30);
        add(addtxtfld);
        
        
        city = new JLabel("City : ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));  
        city.setBounds(100,490,200,30);
        add(city);
        
        cttxtfld = new JTextField();
        cttxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        cttxtfld.setBounds(300,490,400,30);
        add(cttxtfld);
        
        
        state = new JLabel("State : ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));  
        state.setBounds(100,540,200,30);
        add(state);
        
        sttxtfld = new JTextField();
        sttxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        sttxtfld.setBounds(300,540,400,30);
        add(sttxtfld);
        
        
        pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));  
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pintxtfld = new JTextField();
        pintxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        pintxtfld.setBounds(300,590,400,30);
        add(pintxtfld);
        
        
        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 15)); 
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.addActionListener(this);
        add(next);
        
            
        setSize(850, 800);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Signup1();
    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno = ""+random;
        String name = nametxtfld.getText();
        String sname = snametxtfld.getText();
        String dob = ((JTextField)dtchooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }
        else if(female.isSelected())
        {
            gender = "Female";
        }
        else if(gothers.isSelected())
        {
            gender = "Others";
        }   
    
        String email = etxtfld.getText();
        String marital = null;
        if(married.isSelected())
        {
            marital = "Married";
        }
        else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        }
        else if(mdothers.isSelected())
        {
            marital = "Others";
        }   
        String address = addtxtfld.getText();
        String city = cttxtfld.getText();
        String state = sttxtfld.getText();
        String pincode = pintxtfld.getText();
        
        try
        {
            if(name.equals(""))
            {
               JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else
            {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"','"+sname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new Signup2(formno).setVisible(true);
            
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}
