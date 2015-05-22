/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;
import java.util.*;
import java.awt.*;
/**
 *
 * @author s.mohanarajah0901
 */
public class Balls {
    //private java.util.List balls = Collections.synchronizedList(new LinkedList());
    private ArrayList<DropBall> balls= new ArrayList<DropBall>();
    private int maxBalls=0; //not used?
    private int dropSpeed=0;
    private double diameter=0;
    private int landed=0;

    public Balls (int mb, int s, double d){
        maxBalls=mb;
        dropSpeed=s;
        diameter=d;
    }

    public synchronized void addBalls(int nBalls, int w){ //noOfBalls, width
         Random rG = new Random();
         int i=0;
         while (i < nBalls){
             int x=rG.nextInt(w-10)+5;
             DropBall ball=new DropBall(x,0, diameter,dropSpeed);
             if (noCollide(ball)){
                 balls.add(ball);
                 i++;
             }
         }
     }
    public synchronized void dropBalls(int h){
            for (int i = balls.size()-1; i >= 0; i--) {
                DropBall dball = balls.get(i);
                if (dball.yPos>h){
                     balls.remove(i);
                     landed++;
                } else
                     dball.dropBall();
             }
     }
     
   public boolean noCollide(Ball b){
         boolean c=true;
         for (int i = balls.size()-1; i >= 0; i--) {
            Ball ball= balls.get(i);
            if (ball.collide(b)){
                c=false;
                break;
            }
         }
        return c;
    }

    public synchronized void drawBalls(Graphics2D g){
          for (int i = balls.size()-1; i >= 0; i--) {
                 balls.get(i).drawBall(g);
         }
     }
     
   public int landed(){
        return landed;
    }

    public int size(){
       return balls.size();
    }

    public Ball get (int i){
        return balls.get(i);
    }

    public void remove(int i){
        balls.remove(i);
    }

  public void clear(){
      balls.clear();
  }

}
