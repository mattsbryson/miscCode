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
import java.awt.event.MouseListener;

public class TurnBack extends JFrame {

	
	static String name; 
	static String NostalgicChoice;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void run(final String n) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name = n;
					TurnBack frame = new TurnBack();
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
	public TurnBack() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel newOne = new JLabel("You backtrack a few miles and stop for the night. " +
				"You start a fire and set up the tent, but your camp is invaded by the undead at nightfall. " +
				"Your journey ends here.");
		contentPane.add(newOne, "cell 0 0");
		
		JLabel lblYouSeeOn = new JLabel("You start a fire and set up the tent, but your camp is invaded by the undead at nightfall. ");
		contentPane.add(lblYouSeeOn, "cell 0 1");
		
		JLabel lblYourSisterSarah = new JLabel("Your journey ends here.");
		contentPane.add(lblYourSisterSarah, "cell 0 2");
		
		String imgStr = "lib/strangesounds.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 8");

	}

}


//720 x 576 