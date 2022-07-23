
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signup3 extends JFrame implements ActionListener
{
    String formno;
    JLabel l1, type, services, card,number,pin,pinno, carddetail, pindetail;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    Signup3(String formno)
    {
        this.formno = formno;
        setLayout(null);
        l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
         
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180, 150,20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350,180, 200,20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220, 150,20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,220, 230,20);
        add(r4);
        
        ButtonGroup grpacct = new ButtonGroup();
        grpacct.add(r1);
        grpacct.add(r2);
        grpacct.add(r3); 
        grpacct.add(r4);
        
        
        card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        number = new JLabel("XXXX-XXXX-XXXX-6419");
        number.setFont(new Font("Raleway", Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD,12));
        carddetail.setBounds(100,330,200,30);
        add(carddetail);
        
        pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(100,380,200,30);
        add(pin);
        
        pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD,12));
        pindetail.setBounds(100,400,200,30);
        add(pindetail);
        
        
        pinno = new JLabel("XXXX");
        pinno.setFont(new Font("Raleway", Font.BOLD,22));
        pinno.setBounds(330,380,300,30);
        add(pinno);
        
        
        services= new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,450,300,30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        c1.setBounds(100,500,180,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        c3.setBounds(100,550,180,30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        c5.setBounds(100,600,180,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,530,30);
        add(c7);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.setBounds(250,720,100,30);
        
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.setBounds(420,720,100,30);
        submit.addActionListener(this);
        cancel.addActionListener(this);
        add(submit);
        add(cancel);
        
        setSize(850, 820);
        setLocation(350, 0);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    
    }
    public static void main(String aargs[])
    {
        new Signup3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==submit)
         {
             String accttype = null;
             if(r1.isSelected())
             {
                 accttype = "Saving account";
             }
             else if(r2.isSelected())
             {
                 accttype = "Fixed Deposit account";
             }
             else if(r3.isSelected())
             {
                 accttype = "Current account";
             }
             else if(r4.isSelected())
             {
                 accttype = "Reccuring Deposit account";
             }
             Random rnd = new Random();
             String cardno = "" + Math.abs((rnd.nextLong()%90000000L) + 5040679000000000L);
         
             String pinno = "" + Math.abs((rnd.nextLong()%900L) + 1000L);
             
             String facility ="";
             if(c1.isSelected())
             {
                 facility = facility + "ATM Card";
             }
             else if(c2.isSelected())
             {
                 facility = facility + "Internet Banking";
             }
              else if(c3.isSelected())
             {
                 facility = facility + "Mobile Banking";
             }
              else if(c4.isSelected())
             {
                 facility = facility + "Email & SMS Alerts";
             }
              else if(c5.isSelected())
             {
                 facility = facility + "Cheque Book";
             } 
              else if(c6.isSelected())
             {
                 facility = facility + "E-statement";
             }
             
             try
             {
                 if(accttype.equals(""))
                 {
                    JOptionPane.showMessageDialog(null, "Account type is reqired");
                 }
                 if(c7.isSelected()==false)
                 {
                    JOptionPane.showMessageDialog(null, "Check declaration to proceed");                    
                 }
                 else
                 {
                     Conn conn = new Conn();
                     String query1 = "insert into signup3 values('"+formno+"', '"+accttype+"', '"+cardno+"', '"+pinno+"', '"+facility+"')";
                     String query2 = "insert into login values('"+formno+"','"+cardno+"', '"+pinno+"')";
                     
                     conn.s.executeUpdate(query1);
                     conn.s.executeUpdate(query2);
                     JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\nPin : " + pinno);
                     
                     setVisible(false);
                     new Deposit(pinno).setVisible(true);
                 }
             }
             catch(Exception exp)
             {
                 System.out.println(exp);
             }
         }
         else if(e.getSource()==cancel)
         {
             setVisible(false);
             new Login().setVisible(true);
         }
    }
}
