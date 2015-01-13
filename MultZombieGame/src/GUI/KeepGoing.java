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

public class KeepGoing extends JFrame {

	
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
					KeepGoing frame = new KeepGoing();
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
	public KeepGoing() {
		setTitle("Super Zombie Murder Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("", "[680px]", "[][][][514px][][][][][]"));
		
		JLabel lblYouSeeOn = new JLabel("You walk cautiously up to the river and find that the strangers are other healthy people who’ve fled from the city.");
		contentPane.add(lblYouSeeOn, "cell 0 0");
		
		JLabel lblYourSisterSarah = new JLabel("their names are Emma, Randall, Owen, and Nicki. You decide to stick together, and make camp for the night. " );
					
		contentPane.add(lblYourSisterSarah, "cell 0 1");
		
		JLabel lblNewLabel = new JLabel("You decide to stick together, and make camp for the night.");
		contentPane.add(lblNewLabel, "cell 0 2");
		
		JLabel lblNewLabel2 = new JLabel("Note: As you’re falling asleep, you hear Randall coughing repeatedly, until he is practically wheezing. ");
		contentPane.add(lblNewLabel2, "cell 0 3");
		
		JLabel lblNewLabel3 = new JLabel("Pneumonia was a common illness among those infected with the virus… ");
		contentPane.add(lblNewLabel3, "cell 0 4");
		if(StrangeSounds.NostalgicChoice.equalsIgnoreCase("cat"))
		{
			JLabel lblNewLabel4 = new JLabel("Your cat keeps meowing in the middle of the night, and you open the tent door to let her outside. ");
			contentPane.add(lblNewLabel4, "cell 0 5");
			JLabel lblNewLabel5 = new JLabel("You gasp when you see that your campsite is surrounded by the undead. ");
			contentPane.add(lblNewLabel5, "cell 0 6");
			JLabel lblNewLabel6 = new JLabel("You don’t make a sound, but your silence only stalls your fate. You journey ends here.");
			contentPane.add(lblNewLabel6, "cell 0 7");
		}
		else{
		JLabel lblNewLabel4 = new JLabel("You wake up the next morning to find your campsite turned over. ");
		contentPane.add(lblNewLabel4, "cell 0 5");
		
		JLabel lblNewLabel5 = new JLabel("You fear the worst, but you are disappointed when you discover that Emma, Owen, and Nicki  ");
		contentPane.add(lblNewLabel5, "cell 0 6");
		
		JLabel lblNewLabel6 = new JLabel("have stolen your radio, your canned food, and even your matches.");
		contentPane.add(lblNewLabel6, "cell 0 7");
		
		JLabel lblNewLabel7 = new JLabel("Luckily, you still have a lighter and one can of soup in your bag… but Randall was  ");
		contentPane.add(lblNewLabel7, "cell 0 8");
		
		JLabel lblNewLabel8 = new JLabel("abandoned with you, and he seems to be getting increasingly sick.");
		contentPane.add(lblNewLabel8, "cell 0 9");
		
		JLabel lblNewLabel9 = new JLabel("Do you KEEP THE SOUP A SECRET AND DRINK IT YOURSELF, SHARE THE SOUP WITH EVERYONE (INCLUDING RANDALL) ");
		contentPane.add(lblNewLabel9, "cell 1 0");
		
		String imgStr = "lib/option3city.png";
		ImageIcon image = new ImageIcon(imgStr);
		
		JLabel lblNewLabel_1 = new JLabel("", image, JLabel.CENTER);
		contentPane.add(lblNewLabel_1, "cell 1 1");
		
		JButton btnNewButton = new JButton("Keep");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				KeepSoup.run(name);
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
		
		
		JButton btnMachete = new JButton("Share");
		
		btnMachete.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent arg0)
			{
				ShareSoup.run(name);
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

}


//720 x 576 