
/**
 * Program that asks the user to input a change between 1 and 99 cents. The program
 * then will display it in amounts of quarters, dime, nickels and pennies
 * 
 * "Name Goes Here!"
 * Project02
 * 02/01/2021
 */
//Import the classes
import java.util.Scanner;

    public class "Name Goes Here!"Project02{
        //Method of randomly generated number between 1 and 99
        public static double getRandom(double min,double max){
            double change = (int)(Math.random()*((max-min)+1))+min;
            return change;
        }
            
        public static void main(String[] args){
            //Declare constant amount for possible change amounts
             final int QUARTERS = 25;
             final int DIMES = 10;
             final int NICKEL = 5;
             final int PENNIES= 1;
            // Create a Scanner
             Scanner input = new Scanner(System.in);
            //Details to the user what exactly the program will process    
             System.out.println("This program converts your given change in cents to quarters,dimes,nickels, and pennies. ");
            
            //total amount of cents given
            int change;
            //number of quarters, and dimes
            int numberOfQuarters,numberOfDimes;
            //number of nickels and pennies.
            int numberOfNickels,numberOfPennies; 
            // variable to hold amount of cents left after code is run
            int remainingAmount; 
            
            //typecasted method calls and stores random variable
            change=(int) getRandom(1,99);
            
            // Promts user for input 
            System.out.print("Please enter a number from 1 to 99: ");
            change = input.nextInt();
            
            // Find the number of quarters in the remaining amount
            numberOfQuarters = change / QUARTERS;
            remainingAmount = change % QUARTERS;
        
            // Find the number of dimes in the remaining amount
            numberOfDimes = remainingAmount / DIMES;
            remainingAmount = remainingAmount % DIMES;
        
            // Find the number of nickels in the remaining amount
            numberOfNickels = remainingAmount / NICKEL;
            remainingAmount = remainingAmount % NICKEL;
        
            // Find the number of pennies in the remaining amount
            numberOfPennies = remainingAmount;
        
            // Display results
            System.out.println("Your amount " + change + " consists of"); 
            System.out.println("    " + numberOfQuarters + " quarters");
            System.out.println("    " + numberOfDimes + " dimes"); 
            System.out.println("    " + numberOfNickels + " nickels");
            System.out.println("    " + numberOfPennies + " pennies");
        }
    }
    
    /*OUTPUT
     * This program converts your given change in cents to quarters,dimes,nickels, and pennies. 
Please enter a number from 1 to 99: 68
Your amount 68 consists of
    2 quarters
    1 dimes
    1 nickels
    3 pennies
This program converts your given change in cents to quarters,dimes,nickels, and pennies. 
Please enter a number from 1 to 99: 97
Your amount 97 consists of
    3 quarters
    2 dimes
    0 nickels
    2 pennies
This program converts your given change in cents to quarters,dimes,nickels, and pennies. 
Please enter a number from 1 to 99: 47
Your amount 47 consists of
    1 quarters
    2 dimes
    0 nickels
    2 pennies
This program converts your given change in cents to quarters,dimes,nickels, and pennies. 
Please enter a number from 1 to 99: 71
Your amount 71 consists of
    2 quarters
    2 dimes
    0 nickels
    1 pennies
       */
    
