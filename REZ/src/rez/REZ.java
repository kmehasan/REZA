/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rez;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 *
 * @author KME Hasan
 */
public class REZ{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame window = new JFrame();
            window.setTitle("Salat Time Reminder");
            window.setSize(600, 400);
            window.setLayout(new BorderLayout());
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel body = new JPanel();
            JPanel main_panel = new JPanel();
            JButton button1 =new JButton( "Alarm");
            
            main_panel.setLayout(new GridBagLayout());
            main_panel.setBackground(Color.LIGHT_GRAY);
            //main_panel.add(body,BorderLayout.CENTER);
            main_panel.add(body);
            
            body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
            body.setMaximumSize(new Dimension(100, 100));
            body.setAlignmentY(JComponent.CENTER_ALIGNMENT); 
            //body.setBackground(Color.red);
            //body.setBounds(300, 200, body.getWidth(), body.getHeight());
            
            Dimension label_dim = new Dimension(100, 15);
            
            JLabel fajr = new JLabel("Fajr");
            //fajr.setPreferredSize(label_dim);
            fajr.setFont(new Font(fajr.getFont().getName(),Font.PLAIN,30));
            fajr.setForeground(Color.BLUE);
            fajr.setOpaque(true);
            fajr.setBackground(Color.PINK);
            
            
            JLabel dhuhr = new JLabel("Dhuhr");
            JLabel asr = new JLabel("Asr");
            JLabel maghrib = new JLabel("Maghrib");
            JLabel ishaa = new JLabel("Ishaa");
            
            dhuhr.setFont(new Font(fajr.getFont().getName(),Font.PLAIN,30));
            asr.setFont(new Font(fajr.getFont().getName(),Font.PLAIN,30));
            maghrib.setFont(new Font(fajr.getFont().getName(),Font.PLAIN,30));
            ishaa.setFont(new Font(fajr.getFont().getName(),Font.PLAIN,30));
            
            body.add(fajr);
            body.add(button1);
            body.add(dhuhr);
            body.add(asr);
            body.add(maghrib);
            body.add(ishaa);
            
            
            window.add(main_panel,BorderLayout.CENTER);
            
            
            window.setVisible(true);

    }
    
    
}
