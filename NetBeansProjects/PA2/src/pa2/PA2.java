/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;
import javax.swing.JOptionPane;

/**
 *
 * @author divineDavis
 */

public class PA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //1
        JOptionPane.showMessageDialog(null, "Hello");
        String name = JOptionPane.showInputDialog("Please enter your first and last name");
        JOptionPane.showMessageDialog(null, "The length of your name is " + name.length() + " characters");
    
    }
    
}
