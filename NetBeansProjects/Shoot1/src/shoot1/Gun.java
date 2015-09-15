/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

import java.awt.geom.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author s.mohanarajah0901
 */
public class Gun {
    private Board2 B2;
    private int xPos;
    private int yPos;
    private int xPos1;
    private int yPos1;
    private int angle=90;
    private int rLimit=500, lLimit=0; // need to design moving gun
    private static int speed=8;
    private int h=15;
    private int w = 5;
//    private Color c = Color.red;
    //private Rectangle2D gun;
    private Image gun;
    private int bulletSp, bulletDi;
   

    public Gun(Board2 B, int x, int y, int w1, int h1, int bullS, int bullD){
        B2 = B;
        bulletSp=bullS; bulletDi= bullD;
        xPos=x; yPos=y;
        xPos1=xPos; yPos1=yPos-h1;
        //gun=new Rectangle2D.Double(xPos,yPos,w,h);
        try {
            gun = ImageIO.read(Gun.class.getResourceAsStream("/shoot1/Spaceship.png"));
        } catch (IOException ioe) {
            System.err.println("Unable to read spaceship file: " + ioe.getMessage());
            System.exit(1);
        }
        w=w1; h=h1;
    }

    public void drawGun(Graphics2D g){
         //gun.setRect(xPos, yPos, w, h);
        g.drawImage(gun, xPos, yPos - 15, 15, 18, null);
        //g.fill(gun);
         
     }

    public void moveLeft(){
        xPos-=speed;
        if (xPos < lLimit)
           xPos=lLimit;
        xPos1 = xPos;
     }
    
    public void moveRight(){
        xPos+=speed;
        if (xPos > rLimit)
           xPos = rLimit;
        xPos1 = xPos;
     }
    
     public void roRight(){
        angle-=speed;
        if (angle<0)
           angle=0;
        yPos1=  yPos- (int)(h * Math.sin(Math.toRadians(angle)));
        xPos1=  xPos + (int)(h * Math.cos(Math.toRadians(angle)));
     }
      public void roLeft(){
        angle+=speed;
        if (angle>180)
           angle=180;
        yPos1=  yPos- (int)(h * Math.sin(Math.toRadians(angle)));
        xPos1=  xPos + (int)(h * Math.cos(Math.toRadians(angle)));
     }


    public void fire(){
        Bullet b = new Bullet(xPos, yPos1, bulletSp, bulletDi, angle);
        B2.addBullet(b);
    }

}
