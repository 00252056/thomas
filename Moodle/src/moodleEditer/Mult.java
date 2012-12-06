package moodleEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mult extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public static PrintWriter output;

	/**
	 * Create the panel.
	 */
	public Mult(){
		final JTextField textField;

		setLayout(new MigLayout("", "[140][30][90][122.00,grow][70.00][50.00]", "[20][15][60.00,grow][15][20][20][20][20][20][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 4 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_1, "cell 0 2,alignx right,aligny top");
		
		final JTextPane textPane_1 = new JTextPane();
		add(textPane_1, "cell 2 2 4 1,grow");
		
		JButton btnNewButton = new JButton("Cancel/Clear");

		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		add(btnNewButton, "cell 4 3 2 1,growx,aligny top");
		
		final JButton btnNewButton_2 = new JButton("Add New Multple Choice Question");
		btnNewButton_2.setVisible(false);

		JLabel lblAnswer = new JLabel("Answer");
		add(lblAnswer, "cell 0 4,alignx right");
		
		JLabel lblA = new JLabel("A");
		add(lblA, "cell 1 4,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 4 2 1,growx");
		textField_1.setColumns(10);
		
		final JRadioButton rdbtnCorrect = new JRadioButton("Correct");
		add(rdbtnCorrect, "cell 4 4");
					
		final JSpinner spinner = new JSpinner();
		add(spinner, "cell 5 4,growx");
		spinner .setVisible(false);
		
		JLabel lblB = new JLabel("B");
		add(lblB, "cell 1 5,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 2 5 2 1,growx");
		textField_2.setColumns(10);
		
		final JRadioButton radioButton = new JRadioButton("Correct");
		add(radioButton, "cell 4 5");
		
		final JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 5 5,growx");
		spinner_1 .setVisible(false);
		
		JLabel lblC = new JLabel("C");
		add(lblC, "cell 1 6,alignx trailing");
		
		textField_3 = new JTextField();
		add(textField_3, "cell 2 6 2 1,growx");
		textField_3.setColumns(10);
		
		final JRadioButton radioButton_1 = new JRadioButton("Correct");
		add(radioButton_1, "cell 4 6");
		
		
		final JSpinner spinner_2 = new JSpinner();
		add(spinner_2, "cell 5 6,growx");
		spinner_2 .setVisible(false);
		
		JLabel lblD = new JLabel("D");
		add(lblD, "cell 1 7,alignx trailing");
		
		textField_4 = new JTextField();
		add(textField_4, "cell 2 7 2 1,growx");
		textField_4.setColumns(10);
		
		
		final JRadioButton radioButton_2 = new JRadioButton("Correct");
		add(radioButton_2, "cell 4 7");
		spinner_2 .setVisible(false);
		
		final JSpinner spinner_3 = new JSpinner();
		add(spinner_3, "cell 5 7,growx");
		spinner_3 .setVisible(false);
		
		rdbtnCorrect.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rdbtnCorrect.isSelected()) {
					spinner.setVisible(true);
				}else{
					spinner.setVisible(false);
				}
				
			}
		});
		
		radioButton.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (radioButton.isSelected()) {
					spinner_1.setVisible(true);
				}else{
					spinner_1.setVisible(false);
				}
				
			}
		});
		
		radioButton_1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (radioButton_1.isSelected()) {
					spinner_2.setVisible(true);
				}else{
					spinner_2.setVisible(false);
				}
				
			}
		});
		
		radioButton_2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (radioButton_2.isSelected()) {
					spinner_3 .setVisible(true);
				}else{
					spinner_3 .setVisible(false);
				}
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("Save to test file");

		add(btnNewButton_3, "cell 0 8,growx");
		add(btnNewButton_2, "cell 0 10 3 1");
		
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton_2.setVisible(true);
				String qusetionTitle = textField.getText();
				String qusetionQ = textPane_1.getText();
				
				String choice1 = textField_1.getText();
				String choice2 = textField_2.getText();
				String choice3 = textField_3.getText();
				String choice4 = textField_4.getText();
				
				String mark1 = spinner.getValue().toString();
				String mark2 = spinner_1.getValue().toString();
				String mark3 = spinner_2.getValue().toString();
				String mark4 = spinner_3.getValue().toString();
				

				try {
					output = new PrintWriter(new BufferedWriter(new FileWriter(
							"ExamTest.txt", true)));
					
					output.append("::" + qusetionTitle + "::" + qusetionQ + "{"
							+ "\n~%" + setzero(mark1) +"%"+ choice1 + " #"+ 
							"\n~%" +setzero(mark2) + "%"+ choice2 + " #"+"\n~%" + 
							setzero(mark3) + "%"+ choice3+ " #"+
							"\n~%" + setzero(mark4) + "%"+ choice4 + " #"+"\n}" + "\n");
					output.close();

					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			private String setzero(String mark) {
				if(mark.compareTo("0")==0){
					mark = "-100";
					return mark;
				}else
					return mark;	
				}
			
		});
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textPane_1.setText("");
					
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
					
					
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				btnNewButton_2.setVisible(false);
					
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textPane_1.setText("");
					
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
					
					
				spinner.setValue(0);
				spinner_1.setValue(0);
				spinner_2.setValue(0);
				spinner_3.setValue(0);
				
			}
		});
	}

}
