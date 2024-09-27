/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise6;


public class Exercise5 {
    public static void main(String[] args) {
        
        
        int number;
        String str;
        
        try
        {
            str = "xyz";
            number = Integer.parseInt(str);
            System.out.println("A");
        }
        catch(NumberFormatException e)
        {
            System.out.println("B");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("C");
        }
        
        System.out.println("D");
     
    }
}
