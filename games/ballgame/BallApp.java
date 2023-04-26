package lesson09.games.ballgame;

/**
 * BallApp.java
 * Displays a window with a red circle on a white background. 
 */
public class BallApp extends javax.swing.JFrame {
  public BallApp (String title) {
    super(title);
    this.setSize(600, 450);
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.add(new BallPanel());
    this.setVisible(true);
  }

  public static void main (String [ ] args) {
    BallApp app = new BallApp ("Lesson 9: BallApp");
  }
}
