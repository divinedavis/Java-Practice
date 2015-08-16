/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author s.mohanarajah0901
 */
public class Board2 extends JPanel implements Runnable{
      private boolean cwon=false, pwon=false;
      private GameEnvironment GE; //debug
      private int shot=0;
      private int w;
      private int hLimit;
      private double diam = 20; //changing diam makes crash
      //private int maxBombTimes=10;
      private int bombedTimes=0;
      private int droppedBombs=0;
      private int maxBombsDrop=20;
      private int noOFballs=4;// planes
      private int dropBallSpeed=3;
      private int ballsAddSpeed=80;
      private int dropDelayTime=50;
      private int maxLanded=10; //decides loosing - is it 10 landed?
      //private int maxShot=10; // decides winning
      //private int maxWinBalls=maxLanded+maxShot; // to stop adding balls
      private Balls balls=new Balls(maxBombsDrop,dropBallSpeed,diam); //maximum balls;
      private int bltSpeed=10;
      private int bltDiam=5;
      private Bullets bullets= new Bullets(this, bltSpeed,bltDiam); //maximum balls;
      //private int gunW=5, gunH=15;
      private Gun gun =new Gun(this, 300,490,5, 10, bltSpeed, bltDiam);//width,height;
      private Thread running;
      private boolean quit=false;
      

     public Board2(GameEnvironment GE, int state){
        setPreferredSize(new Dimension(600,500));
        this.GE=GE;
        setBackground(Color.YELLOW);
        this.setDoubleBuffered(true);
        Dimension size=GE.getSize();
        w=(int) size.getWidth();
        hLimit= (int)size.getHeight();
       
        addKeyListener(new KeyAdapter()  {
            @Override
            public void keyPressed(KeyEvent evt) {
                    boardAction(evt); //debug
            }
        });
      }  
      
     public void start(){
       balls.addBalls(noOFballs,w);
       droppedBombs=noOFballs;// assume maxBobsDrop>noOFballs
       if (running ==null){
          running= new Thread(this);
          running.start();
        }
    }

    public void run(){
        int i=0;
        quit=false;
        while ((!gameOver()) && (!quit)) {
                i++;
                updateCanvas(i);
                pause();
                repaint();
            }
        running=null;    
        gameFinished();          
   }
    
    private void pause(){
        try {
                Thread.sleep(dropDelayTime);
            } catch (InterruptedException e){
                String why = null;
                Throwable cause = e.getCause();
                if (cause != null) {
                    why = cause.getMessage();
                } else {
                    why = e.getMessage();
                }
                System.err.println("Error Thread Sleep: " + why);
                System.exit(0);
            }
    }

    private boolean gameOver(){
        cwon=(balls.landed()>= maxLanded); //computer wins
        pwon= (balls.size()==0);//old bombedTimes > maxBombTimes); // old (shot > maxShot); // person wins
        return (cwon || pwon);
    }
    
     private void updateCanvas(int i){
          balls.dropBalls(hLimit);
          bullets.move(0); //upper limit is zero
          bullets.blast(balls);
          int n = maxBombsDrop - droppedBombs;
          if (n <= 0) return;
          if (n > noOFballs)
              n=noOFballs;
          if (i%ballsAddSpeed==0){
                bombedTimes++;
                balls.addBalls(n,w);
                droppedBombs+=n;
          }
      }
     
     public void defaultParaSet(){
      maxBombsDrop=20;
      noOFballs=4;// planes
      dropBallSpeed=3;
      ballsAddSpeed=80;
      dropDelayTime=50;
      maxLanded=10;
     }
     
     private void boardAction(KeyEvent evt){  //will be repainted
      switch (evt.getKeyCode()) {
           case KeyEvent.VK_Q:
                quit=true;
                break;
           case KeyEvent.VK_B:
                if (GE.state()!= 1)
                        gun.fire();
                break;
           case KeyEvent.VK_UP:
                if (GE.state()!= 1)
                        gun.fire();
                break;
           case KeyEvent.VK_LEFT:
                if (GE.state()==2)
                    gun.roRight();
                else
                    gun.roLeft();
                break;
           case KeyEvent.VK_RIGHT:
                if (GE.state()==2)
                    gun.roLeft();
                else
                    gun.roRight();
                break;
           case KeyEvent.VK_Z:
                if (GE.state()==2)
                    gun.roRight();
                else
                    gun.roLeft();
                break;
           case KeyEvent.VK_M:
                if (GE.state()==2)
                    gun.roLeft();
                else
                    gun.roRight();
                break;   
               
               
        }
      }

    private Graphics2D condition(Graphics g){
         Graphics2D g2 = (Graphics2D) g; //debug
         RenderingHints rh =
            new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                               RenderingHints.VALUE_ANTIALIAS_ON);
         rh.put(RenderingHints.KEY_RENDERING,
             RenderingHints.VALUE_RENDER_QUALITY);
         g2.setRenderingHints(rh);
         return g2;
     }

     private void gameFinished(){
         refresh();
         GE.gameFinished();
     }
      
     private void refresh(){
         balls.clear();
     }
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=condition(g);
        drawCanvas(g2);
      }
     
     private void drawCanvas(Graphics2D g2){
        //g2.drawString(Integer.toString(bullets.size()),50,50);  
        balls.drawBalls(g2);
        //g2.drawString(Integer.toString(bullets.size()), 50, 50);
        if (bullets.size() >0)
            bullets.drawBullets(g2);
        gun.drawGun(g2);
        //bullets.drawBullets(g2);
     }
     
      public int shot(){
       return shot;
      }
      
      public void incShot(){
          shot++;
      }
      
      public void setDropDelayTime(int newT){
          dropDelayTime=newT;
      }
      
      public void setDropBallSpeed(int newT){
          dropBallSpeed=newT;
          //System.out.println("dropBallSpeed="+newT);
      }
      public void incBallAddSpeed(int newT){
          ballsAddSpeed += newT;
          //System.out.println("BallsAddSpeed="+newT);
      } 
     
      public void setNoOfBalls(int newB){
          noOFballs=newB;
          //System.out.println("NoOFBalls="+newB);
      } 
      public boolean cwon(){
          return cwon;
      }
      public boolean pwon(){
          return pwon;
      }
      
      public int landed(){
          return balls.landed();
      }
      
      public void addBullet(Bullet b){
          bullets.add(b);
      }
      
      
 }
/*Semaphore sem1= new Semaphore(1,true);
           try {
                sem1.acquire();
            } catch (InterruptedException e){};
            * */
//timer=new java.util.Timer();
        //timer.schedule(new moveNext(),2,50);



      /*
      private class moveNext extends TimerTask {
       public void run() {
             repaint();
             balls.dropBalls(hLimit);
             balls.addBalls(noOFballs,w);
             System.out.println("in Move"+landed);
             if (landed==maxLanded) finished();
           }
       }
       */

