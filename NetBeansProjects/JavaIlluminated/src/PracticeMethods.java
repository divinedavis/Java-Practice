
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

// ***** add your import statements here

public class PracticeMethods
{
  public static void main( String [] args )
  {
      final double LIFE_EXPECTANCY = 78.7;
      
    //*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    // Your code goes here
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your first name");
      String firstName = scan.nextLine();
      System.out.println("Hello " + firstName + ", you have " + firstName.length() + " characters in your name.\n");
      
      

    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.7.
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage

      System.out.println("\nWhat year were you born? ");
      int age = scan.nextInt();
        
      System.out.println("You will be " + (age - 2016) + " this year");
      DecimalFormat percentage = new DecimalFormat("0.0#%");
      
      
    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: 
    //         use Math.abs)
      
      Random random = new Random();

      int number = random.nextInt(20) + 1;
      
  }
}