import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class fetchGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPlaying;
	private JTextField hungermeter;
	private JTextField happymeter;
	private JTextField txtPlayed;
	private JTextField txtMoodAdded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fetchGUI frame = new fetchGUI();
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
	public fetchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPlaying = new JTextField();
		txtPlaying.setBackground(Color.ORANGE);
		txtPlaying.setFont(new Font("Libian SC", Font.PLAIN, 30));
		txtPlaying.setText("Playing\n");
		txtPlaying.setBounds(17, 6, 136, 39);
		contentPane.add(txtPlaying);
		txtPlaying.setColumns(10);
		
		hungermeter = new JTextField();
		hungermeter.setBackground(Color.ORANGE);
		hungermeter.setText("Hunger meter    /100\n\n");
		hungermeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		hungermeter.setColumns(10);
		hungermeter.setBounds(314, 6, 130, 26);
		contentPane.add(hungermeter);
		
		happymeter = new JTextField();
		happymeter.setBackground(Color.ORANGE);
		happymeter.setText("Happy meter    /100");
		happymeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		happymeter.setColumns(10);
		happymeter.setBounds(314, 33, 130, 26);
		contentPane.add(happymeter);
		
		txtPlayed = new JTextField();
		txtPlayed.setBackground(Color.ORANGE);
		txtPlayed.setText("   You played fetch with your pet !");
		txtPlayed.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtPlayed.setBounds(92, 57, 266, 85);
		contentPane.add(txtPlayed);
		txtPlayed.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mgui = new MainGUI();
				mgui.show();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBounds(6, 237, 117, 29);
		contentPane.add(btnBack);
		
		txtMoodAdded = new JTextField();
		txtMoodAdded.setBackground(Color.ORANGE);
		txtMoodAdded.setText("         Mood added by 15.\n");
		txtMoodAdded.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtMoodAdded.setColumns(10);
		txtMoodAdded.setBounds(74, 137, 306, 85);
		contentPane.add(txtMoodAdded);
	}

}
