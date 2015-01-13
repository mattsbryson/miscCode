import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


public class MainGUI extends JFrame {

	static ArrayList trades;
	static String selectedData;
	static String [] selectedJobs;
	
	//project names
			static String[] CobaltProjects = {"2700 S Figueroa",
					"Alta Centrum Apartments  - San Diego",
					"Archstone Santa Clarita",
					"Coventry Court - Tustin",
					"Hollywood & Garfield Apartments",
					"LB + Anaheim Senior Artists Colony",
					"LB + Anaheim The Annex",
					"Long Beach Burnett Apartments",
					"Vermont Family Apartments"};
			static String[] ArchiveProjects = {"Adams and Central Mixed-Use",
					"Jamboree West Gateway Housing",
					"Northridge II",
					"Playa del Oro",
					"RP Apartments 400",
					"Villages at Cabrillo"};
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void gui(final ArrayList tr) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trades = tr;
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		
			
		
		
		setTitle("Subcontractor Report Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][][]", "[][][][][][][][]"));
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Subcontractor Report Generator");
		contentPane.add(lblWelcomeToThe, "cell 2 0");
		
	
		
		
		

	
		
		//databse
		ArrayList databases = new ArrayList();
		databases.add("Cobaltcc");
		databases.add("Cobalt Archive");
		String [] genOption = {"Generate Report Based on Trade","Generate Report Based on Project", "Job Report (Includes Sub by Trade)"};
		
		JLabel lblDatabase = new JLabel("Database:");
		contentPane.add(lblDatabase, "cell 0 3,alignx right");
		final JComboBox comboBox = new JComboBox(databases.toArray());
		contentPane.add(comboBox, "cell 2 3,growx");
		
		JLabel lblGeneratorOption = new JLabel("Generator Option:");
		contentPane.add(lblGeneratorOption, "cell 0 5");
		final JComboBox comboBox_3 = new JComboBox(genOption);
		contentPane.add(comboBox_3, "cell 2 5,growx");
		
		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedData = (String) comboBox.getSelectedItem();
				String sReport = (String) comboBox_3.getSelectedItem();
				if(selectedData.equalsIgnoreCase("Cobaltcc"))
				{
					selectedJobs = CobaltProjects;
				}
				else
				{
					selectedJobs = ArchiveProjects;
					ArrayList<String> bCodes = new ArrayList();
					
						try {
							bCodes = aSql.bdgtCodes();
							trades = aSql.bdgtDesc(bCodes);
							Collections.sort(trades);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				
			
					
				}
				if(sReport.equals("Generate Report Based on Trade"))
				{
					ReportTradeGUI.tGUI(selectedData, trades);
				}
				else
				{
					ReportProjectGUI.rGUI(selectedData, selectedJobs);
				}
			}
		});
		contentPane.add(btnNext, "cell 2 7");
		
		
	
	}

}








