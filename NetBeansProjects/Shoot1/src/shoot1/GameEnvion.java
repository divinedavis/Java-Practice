/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;
import javax.swing.*;
/**
 *
 * @author s.mohanarajah0901
 */
public class GameEnvion extends JFrame {
    private instruction instFrame;
    private Board2 b2;
    private ScoreBoard SB;
    private P1ScoreBoard p1SB;
    private int totShot=0;
    private int gameNo=0;
    private int maxGames=3;
    private int score=0;
    private int incScore=10;
    private int gScore=20;
    private int gIncScore=20;
    private int gWin=0;
    private int state=0;
    private int phase=0; // 0 -trial; 
    private int lastP1State=2;
    private int lastState=5; //lastP1State+maxGames
    private int totCorrect=0;
    private boolean[] correct= new boolean[10];
    private int[] answer = {0,4,2,3,4,4,2,1,3,4}; //first 0 for trial game
    //String[] msg={" ","The bombs are comming down very fast- you may slow down them- answer the next questions!"};
    
    public GameEnvion(instruction I){
        instFrame=I;
        setTitle("Learning Conditional Branching by Shooting Ballons");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        trialGame();
      }
    
    private void trialGame(){
       createBoard();
       //b2.setDropBallSpeed(2);
       int result = JOptionPane.showConfirmDialog(this, "Do you want to play a trial game?" , "Practice", JOptionPane.YES_NO_CANCEL_OPTION);
       if (result == JOptionPane.YES_OPTION){
           b2.start();
       } else if (result == JOptionPane.NO_OPTION){
                phase=1; state=0;
                remove(b2);
                //JOptionPane.showMessageDialog(null,"You are in PHASE1(Error Fixing Phase) now.  You may need to fix some errors in the game");
                phase1();
            } else
                showEnd();  
    }
    
    private void showEnd(){
        JOptionPane.showMessageDialog(null, "End Session");
        if (instFrame !=null)
            instFrame.dispose();
        System.exit(0);
    }
    
   private void phase1(){
        state++;
        createBoard();
        switch (state) {
            case 1:  JOptionPane.showMessageDialog(null, "Phase 1: " + " Jonny wrote the algorithm and he made a mistake: Find the error and fix it! <<Press Q to quit>>");
                     break;
            case 2:  JOptionPane.showMessageDialog(null, "Phase 1: " + " Okay, Jonny made another mistake: find it and fix it again! <<Press Q to quit>>");
                     break;                
            default: {}; // do these if expr != any above
        }
        b2.start();
    }
    
    private void phase2(){     
        gameNo++;
        createBoard();
        JOptionPane.showMessageDialog(null, "Game Number : "+ gameNo+ "Ready to start the game? Press ok!");
        if (p1SB!=null) p1SB.dispose();
        setRealGame();
        b2.start();
    }
    private void createBoard(){
        b2=new Board2(this,state);
        add(b2);
        pack();
        setVisible(true);
        b2.requestFocus();
    }   
    
    public void setRealGame(){
       switch (gameNo) {
            case 1:  b2.setDropBallSpeed(8);break;
            case 2:  if (correct[3]){
                        JOptionPane.showMessageDialog(null, "Congratulations! Since you answered correctly, the planes will drop bombs slowly");
                         b2.incBallAddSpeed(40);
                     } else {
                        JOptionPane.showMessageDialog(null, "Sorry! Since your answer was wrong, the planes will drop bombs very fast");
                         b2.incBallAddSpeed(-40);
                     }
                     break;
            case 3:  if (correct[4]){
                        JOptionPane.showMessageDialog(null, "Congratulations! Since you answered correctly, only 2 planes will bomb at a time");
                        b2.setNoOfBalls(2);
                     } else {
                        JOptionPane.showMessageDialog(null, "Sorry! You didn't answer correctly, 6 Planes will bomb at a time");
                        b2.setNoOfBalls(6);
                     }
                     break;
            default: {}; // do these if expr != any above
        }  
    }
    
    public void gameFinished(){
        if (phase==0)
            trialGameFinished();
        else if (phase==1)
            phase1Finished();
        else
            phase2Finished();
    }
    
    public void trialGameFinished(){
        phase=1; 
        remove(b2);
        setVisible(false);
        totShot += b2.shot();
        if (b2.cwon()){
            JOptionPane.showMessageDialog(null, "GAME FINISHED!!!! The Village was bombarded, try to help the next village.");
            JOptionPane.showMessageDialog(null, "In the last game you destroyed " +b2.shot()+
                                       " bombs! So far you have destroyed " + totShot+ " bombs.");
        }else{
            JOptionPane.showMessageDialog(null, "WELL DONE!!!! The Planes flew away: Only " + b2.landed() + " reached the sand, the village is saved. You won the Game!"); 
        }
        JOptionPane.showMessageDialog(null,"Trial game is over! You are in Phase 1 now. You may need to Fix some ERRORS in the game <<if you know the error already press Q to quit the current game"); 
        phase1();
    }    
    
