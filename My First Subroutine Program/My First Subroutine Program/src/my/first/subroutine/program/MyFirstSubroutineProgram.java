/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.first.subroutine.program;

import java.util.Scanner;

public class MyFirstSubroutineProgram {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
        
       int answer;
        
       answer  = keyedInput.nextInt();
       
       if (answer == 1)
       { 
          System.out.println("please enter your numbers");
        
          int numInts;
          numInts = keyedInput.nextInt();
          
          int num3;
          num3  = keyedInput.nextInt();
         
          double numDoubles;
          numDoubles = keyedInput.nextDouble();
          
          int answers;
          
          int average;
          
          average = (numInts + numInts) / num3;
          
          double average2;
          
          average2 = (numInts + numDoubles) / num3;
          
          if (numDoubles == 0)
          { 
          System.out.println("The average is"+ average);
          
          System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");  
        answer = keyedInput.nextInt();
         
          }
          else if (numDoubles >= 0)
          {
          System.out.println("The average is "+ average2);
          
          System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
          answer = keyedInput.nextInt();
          }
          
          else if (answer == 2)
          {
              System.out.println("Please enter your sides");
              
              int side1;
              side1 = keyedInput.nextInt();
             
              int side2;
              side2 = keyedInput.nextInt();
             
              int side3;
              side3 = keyedInput.nextInt();
              
              int side4;
              side4 = keyedInput.nextInt();
              
              if (side4 == 0)
              
              System.out.println("This shape is a triangle !");
               
              int perimeter;
              
              perimeter = side1 + side2 + side3;
              
              System.out.println("The perimeter of this triangle is " + perimeter);
              
              int area;
              
              System.out.println("Please enter the high of this triangle ");
             
              int high;
             
              high = keyedInput.nextInt();
              
              area = (side2 * high) /2;
              
              System.out.println("The area of this triangle is " + area);
              
              if (side4 > 0)
              { 
               int perimeter2;
               
               System.out.println("Please enter the length and width of the Rectangle and Square ");
               
               int length;
               length = keyedInput.nextInt();
               
               int width;
               width = keyedInput.nextInt();
               
               int width2;
               width2 = keyedInput.nextInt();
               
               int length2;
               length2 = keyedInput.nextInt();
               
               perimeter2 =  length + length2 + width + width2;
               
               System.out.println("The perimeter of Rectangle or Square is "+ perimeter2);
               
               int area2;
               
               area2 = width * length;
               
               System.out.println("The area of Rectangle or Square is " + area2);
               
              System.out.println("");
              
              System.out.println("");
              
        System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
                   answer = keyedInput.nextInt();
              }
        
          }
          else if (answer == 3 )
          {
              System.out.println("Please enter your radius");
              
              int radius;
             radius = keyedInput.nextInt();
              
              int diameter;
              
              diameter = radius * 2;
              
              System.out.println("This is the diameter of this circule " + diameter);
              
              double circumference;
              
              circumference = diameter * 3.1415926535;
              
              System.out.println("This is the circumference of this circule " + circumference);
              
              System.out.println("");
              
              System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
          answer = keyedInput.nextInt();
  
          }
          else if (answer == 4)
               
              System.out.println("Please the S and T");
              
              int S;
              S = keyedInput.nextInt();
               
              int T;
              T = keyedInput.nextInt();
               
              int V;
              
               V = S / T;
               
               System.out.println("This is the speed " + V);
               
               int acceleration;
               
               System.out.println("Please enter the new S and new T");
               
               int newS;
               newS = keyedInput.nextInt();
              
               int newT;
               newT = keyedInput.nextInt();
               
               acceleration = newS / newT;
               
               System.out.println("This is the acceleration " + acceleration);
               
               System.out.println("");
               
                System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
          answer = keyedInput.nextInt();
         
       }
             else if (answer == 5)
             {
                 System.out.println("Please enter your X and Y and B");
                 
                 int X; 
                 X = keyedInput.nextInt();
                 
                 int Y;
                 Y = keyedInput.nextInt();
                 
                 int B;
                 B = keyedInput.nextInt();
                 
                 int midpoint;
                 
                 int K;
                 int K2;
                 
                 K = (X*X + Y*Y);
                 K2 =(X*X + Y*Y)/K;

                 midpoint = K2 / 2;
                 
                 System.out.println("The mid point is " + midpoint);
                 
                  int M;
                  M = X*(Y - B);
                 
                  System.out.println("the slope is " + M);
                  
                  System.out.println("");
                  
                  
        System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
                    
        answer = keyedInput.nextInt();
         
             }
             else if (answer==6)
                     {
                         System.out.println("You are exit this program ! ");
                         
                         System.out.println("");
                         
        System.out.println("Please enter your choice");
        System.out.println("1. Caculate the average numbers");
        System.out.println("2. Finding perimeter, area or volume of specific shapes");
        System.out.println("3. Determining radius, diameter, circumference of circles");
        System.out.println("4. Finding speed or acceleration");
        System.out.println("5. Determining the midpoint or slope of a line");
        System.out.println("6. Exit");
          answer = keyedInput.nextInt();

                     }
    }
}
    
    

