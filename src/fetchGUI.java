import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

public class fetchGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boneGUI frame = new boneGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fetchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("PLAYING");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(19, 6, 130, 42);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("You played fetch with your pet!");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(68, 98, 309, 29);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Happy meter increased by 15.");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(135, 139, 231, 33);
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
		
		btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showmain();
			}
		});
		btnNewButton.setBounds(19, 226, 90, 29);
		contentPane.add(btnNewButton);
		
	}
	
	public void showmain() {
		this.setVisible(false);
		MainGUI mgui = new MainGUI();
		mgui.show();
	}
	
	

}