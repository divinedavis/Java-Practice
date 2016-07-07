/* An applet shell
   Anderson, Franceschi
*/

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class ShellApplet extends JApplet
{
  public void paint( Graphics g )
  {
    super.paint( g );
    // include graphics code here
    g.drawRect(40, 40, 90, 50);
    g.drawRect(20, 20, 200, 40);
    
    g.drawOval(80, 80, 120, 160);
    g.drawString("Hi, my name is Divine", 45, 78);
    
  }
}