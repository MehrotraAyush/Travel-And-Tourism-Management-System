package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Destination extends JFrame implements Runnable{
    
    Thread t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    
    @Override
    public void run() {
        try
        {
            l1.setVisible(true);
            Thread.sleep(2500);
            l1.setVisible(false);
            
            l2.setVisible(true);
            Thread.sleep(2500);
            l2.setVisible(false);
            
            l3.setVisible(true);
            Thread.sleep(2500);
            l3.setVisible(false);
            
            l4.setVisible(true);
            Thread.sleep(2500);
            l4.setVisible(false);
            
            l5.setVisible(true);
            Thread.sleep(2500);
            l5.setVisible(false);
            
            l6.setVisible(true);
            Thread.sleep(2500);
            l6.setVisible(false);
            
            l7.setVisible(true);
            Thread.sleep(2500);
            l7.setVisible(false);
            
            l8.setVisible(true);
            Thread.sleep(2500);
            l8.setVisible(false);
            
            l9.setVisible(true);
            Thread.sleep(2500);
            l9.setVisible(false);
            
            l10.setVisible(true);
            Thread.sleep(2500);
            l10.setVisible(false);
            
            this.setVisible(false);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    Destination(){
        setBounds(500,100,800,600);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l1=new JLabel(i3);
        l1.setBounds(0,0,800,600);
        add(l1);
        
        setLayout(null);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/dest2.png"));
        Image i5=i4.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        l2=new JLabel(i6);
        l2.setBounds(0,0,800,600);
        add(l2);
        l2.setVisible(false);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icons/dest3.jpg"));
        Image i8=i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        l3=new JLabel(i9);
        l3.setBounds(0,0,800,600);
        add(l3);
        l3.setVisible(false);
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("icons/dest4.jpg"));
        Image i11=i10.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        l4=new JLabel(i12);
        l4.setBounds(0,0,800,600);
        add(l4);
        l4.setVisible(false);
        
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("icons/dest5.jpg"));
        Image i14=i13.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        l5=new JLabel(i15);
        l5.setBounds(0,0,800,600);
        add(l5);
        l5.setVisible(false);
        
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("icons/dest6.jpg"));
        Image i17=i16.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        l6=new JLabel(i18);
        l6.setBounds(0,0,800,600);
        add(l6);
        l6.setVisible(false);
        
        ImageIcon i19=new ImageIcon(ClassLoader.getSystemResource("icons/dest3.jpg"));
        Image i20=i19.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i21=new ImageIcon(i20);
        l7=new JLabel(i21);
        l7.setBounds(0,0,800,600);
        add(l7);
        l7.setVisible(false);
        
        ImageIcon i22=new ImageIcon(ClassLoader.getSystemResource("icons/dest8.jpg"));
        Image i23=i22.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i24=new ImageIcon(i23);
        l8=new JLabel(i24);
        l8.setBounds(0,0,800,600);
        add(l8);
        l8.setVisible(false);
        
        ImageIcon i25=new ImageIcon(ClassLoader.getSystemResource("icons/dest9.jpg"));
        Image i26=i25.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i27=new ImageIcon(i26);
        l9=new JLabel(i27);
        l9.setBounds(0,0,800,600);
        add(l9);
        l9.setVisible(false);
        
        ImageIcon i28=new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpeg"));
        Image i29=i28.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i30=new ImageIcon(i29);
        l10=new JLabel(i30);
        l10.setBounds(0,0,800,600);
        add(l10);
        l10.setVisible(false);
        
        
        t1=new Thread(this);
        t1.start();
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Destination();
    }
}
