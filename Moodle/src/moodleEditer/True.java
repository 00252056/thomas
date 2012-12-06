package moodleEditer;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class True extends JPanel {
	private JTextField textField;
	private char answer;
	public static PrintWriter output;

	public True() {
		setLayout(new MigLayout("", "[140][180][40.00,grow][140]", "[20][15][85.00,grow][40][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_1, "cell 0 2,alignx right,aligny top");
		
		final JTextPane textPane_1 = new JTextPane();
		add(textPane_1, "cell 1 2 3 1,grow");
				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Correct Answer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, "cell 1 3,grow");
		panel.setLayout(new MigLayout("", "[110][110]", "[40]"));
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		JRadioButton rdbtnTrue = new JRadioButton("True");
		
		panel.add(rdbtnTrue, "cell 0 0,alignx right,aligny bottom");
		panel.add(rdbtnFalse, "cell 1 0,alignx left,aligny bottom");
		
		rdbtnFalse.addActionListener(new Ans());
		rdbtnTrue.addActionListener(new Ans());
		
		final ButtonGroup rbg = new ButtonGroup();
		rbg.add(rdbtnTrue);
		rbg.add(rdbtnFalse);
		
		JButton btnNewButton = new JButton("Cancel/Clear");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		add(btnNewButton, "cell 3 3,alignx right,aligny top");
		
		final JButton btnNewButton_2 = new JButton("Add New True/False Question");
		add(btnNewButton_2, "cell 0 5 2 1");
		btnNewButton_2.setVisible(false);
		
		JButton btnNewButton_3 = new JButton("Save to test file");
		add(btnNewButton_3, "cell 0 3,growx,aligny bottom");
		
		btnNewButton_3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			btnNewButton_2.setVisible(true);
			String qusetionTitle = textField.getText();
			String qusetionQ = textPane_1.getText();

			try {
				output = new PrintWriter(new BufferedWriter(new FileWriter(
						"ExamTest.txt", true)));

				output.append("::" + qusetionTitle + "::" + qusetionQ + " {"
						+ answer + "}" + "\n");
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textPane_1.setText("");
				rbg.clearSelection();
				btnNewButton_2.setVisible(false);
					
			}
		});
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textPane_1.setText("");
				rbg.clearSelection();
					
			}
		});
	}
	
	public class Ans implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "True") {
				answer = 'T';

			} else
				answer = 'F';

		}

	}

}
