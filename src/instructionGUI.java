import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class instructionGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;

	public instructionGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(null);
		
		index newindex=new index(100,100);
		
		JLabel lblNewLabel = new JLabel("INSTRUCTION");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(23, 7, 174, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Interact with your pet to add Happy Meter and Hunger Meter");
		lblNewLabel_1.setBounds(42, 194, 387, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Happy Meter or Hunger Meter decrease every second");
		lblNewLabel_2.setBounds(60, 73, 338, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YOUR PET DIE");
		lblNewLabel_3.setFont(new Font("Libian TC", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(165, 150, 130, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("If one of them reaches 0 ");
		lblNewLabel_4.setBounds(141, 111, 191, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showmain();
			}
		});
		btnNewButton.setBounds(155, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("Hunger ");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(289, 22, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Happy");
		lblNewLabel_4.setBounds(289, 50, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText(index.health + " / 100");
		textField.setBounds(354, 20, 78, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(index.happiness + " / 100");
		textField_1.setBounds(354, 45, 78, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		TimerTask task = new TimerTask() {
			public void run() {
				textField.setText(index.health + " / 100");
				textField_1.setText(index.happiness + " / 100");
				System.out.println(index.health);
				System.out.println(index.happiness);
				System.out.println("Trying to rerender on: " + new Date() + "\n");

			}
		};
		new Timer("Timer").schedule(task, 0, 1000); // in milliseconds
	}
	
	public void showmain() {
		this.setVisible(false);
		MainGUI main = new MainGUI();
		main.show();
	}

}
