import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JTextField txtIncreased;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;

	
	public PetGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showmain();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBounds(6, 237, 117, 29);
		contentPane.add(btnBack);
		
		lblNewLabel = new JLabel("PETTING");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(19, 6, 130, 42);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("You have petted your pet!");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(88, 102, 356, 29);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Happy Meter increased by 20");
//		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(112, 143, 307, 36);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Hunger ");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(289, 22, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Happy");
		lblNewLabel_4.setBounds(289, 50, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText("100 / 100");
		textField.setBounds(354, 20, 78, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("100 / 100");
		textField_1.setBounds(354, 45, 78, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	
	public void showmain() {
		this.setVisible(false);
		MainGUI mgui = new MainGUI();
		mgui.show();
	}
}

