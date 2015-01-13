package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String playerName = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[1px][][][][grow][]", "[1px][][][][][][][][][][][][][]"));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut, "cell 1 3");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1, "cell 2 3");
		
		JLabel lblWelcomeToResident = new JLabel("Super Zombie Murder Simulator");
		contentPane.add(lblWelcomeToResident, "cell 4 3");
		
		JLabel lblEnterYourName = new JLabel("Enter your name below: ");
		contentPane.add(lblEnterYourName, "cell 4 5,alignx left");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 4 6,growx");
		textField.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				playerName = textField.getText();
				Apartment.run(playerName);
			}
		});
		contentPane.add(btnStart, "cell 4 8,alignx center");
	}

}
