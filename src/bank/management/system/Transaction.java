/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Transaction extends JFrame implements ActionListener
{
    JButton deposit,withdrawl, fcash, minstat,exit, balinq, pinchange;
    String pinno;
    Transaction(String pin)
    {
        pinno = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(180,300,700,35);
        text.setFont(new Font("System",Font.BOLD, 20));
        text.setForeground(Color.white);
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fcash = new JButton("Fast Cash");
        fcash.addActionListener(this);
        fcash.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fcash.setBounds(170,450,150,30);
        image.add(fcash);
        
        minstat = new JButton("Mini Statement");
        minstat.setBounds(355,450,150,30);
        minstat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minstat.addActionListener(this);
        image.add(minstat);
        
        pinchange = new JButton("Pin change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        pinchange.setCursor(new Cursor(Cursor.HAND_CURSOR));
        image.add(pinchange);
        
        balinq = new JButton("Balance Enquiry");
        balinq.addActionListener(this);
        balinq.setBounds(355,485,150,30);
        balinq.setCursor(new Cursor(Cursor.HAND_CURSOR));
        image.add(balinq);
        
        exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public static void main(String args[])
    {
        new Transaction("");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exit)
        {
            System.exit(0);
        }
        else if(e.getSource()==deposit)
        {
            setVisible(false);
            new Deposit(pinno).setVisible(true);
        }
        else if(e.getSource()==withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinno).setVisible(true);
        }
        else if(e.getSource()==fcash)
        {
            setVisible(false);
            new FastCash(pinno).setVisible(true);
        }
         else if(e.getSource()==pinchange)
        {
            setVisible(false);
            new Pin(pinno).setVisible(true);
        }
         else if(e.getSource()==balinq)
        {
            setVisible(false);
            new BalanceEnquiry(pinno).setVisible(true);
        }
         else if(e.getSource()==minstat)
        {
           // setVisible(false);
            new MiniStatement(pinno).setVisible(true);
        }
    }
}
