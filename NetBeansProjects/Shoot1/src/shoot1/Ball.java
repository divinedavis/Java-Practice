/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

/**
 *
 * @author s.mohanarajah0901
 */

import java.awt.geom.*;
import java.awt.*;
import java.util.*;


public class Ball {
    protected int xPos;
    protected int yPos;
    private double diam; // change later to come from GameEnviron
    private Color c;

    public Ball(int x, int y, double d){
        xPos=x; yPos=y; diam=d;
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

   public int xPos(){
        return xPos;
    }
    public int yPos(){
        return yPos;
    }
    public double diam(){
        return diam;
    }

    public boolean collide(Ball b){
        if ((Math.abs(b.xPos - xPos) < diam ))
            return true;
        else
            return false;
    }

    public void setColor(Color c1){
        c=c1;
    }

}


