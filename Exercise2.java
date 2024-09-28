/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Exercise2 {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner inputFile;
        String fileName;
    
        fileName = JOptionPane.showInputDialog("Enter the name of the file: ");
        ///Users/danielhernandez/Desktop/GoodFile.txt
        
        
        System.out.println("\n" + fileName);
        
        try
        {
            file = new File(fileName);
            inputFile = new Scanner(file);
            
            FileWriter fw = new FileWriter(fileName);

            fw.write("\nThe file writer has been found, thank you");
            fw.close();
            
            JOptionPane.showMessageDialog(null, "The file was found");
            
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "The file was not found: " + ex);
        }
        
        JOptionPane.showMessageDialog(null, "Done");
        System.exit(0);
        
        
    }
}
