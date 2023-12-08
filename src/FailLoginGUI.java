import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FailLoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public FailLoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		
		JLabel lblNewLabel = new JLabel("The Password you enter is incorrect!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel.setBounds(30, 21, 389, 102);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please Click Back to Try Again");
		lblNewLabel_1.setBounds(121, 120, 240, 45);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				showloginpage();
			}
		});
		btnNewButton.setBounds(162, 193, 117, 29);
		contentPane.add(btnNewButton);
	}
	
	public void showloginpage() {
		this.setVisible(false);
		LoginGUI loginpage = new LoginGUI();
		loginpage.show();
	}

}
