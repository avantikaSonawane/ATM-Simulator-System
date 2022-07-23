
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class Signup2 extends JFrame implements ActionListener
{
    JLabel addDetails,name, sname, dob,pincode, gender,city,state, email,address, marital;
    JButton next;
    JTextField nametxtfld,snametxtfld, pantxtfld, cttxtfld,
            sttxtfld, etxtfld,adhtxtfld;
    JDateChooser dtchooser;
    ButtonGroup sctzn, ectzn, gendergrp, marriedgrp;
    JRadioButton eyes,eno,syes, sno,male, female, gothers, married, unmarried, mdothers;
    JComboBox religion, category, income, education, occupation;
    String formno;
    
    Signup2(String formno)
    {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE-2");
        this.formno = formno;
        addDetails = new JLabel("Page 2 : Additional Details");
        addDetails.setFont(new Font("Raleway", Font.BOLD, 22 ));  
        addDetails.setBounds(270,80,400,30);
        add(addDetails);
        
        name = new JLabel("Religion : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));  
        name.setBounds(100,140,150,30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setFont(new Font("Raleway", Font.BOLD, 15)); 
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        religion.setForeground(Color.black);
        add(religion);
        
        sname = new JLabel("Category : ");
        sname.setFont(new Font("Raleway", Font.BOLD, 20));  
        sname.setBounds(100,190,200,30);
        add(sname);
        
        String valCategory[] = {"General","OBC", "SC","ST", "Other"};
        category = new JComboBox(valCategory);
        category.setFont(new Font("Raleway", Font.BOLD, 15)); 
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        category.setForeground(Color.black);
        add(category);
        
        dob = new JLabel("Income : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));  
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valIncome[] = {"Null","1-1,50,000", "1,50,000-2,50,500","2,50,000-5,00,000", ">5,00,000"};
        income = new JComboBox(valIncome);
        income.setFont(new Font("Raleway", Font.BOLD, 15)); 
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        income.setForeground(Color.black);
        add(income);
        

        gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));  
        gender.setBounds(100,290,200,30);
        add(gender);
    
        email = new JLabel("Qualification : ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));  
        email.setBounds(100,320,200,30);
        add(email);
        
        
        String valedu[] = {"Non Graduate","Graduate", "Post-Graduation","PhD","Others"};
        education = new JComboBox(valedu);
        education.setFont(new Font("Raleway", Font.BOLD, 15)); 
        education.setBounds(300,320,400,30);
        education.setBackground(Color.white);
        education.setForeground(Color.black);
        add(education);
        
       
        marital = new JLabel("Occupation : ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));  
        marital.setBounds(100,370,200,30);
        add(marital);
        
        String valocc[] = {"Salaried","Self-Employed", "Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(valocc);
        occupation.setFont(new Font("Raleway", Font.BOLD, 15)); 
        occupation.setBounds(300,370,400,30);
        occupation.setBackground(Color.white);
        occupation.setForeground(Color.black);
        add(occupation);
       
        address = new JLabel("PAN No. : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));  
        address.setBounds(100,420,200,30);
        add(address);
        
        pantxtfld = new JTextField();
        pantxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        pantxtfld.setBounds(300,420,400,30);
        add(pantxtfld);
        
        
        city = new JLabel("Aadhar No. : ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));  
        city.setBounds(100,470,200,30);
        add(city);
        
        adhtxtfld = new JTextField();
        adhtxtfld.setFont(new Font("Raleway", Font.BOLD, 15)); 
        adhtxtfld.setBounds(300,470,400,30);
        add(adhtxtfld);
        
        
        state = new JLabel("Senior Citizen : ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));  
        state.setBounds(100,520,200,30);
        add(state);
        
         syes = new JRadioButton("Yes");
         syes.setBounds(300,520,100,30);
         syes.setFont(new Font("Raleway", Font.BOLD, 20));
         syes.setBackground(Color.white);
         add(syes);
         
          sno = new JRadioButton("No");
          sno.setFont(new Font("Raleway", Font.BOLD, 20));
         sno.setBounds(450,520,100,30);
         sno.setBackground(Color.white);
         add(sno);
        
         sctzn = new ButtonGroup();
         sctzn.add(syes);
         sctzn.add(sno);
        
        pincode = new JLabel("Existing Account : ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));  
        pincode.setBounds(100,570,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway", Font.BOLD, 20));
         eyes.setBounds(300,570,100,30);
         eyes.setBackground(Color.white);
         add(eyes);
         
         eno = new JRadioButton("No");
         eno.setBounds(450,570,100,30);
         eno.setFont(new Font("Raleway", Font.BOLD, 20));
         eno.setBackground(Color.white);
         add(eno);
        
       ectzn = new ButtonGroup();
         ectzn.add(eyes);
         ectzn.add(eno);
        
        next = new JButton("Next");
        next.setBounds(620,640,80,30);
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
        new Signup2("");
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String snct = null;
        if(syes.isSelected())
        {
            snct = "Yes";
        }
        else if(sno.isSelected())
        {
            snct = "No";
        }
    

        String extacct = null;
        if(eyes.isSelected())
        {
            extacct = "Yes";
        }
        else if(eno.isSelected())
        {
            extacct = "No";
        }
        String adhar = adhtxtfld.getText();
        String pan = pantxtfld.getText();
      
        try
        {
           Conn c = new Conn();
           String query = "insert into signup2 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+pan+"','"+adhar+"','"+snct+"','"+extacct+"')"; 
           
           c.s.executeUpdate(query);
           setVisible(false);
           new Signup3(formno).setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}
