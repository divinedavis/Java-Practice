/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shoot1;

import javax.swing.JFrame;


public class snake extends JFrame {

    public snake() {

        add(new Board());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 340);
        setLocationRelativeTo(null);
        setTitle("Snake");

        setResizable(false);
        setVisible(true);
    }

}
