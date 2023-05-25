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
public class DoneItpage {
    private JFrame fr;
    //private JPanel pn;
    private JLabel lb;
    
    public DoneItpage() {
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pn = new JPanel();
        lb = new JLabel("Done It !",0);
        
        //pn.setLayout(new BorderLayout());
        //pn.add(lb);
        fr.add(lb, BorderLayout.CENTER);
        
        fr.setSize(200,100);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new DoneItpage();
    }
}
