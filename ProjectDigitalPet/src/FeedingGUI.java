import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class FeedingGUI extends JFrame {

	private JPanel contentPane;
	
	JButton btnfeedbeef;
	JButton btnfeedvegetable;
	JButton btnBack;

	public FeedingGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnfeedbeef = new JButton("Feeding with Beef");
		btnfeedbeef.setBounds(113, 89, 222, 29);
		btnfeedbeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				FeedingBeefGUI feedingbeefmeat = new FeedingBeefGUI();
				feedingbeefmeat.show();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnfeedbeef);
		
		btnfeedvegetable = new JButton("Feeding with Vegetable");
		btnfeedvegetable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				vegetableGUI feedingvegetable = new vegetableGUI();
				feedingvegetable.show();
			}
		});
		btnfeedvegetable.setBounds(113, 160, 222, 29);
		contentPane.add(btnfeedvegetable);
		
		btnBack = new JButton("BACK");
		btnBack.setBounds(37, 231, 59, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI mgui = new MainGUI();
				mgui.show();
			}
		});
		contentPane.add(btnBack);
		
		JFormattedTextField frmtdtxtfldFeeding = new JFormattedTextField();
		frmtdtxtfldFeeding.setBounds(39, 17, 67, 26);
		frmtdtxtfldFeeding.setText("Feeding");
		contentPane.add(frmtdtxtfldFeeding);
	}
}
