package mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	JButton boto1;
	private JButton boto2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Vista frame = new Vista();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boto1 = new JButton("Missatge 1");
		boto1.setBounds(148, 38, 118, 21);
		contentPane.add(boto1);
		
		textField = new JTextField();
		textField.setBounds(113, 153, 207, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		boto2 = new JButton("Missatge 2");
		boto2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boto2.setBounds(148, 98, 118, 21);
		contentPane.add(boto2);
		
		this.setVisible(true);
	}
	
	JButton getBoto() {
		return boto1;
	}
	
	JButton getBoto2() {
		return boto2;
	}
	
	
	JTextField getTextField() {
		return textField;
	}

	public void posarText(String missatge) {
		textField.setText(missatge);
		
	}
	
}
