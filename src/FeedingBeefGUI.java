import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FeedingBeefGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;



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
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showmain();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setBounds(6, 237, 117, 29);
		contentPane.add(btnBack);
		
		lblNewLabel = new JLabel("FEEDING");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(19, 6, 130, 42);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Hunger ");
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setBounds(289, 22, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Happy");
		lblNewLabel_2.setBounds(289, 50, 61, 16);
		contentPane.add(lblNewLabel_2);
		
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
		
		lblNewLabel_3 = new JLabel("You feed your pet with beef");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(87, 104, 288, 29);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Hunger Meter increased by 20");
		lblNewLabel_4.setBounds(133, 167, 242, 16);
		contentPane.add(lblNewLabel_4);
	}
	
	public void showmain() {
		this.setVisible(false);
		MainGUI mgui = new MainGUI();
		mgui.show();	
	}

}
