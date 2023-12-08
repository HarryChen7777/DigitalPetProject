import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class playGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the frame.
	 */
	public playGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mgui = new MainGUI();
				mgui.show();

			}
		});
		btnBack.setBounds(16, 204, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnfetch = new JButton("Play Fetch");
		btnfetch.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnfetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showfetch();
			}
		});
		btnfetch.setBounds(160, 75, 125, 47);
		contentPane.add(btnfetch);
		
		JButton btnbone = new JButton("Play Bone\n");
		btnbone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showbones();
			}
		});
		btnbone.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnbone.setBounds(160, 144, 127, 47);
		contentPane.add(btnbone);
		
		lblNewLabel = new JLabel("PLAYING");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 30));
		lblNewLabel.setBounds(26, 10, 125, 29);
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
	}
	
	public void showfetch() {
		this.setVisible(false);
		fetchGUI playfetch = new fetchGUI();
		playfetch.show();
	}
	
	public void showbones() {
		this.setVisible(false);
		boneGUI playbones = new boneGUI();
		playbones.show();
	}

}
