// Example with a panel of components  (JPanel).
package lesson09;
import javax.swing.JPanel; // Several swing components
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimplePanel extends JPanel {

    private JLabel label;
    private JButton button;
    private JTextField text;

    public SimplePanel() { // Include components with its constructor.
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
    }
}
