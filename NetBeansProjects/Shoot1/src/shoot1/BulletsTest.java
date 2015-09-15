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
public class BulletsTest {

    private int speed;
    private double diameter;
    private ArrayList<Bullet> bulletsA = new ArrayList<Bullet>();
    private SoundPlayer blast = new SoundPlayer("blast.wav");
   
    public BulletsTest (int s, double d){      
        speed=s;
        diameter=d;
       
    }

    public void blast(Balls balls){
         int i = bulletsA.size();
         while (i > 0){
                 Bullet bullet= bulletsA.get(i-1);
                 int j = balls.size();
                 OUT:
                 while (i>0 && j >0){
                     Ball ball= balls.get(j-1);
                     if (bullet.collide(ball)){
                           //b2.incShot();
                           bulletsA.remove(i-1);i--;
                           balls.remove(j-1);j--;
                           if (blast != null && !blast.isPlaying()) {
                               blast.play();
                           }
                     }
                     if (ball.yPos()- ball.diam()>bullet.yPos()){
                          break OUT;
                     }
                     j--;
                }
            i--;                 
         }
      }
    

   public synchronized void move(int h){
            for (int i = bulletsA.size()-1; i >= 0; i--) {
                 Bullet bullet= bulletsA.get(i);
                 if (bullet.yPos < h){
                     bulletsA.remove(i);
                 } else {
                     bullet.moveUp();
                 }
            }
   }
     
   public synchronized void drawBullets(Graphics2D g){
          for (int i = bulletsA.size()-1; i >= 0; i--) {
                 bulletsA.get(i).drawBullet(g);
          }
    }

   public void add(Bullet b){
     bulletsA.add(b);
   }

   public int size(){
       return bulletsA.size();
   }

   public int speed(){
      return speed;
   }
   public double diameter(){
      return diameter;
   }

   public void clear(){
      bulletsA.clear();
   }
   
  public Bullet get(int i){
      return bulletsA.get(i);
  }

}
