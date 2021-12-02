/*
Advent of Code
Day 2
Lucas Sarweh
Dec 02 2021
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Day 2 solution of Advent of Code
 */
public class Dive 
{
    public static void main(String[] args) throws FileNotFoundException{

        // First open the file
        FileReader fl = new FileReader("input.txt");
        Scanner file = new Scanner(fl);

        // Define variables and lists
        ArrayList<String> mylist = new ArrayList<String>();
        int horPos = 0;
        int depth = 0;
        int aim = 0;
        String[] buffer = new String[2];

        // Extract file
        while(file.hasNext()){
            mylist.add(file.nextLine());
        }

        // Close file
        file.close();

        // Determine if we go forward up or down
        for(String val : mylist){
            buffer = val.split(" ");
            if(buffer[0].equals("forward")){
                horPos += Integer.parseInt(buffer[1]);
                depth += (aim * Integer.parseInt(buffer[1]));
            }else if(buffer[0].equals("up")){
                aim -= Integer.parseInt(buffer[1]);
            }else if(buffer[0].equals("down")){
                aim += Integer.parseInt(buffer[1]);
            }
        }

        // Print product of results
        System.out.printf("Product of the two values: %d", horPos * depth);
    }
}
