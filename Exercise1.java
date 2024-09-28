


package com.mycompany.classexercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercise1 {
    
    public static void main(String[] args) throws IOException{
        
        String inputFile = JOptionPane.showInputDialog(null, "Input the filename: ");
                
        ///Users/danielhernandez/Desktop/TextFiles/Numbers.txt
        
        FileWriter fw = new FileWriter(inputFile);

        try
        {
            int numbers[] = {1, 2, 3, 4, 5};
            
            //will get an error
            for(int i = 0; i < 5; i++)
            {
                fw.write(numbers[i] + "\n");
            }
            
            fw.close();
            System.out.println("Numbers written to file");
            
        }
        catch(IOException ex)
        {
            System.out.println("Error; " + ex);
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Now Reading Files");
        
        try
        {
            Scanner scan = new Scanner(new File(inputFile));
            System.out.println("\n\nThis is in the file\n");
            while(scan.hasNextLine())
            {
                System.out.println(scan.nextLine());
            }
        }
        catch(IOException ex)
        {
            System.out.println("Error: " + ex.toString());
        }
                    
        
    }
}
