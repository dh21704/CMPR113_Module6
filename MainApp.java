package com.mycompany.classexercise6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainApp extends JFrame {
    
    private JRadioButton rdoRed, rdoBlue, rdoGreen;
    private JTextField txtRed, txtBlue, txtGreen, txtAnyColor;
    private JCheckBox chkOrange;
    private JComboBox<String> combo = new JComboBox<>();
    
    public static boolean flag = true;
    
    

    public static void main(String[] args) {
               
        JFrame frame = new MainApp();

        frame.pack();
        

        
        frame.setVisible(true);
        
        
        if(flag == false)
        {
            System.out.println("\nFlag is now false\n");
            frame.setVisible(false);
            
            JFrame frame2 = new Login();
            frame2.pack();
            frame2.setVisible(false);
            
        }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the application exits
    }
    
    public MainApp() {
        setTitle("Color Selector");
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // Adjusted columns to 2 for better layout
        
        // Initialize components
        rdoRed = new JRadioButton("Red");
        txtRed = new JTextField(20);
        
        rdoBlue = new JRadioButton("Blue");
        txtBlue = new JTextField(20);
        
        rdoGreen = new JRadioButton("Green");
        txtGreen = new JTextField(20);
        
        chkOrange = new JCheckBox("Orange");
        txtAnyColor = new JTextField(20);
        
        JButton button = new JButton("EXIT");
        
        // Add components to panel
        panel.add(rdoRed);
        panel.add(txtRed);
        panel.add(rdoBlue);
        panel.add(txtBlue);
        panel.add(rdoGreen);
        panel.add(txtGreen);
        panel.add(chkOrange);
        panel.add(txtAnyColor);
        
        panel.add(button);
        
        add(panel, BorderLayout.CENTER);
        
        ButtonGroup group = new ButtonGroup();
        group.add(rdoRed);
        group.add(rdoBlue);
        group.add(rdoGreen);
        
        
        
        rdoRed.addActionListener(e -> {
            txtRed.setForeground(Color.red);
            txtRed.setBackground(Color.gray);
        });
        
        rdoGreen.addActionListener(e -> {
            txtGreen.setForeground(Color.green);
            txtGreen.setBackground(Color.gray);
        });
        
        rdoBlue.addActionListener(e -> {
            txtBlue.setForeground(Color.blue); // Use Color.blue for blue text
            txtBlue.setBackground(Color.gray);
        });
        
        chkOrange.addActionListener(e -> {
            if (chkOrange.isSelected()) {
                txtAnyColor.setForeground(Color.orange);
                txtAnyColor.setBackground(Color.gray);
            } else {
                txtAnyColor.setForeground(Color.black);
                txtAnyColor.setBackground(Color.white);
            }
        });
        
        combo.addActionListener(e -> {
            if (combo.getSelectedIndex() == 1) {
                txtAnyColor.setForeground(Color.magenta);
            } else if (combo.getSelectedIndex() == 2) {
                txtAnyColor.setForeground(Color.cyan);
            } else {
                JOptionPane.showMessageDialog(null, "Choose Color");
            }
        });
        
        panel.add(combo);
        
        combo.addItem("Choose");
        combo.addItem("Magenta");
        combo.addItem("Cyan");
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("\nNow Exiting\n");
                
                dispose();
                
                JFrame frame2 = new Login();
                
                frame2.pack();
                frame2.setVisible(true);
            }
            
        }
        
        );
    }
}
