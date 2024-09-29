/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author danielhernandez
 */
public class Login extends JFrame{
    public static void main(String[] args) {
        
        
        JFrame frame = new Login();
        frame.pack();
        frame.setVisible(true);
        
    }
    
    JLabel lblLogin, lblPassword;
    JTextField txtLogin, txtPassword;
    JButton btnLogin;
    
    Login()
    {
        JPanel panel = new JPanel();
        
        panel.add(lblLogin = new JLabel("Enter username"));
        panel.add(txtLogin = new JTextField(10));
        
        panel.add(lblLogin = new JLabel("Enter password"));
        
        panel.add(txtPassword = new JPasswordField(10));
        
        panel.add(btnLogin = new JButton("Login"));
        
        add(panel);
        
        
        btnLogin.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String username = txtLogin.getText();
                String password = txtPassword.getText();
                
                if(username.equals("jdoe") && password.equals("sac123"))
                {
                    JOptionPane.showMessageDialog(null, "Welcome " + username);
                    
                    MainApp callApp = new MainApp();
                    callApp.setVisible(true);
                    
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "username and or password not correct");
                    txtLogin.setText("");
                    txtPassword.setText("");
                }
            }
        }
        
        
        );
        
        
        
        
        
    }
            
            
}
