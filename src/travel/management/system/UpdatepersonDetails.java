package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class UpdatepersonDetails extends JFrame implements ActionListener{
    
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfaddress,tfcountry,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    
    UpdatepersonDetails (String username){
        
        setBounds(350,150,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50, 0, 300, 25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
        
        JLabel lblusername =new JLabel("UserName");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        labelusername =new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid =new JLabel("ID");
        lblid.setBounds(30,90,150,25);
        add(lblid);
        
        tfid=new JTextField();
        tfid.setBounds(220, 90, 150, 25);
        add(tfid);
        
        JLabel lblnumber =new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);
        
        tfnumber=new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);
        
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);
        
        labelname =new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        add(lblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(220, 210, 150, 25);
        add(tfgender);
        
        JLabel lblcountry =new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);
        
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);
        
        JLabel lblemail=new JLabel("E-Mail");
        lblemail.setBounds(30,330,150,25);
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220, 330, 150, 25);
        add(tfemail);
        
        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(30,370,150,25);
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220, 370, 150, 25);
        add(tfphone);
        
        add=new JButton("Update");
        add.setBounds(70,430,100,25);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2=i1.getImage().getScaledInstance(200, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400, 100, 450, 300);
        add(image);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            String username =labelusername.getText();
            String id=tfid.getText();
            String number=tfnumber.getText();
            String name=labelname.getText();
            String gender= tfgender.getText();
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            
            try{
                Conn c=new Conn();
                    String query="update customer set username='"+username+"',id ='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                    setVisible(false);
            }catch(Exception e1){
                System.out.println(e1);
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new UpdatepersonDetails("Ayush Mehrotra");
    }
}

