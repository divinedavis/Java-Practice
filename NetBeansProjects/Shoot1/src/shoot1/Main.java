/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author s.mohanarajah0901
 */
public class Main {
 public static String myName;
 public int Score = 0; 
    /**
     * @param args the command line arguments
     */

 /*
 public static void test1(){ // to test fire
        BulletsTest bT= new BulletsTest(5,10); 
        Bullet b =new Bullet(100, 105, 5, 3, 90);
        bT.add(b);
    }
 
 public static void main(String[] args) {
     test1();
  }

 */
 public static void main(String[] args) {
        myName= JOptionPane.showInputDialog("Enter Your Name Please:");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instruction(myName).setVisible(true);
                 /* Set the Nimbus look and feel */
                    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

            }

        });
    }
 
 
}


 
