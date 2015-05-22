/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shoot1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Object;
/**
 *
 * @author s.mohanarajah0901
 */ 

public class mcqDlg extends JDialog {
  private JPanel panel1 = new JPanel();
  private BorderLayout borderLayout1 = new BorderLayout();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();
  private JPanel jPanel3 = new JPanel();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private ButtonGroup bg= new ButtonGroup();
  private JRadioButton jRadioButton1 = new JRadioButton();
  private JRadioButton jRadioButton2 = new JRadioButton();
  private JRadioButton jRadioButton3 = new JRadioButton();
  private JRadioButton jRadioButton4 = new JRadioButton();
  private JButton OK = new JButton();
  private FlowLayout flowLayout1 = new FlowLayout();
  private JButton Cancel = new JButton();
  private BorderLayout borderLayout2 = new BorderLayout();
  private JRadioButton jRadioButton5 = new JRadioButton();
  private JRadioButton jRadioButton6 = new JRadioButton();
  private JRadioButton jRadioButton7 = new JRadioButton();
  private JRadioButton jRadioButton8 = new JRadioButton();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JSlider jSlider1 = new JSlider();
  private JSlider jSlider2 = new JSlider();
  private JSlider jSlider3 = new JSlider();
  private JSlider jSlider4 = new JSlider();
  private JSlider jSlider5 = new JSlider();
  private JSlider jSlider6 = new JSlider();
  private JSlider jSlider7 = new JSlider();
  private JSlider jSlider8 = new JSlider();
  private JLabel jLabel8 = new JLabel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JLabel jLabel11 = new JLabel();
  private JLabel jLabel12 = new JLabel();
  private JLabel jLabel13 = new JLabel();
  private JLabel jLabel14 = new JLabel();
  private JRadioButton jRadioButton9 = new JRadioButton();
  private JRadioButton jRadioButton10 = new JRadioButton();
  private JRadioButton jRadioButton11 = new JRadioButton();
  private JRadioButton jRadioButton12 = new JRadioButton();
  private JRadioButton jRadioButton13 = new JRadioButton();

