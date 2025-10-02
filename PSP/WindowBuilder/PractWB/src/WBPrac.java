import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class WBPrac {

	private JFrame frame;
	private JTextField textField;
	private JTextField TxtfNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBPrac window = new WBPrac();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WBPrac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(62, 158, 324, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSaludo = new JButton("Saludo");
		btnSaludo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("Hola "+TxtfNom.getText());
				
			}
		});
		btnSaludo.setBounds(172, 106, 89, 23);
		frame.getContentPane().add(btnSaludo);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(64, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		TxtfNom = new JTextField();
		TxtfNom.setBounds(106, 34, 100, 20);
		frame.getContentPane().add(TxtfNom);
		TxtfNom.setColumns(10);
	}
}
