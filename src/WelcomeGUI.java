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

public class WelcomeGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public WelcomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.ORANGE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Back !");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(98, 60, 250, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showinstruction();
			}
		});
		btnNewButton.setBounds(151, 160, 117, 29);
		contentPane.add(btnNewButton);
	}
	
	public void showinstruction() {
		this.setVisible(false);
		instructionGUI instruction = new instructionGUI();
		instruction.show();
		
	}

}
