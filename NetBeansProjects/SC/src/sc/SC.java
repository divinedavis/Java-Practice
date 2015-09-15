/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc;

import javax.swing.JFrame;

/**
 *
 * @author divineDavis
 */
public class SC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SimpleDateClient app = new SimpleDateClient( );
    
    app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    app.workWithDates( );
  }
    
}
