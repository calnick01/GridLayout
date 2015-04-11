/*
 * 
Requirements:
	- Create a class named GridLayoutDemo extends JFrame.
	- Create user interface using JPanels and JButtons.
	- Add the instances of 3 JButtons using GridLayout to JPanel named panel1 and other 3 instances of JButtons using GridLayout to JPanel named panel2. 
	- GridLayout of 2 rows and 2 colums
	- Add panel1 and panel2 to JFrame using BroderLayout, one panel in the south and another in the center of the frame, and set frame title to BorderLayout Demo.
	- Use pack method of JFrame, center the frame, and make the frame visible
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class GridLayoutDemo extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1, button2, button3, button4, button5, button6; 
	private JPanel panel1, panel2;
	public GridLayoutDemo()
	{
		setLayout(new GridLayout(2,2));	
		setSize(new Dimension(200,150));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLocationRelativeTo(null);
		setTitle("GridLayout Demo");
		
		button1=new JButton("Button 1");
		button2=new JButton("Button 2");
		button3=new JButton("Button 3");
		button4=new JButton("Button 4");
		button5=new JButton("Button 5");
		button6=new JButton("Button 6");
		
		panel1= new JPanel(new GridLayout(2,2));
		panel2= new JPanel(new GridLayout(2,2));
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		
		add(panel2,BorderLayout.CENTER);
		add(panel1,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args)
	{
		GridLayoutDemo gridLayoutTest = new GridLayoutDemo();
	}

}