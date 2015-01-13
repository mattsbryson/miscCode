package GUI;

import java.awt.BorderLayout;
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

public class TakeWeapon extends JFrame {

	
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
	public TakeWeapon() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel lblYouSeeOn = new JLabel("You bring your weapon and you’re able to overtake a small deer. ");
		contentPane.add(lblYouSeeOn, "cell 0 0");
		
		JLabel lblYourSisterSarah = new JLabel("You and Brad carry the deer back to camp… but Sarah and Randall were attacked and " );			
		contentPane.add(lblYourSisterSarah, "cell 0 1");
		
		JLabel lblNewLabel = new JLabel("killed while you were gone, and they were defenseless.  ");
		contentPane.add(lblNewLabel, "cell 0 2");
		
		JLabel lblNewLabel2 = new JLabel("The guilt is unbearable.");
		contentPane.add(lblNewLabel2, "cell 0 3");
		
		JLabel lblNewLabel3 = new JLabel("You don’t have any reason to keep on going in life.");
		contentPane.add(lblNewLabel3, "cell 0 3");
		
		JLabel lblNewLabel4 = new JLabel("Your journey ends here.");
		contentPane.add(lblNewLabel4, "cell 0 3");
		
		
	
		String imgStr = "lib/option3city.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 3");
		
			
	}

}


//720 x 576 