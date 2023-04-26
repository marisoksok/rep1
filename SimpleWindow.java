/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson09;

import javax.swing.JFrame;

public class SimpleWindow {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Example for a window");
        ventana.setSize(300, 200);
        ventana.add(new SimplePanel()); // including a panel that may contain several
        ventana.setVisible(true); // components (such as text, labels, buttons,....
    }
}