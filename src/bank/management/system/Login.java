/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton login, clear, signup;
    JTextField cardtxtfld;
    JPasswordField pintxtfld;
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(130, 10, 100, 100);
        add(label);
        getContentPane().setBackground(Color.white);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(240,40,400,40);
        text.setFont(new Font("osward", Font.BOLD, 38));
        add(text);
        
        
        JLabel cardno = new JLabel("Card no. : ");
        cardno.setBounds(120,150,170,40);
        cardno.setFont(new Font("Raleway", Font.BOLD, 30));
        add(cardno);
        
        cardtxtfld = new JTextField();
        cardtxtfld.setBounds(300, 160, 250, 30);
        cardtxtfld.setFont(new Font("Raleway", Font.BOLD, 20));
        add(cardtxtfld);
      
        JLabel pin = new JLabel("PIN : ");
        pin.setBounds(120,220,400,40);
        pin.setFont(new Font("Raleway", Font.BOLD, 30));
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        add(pin);
        
        pintxtfld = new JPasswordField();
        pintxtfld.setBounds(300, 230, 250, 30);
        pintxtfld.setFont(new Font("Raleway", Font.BOLD, 20));
        add(pintxtfld);
        
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        
        clear = new JButton("CLEAR");
        clear.setBounds(450,300,100,30);
        clear.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,250,30);
        signup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        
        setSize(730,480);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    public static void main(String args[])
    {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== clear)
        {
            cardtxtfld.setText("");
            pintxtfld.setText("");
        }
        else if(e.getSource()==login)
        {
            Conn conn = new Conn();
            String cardnumber = cardtxtfld.getText();
            String pinno = pintxtfld.getText();
            String query = "select * from login where cardno= '"+cardnumber+"' and pin= '"+pinno+"'";
            try
            {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transaction(pinno).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials");
                }
            }
            catch(Exception ae)
            {
                System.out.println(ae);
            }
        
        
        }
        else if(e.getSource()==signup)
        {
            setVisible(false);
            new Signup1().setVisible(true);
        }
    }
}
