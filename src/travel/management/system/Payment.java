package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener{
    JButton pay,back;
    Payment(){
        setBounds(500,100,800,600);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);
        
        back=new JButton("Back");
        back.setBounds(520,0,80,40);
        back.addActionListener(this);
        image.add(back);
        
        pay=new JButton("Pay");
        pay.setBounds(420,0,80,40);
        pay.addActionListener(this);
        image.add(pay);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Payment();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pay){
           setVisible(false);
           new Paytm();
        }
        else{
            setVisible(false);
        }
    }
    
}
