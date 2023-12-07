import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WalkingGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrWalking;
	private JTextArea txtrYouWalkedWith;
	private JTextArea txtrMoodMeterIncrease;
	private JButton btnNewButton;
	private JTextArea textArea;
	

	
	public WalkingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtrWalking = new JTextArea();
		txtrWalking.setLineWrap(true);
		txtrWalking.setBounds(20, 17, 56, 21);
		txtrWalking.setText(" Walking");
		contentPane.add(txtrWalking);
		
		txtrYouWalkedWith = new JTextArea();
		txtrYouWalkedWith.setFont(new Font("Libian SC", Font.PLAIN, 30));
		txtrYouWalkedWith.setText(" You walked with your Pet!");
		txtrYouWalkedWith.setBounds(75, 75, 304, 43);
		contentPane.add(txtrYouWalkedWith);
		
		txtrMoodMeterIncrease = new JTextArea();
		txtrMoodMeterIncrease.setFont(new Font("Libian SC", Font.PLAIN, 27));
		txtrMoodMeterIncrease.setText(" Mood Meter Increase 15");
		txtrMoodMeterIncrease.setBounds(104, 151, 248, 34);
		contentPane.add(txtrMoodMeterIncrease);
		
		btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mgui = new MainGUI();
				mgui.show();
			}
		});
		btnNewButton.setBounds(37, 231, 59, 29);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(309, 75, 1, 16);
		contentPane.add(textArea);
	}
}