    public void phase1Finished(){
        remove(b2);
        setVisible(false);
        if (state>lastP1State){
            phase=2;
            return;
        }
        switch (state) {
            case 1:  JOptionPane.showMessageDialog(null, "Phase 1: "+ state+ "GAME OVER: Have you found the ERROR?: Unable to FIRE the GUN! -help Jonny to fix it now!!");
                     qu1();
                     break;
            case 2:  JOptionPane.showMessageDialog(null, "Phase 1: "+ state+ "GAME OVER: Have you found the ERROR? The LEFT and RIGHT ARROW Keys are moving the GUN in opposite directions!!! - help Jonny again");
                     if (p1SB != null) p1SB.dispose();
                     qu2();
                     break;                
            default: {}; // do these if expr != any above
        }
     }
    
    public void phase2Finished(){
        remove(b2);
        setVisible(false);
        totShot+=b2.shot();
        if (b2.cwon()){
            JOptionPane.showMessageDialog(null, "GAME FINISHED!!!! The Village was bombarded- help the next village.");
            JOptionPane.showMessageDialog(null, "In the last game you destroyed " +b2.shot()+
                                       " bombs! So far you have destroyed " + totShot+ " bombs.");
        }else{
            JOptionPane.showMessageDialog(null, "WELDONE!!!! The Planes flew away: Only " + b2.landed() + " reached the sand - Village is saved: You won the Game!!");
            gScore+=gIncScore;
            gWin++;
        }
        //JOptionPane.showMessageDialog(null, msg[gameNo]); 
        showScoreBoard();
        if (gameNo==maxGames){ // check allOver
                JOptionPane.showMessageDialog(null, "You completed all of your games!");
        } else
              displayQ(); // display the next question  
    }
     
    public boolean allOver(){
        return (state==lastState);
    }
    private void displayQ() {
        switch (gameNo) {
            case 1: qu3(); break;
            case 2: qu4(); break;
            default: {}; // do these if expr != any above
        } 
    }
    
    public boolean[] correct(){
        return correct;
    }
    
    public void setCorrect(int i, boolean t){
        correct[i]=t;
    }
    
    public int state(){
        return state;
    }
    public int[] answers(){
        return answer;
    }
    private void qu1(){
        new ques1(this).setVisible(true);
    }
     private void qu2(){
        new quess2(this).setVisible(true);
    }
    private void qu3(){
        new quess3(this).setVisible(true);
    }
    private void qu4(){
        new quess4(this).setVisible(true);
    }
    public void giveFeedback(javax.swing.JFrame qframe){
        if (correct[state]){
            score+=incScore;
            totCorrect++;
            JOptionPane.showMessageDialog(null, "Weldone! Your answer option [" + answer[state] + "] is correct!! Your current score is " +  score);
        } else {
            JOptionPane.showMessageDialog(null, "You missed it! The correct answer is option " + answer[state]);          
        }
        qframe.dispose();
        if (phase==1)
            giveP1Feedback();
        else
            giveGFeedback();   
    }
    public void giveP1Feedback(){
        showP1ScoreBoard();
        if (state==lastP1State){
            phase=2;
            JOptionPane.showMessageDialog(null, "Phase-1(Error correcting phase) is over. We are moving to Phase 2- Play some real games now!");   
        }
        if (phase==1){
                phase1();
        }else if (phase==2){
                if (p1SB != null) p1SB.dispose(); 
                nextGame();
             }
     }
     
   public void giveGFeedback(){
         showScoreBoard();
         nextGame();      
     }
    
   private void showScoreBoard(){
       final GameEnvion G=this; 
       if (SB != null) SB.dispose();
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SB = new ScoreBoard(G);
                SB.setSB(score,totCorrect,totShot,score+totShot+gScore,maxGames-gameNo, gWin, gScore);
                SB.setVisible(true);
            }
        });
       
    }
   
   private void showP1ScoreBoard(){
       final GameEnvion G=this;
       if (p1SB != null) p1SB.dispose();
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                p1SB = new P1ScoreBoard(G);
                p1SB.setP1SB(score,totCorrect,totShot,score+totShot);
                p1SB.setVisible(true);
            }
        });
       
    }
   
   public void nextGame(){
       setVisible(true);
       if (allOver())
           showEnd();
       phase2();
     }
   
  }
