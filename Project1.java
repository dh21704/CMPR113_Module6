

package com.mycompany.cmpr113_hw6;

class TestScores
{
    double pri[];
    int length;
    double average;
    
    TestScores(double arr[])
    {
        pri = arr;
        length = arr.length;
    }
    
    double getAverage()
    {
        try
        {
            for (int i = 0; i < length; i++)
            {
                if (pri[i] > 100 || pri[i] < 0)
                {
                    //average += pri[i]; 

                    throw new IllegalArgumentException("\nNumber " + pri[i] + " is greater than 100 or less than 0");

                }
            
             average += pri[i];
             System.out.println("\nNumber: " + pri[i] + " was added");
            }
        
            average = average / length;
        
            
        } 
        catch(IllegalArgumentException e)
        {
                System.out.println("\nError: " + e.toString());

        }
        
        
        return average;

    }
    
}


public class Project1 {
    public static void main(String[] args) {
        double arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 90, 101};
        
        TestScores test1 = new TestScores(arr);
        
        System.out.println("\nAverage: " + test1.getAverage());
    }
}
