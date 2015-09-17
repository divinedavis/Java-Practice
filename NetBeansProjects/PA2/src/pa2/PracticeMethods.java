package pa2;

import javax.swing.JOptionPane;

/* Chapter 3 Programming Activity 2
   Calling class methods
   Anderson, Franceschi
*/

// ***** add your import statements here

public class PracticeMethods
{
  public static void main( String [] args )
  {
    //*****
    // 1.  a. Create a Scanner object to read from the console
    //     b. Prompt the user for their first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    JOptionPane.showMessageDialog(null, "Hello");
        String name = JOptionPane.showInputDialog("Please enter your first and last name");
        JOptionPane.showMessageDialog(null, "The length of your name is " + name.length() + " characters");
    
        String birthYear = JOptionPane.showInputDialog(name + ", enter your birth year below");
        int age = Integer.parseInt(birthYear);
        int newAge = 2015 - age;
        JOptionPane.showMessageDialog(null, "This year you will be " + ++newAge);
        final double AVERAGE_LIFE_EXPECTANCY = 78.7;
        double ageInPercentage = (newAge/AVERAGE_LIFE_EXPECTANCY);
        JOptionPane.showMessageDialog(null, "The percentage of life you have left to live is: " + ageInPercentage);

    //*****
    // 2.  a. Skip a line, then prompt the user for the year
    //            they were born.
    //     b. Calculate and print the age the user will be this year.
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.7.
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    //       Use the DecimalFormat class to format the percentage

    //*****
    // 3.  a. Generate a random integer between 1 and 20
    //     b. Pop up an input dialog box and ask the user for a guess.
    //     c. Pop up an output dialog box telling the user the number
    //         and how far from the number the guess was (hint: 
    //         use Math.abs)

  }
}