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

public class boneGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPlaying;
	private JTextField hungerMeter;
	private JTextField happymeter;
	private JTextField txtPlayed;
	private JTextField txtMoodMeterAdded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boneGUI frame = new boneGUI();
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
	public boneGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPlaying = new JTextField();
		textPlaying.setBackground(Color.ORANGE);
		textPlaying.setText("Playing\n");
		textPlaying.setFont(new Font("Libian SC", Font.PLAIN, 30));
		textPlaying.setColumns(10);
		textPlaying.setBounds(23, 6, 136, 39);
		contentPane.add(textPlaying);
		
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
		hungerMeter = new JTextField();
		hungerMeter.setBackground(Color.ORANGE);
		hungerMeter.setText("Hunger meter    /100\n\n");
		hungerMeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		hungerMeter.setColumns(10);
		hungerMeter.setBounds(314, 6, 130, 26);
		contentPane.add(hungerMeter);
		
		happymeter = new JTextField();
		happymeter.setBackground(Color.ORANGE);
		happymeter.setText("Happy meter    /100");
		happymeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		happymeter.setColumns(10);
		happymeter.setBounds(314, 34, 130, 26);
		contentPane.add(happymeter);
		
		txtPlayed = new JTextField();
		txtPlayed.setBackground(Color.ORANGE);
		txtPlayed.setText("   You gave with your pet a bone!");
		txtPlayed.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtPlayed.setColumns(10);
		txtPlayed.setBounds(80, 57, 266, 85);
		contentPane.add(txtPlayed);
		
		txtMoodMeterAdded = new JTextField();
		txtMoodMeterAdded.setBackground(Color.ORANGE);
		txtMoodMeterAdded.setText("    Mood meter added by 30.\n");
		txtMoodMeterAdded.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtMoodMeterAdded.setColumns(10);
		txtMoodMeterAdded.setBounds(70, 140, 306, 85);
		contentPane.add(txtMoodMeterAdded);
	}
	
	

}
