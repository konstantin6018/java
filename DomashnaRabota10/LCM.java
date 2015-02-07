import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;

//Изчисляване на най-малко общо кратно на две числа.

public class LCM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LCM window = new LCM();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void LMCCal() {
		try {
			String firstNumberText = this.textField.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.textField_1.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber * secondNumber;
			int squared = (int) Math.sqrt(rezult);
			for (int i = squared; i <= rezult; i++) {
				if (i % firstNumber == 0 && i % secondNumber == 0) {
					JOptionPane.showMessageDialog(null, "Резултатът е: " + i);
					break;
				}

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	/**
	 * Create the application.
	 */
	public LCM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(39, 93, 122, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(274, 93, 122, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnIzchisli = new JButton(
				"\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		btnIzchisli.setForeground(Color.RED);
		btnIzchisli.setFont(new Font("Tahoma", Font.PLAIN, 52));
		btnIzchisli.setBounds(10, 145, 414, 88);
		frame.getContentPane().add(btnIzchisli);

		JLabel label = new JLabel(
				"\u0412\u044A\u0432\u0435\u0434\u0438 \u043F\u044A\u0440\u0432\u043E\u0442\u043E \u0447\u0438\u0441\u043B\u043E:");
		label.setBounds(39, 68, 143, 14);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel(
				"\u0412\u044A\u0432\u0435\u0434\u0438 \u0432\u0442\u043E\u0440\u043E\u0442\u043E \u0447\u0438\u0441\u043B\u043E:");
		label_1.setBounds(274, 68, 148, 14);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel(
				"\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0430 \u0437\u0430 \u0438\u0437\u0447\u0438\u0441\u043B\u044F\u0432\u0430\u043D\u0432 \u043D\u0430 \u041D\u041E\u041A");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		label_2.setBounds(54, 33, 337, 24);
		frame.getContentPane().add(label_2);
		btnIzchisli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LMCCal();
			}
		});
	}
}
