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

public class Option2Car extends JFrame {

	
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
					Option2Car frame = new Option2Car();
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
	public Option2Car() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
	
		
		
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel lblYouSeeOn = new JLabel("You drive to the city and meet up with your sister and her boyfriend, Brad. ");
		contentPane.add(lblYouSeeOn, "cell 0 0");
		
		JLabel lblYourSisterSarah = new JLabel("There's nobody on the streets because it seems that most people are in the hospital.  ");
		contentPane.add(lblYourSisterSarah, "cell 0 1");
		
		JLabel lblNewLabel = new JLabel("You only have enough gas to make it home, because the gas stations are closed. The three of you decide to stick together.");
		contentPane.add(lblNewLabel, "cell 0 2");
		
		JLabel lblNewLabel2 = new JLabel("Do you stay in the city or do you go back home?");
		contentPane.add(lblNewLabel2, "cell 0 3");
		
		String imgStr = "lib/option2car.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 4");
		
		
	
		
		
		JButton btnNewButton = new JButton("Stay in City");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Option3City.run(name);
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
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_10, "cell 0 8");
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_16, "cell 0 8");
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_17, "cell 0 8");
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_18, "cell 0 8");
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_19, "cell 0 8");
		
		JButton btnRv = new JButton("Go Home");
		btnRv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Option3Home.run(name);
			}
		});
		contentPane.add(btnRv, "cell 0 8,alignx right");
		
	
		
		
		
	}

}


//720 x 576 