import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetLayoutGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public SetLayoutGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		
		JLabel lblNewLabel = new JLabel("Your Pet Died");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(118, 29, 264, 93);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton = new JButton("EXIT GAME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);		
			}
		});
		btnNewButton.setBounds(66, 163, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PLAY AGAIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GenderGUI gendergui = new GenderGUI();
				gendergui.show();
			}
		});
		btnNewButton_1.setBounds(251, 163, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
