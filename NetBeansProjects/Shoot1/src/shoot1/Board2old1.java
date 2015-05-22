/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;
//import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author s.mohanarajah0901
 */
public class Board2old1 extends JPanel {
/*      //private Timer timer;
      private GameEnvion GE;
      private int noOFballs=10;
      private int w;
      private int hLimit;
      private final double diam = 5.0;
      private Balls balls = new Balls();
      private java.util.Timer timer;
      private int landed=0;
      private int maxLanded=10;
      private Gun gun;

      public Board2old1(GameEnvion GE){
        this.GE=GE;
        setBackground(Color.YELLOW);
        this.setDoubleBuffered(true);
      }

      public void start(){
       Dimension size=GE.getSize();
       w=(int) size.getWidth();
       hLimit= (int)size.getHeight();
       //gun = new Gun(w/2,hLimit-5);
       balls.addBalls(noOFballs,w);
       timer=new java.util.Timer();
       timer.schedule(new moveNext(),2,50);
      }

      private class moveNext extends TimerTask {
       public void run() {
             repaint();
             balls.dropBalls(hLimit);
             balls.addBalls(noOFballs,w);
             System.out.println("in Move"+landed);
             if (landed==maxLanded) finished();
           }
       }

    private Graphics2D condition(Graphics g){
         Graphics2D g2 = (Graphics2D) g;
         RenderingHints rh =
            new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                               RenderingHints.VALUE_ANTIALIAS_ON);
         rh.put(RenderingHints.KEY_RENDERING,
             RenderingHints.VALUE_RENDER_QUALITY);
         g2.setRenderingHints(rh);
         return g2;
     }



     private void finished(){
         balls.clear();
         GE.finished();
         timer.cancel();
     }

     public void incLanded(){
         landed++;
     }

     public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=condition(g);
        balls.drawBalls(g2,this);
        //gun.drawGun(g2);
      }
*/
}
