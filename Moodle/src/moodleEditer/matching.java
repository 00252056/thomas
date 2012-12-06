package moodleEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextArea;

public class matching extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	public static PrintWriter output;
	
	/**
	 * Create the panel.
	 */
	public matching() {

		final JTextField textField;

		setLayout(new MigLayout("", "[89.00][30.00][100,grow][30][100.00,grow][20.00]", "[20][80,grow][][20][20][20][20][20][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0 2 1,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 4 1,growx");
		textField.setColumns(10);
		
		JButton button = new JButton("Cancel/Clear");
		final JButton btnNewButton_2 = new JButton("Add New Matching Question");
		JButton btnNewButton_3 = new JButton("Save to test file");
		btnNewButton_2.setVisible(false);

		
		JLabel label = new JLabel("Question");
		add(label, "cell 0 1,alignx right,aligny top");
		
		final JTextArea textArea = new JTextArea();
		add(textArea, "cell 2 1 4 1,grow");
		
		button.setVerticalAlignment(SwingConstants.TOP);
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblAnswers = new JLabel("Answers");
		add(lblAnswers, "cell 0 3,alignx right");
		
		JLabel lblA = new JLabel("A");
		add(lblA, "cell 1 3,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 3,growx");
		textField_1.setColumns(10);
		
		JLabel lblA_1 = new JLabel("A");
		add(lblA_1, "cell 3 3,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 4 3,growx");
		textField_2.setColumns(10);
		
	
		
		JLabel lblB = new JLabel("B");
		add(lblB, "cell 1 4,alignx trailing");
		
		textField_8 = new JTextField();
		add(textField_8, "cell 2 4,growx");
		textField_8.setColumns(10);
		
		JLabel lblB_1 = new JLabel("B");
		add(lblB_1, "cell 3 4,alignx trailing");
		
		textField_3 = new JTextField();
		add(textField_3, "cell 4 4,growx");
		textField_3.setColumns(10);
		
		
		JLabel lblC = new JLabel("C");
		add(lblC, "cell 1 5,alignx trailing");
		
		textField_4 = new JTextField();
		add(textField_4, "cell 2 5,growx");
		textField_4.setColumns(10);
		
		JLabel lblC_1 = new JLabel("C");
		add(lblC_1, "cell 3 5,alignx trailing");
		
		textField_5 = new JTextField();
		add(textField_5, "cell 4 5,growx");
		textField_5.setColumns(10);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_8.setText("");
				textArea.setText("");
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_8.setText("");
					textArea.setText("");
					btnNewButton_2.setVisible(false);
				}
			});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_2.setVisible(true);
				String qusetionTitle = textField.getText();
				String qusetionQ = textArea.getText();

				String matchA = textField_1.getText();
				String answerA = textField_2.getText();
				String matchB = textField_8.getText();
				String answerB = textField_3.getText();
				String matchC = textField_4.getText();
				String answerC = textField_5.getText();

				try {
					output = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamTest.txt", true)));

					output.append("::" + qusetionTitle + "::" + qusetionQ + "{"
							+ "\n=" + matchA + " -> " + answerA + "\n="
							+ matchB + " -> " + answerB + "\n=" + matchC
							+ " -> " + answerC + "\n}" + "\n");
					output.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		add(button, "cell 4 2,alignx right");
		add(btnNewButton_3, "cell 0 7 2 1,growx");
		add(btnNewButton_2, "cell 0 9 3 1");

	}

}
