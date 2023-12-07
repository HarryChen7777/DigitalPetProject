import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetGUI extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtPlaying;
	private JTextField txtpetted;
	private JTextField txtIncreased;
	private JTextField hungermeter;
	private JTextField happymeter;

	
	public PetGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPlaying = new JTextField();
		txtPlaying.setBackground(Color.ORANGE);
		txtPlaying.setFont(new Font("Libian SC", Font.PLAIN, 30));
		txtPlaying.setText("Playing\n");
		txtPlaying.setBounds(24, 20, 98, 32);
		contentPane.add(txtPlaying);
		txtPlaying.setColumns(10);
		
		txtpetted = new JTextField();
		txtpetted.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtpetted.setBackground(Color.ORANGE);
		txtpetted.setText("You have petted your Pet !!! ");
		txtpetted.setBounds(123, 77, 214, 67);
		contentPane.add(txtpetted);
		txtpetted.setColumns(10);
		
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
		
		txtIncreased = new JTextField();
		txtIncreased.setText("The Happy meter increased by 20!!!");
		txtIncreased.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtIncreased.setColumns(10);
		txtIncreased.setBackground(Color.ORANGE);
		txtIncreased.setBounds(104, 134, 247, 67);
		contentPane.add(txtIncreased);
		
		hungermeter = new JTextField();
		hungermeter.setBackground(Color.ORANGE);
		hungermeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		hungermeter.setText("Hunger meter    /100\n");
		hungermeter.setBounds(314, 9, 130, 26);
		contentPane.add(hungermeter);
		hungermeter.setColumns(10);
		
		happymeter = new JTextField();
		happymeter.setBackground(Color.ORANGE);
		happymeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		happymeter.setText("Happy meter    /100");
		happymeter.setColumns(10);
		happymeter.setBounds(314, 30, 130, 26);
		contentPane.add(happymeter);
	}
}
