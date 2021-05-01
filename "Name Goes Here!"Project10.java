
/**
 * Project Objectives:
 *  1. Apply UML design	on user	defined	class
 *  2. Write overloaded	constructors of	a class
 *  3. Write customer methods of the class (Other than get and set methods).
 *  -data:	char[]
 *  +MyString(chars:	char[])
 *  +charAt(i:	int)	:	char
 *  +length()	:	int
 *  +substring(begin:	int,	end:	int)	:	MyString
 *  +toLowerCase()	:	MyString
 *  +equals(other:	MyString)	:	Boolean
 *  +valueOf(i:	int)	:	MyString
 *
 *
 *
 * @author "Name Goes Here!"
 * @version 4/13/2021
 */


public class "Name Goes Here!"Project10{
    public static void main(String[] args){
    
        // Create to char arrays
        char[] test = {'S', 't', 'E', 'v', 'e'};
        char[] test2 = {'S', 't', 'e', 'V', 'E', 'n'};

        // Create two MyString objects
        MyString string = new MyString(test);
        MyString string2 = new MyString(test2);
        MyString string3 = new MyString(test2);
        MyString string4 = new MyString(test2);

        // Test charAt()
        System.out.print("\nCharacter at index 4 of string: "
            + string.charAt(4));

        System.out.print("\nCharacter at index 0 of string (2nd test): "
            + string2.charAt(0));

        // Test the length of string
        System.out.print("\nLength of MyString: " + string.length());

        System.out.print("\nLength of MyString (2nd test): " + string2.length());


        // Test substring
        System.out.print("\nSubstring from index 0 to 5 of MyString: ");
        MyString substr = string.substring(0,5);
        for (int i = 0; i < substr.length(); i++) {
            System.out.print(substr.charAt(i));
        }
        System.out.print("\nSubstring from index 0 to 6 of MyString (2nd test): ");
        MyString substr2 = string2.substring(0,6);
        for (int i = 0; i < substr2.length(); i++) {
            System.out.print(substr2.charAt(i));
        }

        // Test string as lowercase:
        System.out.print("\nMyString to lowercase: ");
        MyString lower = string.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            System.out.print(lower.charAt(i));
        }

        System.out.print("\nMyString to lowercase (2nd test): ");
        MyString lower2 = string4.toLowerCase();
        for (int i = 0; i < lower2.length(); i++) {
            System.out.print(lower2.charAt(i));
        }

        // Test if string is equal to string1
        System.out.print("\nString is equal to string2: "
            + string.equals(string2));

            System.out.print("\nString2 is equal to string3 (2nd test, should return true): "
            + string2.equals(string3));

        // Test the integer 20 as a string object
        System.out.print("\nDisplay the integer 31 as a MyString object: ");
        MyString value = string.valueOf(31);
        for (int i = 0; i < value.length(); i++) {
            System.out.print(value.charAt(i));
        }

        System.out.print("\nDisplay the integer 100 as a MyString object: ");
        MyString value2 = string2.valueOf(100);
        for (int i = 0; i < value2.length(); i++) {
            System.out.print(value2.charAt(i));
        }
    }
}
//mimicking provided structure from project10.pdf
class MyString{
    private char[] string;
    private int stringLength;

    //  +MyString(chars: char[])
    public MyString(char[] chars){
        stringLength = chars.length;
        string = new char[stringLength];
        for(int i = 0; i < stringLength; i++){
            string[i] = chars[i];
        }
    }

    // +charAt(i: int) : char
    public char charAt(int i){
        return string[i];
    }

    // +length():int
    public int length(){
        return stringLength;
    }

    // +substring(begin: int, end: int) : MyString
    public MyString substring(int begin, int end){
        int subLength = end - begin;
        int count = 0;
        char[] sub = new char[subLength];

        for(int j = begin; j < end; j++){
            sub[count] = string[j];
            count++;
        }

        return new MyString(sub);
    }

    // +toLowerCase() : MyString
    public MyString toLowerCase(){
        char[] lowerCaseString = new char[stringLength];
        for(int i = 0; i < stringLength; i++){
            //using 'char' class toLowerCase()
            lowerCaseString[i] = Character.toLowerCase(string[i]); 
        }

        return new MyString(lowerCaseString);
    }

    // +equals(other: MyString) : Boolean
    public boolean equals(MyString s){

        if (s.length() != stringLength) {
            return false;
        }
        else{
            for (int i = 0; i < stringLength; i++) {
                if(s.string[i] != string[i]){
                    return false;
                }
            }
        }

        return true;
    }

    // +valueOf(i:  int) : MyString
    public static MyString valueOf(int i){
        int digits = 1;
        int temp = i;

        while(temp > 0){
            temp /= 10;
            digits++;
        }

        int[] integers = new int[digits];
        int count = 0;

        while(i > 0){
            integers[count] = i % 10;
            i /= 10;
            count++;
        }

        char[] chars = new char[count];
        int anotherCount = 0;
        for(int k = count-1; k >= 0; k--){
            chars[anotherCount] = Character.forDigit(integers[k], 10);
            anotherCount++;
        }

        return new MyString(chars);
    }
}
