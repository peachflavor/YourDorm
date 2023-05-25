/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mac
 */
import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;

public class Firstpage {
    private JFrame fr;
    private JPanel p1, p2, p3, p4, p5, p6, p7;
    private JLabel lb1, lb2;
    private JButton b1, b2, b3;
    private ImageIcon im;
    private Image i;
    
    public Firstpage() {
        fr = new JFrame("Menu Page");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(1,2));
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        
        p2.setLayout(new GridLayout(5, 1));
        p3.setLayout(new FlowLayout());
        p4.setLayout(new FlowLayout());
        p5.setLayout(new FlowLayout());
        
        lb1 = new JLabel("YOUR DORM");
        lb2 = new JLabel();
        
        b1 = new JButton("Utilities");
        b2 = new JButton("Rooms");
        b3 = new JButton("Tanents");
        
        p3.add(b1);
        p4.add(b2);
        p5.add(b3);
        
        b1.setPreferredSize(new Dimension(150,80));
        b2.setPreferredSize(new Dimension(150,80));
        b3.setPreferredSize(new Dimension(150,80));
        
        im = new ImageIcon("pic/dor2.jpeg");
        i = im.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH);
        lb2.setIcon(new ImageIcon(i));
        
        //b1.addActionListener(this);
        //b2.addActionListener(this);
        //b3.addActionListener(this);
        
        Font font = new Font("Belleza", Font.PLAIN, 20);
        lb1.setFont(font);
        
        p6.setBackground(Color.LIGHT_GRAY);
        p3.setBackground(Color.GRAY);
        p4.setBackground(Color.GRAY);
        p5.setBackground(Color.GRAY);
        p7.setBackground(Color.GRAY);
     
        p2.add(p6);
        p2.add(p3);
        p2.add(p4);
        p2.add(p5);
        p2.add(p7);
        
        p1.add(lb2);
        p6.add(lb1, BorderLayout.CENTER);
        
        
        fr.add(p1);
        fr.add(p2);
        
        
        
        fr.setSize(800, 600);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new Firstpage();
    }
    //public void actionPerformed(ActionEvent ae) {
      //  if(ae.getSource().equals(b1)) {
            
        }

