/*  A graphical application that rolls and draws a die
    Anderson, Franceschi
*/

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class RollDie extends JFrame
{
  public void paint( Graphics g )
  {
     super.paint( g );

     Random random = new Random( );
     int roll = random.nextInt( 6 ) + 1;
     final int START_X = 150, START_Y = 100, ROLL_Y = 80;
     final int DIE_SIZE = 60, DOT_SIZE = 10;
     final int DOT_1 = DOT_SIZE / 2, 
               DOT_2 = DIE_SIZE / 2 - DOT_SIZE / 2, 
               DOT_3 = DIE_SIZE - DOT_SIZE / 2 - DOT_SIZE;
     g.setColor( Color.PINK ); // die will be pink
     // draw the die 
     g.fillRect( START_X, START_Y, DIE_SIZE, DIE_SIZE );

     g.setColor(  Color.BLACK ); // dots will be black 
     switch ( roll )
     {
       case 5:  // draw upper right, lower left dots
         g.fillRect( START_X + DOT_3, START_Y + DOT_1, 
                     DOT_SIZE, DOT_SIZE );
         g.fillRect( START_X + DOT_1, START_Y + DOT_3, 
                     DOT_SIZE, DOT_SIZE );
       case 3:  // draw upper left, lower right dots       
         g.fillRect( START_X + DOT_1, START_Y + DOT_1, 
                     DOT_SIZE, DOT_SIZE );
         g.fillRect( START_X + DOT_3, START_Y + DOT_3, 
                     DOT_SIZE, DOT_SIZE );    
       case 1:  // draw the center dot
         g.fillRect( START_X + DOT_2, START_Y + DOT_2, 
                     DOT_SIZE, DOT_SIZE );
         break; // stop executing the switch

       case 6:  // draw middle left and right dots
         g.fillRect( START_X + DOT_1, START_Y + DOT_2, 
                     DOT_SIZE, DOT_SIZE );
         g.fillRect( START_X + DOT_3, START_Y + DOT_2, 
                     DOT_SIZE, DOT_SIZE );
       case 4:  // draw upper right and lower left dots       
         g.fillRect( START_X + DOT_3, START_Y + DOT_1, 
                     DOT_SIZE, DOT_SIZE );
         g.fillRect( START_X + DOT_1, START_Y + DOT_3, 
                     DOT_SIZE, DOT_SIZE );
       case 2:  // draw upper left and lower right dots
         g.fillRect( START_X + DOT_1, START_Y + DOT_1, 
                     DOT_SIZE, DOT_SIZE );
         g.fillRect( START_X + DOT_3, START_Y + DOT_3, 
                     DOT_SIZE, DOT_SIZE );
         break; // stop executing the switch
     } 
     // display the roll number
     g.drawString( "The roll is " + roll, START_X, ROLL_Y );
  }
  
  public static void main( String [] args )
  {
    RollDie rollDie = new RollDie( );
    rollDie.setSize( 400, 250 );
    rollDie.setVisible( true );
  }
}