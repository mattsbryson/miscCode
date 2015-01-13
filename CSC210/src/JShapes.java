

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;



public class JShapes extends JFrame
{
	
	JPanel Buttons = new JPanel();
	DPanel Shapes = new DPanel();
	
	public JShapes()
	{
		
		
		
		setLayout(new BorderLayout());
		
		add(Buttons, BorderLayout.SOUTH);
		add(Shapes, BorderLayout.NORTH);
		Shapes.setBorder(new LineBorder(Color.black,2));
		
		SquareListener SquareL = new SquareListener();
		CircleListener CircleL = new CircleListener();
		TriangleListener TriangleL = new TriangleListener();
		
		JButton S = new JButton("Square");
		JButton C = new JButton("Circle");
		JButton T = new JButton("Triangle");
		S.addActionListener(SquareL);
		C.addActionListener(CircleL);
		T.addActionListener(TriangleL);
		
		Buttons.add(S);
		Buttons.add(C);
		Buttons.add(T);
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	class SquareListener implements ActionListener
	{
		public void actionPerformed(ActionEvent A)
		{
			repaint();
			
			
		}
	}
	
	
	class DPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawRect(40, 40, 30, 30);
		}
	}
	
}
	


class CircleListener implements ActionListener
{
	public void actionPerformed(ActionEvent A)
	{
		System.out.println("TestC");
	}
}

class TriangleListener implements ActionListener
{
	public void actionPerformed(ActionEvent A)
	{
		System.out.println("TestT");
	}
}

