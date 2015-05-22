/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//Ball OLD
package shoot1;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author s.mohanarajah0901
 */
public class ball1 {
    private boolean onBottom=false;
    private int xPos;
    private int yPos;
    private static int speed=2;
    private static int diam=10;
    private Color c;

    public ball1(int x, int y){
        xPos=x; yPos=y;
        Random r = new Random();
        c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
    }

    public void drawBall(Graphics2D g){
         Ellipse2D  ball = new Ellipse2D.Double(xPos,yPos,diam, diam);
         g.setStroke(new BasicStroke(1));
         g.setColor(c);
         g.fill(ball);
         g.draw(ball);
    }

    public ball1 dropBall(int yLimit){
        if (yPos==yLimit)
            onBottom=true;
        else
            yPos+=speed;
        return this;
    }

    public boolean isOnBottom(){
        return onBottom;
    }

    public int xPos(){
        return xPos;
    }
    public int yPos(){
        return yPos;
    }
    public int diam(){
        return diam;
    }

    public boolean collide(ball1 b){
        if ((Math.abs(b.xPos - xPos) < diam ))
            return true;
        else
            return false;
    }

}
