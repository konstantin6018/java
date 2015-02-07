import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

//Направете програма с графичен интерфейс, която има 2 полета за реални числа
//Направете 4 бутона съответвно събиране, изваждане, умножение и делене
//При натискане на съответния бутон програмата трябва да извежда прозорец с резултат от съответната операция
public class Calc {

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
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Umnojenie() {
		try {
			String firstNumberText = this.textField.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.textField_1.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber * secondNumber;

			JOptionPane.showMessageDialog(null, "Резултатът е: " + rezult);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	public void Delenie() {
		try {
			String firstNumberText = this.textField.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.textField_1.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber / secondNumber;

			JOptionPane.showMessageDialog(null, "Резултатът е: " + rezult);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	public void Subirane() {
		try {
			String firstNumberText = this.textField.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.textField_1.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber + secondNumber;

			JOptionPane.showMessageDialog(null, "Резултатът е: " + rezult);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	public void Izvajdane() {
		try {
			String firstNumberText = this.textField.getText();
			int firstNumber = Integer.parseInt(firstNumberText);

			String secondNumberText = this.textField_1.getText();
			int secondNumber = Integer.parseInt(secondNumberText);
			int rezult = firstNumber - secondNumber;

			JOptionPane.showMessageDialog(null, "Резултатът е: " + rezult);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Възникна грешка при изчислението!", "Внимание", 0);
		}

	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(76, 87, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(247, 87, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Subirane();
			}
		});
		btnNewButton.setBounds(73, 137, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Izvajdane();
			}
		});
		btnNewButton_1.setBounds(247, 137, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.setForeground(Color.LIGHT_GRAY);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Umnojenie();
			}
		});
		btnNewButton_2.setBounds(73, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setForeground(Color.LIGHT_GRAY);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delenie();
			}
		});
		btnNewButton_3.setBounds(247, 183, 89, 23);
		frame.getContentPane().add(btnNewButton_3);

		JLabel label = new JLabel(
				"\u0412\u044A\u0432\u0435\u0434\u0438 \u043F\u044A\u0440\u0432\u043E\u0442\u043E \u0447\u0438\u0441\u043B\u043E:");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 34, 196, 42);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel(
				"\u0412\u044A\u0432\u0435\u0434\u0438 \u0432\u0442\u043E\u0440\u043E\u0442\u043E \u0447\u0438\u0441\u043B\u043E:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(226, 34, 198, 42);
		frame.getContentPane().add(label_1);

	}
}
