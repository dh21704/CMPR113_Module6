package com.mycompany.classexercise6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.*;

public class Exercise3 extends JFrame 
{
    public static void main(String[] args) 
    {
        JTextField field = new JTextField(7);
        JButton button = new JButton("Go");
        JFrame frame = new JFrame("Frame");

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter the name of the file: ");

        frame.add(label);
        frame.add(field);
        frame.add(button);

        try 
        {
            button.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    int months = 0;
                    double oneMonth;
                    double totalSales = 0.0;
                    double averageSales = 0.0;

                    String fileName = field.getText();
                    System.out.println("Input: " + fileName);
                    File file = new File(fileName);

                    try 
                    {
                        Scanner inputFile = new Scanner(file);
                        while (inputFile.hasNext()) 
                        {
                            oneMonth = inputFile.nextDouble();
                            totalSales += oneMonth;
                            months++;
                        }
                        inputFile.close();
                        averageSales = totalSales / months;

                        JOptionPane.showMessageDialog(null, String.format(
                                "Numbers of months %d\nTotal Sales: $%,.2f\nAverage Sales: $,.2f",
                                months, totalSales, averageSales));
                    } 
                    catch (Exception ex2) 
                    {
                        System.out.println("Error: " + ex2.getMessage());
                    }
                }
            });

            frame.setVisible(true);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Sales Data does not exist, make the sales report");
            try 
            {
                FileWriter fw = new FileWriter("D:\\SalesData.txt");
                fw.write("24987.62\n");
                fw.write("26978.97\n");
                fw.write("32589.45\n");
                fw.write("31978.47\n");
                fw.close();
                JOptionPane.showMessageDialog(null, "Sales Report Created");
            } 
            catch (Exception ex1) 
            {
                // Handle exception
                System.out.println("Error: " + ex1.getMessage());
            }
        }
    }
}
