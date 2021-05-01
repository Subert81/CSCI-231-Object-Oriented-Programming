/**
 * If else and switch statements to assign letter grades based off user input
 * 
 *
 * @author Steve Ubert
 * @version 2/15/2021
 */

//Import the classes
import java.util.Scanner;
//create class for this code
public class StevenUbertProject03
{
    public static void main(String [] args)
    {
        //Creates Scanner
        Scanner input = new Scanner(System.in);
        //prompts the user to inpt a vaues from 0-100
            System.out.print("Enter your score (0-100): ");
            //sets integer from user
                int score = input.nextInt();
                //if statement to check if input is valid, otherwise exits prgram
                    if (score < 0 || score > 100)
                    {
                           System.out.println("Error - Value outside range! Value must be between 0(zero) and 100(one hundred).");
                           System.exit(0);
                        }
                        /*if else & switch statements checking user input to 
                         * pre-determind letter grades.
                         * 100-90 = A; 89-80 = B; 79-70 = C;
                         * 69-60 = D; & 59-0 = F
                         */ 
                    //switch processing
                    switch (score/10){
                        case 10: 
                        case 9: System.out.println("Your grade is an A.");
                        break;
                        case 8: System.out.println("Your grade is a B.");
                        break;
                        case 7: System.out.println("Your grade is a C.");
                        break;
                        case 6: System.out.println("Your grade is a D.");
                        break;
                        default: System.out.println("Your grade is a F.");
                    }
                    //if else processing
                    /*
                    if (score >= 90){
                        System.out.println("Your grade is an A.");
                    }
                    else if (score >= 80 & score < 90){
                        System.out.println("Your grade is a B.");
                    }
                    else if (score >= 70 & score < 80){
                        System.out.println("Your grade is a C.");
                    }
                    else if (score >= 60 & score < 70){
                        System.out.println("Your grade is a D.");
                    }
                    else{
                        System.out.println("Your grade is a F.");
                    */
                    }
           }
/*OUTPUT
else-if output
Enter your score (0-100): 86
Your grade is a B.
Enter your score (0-100): 91
Your grade is an A.
Enter your score (0-100): -50
Error - Value outside range! Value must be between 0(zero) and 100(one hundred).
Enter your score (0-100): 48
Your grade is a F.
switch output
Enter your score (0-100): 100
Your grade is an A.
Enter your score (0-100): 90
Your grade is an A.
Enter your score (0-100): 84
Your grade is a B.
Enter your score (0-100): 77
Your grade is a C.
Enter your score (0-100): 60
Your grade is a D.
Enter your score (0-100): 31
Your grade is a F.
Enter your score (0-100): 2
Your grade is a F.
Enter your score (0-100): -25
Error - Value outside range! Value must be between 0(zero) and 100(one hundred).
150


   */

