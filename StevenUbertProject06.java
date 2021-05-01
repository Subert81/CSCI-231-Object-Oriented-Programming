
/**
 * The  purpose of this project is to reinforce the knowledge from Chapter Six of the textbook.
 * The students are required to write the following two overloaded methods:
 *      1. public static int countLetters(String s) 
 *      which count the number of English letters in given a String s.
 *      2. public static int countLetters(String s, char c) 
 *      which count the number of English letter c   
 *      (not case sensitive) in given String s. If c is not an English letter, returns -1
 *
 * @author Steven Ubert
 * @version 3/11/2021
 */

import java.util.Scanner;
public class StevenUbertProject06
{
    public static void main(String[] args) 
    {
                // Create a Scanner
		Scanner input = new Scanner(System.in);
		char c;
		while (true)
		{
		// Prompt the user to enter a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.print("Enter a char: ");
		c = input.next().charAt(0);

		// Display the number of letters in the string
		System.out.println(
		"The result of calling function int countLetters(String s) \"" + 
			s + "\": " + countLetters(s));
		System.out.println(
		"The result of calling function int countLetters(String s, char c) \"" + 
			c + "\": " + countLetters(s, c));
		System.out.print("Do your want to do another test? Y/N: ");
                c = input.next().charAt(0);
                input.nextLine();
                if(c == 'n' || c == 'N') break;
                }
    }


	/** Method countLetters counts the number of letters in a string */
	public static int countLetters(String s) {
	       // Counts the number of letters
		int numberOfLetters = 0; 
		for (int i = 0; i < s.length(); i++) 
		{
			// Test if character is a letter
			if (Character.isLetter(s.charAt(i)))
			        // Increment the number of letters
				++numberOfLetters; 
		}
		return numberOfLetters;
	}
	public static int countLetters(String s, char c) 
	{
	      
			// Test if character is a letter
			if (!Character.isAlphabetic(c))
			{
			return -1;
                        } else 
                        {
                            int numberOfLetters = 0;
                            s = s.toLowerCase();
                            for (int i = 0; i < s.length(); i++)
                            {
                                if(s.charAt(i) == Character.toLowerCase(c))
			        // Increment the number of letters
				++numberOfLetters; 
                            }
                            return numberOfLetters;
	                }
        }
}