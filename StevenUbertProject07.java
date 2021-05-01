
/**
 * The	purpose	for this project is to reinforce the knowledge learned in Chapter 7.
 * Apply linear search algorithm
 * Apply select sort algorithm
 * Apply array iteration skill
 *
 * @author Steven Ubert
 * @version 3/21/2021
 */

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class StevenUbertProject07 {
  
    public static int randomNumberInRange(int min, int max) 
    {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    
    public static void printArray(int arr[]) 
    {
        int i;
        for(i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }  
    }
    
    public static int smallest(int arr[]) 
    {
        int smallest = arr[0];
        int i;
        for(i = 1; i < arr.length; i++) 
        {
            if(arr[i] < smallest) 
            {
                smallest = arr[i];
            }
        }
    return smallest;
    }   
  
    public static int largst(int arr[]) 
    {
        int largest = arr[0];
        int i;
        for(i = 1; i < arr.length; i++) 
        {
            if(arr[i]> largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
      
    public static int range(int arr[]) 
    {
        return largst(arr) - smallest(arr);
    }
      
    public static double average(int arr[]) 
    {
    int i;
    int sum =0;
        for(i=0; i<arr.length; i++)
            sum += arr[i];
    return (sum/arr.length);   
    }
  
    public static int linearSearch(int arr[], int key) 
    {
        int i;
        for(i = 0; i < arr.length; i++) 
        {
            if(arr[i] == key) 
            {
                return i+1;
            }
        }
        return (-1);
    }
  
    public static void selectSort(int arr[]) 
    {
    int n = arr.length;
    
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++)
    {
        // Find the minimum element in unsorted array
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (arr[j] < arr[min_idx])
        min_idx = j;
          
        // Swap the found minimum element with the first
        // element
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
    }
    
    public static void initializeArray(int arr[]) 
    {
        int i;
        for(i = 0; i < arr.length; i++) {
            arr[i] = randomNumberInRange(1,100);
        }
    }
  
    public static void main(String args[]) 
    {
        int array[];
        array = new int[10];
        int i, key;
        Scanner in = new Scanner(System.in);
          
        initializeArray(array);
        printArray(array);
        System.out.println("largest - " + largst(array) + " smallest - " + smallest(array));
        System.out.println("range - " + range(array));
        System.out.println("Average - "+ average(array));
        System.out.println("Enter a search key: ");
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        int result = StevenUbertProject07.linearSearch(array, key);
            if(result != -1){
            System.out.println("The index of the first occurence of the key in "
                    + "the array is " + result);            
                }
                else{
                    System.out.println("The key is not present in the array.");
                }
        System.out.println(key);
        System.out.println(linearSearch(array, key));
        selectSort(array);
        printArray(array);
    }
}



