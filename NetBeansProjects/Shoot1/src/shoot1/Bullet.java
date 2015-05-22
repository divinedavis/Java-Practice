/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

import java.awt.*;
/**
 *
 * @author s.mohanarajah0901
 */
public class Bullet extends Ball{ //bad inheritance
   private int speed;
   private double diam;
   private int angle;
   
   public Bullet(int x, int y, int s, double d, int a){
       super(x,y,d);
       diam=d;
       speed=s;
       angle=a;
       setColor(Color.GREEN);
   }

   public void moveUp(){ //moves only one direction
       yPos -= (int)(speed * Math.sin(Math.toRadians(angle)));
       xPos +=  (int)(speed * Math.cos(Math.toRadians(angle)));;
       
   }

   public void drawBullet(Graphics2D g){
       drawBall(g);
   }

   public boolean collide(Ball b){
      if ((Math.pow((b.xPos - xPos),2)+ Math.pow((b.yPos-yPos),2))< b.diam()*b.diam()){
            return true;
        } else {
            return false;
       }
    }

}
