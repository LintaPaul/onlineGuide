package onlineguide;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




class firstWindow extends JFrame implements ActionListener{ 
    public firstWindow(){
        this.getContentPane().setBackground(Color.yellow);
        this.setTitle("ONLINE SHOPPING GUIDE");
        this.setBounds(200,200,900,550);
        this.setResizable(false);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel heading=new JLabel();
        heading.setBounds(50,60,800,100);
        heading.setBorder(BorderFactory.createLineBorder(Color.black,2));
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("",Font.BOLD, 40));
        add(heading);
        
        heading.setText("ONLINE SHOPPING GUIDE");
        JButton b1=new JButton("LOGIN");
        b1.setBounds(100,350,250,70);
        b1.setBackground(Color.white);
        b1.setBorder(BorderFactory.createLineBorder(Color.black,2));
        add(b1);
        b1.addActionListener(this);
        JButton b2=new JButton("REGISTER");
        b2.setBounds(550,350,250,70);
        b2.setBackground(Color.white);
        b2.setBorder(BorderFactory.createLineBorder(Color.black,2));
        add(b2);
        b2.addActionListener(this);
       
        setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        String name=ae.getActionCommand();
         if(name.equals("LOGIN")){
             System.out.println("make login");
             this.dispose();
             new loginWindow().setVisible(true);
             
         }
         else if(name.equals("REGISTER")){
             System.out.println("make register");
             this.dispose();
             new registerWindow().setVisible(true);

         }
         
    }
    
        public static void main(String args[]) {
        new firstWindow().setVisible(true);
        
    }

}

