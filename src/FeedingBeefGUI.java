import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FeedingBeefGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hungermeter;
	private JTextField happymeter;
	private JTextField txtFeeding;
	private JTextField txtFed;
	private JTextField txtHungerMeterDecreased;


	/**
	 * Create the frame.
	 */
	public FeedingBeefGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hungermeter = new JTextField();
		hungermeter.setText("Hunger meter    /100\n\n");
		hungermeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		hungermeter.setColumns(10);
		hungermeter.setBackground(Color.ORANGE);
		hungermeter.setBounds(314, 18, 130, 26);
		contentPane.add(hungermeter);
		
		happymeter = new JTextField();
		happymeter.setText("Happy meter    /100");
		happymeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		happymeter.setColumns(10);
		happymeter.setBackground(Color.ORANGE);
		happymeter.setBounds(314, 50, 130, 26);
		contentPane.add(happymeter);
		
		txtFeeding = new JTextField();
		txtFeeding.setText("Feeding");
		txtFeeding.setFont(new Font("Libian SC", Font.PLAIN, 30));
		txtFeeding.setColumns(10);
		txtFeeding.setBackground(Color.ORANGE);
		txtFeeding.setBounds(6, 6, 136, 39);
		contentPane.add(txtFeeding);
		
		txtFed = new JTextField();
		txtFed.setText("      You feed your pet with beef");
		txtFed.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		txtFed.setColumns(10);
		txtFed.setBackground(Color.ORANGE);
		txtFed.setBounds(77, 88, 266, 62);
		contentPane.add(txtFed);
		
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
		
		txtHungerMeterDecreased = new JTextField();
		txtHungerMeterDecreased.setText("Hunger meter decreased by 20");
		txtHungerMeterDecreased.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtHungerMeterDecreased.setColumns(10);
		txtHungerMeterDecreased.setBackground(Color.ORANGE);
		txtHungerMeterDecreased.setBounds(65, 147, 324, 85);
		contentPane.add(txtHungerMeterDecreased);
	}

}
