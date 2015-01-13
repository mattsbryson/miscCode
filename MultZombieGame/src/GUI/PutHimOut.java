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
public class PutHimOut extends JFrame {

	
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
					PutHimOut frame = new PutHimOut();
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
	public PutHimOut() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel lblYouSeeOn = new JLabel("You, Brad, and Sarah decide it would be best to put him out of his misery, due to your lack of resources.");
		contentPane.add(lblYouSeeOn, "cell 0 0");
		
		JLabel lblYourSisterSarah = new JLabel("You are the one to do the deed, in the privacy of the woods." );			
		contentPane.add(lblYourSisterSarah, "cell 0 1");
		
		JLabel lblNewLabel = new JLabel("Randall was most likely infected, anyways. When you return to camp, the three of you decide that it ");
		contentPane.add(lblNewLabel, "cell 0 2");
		
		JLabel lblNewLabel2 = new JLabel("would be best to scout for a camping site further from the city.");
		contentPane.add(lblNewLabel2, "cell 0 3");
		
		if(StrangeSounds.NostalgicChoice.equalsIgnoreCase("photoalbum"))
		{
			JLabel lblNewLabel3 = new JLabel("You slip Randall’s driver’s license into your photoalbum. " +
						"His picture seems like it belongs with the photos of your other friends.");
			contentPane.add(lblNewLabel3, "cell 0 4");
		}
		
		JLabel lblNewLabel4 = new JLabel("Now you feel torn.Do you FIRST GIVE RANDALL A PROPER BURIAL, HEAD FURTHER INTO THE COUNTRYSIDE IMMEDIATELY?");
		contentPane.add(lblNewLabel4, "cell 0 3");
	
		String imgStr = "lib/option3city.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 3");
		
		JButton btnNewButton = new JButton("Burial");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Burial.run(name);
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
		
		
		JButton btnMachete = new JButton("Go to countryside");
		
		btnMachete.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent arg0)
			{
				Countryside.run(name);
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
	
		
	}

}


//720 x 576 