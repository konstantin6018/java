import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class OddEven extends JFrame implements ActionListener {

	public OddEven() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Upload File");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Footlight MT Light", Font.BOLD, 26));
		btnNewButton.setBounds(104, 65, 241, 98);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OddEven frame = new OddEven();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(OddEven.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			BufferedWriter oddWriter;
			BufferedWriter evenWriter;

			try {
				oddWriter = new BufferedWriter(new FileWriter("necheten.txt"));
				evenWriter = new BufferedWriter(new FileWriter("cheten.txt"));

				String res = "";
				int counter = 0;
				BufferedReader fr = new BufferedReader(new FileReader(file));

				while ((res = fr.readLine()) != null) {

					if (counter % 2 == 0) {
						oddWriter.write(res);
						oddWriter.newLine();
					} else {
						evenWriter.write(res);
						evenWriter.newLine();
					}
					counter++;
				}

				oddWriter.flush();
				evenWriter.flush();
				oddWriter.close();
				evenWriter.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}