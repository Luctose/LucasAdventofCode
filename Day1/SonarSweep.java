/*
Advent of Code
Day 1
Lucas Sarweh
Dec 01 2021
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solution to Day 1 problem of Advent of Code 2021
 */
public class SonarSweep
{
    public static void main(String[] args) throws FileNotFoundException{
        // Open a file for reading
        FileReader fl = new FileReader("testinput.txt");
        Scanner file = new Scanner(fl);
        int sum = 0;

        // Send the file contents to an ArrayList
        ArrayList<Integer> myList = new ArrayList<Integer>();
        // Store sliding windows in here
        ArrayList<Integer> newList = new ArrayList<Integer>();

        // Populate the list
        while(file.hasNext()){
            myList.add(file.nextInt());
        }

        // Close file
        file.close();

        // Populate the list of sliding windows
        for(int k = 2; k < myList.size(); k++){
            newList.add(myList.get(k) + myList.get(k - 1) + myList.get(k - 2));
        }

        // Check for increased depth
        for(int i = 1; i < newList.size(); i++){
            if(newList.get(i) - newList.get(i - 1) > 0){
                sum++; // Add to sum
            }
        }
        // Print result
        System.out.printf("The number of windowed increases is: %d", sum);
    }
}