package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel lblusername,lblid,lblnumber,lblpesons,lbltotal,lblphone,labelprice,labelusername,labelid,labelnumber,labelphone;
    JButton checkprice,bookpackage,back;
    
    BookPackage(String username){
        this.username=username;
        setBounds(250,150,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text=new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 230, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250,70,200,20);
        add(labelusername);
        
        JLabel lblpackage=new JLabel("Select Package");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,100,20);
        add(lblpackage);
        
        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,150,20);
        add(cpackage);
        
        lblpesons=new JLabel("Total Person");
        lblpesons.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpesons.setBounds(40,150,150,20);
        add(lblpesons);
         
        tfpersons =new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,190,150,20);
        add(lblid);
        
        labelid=new JLabel();
        labelid.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelid.setBounds(250,190,200,20);
        add(labelid);
        
        
        lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,230,150,20);
        add(lblnumber);
        
        labelnumber=new JLabel();
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelnumber.setBounds(250,230,150,25);
        add(labelnumber);
        
        lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,270,150,20);
        add(lblphone);
        
        labelphone=new JLabel();
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelphone.setBounds(250,270,150,25);
        add(labelphone);
        
        lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,310,150,20);
        add(lbltotal);
        
        labelprice=new JLabel();
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelprice.setBounds(250,310,150,25);
        add(labelprice);
        
        try{
            Conn conn=new Conn();
            String query="select * from customer where username='"+username+"'";
            conn.s.executeQuery(query);
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
                
        checkprice=new JButton("Check Price");
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.white);
        checkprice.setBounds(60, 380, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        
        bookpackage=new JButton("BooK Package");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.white);
        bookpackage.setBounds(200, 380, 120, 25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(340, 380, 120, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l12=new JLabel(i3);
        l12.setBounds(550,50,500,300);
        add(l12);

        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==checkprice){
            String pack=cpackage.getSelectedItem();
            int cost=0;
            if(pack.equals("Gold Package")){
                cost+=12000;
            }else if(pack.equals("Silver Package")){
                cost+=24000;
            }
            else{
                cost+=32000;
            }
            int person=Integer.parseInt(tfpersons.getText());
            cost*=person;
            labelprice.setText("Rs "+cost);
        }
        else if(e.getSource()==bookpackage){
         try{
             Conn c=new Conn();
             c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
             JOptionPane.showMessageDialog(null,"Package Booked Sucessfully");
             setVisible(false);
         }
         catch(Exception e1){
             System.out.println(e);
         }
        }
        else{
           setVisible(false); 
        }
    }
    
    public static void main(String[] args) {
        new BookPackage("Ayush Mehrotra");   
    }
}
