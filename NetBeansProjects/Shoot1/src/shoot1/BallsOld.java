/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;
import java.util.*;
//import java.util.concurrent.ConcurrentLinkedQueue;
import java.awt.*;

/**
 *
 * @author s.mohanarajah0901
 */
public class BallsOld {
    //private java.util.List balls = Collections.synchronizedList(new LinkedList());
    private LinkedList balls= new LinkedList();

    public void addBalls(int n, int w){
         Random rG = new Random();
         int i=0;
         while (i <n){
             int x=rG.nextInt(w-10)+5;
             ball1 ball=new ball1(x,0);
             if (noCollide(ball)){
                 balls.add(ball);
                 i++;
             }
         }
     }

    public void dropBalls(int h){
           Iterator i= balls.iterator();
            ball1 ball;
            while (i.hasNext()){
                 ball= (ball1)i.next();
                 ball.dropBall(h);
            }
     }


    public boolean noCollide(ball1 b1){
        Iterator i = balls.iterator();
        boolean c=true;
        while (i.hasNext()){
            ball1 b2 = (ball1) (i.next());
            if (b1.collide(b2)){
                c=false;
                break;
            }
         }
        return c;
    }

    public void drawBalls(Graphics2D g, Board2 b){
           Iterator i= balls.iterator();
           ball1 ball;
            while (i.hasNext()){
                 ball= (ball1)i.next();
                 if (ball.isOnBottom()){
                     i.remove();
                     //b.incLanded();
                 } else {
                     ball.drawBall(g);
                 }
              }
     }

  public void clear(){
      balls.clear();
  }

}
