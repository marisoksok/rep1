package lesson09.games.ballgame;

/**
 * Chapter 8: QuitButton.java
 * Lets the user quit a program.
 * A very simple illustration of the event-handler recipe, with no
 * user-defined responder objects.
 */
public class QuitButton extends javax.swing.JButton {//Fig. 8.11, Step 2
    public QuitButton() {
	  super("Quit");
	  this.addActionListener(new QuitListener());//Fig. 8.11, Step 5
    }

    // Fig. 8.11, Step 4
    private class QuitListener implements java.awt.event.ActionListener {
       @Override
       public void actionPerformed(java.awt.event.ActionEvent e) {
	   System.exit(0); // Fig. 8.11, Step 6
       }
   }
}
