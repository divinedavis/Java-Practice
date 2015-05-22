/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

/**
 *
 * @author s.mohanarajah0901
 */
public class DropBall extends Ball{
     private int dropSpeed=0;
     public DropBall(int x, int y, double d, int s){
         super(x,y,d);
         dropSpeed=s;
     }

     public void dropBall(){
          yPos += dropSpeed;
     }

 }