  public mcqDlg(Frame frame, String title, boolean modal) {
    super(frame, title, modal); 
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  
  private void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    this.setTitle("MCQ Answer Dialog");
    jLabel1.setFont(new java.awt.Font("Serif", 3, 30));
    jLabel1.setForeground(Color.red);
    jLabel1.setText("Express Your Belief.");
    jPanel3.setLayout(flowLayout1);
    jPanel3.setBackground(new Color(236, 197, 144));
    jPanel3.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBackground(new Color(255, 200, 164));
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setLayout(borderLayout2);
    jPanel2.setBackground(new Color(203, 190, 175));
    jPanel2.setBorder(BorderFactory.createRaisedBevelBorder());
    jRadioButton1.setBackground(new Color(203, 190, 175));
    jRadioButton1.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton1.setForeground(new Color(0, 98, 158));
    jRadioButton1.setActionCommand("A1");
    jRadioButton2.setBackground(new Color(203, 190, 175));
    jRadioButton2.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton2.setForeground(new Color(0, 98, 158));
    jRadioButton2.setActionCommand("A2");
    jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton2_actionPerformed(e);
      }
    });
    jRadioButton3.setBackground(new Color(203, 190, 175));
    jRadioButton3.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton3.setForeground(new Color(0, 98, 158));
    jRadioButton3.setActionCommand("A3");
    jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton3_actionPerformed(e);
      }
    });
    jRadioButton4.setBackground(new Color(203, 190, 175));
    jRadioButton4.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton4.setForeground(new Color(0, 98, 158));
    jRadioButton4.setActionCommand("A4");
    jRadioButton3.setActionCommand("A3");
    OK.setBackground(new Color(255, 175, 125));
    OK.setFont(new java.awt.Font("Dialog", 1, 12));
    OK.setActionCommand("OK");
    OK.setText("OK");
    OK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        OK_actionPerformed(e);
      }
    });
    Cancel.setBackground(new Color(255, 175, 125));
    Cancel.setFont(new java.awt.Font("Dialog", 1, 12));
    Cancel.setActionCommand("Cancel");
    Cancel.setText("Cancel");
    Cancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Cancel_actionPerformed(e);
      }
    });
    jLabel2.setBackground(Color.orange);
    jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton5_actionPerformed(e);
      }
    });
    jRadioButton5.setActionCommand("A1");
    jRadioButton5.setForeground(new Color(0, 98, 158));
    jRadioButton5.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton5.setBackground(new Color(203, 190, 175));
    jRadioButton6.setActionCommand("A3");
    jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton6_actionPerformed(e);
      }
    });
    jRadioButton6.setActionCommand("A3");
    jRadioButton6.setForeground(new Color(0, 98, 158));
    jRadioButton6.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton6.setBackground(new Color(203, 190, 175));
    jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton7_actionPerformed(e);
      }
    });
    jRadioButton7.setActionCommand("A2");
    jRadioButton7.setForeground(new Color(0, 98, 158));
    jRadioButton7.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton7.setBackground(new Color(203, 190, 175));
    jRadioButton8.setActionCommand("A4");
    jRadioButton8.setForeground(new Color(0, 98, 158));
    jRadioButton8.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton8.setBackground(new Color(203, 190, 175));
    jLabel3.setFont(new java.awt.Font("SansSerif", 0, 20));
    jLabel3.setText("Answers");
    jLabel4.setFont(new java.awt.Font("Dialog", 0, 20));
    jLabel4.setText("[ 1 ]");
    jLabel5.setText("[ 2 ]");
    jLabel5.setFont(new java.awt.Font("Dialog", 0, 20));
    jLabel6.setText("[ 3 ]");
    jLabel6.setFont(new java.awt.Font("Dialog", 0, 20));
    jLabel7.setText("[ 4 ]");
    jLabel7.setFont(new java.awt.Font("Dialog", 0, 20));
    jLabel8.setText("Wrong");
    jLabel9.setText("Correct");
    jLabel10.setText("Not Sure");
    jLabel11.setText("100%");
    jLabel12.setText("100%");
    jLabel13.setText("0%");
    jLabel14.setText("0%");
    jRadioButton9.setActionCommand("A4");
    jRadioButton9.setForeground(new Color(0, 98, 158));
    jRadioButton9.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton9.setBackground(new Color(203, 190, 175));
    jRadioButton10.setActionCommand("A3");
    jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton10_actionPerformed(e);
      }
    });
    jRadioButton10.setActionCommand("A3");
    jRadioButton10.setForeground(new Color(0, 98, 158));
    jRadioButton10.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton10.setBackground(new Color(203, 190, 175));
    jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton11_actionPerformed(e);
      }
    });
    jRadioButton11.setActionCommand("A2");
    jRadioButton11.setForeground(new Color(0, 98, 158));
    jRadioButton11.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton11.setBackground(new Color(203, 190, 175));
    jRadioButton12.setActionCommand("A1");
    jRadioButton12.setForeground(new Color(0, 98, 158));
    jRadioButton12.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton12.setBackground(new Color(203, 190, 175));
    jRadioButton13.setBackground(new Color(203, 190, 175));
    jRadioButton13.setFont(new java.awt.Font("SansSerif", 1, 20));
    jRadioButton13.setForeground(new Color(0, 98, 158));
    jRadioButton13.setActionCommand("A3");
    jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButton13_actionPerformed(e);
      }
    });
    jRadioButton13.setActionCommand("A3");
    getContentPane().add(panel1);
    panel1.add(jPanel1, BorderLayout.SOUTH);
    jPanel1.add(Cancel, BorderLayout.WEST);
    jPanel1.add(OK, BorderLayout.EAST);
    jPanel1.add(jLabel2, BorderLayout.CENTER);
    panel1.add(jPanel2, BorderLayout.CENTER);
    //jPanel2.add(jRadioButton5,   new Constraints(92, 32, 22, 32));
    /*
    jPanel2.add(jRadioButton7,   new Constraint(92, 81, -1, -1));
    jPanel2.add(jRadioButton6,   new Constraint(92, 119, -1, -1));
    jPanel2.add(jRadioButton8,  new Constraint(92, 157, -1, -1));
    jPanel2.add(jLabel4,     new Constraint(15, 39, 50, 24));
    jPanel2.add(jLabel5,   new Constraint(15, 78, 50, 24));
    jPanel2.add(jLabel6,   new Constraint(15, 117, 50, 24));
    jPanel2.add(jLabel7,  new Constraint(15, 156, 50, 24));
    jPanel2.add(jSlider1,   new Constraint(118, 41, 82, 21));
    jPanel2.add(jSlider2,    new Constraint(221, 41, 82, 21));
    jPanel2.add(jSlider4,   new Constraint(118, 81, 82, 21));
    jPanel2.add(jSlider3,  new Constraint(220, 81, 83, 21));
    jPanel2.add(jSlider5,  new Constraint(218, 121, 85, 21));
    jPanel2.add(jSlider6,  new Constraint(118, 121, 83, 21));
    jPanel2.add(jSlider7,  new Constraint(219, 159, 83, 21));
    jPanel2.add(jSlider8,  new Constraint(117, 159, 83, 21));
    jPanel2.add(jRadioButton3, new Constraint(319, 122, -1, -1));
    jPanel2.add(jRadioButton1,  new Constraint(319, 33, 25, 32));
    jPanel2.add(jRadioButton2, new Constraint(319, 83, -1, -1));
    jPanel2.add(jRadioButton4, new Constraint(319, 161, -1, -1));
    jPanel2.add(jLabel10,       new Constraint(193, 5, 65, 35));
    jPanel2.add(jLabel11,     new Constraint(110, 171, 39, 35));
    jPanel2.add(jLabel12,   new Constraint(277, 173, 39, 35));
    jPanel2.add(jLabel14,  new Constraint(214, 171, 25, 35));
    jPanel2.add(jLabel13, new Constraint(195, 170, 24, 35));
    jPanel2.add(jLabel3,  new Constraint(7, 15, 106, 18));
    jPanel2.add(jLabel8, new Constraint(98, 8, 45, 35));
    jPanel2.add(jLabel9, new Constraint(291, 8, 45, 35));
    jPanel2.add(jRadioButton9, new Constraint(359, 191, -1, -1));
    jPanel2.add(jRadioButton10, new Constraint(204, 117, -1, -1));
    jPanel2.add(jRadioButton13, new Constraint(204, 157, -1, -1));
    jPanel2.add(jRadioButton11, new Constraint(204, 79, -1, -1));
    jPanel2.add(jRadioButton12, new Constraint(204, 34, 25, 32));
     
     * */
     
    panel1.add(jPanel3, BorderLayout.NORTH);
    jPanel3.add(jLabel1, null);
    bg.add(jRadioButton1); bg.add(jRadioButton2); bg.add(jRadioButton3);
    bg.add(jRadioButton4);

  }
  void jRadioButton2_actionPerformed(ActionEvent e){
  };

  void jRadioButton3_actionPerformed(ActionEvent e){
    };



  void OK_actionPerformed(ActionEvent e) {
    ButtonModel rB= bg.getSelection();
    if (rB!=null){
      char c=rB.getActionCommand().charAt(1);
      rB.setSelected(false);
      short selAnswer= (short)(c-48);
      //theM.processAnswer(selAnswer);
    }
  }

  void Cancel_actionPerformed(ActionEvent e) {
    this.setModal(false);this.setVisible(false);
  }

  void refresh(){
      jRadioButton1.setSelected(false);
      jRadioButton2.setSelected(false);
      jRadioButton3.setSelected(false);
      jRadioButton4.setSelected(false);
  }

  void jRadioButton5_actionPerformed(ActionEvent e) {

  }
  void jRadioButton6_actionPerformed(ActionEvent e) {

  }
  void jRadioButton7_actionPerformed(ActionEvent e) {

  }
  void jRadioButton10_actionPerformed(ActionEvent e) {

  }
  void jRadioButton11_actionPerformed(ActionEvent e) {

  }
  void jRadioButton13_actionPerformed(ActionEvent e) {

  }
}

