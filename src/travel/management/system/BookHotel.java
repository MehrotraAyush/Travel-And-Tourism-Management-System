package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel lblusername,lblid,lblnumber,lblpesons,lbltotal,lblphone,labelprice,labelusername,labelid,labelnumber,labelphone;
    JButton checkprice,bookhotel,back;
    
    BookHotel(String username){
        this.username=username;
        setBounds(250,150,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel text=new JLabel("BOOK HOTEL");
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
        
        JLabel lblhotel=new JLabel("Select Hotel");
        lblhotel.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblhotel.setBounds(40,110,100,20);
        add(lblhotel);
        
        chotel=new Choice();
        chotel.setBounds(250,110,150,20);
        add(chotel);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        lblpesons=new JLabel("Total Person");
        lblpesons.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpesons.setBounds(40,150,150,20);
        add(lblpesons);
         
        tfpersons =new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        JLabel lbldays=new JLabel("No of Days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbldays.setBounds(40,190,150,20);
        add(lbldays);
         
        tfdays =new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        JLabel lblac=new JLabel("AC /Non-AC");
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblac.setBounds(40,230,150,20);
        add(lblac);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,150,20);
        add(cac);
        
        JLabel lblfood=new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblfood.setBounds(40,270,150,20);
        add(lblfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,150,20);
        add(cfood);
        
        lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,310,150,20);
        add(lblid);
        
        labelid=new JLabel();
        labelid.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelid.setBounds(250,310,200,20);
        add(labelid);
        
        
        lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,350,150,20);
        add(lblnumber);
        
        labelnumber=new JLabel();
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelnumber.setBounds(250,350,150,25);
        add(labelnumber);
        
        lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,390,150,20);
        add(lblphone);
        
        labelphone=new JLabel();
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelphone.setBounds(250,390,150,25);
        add(labelphone);
        
        lbltotal=new JLabel("Total Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltotal.setBounds(40,430,150,20);
        add(lbltotal);
        
        labelprice=new JLabel();
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelprice.setBounds(250,430,150,25);
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
        checkprice.setBounds(60, 490, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        
        bookhotel=new JButton("BooK Hotel");
        bookhotel.setBackground(Color.BLACK);
        bookhotel.setForeground(Color.white);
        bookhotel.setBounds(200, 490, 120, 25);
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(340, 490, 120, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l12=new JLabel(i3);
        l12.setBounds(550,50,500,400);
        add(l12);

        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==checkprice){
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("cost_per_person"));
                    int food=Integer.parseInt(rs.getString("food_Included"));
                    int ac=Integer.parseInt(rs.getString("ac_room"));
                    
                    int persons=Integer.parseInt(tfpersons.getText());
                    int days=Integer.parseInt(tfdays.getText());
                    
                    String acselected=cac.getSelectedItem();
                    String foodselected=cfood.getSelectedItem();
                    
                    if(persons *days>0){
                        int total =0;
                        total+=acselected.equals("AC")?ac:0;
                        total+=foodselected.equals("Yes")?ac:0;
                        total+=cost;
                        total=total*persons*days;
                        labelprice.setText("Rs "+total);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
                    }
                }
               }
            catch(Exception e1){
                System.out.println(e1);
            }
        }
        else if(e.getSource()==bookhotel){
         try{
             Conn c=new Conn();
             c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
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
        new BookHotel("Ayush Mehrotra");   
    }
}
