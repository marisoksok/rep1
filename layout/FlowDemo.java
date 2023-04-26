package lesson09.layout;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

//=============================================================================
/** This class demonstrates the Java Flow Layout Manager.
 *  @author Dr. Rick Coleman
 *  Date: February 2009
 */
//=============================================================================

public class FlowDemo extends JFrame
{
	/** Main panel for the demonstration */
	private JPanel m_MainPanel;
	
	/** Button 1 */
	private JButton m_Button1;
	
	/** Button 2 */
	private JButton m_Button2;

	/** Button 3 */
	private JButton m_Button3;

	/** Button 4 */
	private JButton m_Button4;

	/** Button 5 */
	private JButton m_Button5;
        
        
        /** Button 1 */
	private JButton m_Button6;
	
	/** Button 2 */
	private JButton m_Button7;

	/** Button 3 */
	private JButton m_Button8;

	/** Button 4 */
	private JButton m_Button9;

	/** Button 5 */
	private JButton m_Button10;

	//----------------------------------------------------------
	/** Default constructor */
	//----------------------------------------------------------
	public FlowDemo()
	{
		this.setSize(320, 240);
		this.setLocation(100, 150);
		this.setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Flow Layout Manager");
		this.setResizable(true);
		
		// Create the main panel
		m_MainPanel = new JPanel();
		m_MainPanel.setSize(320, 220);
		m_MainPanel.setLocation(0, 0);
		m_MainPanel.setLayout(new FlowLayout());
		m_MainPanel.setBackground(Color.LIGHT_GRAY);
		m_MainPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		this.getContentPane().add(m_MainPanel);

		// Create and add the button 1
		m_Button1 = new JButton("Button 1");
		m_Button1.setPreferredSize(new Dimension(100, 30));
		m_Button1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button1.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button1);

		// Create and add the button 2
		m_Button2 = new JButton("Button 2");
		m_Button2.setPreferredSize(new Dimension(100, 30));
		m_Button2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button2.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button2);

		// Create and add the button 3
		m_Button3 = new JButton("Button 3");
		m_Button3.setPreferredSize(new Dimension(100, 30));
		m_Button3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button3.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button3);

		// Create and add the button 4
		m_Button4 = new JButton("Button 4");
		m_Button4.setPreferredSize(new Dimension(100, 30));
		m_Button4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button4.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button4);

		// Create and add the button 5
		m_Button5 = new JButton("Button 5");
		m_Button5.setPreferredSize(new Dimension(100, 30));
		m_Button5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button5.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button5);
                
                
                // Create and add the button 6
		m_Button6 = new JButton("Button 6");
		m_Button6.setPreferredSize(new Dimension(100, 30));
		m_Button6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button6.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button6);

		// Create and add the button 7
		m_Button7 = new JButton("Button 7");
		m_Button7.setPreferredSize(new Dimension(100, 30));
		m_Button7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button7.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button7);

		// Create and add the button 8
		m_Button8 = new JButton("Button 8");
		m_Button8.setPreferredSize(new Dimension(100, 30));
		m_Button8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button8.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button8);

		// Create and add the button 9
		m_Button9 = new JButton("Button 9");
		m_Button9.setPreferredSize(new Dimension(100, 30));
		m_Button9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button9.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button9);

		// Create and add the button 10
		m_Button10 = new JButton("Button 10");
		m_Button10.setPreferredSize(new Dimension(100, 30));
		m_Button10.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		m_Button10.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
					}
				});
		m_MainPanel.add(m_Button10);
	}
}

