package onlineguide;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




class loginWindow extends JFrame implements ActionListener{ 
    public loginWindow(){
        this.setBackground(Color.yellow);
        this.setTitle("ONLINE SHOPPING GUIDE");
        this.setBounds(200,200,900,550);
        this.setResizable(false);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel heading=new JLabel();
        heading.setBounds(50,60,800,100);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("", Font.BOLD, 40));
        add(heading);
        
        heading.setText("LOGIN");
        JButton b1=new JButton("CANCEL");
        b1.setBounds(100,350,250,70);
        b1.setBackground(Color.white);
        add(b1);
        b1.addActionListener(this);
        JButton b2=new JButton("LOGIN");
        b2.setBounds(550,350,250,70);
        b2.setBackground(Color.white);
        add(b2);
        b2.addActionListener(this);
       
        setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        String name=ae.getActionCommand();
         if(name.equals("CANCEL")){
             System.out.println("cancelled");
             this.dispose();
             new firstWindow().setVisible(true);
             
         }
         else if(name.equals("LOGIN")){
             System.out.println("loginned");
             this.dispose();

         }
         
    }
    
    
    public static void main(String args[]) {
        new registerWindow().setVisible(true);
        
    }

}


