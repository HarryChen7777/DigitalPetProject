import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		
		
		JLabel lblNewLabel = new JLabel("Welcome !!!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(105, 6, 241, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(93, 86, 99, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(241, 81, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		account a = new account();
//		a.setAccount(textField.getText());
//		System.out.println(textField.getText());
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(93, 132, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 127, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
//		a.setPassword(textField_1.getText());
		
		JLabel lblNewLabel_3 = new JLabel("System will create the account automatically for you if you have not visited before");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblNewLabel_3.setBounds(40, 209, 380, 44);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String pwd = textField_1.getText();

//				System.out.println(username);
//				System.out.println(pwd);
				Integer result = a.login(username, pwd);
				
				// No need. will set account and password in login method
				// a.setAccount(username);
				// a.setPassword(pwd);
				
				showsteps(result);
			}
		});
		btnNewButton.setBounds(159, 182, 117, 29);
		contentPane.add(btnNewButton);
	}
	
	public void showsteps(int result) {
		this.setVisible(false);
		if (result == -2) {
			GenderGUI create = new GenderGUI();
			create.show();
		} else if (result >= 0) {					
			WelcomeGUI welcomepage = new WelcomeGUI();
			welcomepage.show();		
		} else if (result == -1) {
			FailLoginGUI faillogin = new FailLoginGUI();
			faillogin.show();	
		}
	}
}
