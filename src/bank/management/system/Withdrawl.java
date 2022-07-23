/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;


public class Withdrawl extends JFrame implements ActionListener
{
    JLabel text;
    JTextField amount;
    JButton withdraw, back;
    String pinno;
   Withdrawl(String pinno)
    {
        setLayout(null);
        this.pinno = pinno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text = new JLabel("Enter the amount to Withdraw");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400,20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320,25);
        image.add(amount);
        
        withdraw = new JButton("Withdraw");
        withdraw.setCursor(new Cursor(Cursor.HAND_CURSOR));
        withdraw.addActionListener(this);
        withdraw.setBounds(355,485,150,30);
        image.add(withdraw);
        
        back = new JButton("Back");
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        back.setBounds(355,520,150,30);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new Withdrawl("");
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==withdraw)
        {
            String number = amount.getText();
            Date date = new Date();
            if(number.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid amount");
                
            }
            else
            {
                try
                {
                    
                    //String amount = ((JButton)ae.getSource()).getText();
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinno+"'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } 
                    else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                    }
                  } 
                    
                 if (balance < Integer.parseInt(number)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                 setVisible(false);
                 new Transaction(pinno).setVisible(true);
            }
                 else
                 {
                     Conn conn = new Conn();
                    String query = "insert into bank values('"+pinno+"', '"+date+"', 'Withdrawl', '"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + number + " Withdraw Successfully");
                    setVisible(false);
                    new Transaction(pinno).setVisible(true);
                 }
                    
                
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
             }
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
             new Transaction(pinno).setVisible(true);
        }
    }
}
