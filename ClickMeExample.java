/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class ClickMeExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = (JPanel) frame.getContentPane();
        JButton button = new JButton("Click me");
        button.setBackground(Color.yellow);
        contentPane.add(button,BorderLayout.NORTH);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
