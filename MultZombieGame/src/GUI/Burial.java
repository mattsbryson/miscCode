package GUI;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Canvas;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;


import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Burial extends JFrame {

	
	static String name; 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void run(final String n) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name = n;
					Option3City frame = new Option3City();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Burial() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel lblYouSeeOn = new JLabel("You decide it best to at least bury Randall and say a few kind words, though you hardly knew him.");
		contentPane.add(lblYouSeeOn, "cell 0 0");
		
		JLabel lblYourSisterSarah = new JLabel("The burial and makeshift service last all day, and as you prepare to go to sleep at night, you begin to cough violently." );			
		contentPane.add(lblYourSisterSarah, "cell 0 1");
		
		JLabel lblNewLabel = new JLabel("In fact, you're seeing stars and even choking up blood.");
		contentPane.add(lblNewLabel, "cell 0 2");
		
		JLabel lblNewLabel2 = new JLabel("The look in Sarah ’s eyes confirms the worst, you’re INFECTED.");
		contentPane.add(lblNewLabel2, "cell 0 3");
	
		JLabel lblNewLabel4 = new JLabel("You probably only have a few days left. ");
		contentPane.add(lblNewLabel4, "cell 0 4");
		
		JLabel lblNewLabel5 = new JLabel("You lie down, and you know that your journey will end here. ");
		contentPane.add(lblNewLabel5, "cell 0 5");
	
		String imgStr = "lib/burial.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 6");
		
			
	}

}


//720 x 576 