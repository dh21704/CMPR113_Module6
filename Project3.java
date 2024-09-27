
package com.mycompany.cmpr113_hw6;

import java.util.Scanner;

class ClassException extends Exception
{
    public ClassException(String message)
    {
        super(message);
    }
}


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
    
    @Override
    public String toString()
    {
        return "\nName : " + getName() + 
                "\nID: " + getID() + 
                "\nHours Worked: " + hoursWorked() + 
                "\nHourly Pay: " + hourlyPay();
    }
           
}

public class Project3 {
    public static void main(String[] args) {
        Payroll3 p = new Payroll3("Bob", 12345);
        
        Scanner scan = new Scanner(System.in);
        
        boolean nameFlag = true;
        boolean IDFlag = true;
        boolean HoursWorkedFlag = true;
        boolean HourlyPayFlag = true;
        
        String name = "";
        int ID = 0;
        int hoursWorked = 0;
        double hourlyPay = 0.0;

        
        while(nameFlag)
        {
            System.out.print("Enter the name of the user: ");          
            name = scan.nextLine();
            try
            {
                validateName(name);
                System.out.println("\nHello " + name + "!\n");
                nameFlag = false;
                
            } catch(ClassException e)
            {
                  System.out.println("Error: " + e.getMessage());
            } 
        }
        
        
        while(IDFlag)
        {
            System.out.print("Enter the ID of the user: ");
            ID = scan.nextInt();
            try
            {
                validateID(ID);
                System.out.println("\n" + ID + " is a valid ID!\n");
                IDFlag = false;

            }
            catch(ClassException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
      
        
        while(HoursWorkedFlag)
        {
            System.out.print("Enter the hours worked: ");
            hoursWorked = scan.nextInt();
            try
            {
                validateHoursWorked(hoursWorked);
                System.out.println("\n" + hoursWorked + " is a valid number of hours worked!\n");
                HoursWorkedFlag = false;
                
            }
            catch(ClassException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        
        while(HourlyPayFlag)
        {
            System.out.print("Enter the hourly pay: ");
            hourlyPay = scan.nextDouble();
            
            try
            {
                validatePay(hourlyPay);
                System.out.println("\n" + hourlyPay + " is valid hourly pay!\n");
                HourlyPayFlag = false;
            }
            catch(ClassException e)
            {
                System.out.println("Error: " + e.getMessage());
            }

        }
            
        
        p.setName(name);
        p.setID(ID);
        p.setHoursWorked(hoursWorked);
        p.setHourlyPay(hourlyPay);
        
        System.out.println(p);
        
        System.out.println("\nGross Pay for " + p.getName() + ": $" + p.grossPay());
        
        
    }
    
    public static void validateName(String name) throws ClassException
    {
        if (name == null || name.trim().isEmpty())
        {
            throw new ClassException("Name cannot be empty");   
        }
    
    }
    
    public static void validateID(int ID) throws ClassException
    {
        if (ID <= 0)
        {
            throw new ClassException("ID cannot be 0 or less");
        }
    }
    
    public static void validateHoursWorked(int hoursWorked) throws ClassException
    {
        if (hoursWorked < 0 || hoursWorked > 84)
        {
            throw new ClassException("Hours Worked cannot be less than 0 or more than 84 hours");
        }
    }
    
    public static void validatePay(double pay) throws ClassException
    {
        if (pay < 0 || pay > 25)
        {
            throw new ClassException("Pay cannot be a negative number or a number greater than 25");
        }
    }
}
