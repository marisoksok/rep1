// Example with a panel of components  (JPanel).
package lesson09;

import javax.swing.JPanel; // Several swing components
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
//new imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimplePanelHandlingEvents extends JPanel {

    private JLabel label;
    private JButton button;
    private JTextField text;

    public SimplePanelHandlingEvents() { // Include components with its constructor.
        setLayout(null); // Remove default layout
        label = new JLabel("Name");
        label.setBounds(20, 20, 200, 30); // position (x,y) and size (width,heigth)
        add(label);
        text = new JTextField("Text");
        text.setBounds(80, 20, 150, 30);
        add(text);
        button = new JButton("Press");
        button.setBounds(20, 100, 100, 30);
        add(button);
        //New for events
        button.addActionListener(new ListenerHandler()); // registering a listener
        add(button);        
    }

    private class ListenerHandler implements ActionListener { // implement a listener locally
        private int i = 0;

        @Override
        public void actionPerformed(ActionEvent e) { //this method handles event e
            if (e.getSource() == button) { //the same listener can be registered
                i++; // for several components
                text.setText("Clicks: " + i);
            }
        }
    }
}
