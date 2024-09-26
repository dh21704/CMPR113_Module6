
package com.mycompany.cmpr113_hw6;

import java.util.Scanner;

class Payroll3 extends Exception
{
    String name;
    int ID, hoursWorked;
    double hourlyPay;
    
    Payroll3(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
    }
    
    Payroll3(String exception)
    {
        System.out.println("Name cannot be empty!");
    }
    
    double grossPay()
    {
        return hoursWorked * hourlyPay;
    }
    
    String getName()
    {
        return name;
    }
    
    int getID()
    {
        return ID;
    }
    
    int hoursWorked()
    {
        return hoursWorked;
    }
    
    double hourlyPay()
    {
        return hourlyPay;
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    
    void setID(int ID)
    {
        this.ID = ID;
    }
    
    void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    
    void setHourlyPay(double hourlyPay)
    {
        this.hourlyPay = hourlyPay;
    }
           
}

public class Project3 {
    public static void main(String[] args) {
        Payroll3 p = new Payroll3("Bob", 12345);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the name of the user: ");          
        p.setName(scan.nextLine());
        
//        if (p.getName().equals(""))
//        {
//            throw new Payroll3(" ");
//        }
//        
        System.out.print("Enter the ID of the user: ");
        p.setID(scan.nextInt());
        
        System.out.print("Enter the hours worked: ");
        p.setHoursWorked(scan.nextInt());
        
        System.out.print("Enter the hourly pay: ");
        p.setHourlyPay(scan.nextDouble());
        
        System.out.println("Gross Pay for " + p.getName() + ": $" + p.grossPay());
        
        
    }
}
