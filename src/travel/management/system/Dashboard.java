package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
     
    String username;
    JButton addpersonalDetails,viewpersonalDetails,updatepersonalDetails,checkpackage,bookpackage,viewpackage;
    JButton viewhotels,destination,bookhotels,viewbookedhotels,about,payment,calculator,notepad,deletepersonalDetails;
    
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,63);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 =i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65 ,300,900);
        add(p2);
        
        addpersonalDetails=new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0, 0, 300, 50);
        addpersonalDetails.setBackground(new Color(0,0,102));
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addpersonalDetails.setMargin(new Insets(0,0,0,60));
        addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);
        
        updatepersonalDetails=new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0, 40, 300, 50);
        updatepersonalDetails.setBackground(new Color(0,0,102));
        updatepersonalDetails.setForeground(Color.WHITE);
        updatepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatepersonalDetails.setMargin(new Insets(0,0,0,30));
        updatepersonalDetails.addActionListener(this);
        p2.add(updatepersonalDetails);
        
        viewpersonalDetails=new JButton("View Details");
        viewpersonalDetails.setBounds(0, 80, 300, 50);
        viewpersonalDetails.setBackground(new Color(0,0,102));
        viewpersonalDetails.setForeground(Color.WHITE);
        viewpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpersonalDetails.setMargin(new Insets(0,0,0,130));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);
        
        deletepersonalDetails=new JButton("Delete Personal  Details");
        deletepersonalDetails.setBounds(0, 120, 300, 50);
        deletepersonalDetails.setBackground(new Color(0,0,102));
        deletepersonalDetails.setForeground(Color.WHITE);
        deletepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletepersonalDetails.setMargin(new Insets(0,0,0,30));
        deletepersonalDetails.addActionListener(this);
        p2.add(deletepersonalDetails);
        
        checkpackage=new JButton("Check Packages");
        checkpackage.setBounds(0, 160, 300, 50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,100));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

        bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0, 200, 300, 50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage=new JButton("View Package");
        viewpackage.setBounds(0, 240, 300, 50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0, 280, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotels=new JButton("Book Hotels");
        bookhotels.setBounds(0, 320, 300, 50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,130));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);
        
        viewbookedhotels=new JButton("View Booked Hotels");
        viewbookedhotels.setBounds(0, 360, 300, 50);
        viewbookedhotels.setBackground(new Color(0,0,102));
        viewbookedhotels.setForeground(Color.WHITE);
        viewbookedhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotels.setMargin(new Insets(0,0,0,70));
        viewbookedhotels.addActionListener(this);
        p2.add(viewbookedhotels);
        
        destination=new JButton("Destination");
        destination.setBounds(0, 400, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
        payment=new JButton("Payment");
        payment.setBounds(0, 440, 300, 50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculator=new JButton("Calculator");
        calculator.setBounds(0, 480, 300, 50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0, 520, 300, 50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about=new JButton("About");
        about.setBounds(0, 560, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0, 0, 1600, 1000);
        add(image);
        
        JLabel text=new JLabel("Travel and Tourism Mangement Sytem");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.PLAIN,50));
        image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addpersonalDetails){
            new AddCustomer(username);
        }
        else if(e.getSource()== viewpersonalDetails){
            new ViewCustomer(username);
        }
        else if(e.getSource()==updatepersonalDetails){
            new UpdatepersonDetails(username);
        }
        else if(e.getSource()==checkpackage){
            new CheckPackage();
        }
        else if(e.getSource()==bookpackage){
            new BookPackage(username);
        }
        else if(e.getSource()==viewpackage){
            new ViewPackage(username);
        }  
        else if(e.getSource()==viewhotels){
            new checkHotals();
        }
        else if(e.getSource()==destination){
            new Destination();
        }
        else if(e.getSource()==bookhotels){
            new BookHotel(username);
        }
        else if(e.getSource()==viewbookedhotels){
            new ViewBookedHotel(username);
        }
        else if(e.getSource()==about){
            new About();
        }
        else if(e.getSource()==payment){
            new Payment();
        }
        else if(e.getSource()==deletepersonalDetails){
            new DeleteDetails("username");
        }
        else if(e.getSource()==notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e1){
                System.out.print(e1);
            }
        }
        else if(e.getSource()==calculator)
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e1){
                System.out.print(e1);
            }
        }
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
    
}
