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

public class Option3Home extends JFrame {

	
	static String name; 
	private JPanel contentPane;
	static String Weapon = "";

	/**
	 * Launch the application.
	 */
	public static void run(final String n) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name = n;
					Option3Home frame = new Option3Home();
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
	public Option3Home() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
	
		
		
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel newOne = new JLabel("Your phone and internet are not working. ");
		contentPane.add(newOne, "cell 0 0");
		
		JLabel lblYouSeeOn = new JLabel("You turn on the radio and find out that all of the deceased have COME BACK TO LIFE and ");
		contentPane.add(lblYouSeeOn, "cell 0 1");
		
		JLabel lblYourSisterSarah = new JLabel("COME BACK TO LIFE and are attacking and eating the living. These “undead” are fast, strong and somewhat intelligent. ");
		contentPane.add(lblYourSisterSarah, "cell 0 2");
		
		JLabel lblNewLabel = new JLabel("Their brains must be destroyed in order to kill them. There ’s also a risk of becoming infected if you come into direct contact with them.");
		contentPane.add(lblNewLabel, "cell 0 3");
		
		JLabel lblNewLabel2 = new JLabel("You race home, barely navigating around all of the abandoned cars. You lock the doors and windows, and secure the garage door.");
		contentPane.add(lblNewLabel2, "cell 0 4");
		
		JLabel lblNewLabel3 = new JLabel("Do you take the HANDGUN WITH 20 ROUNDS, AXE, CROBAR: ");
		contentPane.add(lblNewLabel3, "cell 0 5");
		
		String imgStr = "lib/option3home.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 6");
		
		
	
		
		
		JButton btnNewButton = new JButton("Handgun");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Weapon = "handgun";
				Bat.run(name);
			}
		});
		contentPane.add(btnNewButton, "flowx,cell 0 8,alignx left");
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut, "cell 0 8");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_2, "cell 0 8");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_3, "cell 0 8");
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_6, "cell 0 8");
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_7, "cell 0 8");
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_8, "cell 0 8");
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_11, "cell 0 8");
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_12, "cell 0 8");
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_13, "cell 0 8");
		
		JButton btnMachete = new JButton("Axe");
		btnMachete.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent arg0){
				Weapon = "axe";
				Bat.run(name);
			}
		});
		contentPane.add(btnMachete, "cell 0 8");
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_14, "cell 0 8");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1, "cell 0 8");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_4, "cell 0 8");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_5, "cell 0 8");
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_9, "cell 0 8");
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_18, "cell 0 8");
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_19, "cell 0 8");
		
		JButton btnRv = new JButton("Crobar");
		btnRv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Weapon = "crobar";
				Bat.run(name);
			}
		});
		contentPane.add(btnRv, "cell 0 8,alignx right");
		
	
		
		
		
	}

}


//720 x 576 