/*
 * Covert a Hexadecimal to decimal (there is a video for you to watch too).
 * Then write a program that can convert a binary to decimal (only for integer case).
 * There are two ways to do so.
 * Part1/Easy way: Directly use Java built-in method to do this. 
 * In this case, only couple lines of code.
 * Hint: Study Integer class in Java.
 * Part2/Hard way: Write your own code to convert a binary to decimal from scratch.
 * The input is a binary string. The program output is its corresponding decimal value.
 * This way you need to design the algorithm.
 *
 *
 * @author Steve Ubert
 * @version 2/21/2021
 */
/*
//import the scanner
import java.util.Scanner;
//Part1-Easy way
//create class, establishing pre-determined code with a pre-defined function
public class StevenUbertProject04{
    public static void main(String[] args) {
        String binaryString = "11111010";
        //Conversion and printing of required decimal number using built-in function, Integer.parseInt
        System.out.println(Integer.parseInt(binaryString, 2));
    }
}
*/
//Part2-hard way
//create class, create algorithm from scratch
public class StevenUbertProject04{
    public static void main(String[] args) {
        //set input
        String binaryInput = "10011110";
        int binaryNumber = Integer.parseInt(binaryInput);
        //declare variables for calculations
        int decimal = 0;
        int power = 0;
        //loop until until all binary digits are used/checked/run through
            while(true){
                if (binaryNumber == 0){
                    break;
                } else {
                    int i = binaryNumber%10;
                    decimal += i*Math.pow(2, power);
                    binaryNumber = binaryNumber/10;
                    power++;
                }
            }
            System.out.println(decimal);
        }
    }
/*Output
250
158
*/