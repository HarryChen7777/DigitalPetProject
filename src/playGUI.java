import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class playGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFeeding;
	private JTextField hungermeter;
	private JTextField happymeter;



	/**
	 * Create the frame.
	 */
	public playGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mgui = new MainGUI();
				mgui.show();

			}
		});
		btnBack.setBounds(16, 204, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnfetch = new JButton("Play Fetch");
		btnfetch.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnfetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fetchGUI playfetch = new fetchGUI();
				playfetch.show();
			}
		});
		btnfetch.setBounds(142, 81, 164, 52);
		contentPane.add(btnfetch);
		
		JButton btnbone = new JButton("Play Bone\n");
		btnbone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boneGUI playbones = new boneGUI();
				playbones.show();
			}
		});
		btnbone.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnbone.setBounds(142, 145, 173, 58);
		contentPane.add(btnbone);
		
		txtFeeding = new JTextField();
		txtFeeding.setBackground(Color.ORANGE);
		txtFeeding.setFont(new Font("Libian SC", Font.PLAIN, 30));
		txtFeeding.setText("Playing\n");
		txtFeeding.setBounds(16, 16, 117, 35);
		contentPane.add(txtFeeding);
		txtFeeding.setColumns(10);
		
		hungermeter = new JTextField();
		hungermeter.setBackground(Color.ORANGE);
		hungermeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		hungermeter.setText("Hunger meter    /100\n\n");
		hungermeter.setBounds(314, 6, 130, 26);
		contentPane.add(hungermeter);
		hungermeter.setColumns(10);
		
		happymeter = new JTextField();
		happymeter.setBackground(Color.ORANGE);
		happymeter.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		happymeter.setText("Happy meter    /100");
		happymeter.setBounds(314, 27, 130, 26);
		contentPane.add(happymeter);
		happymeter.setColumns(10);
	}

}
