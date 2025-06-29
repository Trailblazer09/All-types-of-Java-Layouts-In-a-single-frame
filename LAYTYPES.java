package com.mycompany.laytypes;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class LAYTYPES //Main class
{  
    public static void main(String[] args) //Main method
    {
      
 
       JFrame f=new JFrame("ALL TYPES OF LAYOUTS IN ONE FRAME");        
       
       Panel p  = new Panel();
       Panel p2 = new Panel();
       Panel p3 = new Panel();
       Panel p4 = new Panel();
       Panel p5 = new Panel();
       
       CardLayout cardLayout = new CardLayout(20,20);
       JPanel p6 = new JPanel(cardLayout);
       
       //LAYOUT TITLES INSIDE RESPECTIVE LABELS  
       JLabel label1 = new JLabel("BORDER LAYOUT");              
                
       JLabel label2 = new JLabel("GRID LAYOUT");

       JLabel label3 = new JLabel("FLOW LAYOUT");
       
       JLabel label4 = new JLabel("GRID BAG LAYOUT ");
               
       JLabel label5 = new JLabel("BOX LAYOUT");

       JLabel label6 = new JLabel("CARD LAYOUT");


               
       label1.setBounds(100, 310, 200, 30);
       label2.setBounds(400, 310, 200, 30);
       label3.setBounds(700, 310, 200, 30);
       //
       label4.setBounds(712,710, 200, 30);
       label5.setBounds(100, 710, 200, 30);
       label6.setBounds(400, 710, 200, 30);
       
    

      //LAYOUT TYPES  
       p.setLayout(new BorderLayout(20,10));
       p2.setLayout(new GridLayout(2,2));
       p3.setLayout(new FlowLayout(FlowLayout.CENTER));   
       p4.setLayout(new GridBagLayout());
       p5.setLayout(new BoxLayout(p5,BoxLayout.Y_AXIS));
      
      

      //SETTING BOUNDS OF ALL PANELS
       p.setBounds(0,0,300,300);
       p2.setBounds(301,0,300,300);
       p3.setBounds(602,0,300,300);
       p4.setBounds(605,400,300,300);
       p5.setBounds(0,400,300,300);
       p6.setBounds(301,400,300,300);
       
       
       //SETTING BUTTONS FOR p1
       JButton b1= new JButton("LEFT");
       JButton b2 = new JButton("RIGHT");
       JButton b3 = new JButton("UP ");
       JButton b4 = new JButton("DOWN");
       JButton b5 = new JButton ("CENTER");
       
       
       //SETTING BUTTONS FOR p2
       JButton a1= new JButton("1");
       JButton a2 = new JButton("2");
       JButton a3 = new JButton("3 ");
       JButton a4 = new JButton("4");
     
        
      
       //SETTING BUTTONS FOR p3
       JButton c1= new JButton("1");
       JButton c2 = new JButton("2");
       JButton c3 = new JButton("3");
       JButton c4 = new JButton("4");
       JButton c5= new JButton("5");
       JButton c6 = new JButton("6");
       JButton c7 = new JButton("7 ");
       JButton c8 = new JButton("8");
       
        //SETTING BUTTONS FOR p6
        JButton card1 = new JButton("Card 1");
        JButton card2 = new JButton("Card 2");
        JButton card3 = new JButton("Card 3");
   

         //ADDING BUTTONS TO RESPECTIVE PANELS      
         
         p.add (b1, BorderLayout.WEST);
         p.add (b2, BorderLayout.EAST);
         p.add (b3, BorderLayout.NORTH);
         p.add (b4, BorderLayout.SOUTH);
         p.add (b5, BorderLayout.CENTER);
         
         p2.add (a1);
         p2.add (a2);
         p2.add (a3);
         p2.add (a4);
         
         p3.add (c1);
         p3.add (c2);
         p3.add (c3);
         p3.add (c4); 
         p3.add (c5);
         p3.add (c6);
         p3.add (c7);
         p3.add (c8);
         
      GridBagConstraints c = new GridBagConstraints();
      c.insets = new Insets(2,2,2,2);
 
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 100;
        p4.add(new JButton("Merged"),c);

        c.gridx = 1;
        c.ipadx = 8;
        p4.add(new JButton("B1"), c);
        
        c.gridx = 2;
        c.ipadx =8;
        p4.add(new JButton("B2"), c);
        
        
        p5.add(new JButton("MATHS"));
        p5.add(new JButton("ENGLISH "));
        p5.add(new JButton("COMPUTER"));
        p5.add(new JButton("G.K."));
        p5.add(new JButton("VEDANTA"));
        p5.add(new JButton("HINDI"));
        p5.add(new JButton("DBMS"));
        p5.add(new JButton("E.V.S"));
        p5.add(new JButton("SCIENCE"));
        p5.add(new JButton("HRM"));
        p5.add(new JButton("SOCIOLOGY"));
        

        p6.add(card1, "Card 1");
        p6.add(card2, "Card 2");
        p6.add(card3, "Card 3");
        
        //for card layout
        ActionListener al = new ActionListener()
        {
        public void actionPerformed(ActionEvent e) 
        {
        cardLayout.next(p6);
        }};
        card1.addActionListener(al);
        card2.addActionListener(al);
        card3.addActionListener(al);
         
         
           // SETTING BG COLOURS OF RESPECTIVE PANELS
           p.setBackground(Color.orange);
           p3.setBackground(Color.pink);
           p4.setBackground(Color.green);
           p5.setBackground(Color.cyan);
           p6.setBackground(Color.yellow);
            
            
        //ADDING PANELS IN THE FRAME      
        f.add(p);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        
        //ADDING LABELS IN THE FRAME
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(label5);
        f.add(label6);
       
        f.setSize(1050,1050); // setting frame size
        f.setLayout(null);
        f.pack(); //THIS IS OPTIONAL

        f.setVisible(true); // setting visiblity 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // THIS IS OPTIONAL
        
     //end of the program
    }}
