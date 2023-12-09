import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	
	private JButton btnfeeding;
	private JButton btnwalking;
	private JButton btnplaying;
	private JButton btnpetting;
	private JButton btnexit;
	private JButton btnBack;
	
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	

	public MainGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.ORANGE);
		
		btnfeeding = new JButton("Feeding");
		btnfeeding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showfeeding();
			}
		});
		btnfeeding.setBounds(73, 83, 117, 29);
		contentPane.add(btnfeeding);
		
		btnwalking = new JButton("Walking");
		btnwalking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showwalking();
			}
		});
		btnwalking.setBounds(73, 145, 117, 29);
		contentPane.add(btnwalking);
		
		btnplaying = new JButton("Playing");
		btnplaying.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				showplaying();
			}
		});
		btnplaying.setBounds(269, 83, 117, 29);
		contentPane.add(btnplaying);
		
		btnpetting = new JButton("Petting");
		btnpetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showpetting();
			}
		});
		btnpetting.setBounds(269, 145, 117, 29);
		contentPane.add(btnpetting);
		
		btnexit = new JButton("EXIT GAME");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnexit.setBounds(183, 234, 99, 20);
		contentPane.add(btnexit);
		
		JLabel lblNewLabel = new JLabel("Interact With Your Pet");
		lblNewLabel.setFont(new Font("Libian SC", Font.PLAIN, 29));
		lblNewLabel.setBounds(20, 24, 243, 47);
		contentPane.add(lblNewLabel);
		
		

		lblNewLabel_3 = new JLabel("Hunger ");
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setBounds(289, 22, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Happy");
		lblNewLabel_4.setBounds(289, 50, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText(index.health + " / 100");
		textField.setBounds(354, 15, 78, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(index.happiness + " / 100");
		textField_1.setBounds(354, 55, 78, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Give your pet 5 seconds rest before next interaction");
		lblNewLabel_1.setBounds(73, 186, 334, 16);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("If you interact with your pet in less than 5 seconds, the meters will not increase ");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(66, 206, 366, 16);
		contentPane.add(lblNewLabel_2);
		
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

		
//		btnBack = new JButton("BACK");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnBack.setBounds(37, 231, 59, 29);
//		contentPane.add(btnBack);
	}
	
	public void showplaying() {
		this.setVisible(false);
		playGUI playing= new playGUI();
		playing.show();
	}
	
	public void showpetting() {
		index.applyChange(0,20);
		this.setVisible(false);
		PetGUI petting = new PetGUI();
		petting.show();
	}
	
	public void showwalking() {
		index.applyChange(0, 15);
		this.setVisible(false);
		WalkingGUI walking = new WalkingGUI();
		walking.show();	
	}
	
	public void showfeeding() {
		this.setVisible(false);
		FeedingGUI feeding = new FeedingGUI();
		feeding.show();
		
	}
}