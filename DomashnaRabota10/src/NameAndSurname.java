import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;


public class NameAndSurname {

	private JFrame frame;
	private JTextField txtKonstantinPapazov;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameAndSurname window = new NameAndSurname();
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
	public NameAndSurname() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 255, 47));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtKonstantinPapazov = new JTextField();
		txtKonstantinPapazov.setText("Konstantin Papazov");
		txtKonstantinPapazov.setBounds(119, 95, 123, 20);
		frame.getContentPane().add(txtKonstantinPapazov);
		txtKonstantinPapazov.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setBounds(119, 79, 46, 14);
		frame.getContentPane().add(lblName);
	}
}