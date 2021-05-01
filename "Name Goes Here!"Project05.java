
/**
 * Write a description of class "Name Goes Here!"Project05 here.
 *
 * @author "Name Goes Here!"
 * @version 3/4/2021
 */

import java.util.Scanner;
/*
// 1 using a for structure   
public class "Name Goes Here!"Project05{
    
    public static void main(String[]args){
            // create a Scanner Object 
            Scanner input = new Scanner(System.in);
                      
            //prompt user with guidelines and to enter amount to borrow
            System.out.println("Please enter your principle, interest rate, & term: ");
            System.out.print("Enter the principle amount to borrow: $ ");
            double p = input.nextDouble();
              
            //user input for interest rate
            System.out.print("Enter the interest rate (in decimal): ");
            double rate = input.nextDouble();
              
            // user input for lenght of loan
            System.out.print("Enter the term (in years) :");
            int term = input.nextInt();
              
            int n = term * 12;
            double r = rate/12;
              
             // Table Display
             System.out.println("Month   " + 
             "Payment         " + "Total Interest  " + 
             "Balance");
             //alogrithm for mortgage calculator
            for(int i=1; i<=n; i++)
            {
            double c = p * r * Math.pow(1+r, n)/(Math.pow(1+r, n) - 1);
            double b = Math.pow(1+r, i)*p- ((Math.pow(1+r, i)-1)*c/r);
            double interest = c*i -(p - b);
            System.out.printf("%d  \t$%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
        }
    }
}

//2 using a for structure with a while statement
public class "Name Goes Here!"Project05{
    
    public static void main(String[]args){
            // create a Scanner Object 
            Scanner input = new Scanner(System.in);
                      
            //prompt user with guidelines and to enter amount to borrow
            System.out.println("Please enter your principle, interest rate, & term: ");
            System.out.print("Enter the principle amount to borrow: $ ");
            double p = input.nextDouble();
              
            //user input for interest rate
            System.out.print("Enter the interest rate (in decimal): ");
            double rate = input.nextDouble();
              
            // user input for lenght of loan
            System.out.print("Enter the term (in years) :");
            int term = input.nextInt();
              
            int n = term * 12;
            double r = rate/12;
              
             // Table Display
             System.out.println("Month   " + 
             "Payment         " + "Total Interest  " + 
             "Balance");
             //alogrithm for mortgage calculator
            int i=1;
                while(i<=n)
                {
                double c = p * r * Math.pow(1+r, n)/(Math.pow(1+r, n) - 1);
                double b = Math.pow(1+r, i)*p- ((Math.pow(1+r, i)-1)*c/r);
                double interest = c*i -(p - b);
            System.out.printf("%d  \t$%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
            i++;
        }
    }
}
*/
//3 Using do while to repeat things that at least be done one time
public class "Name Goes Here!"Project05{
    
    public static void main(String[]args){
            // create a Scanner Object 
            Scanner input = new Scanner(System.in);
                      
            //prompt user with guidelines and to enter amount to borrow
            System.out.println("Please enter your principle, interest rate, & term: ");
            System.out.print("Enter the principle amount to borrow: $ ");
            double p = input.nextDouble();
              
            //user input for interest rate
            System.out.print("Enter the interest rate (in decimal): ");
            double rate = input.nextDouble();
              
            // user input for lenght of loan
            System.out.print("Enter the term (in years) :");
            int term = input.nextInt();
              
            int n = term * 12;
            double r = rate/12;
              
             // Table Display
             System.out.println("Month   " + 
             "Payment         " + "Total Interest  " + 
             "Balance");
             //alogrithm for mortgage calculator
            int i=1;
            do
            {
                double c = p * r * Math.pow(1+r, n)/(Math.pow(1+r, n) - 1);
                double b = Math.pow(1+r, i)*p- ((Math.pow(1+r, i)-1)*c/r);
                double interest = c*i -(p - b);
                System.out.printf("%d  \t$%5.2f \t$ %5.2f \t$ %5.2f\n" , i, c, interest, b);
                i++;
        } 
                while (i<=n);
    }
}
