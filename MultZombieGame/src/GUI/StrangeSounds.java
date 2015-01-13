package GUI;

import javax.sound.sampled.*;

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
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class StrangeSounds extends JFrame {

	
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
					StrangeSounds frame = new StrangeSounds();
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
	public StrangeSounds() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		 try {
	         // Open an audio input stream.
			 File soundFile = new File("lib/Sound/creepy3.wav");
	    	  AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
	         // Get a sound clip resource.
	         Clip clip = AudioSystem.getClip();
	         // Open audio clip and load samples from the audio input stream.
	         clip.open(audioIn);
	         clip.start();
	      } catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel newOne = new JLabel("There’s a strange sound coming from outside, but you can’t quite make it out. It sounds like a low hum. Maybe a neighbor, or a car running?");
		contentPane.add(newOne, "cell 0 0");
		
		JLabel lblYouSeeOn = new JLabel(" You walk to the window and open it a crack. To your horror, the street is swarming with the UNDEAD. This area is unsafe, and you, your sister, ");
		contentPane.add(lblYouSeeOn, "cell 0 1");
		
		JLabel lblYourSisterSarah = new JLabel("and Brad decide it would be best to flee into the countryside. You are all experienced hikers, so you pack bags with some basic survival gear. ");
		contentPane.add(lblYourSisterSarah, "cell 0 2");
		
		JLabel lblNewLabel = new JLabel("Some of your supplies include a tent, a radio, your weapons, water, and some canned food.");
		contentPane.add(lblNewLabel, "cell 0 3");
		
		JLabel lblNewLabel2 = new JLabel("You only bring the clothing on your backs. You know of a clean river about 15 miles out, and you decide to go there.");
		contentPane.add(lblNewLabel2, "cell 0 4");
		
		JLabel lblNewLabel3 = new JLabel("Nostalgia gets the best of you, though, and you might bring along something else due to sentimental reasons. ");
		contentPane.add(lblNewLabel3, "cell 0 5");
		
		JLabel lblNewLabel4 = new JLabel("There’s Oreo, your cat, who’s been with you for years. There’s a gardenia flower in a ceramic pot that your mother gave to you before she died. ");
		contentPane.add(lblNewLabel4, "cell 0 6");
		
		JLabel lblNewLabel5 = new JLabel("And there’s a photo album that you may never see again. Do you take CAT, FLOWERPOT, PHOTOALBUM : ");
		contentPane.add(lblNewLabel5, "cell 0 7");
		
		String imgStr = "lib/strangesounds.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 0 8");

		JButton btnNewButton = new JButton("Cat");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				NostalgicChoice = "cat";
				PivotalChoice.run(name);
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
		
		JButton btnMachete = new JButton("Flowerpot");
		btnMachete.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				NostalgicChoice = "flowerpot";
				PivotalChoice.run(name);
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
		
		JButton btnRv = new JButton("Photoalbum");
		btnRv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NostalgicChoice = "photoalbum";
				PivotalChoice.run(name);
				
			}
		});
		contentPane.add(btnRv, "cell 0 8,alignx right");		
	}

}


//720 x 576 