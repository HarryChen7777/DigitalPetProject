import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class FeedingGUI extends JFrame {

	private JPanel contentPane;
	
	JButton btnfeedbeef;
	JButton btnfeedvegetable;
	JButton btnBack;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;

	public FeedingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		
		btnfeedbeef = new JButton("Feeding with Beef");
		btnfeedbeef.setBounds(113, 89, 222, 29);
		btnfeedbeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				showfeedingbeef();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnfeedbeef);
		
		btnfeedvegetable = new JButton("Feeding with Vegetable");
		btnfeedvegetable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				showfeedingvegetable();
			}
		});
		btnfeedvegetable.setBounds(113, 160, 222, 29);
		contentPane.add(btnfeedvegetable);
		
		btnBack = new JButton("BACK");
		btnBack.setBounds(37, 231, 59, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showmain();
			}
		});
		contentPane.add(btnBack);
		
		
		
		lblNewLabel = new JLabel("FEEDING");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(19, 6, 130, 42);
		contentPane.add(lblNewLabel);
		
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
	}
	
	public void showmain() {
		this.setVisible(false);
		MainGUI mgui = new MainGUI();
		mgui.show();	
	}
	
	public void showfeedingvegetable() {
		index.applyChange(15, 0);
		this.setVisible(false);
		vegetableGUI feedingvegetable = new vegetableGUI();
		feedingvegetable.show();
	}
	
	public void showfeedingbeef() {
		index.applyChange(20, 0);
		this.setVisible(false);
		FeedingBeefGUI feedingbeefmeat = new FeedingBeefGUI();
		feedingbeefmeat.show();	
	}
}
