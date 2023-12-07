import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
	

	public MainGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnexit.setBounds(177, 204, 99, 20);
		contentPane.add(btnexit);
		
		JLabel lblNewLabel = new JLabel("Interact With Your Pet");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(60, 17, 349, 47);
		contentPane.add(lblNewLabel);
		
//		btnBack = new JButton("BACK");
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnBack.setBounds(37, 231, 59, 29);
//		contentPane.add(btnBack);
	}
	
	public void showplaying() {
		playGUI playing= new playGUI();
		playing.show();
	}
	
	public void showpetting() {
		PetGUI petting = new PetGUI();
		petting.show();
	}
	
	public void showwalking() {
		WalkingGUI walking = new WalkingGUI();
		walking.show();	
	}
	
	public void showfeeding() {
		FeedingGUI feeding = new FeedingGUI();
		feeding.show();
		
	}
}