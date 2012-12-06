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

public class Mult extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Mult(){
		JTextField textField;

		setLayout(new MigLayout("", "[140][90][122.00][70.00][70.00]", "[20][15][60.00,grow][15][20][20][20][20][20][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0 4 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_1, "cell 0 2,alignx right,aligny top");
		
		JTextPane textPane_1 = new JTextPane();
		add(textPane_1, "cell 1 2 4 1,grow");
		
		JButton btnNewButton = new JButton("Cancel/Clear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		add(btnNewButton, "cell 3 3 2 1,growx,aligny top");
		
		JButton btnNewButton_2 = new JButton("Add New Multple Choose Question");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("New Answer");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		add(btnNewButton_1, "cell 0 4");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 1 4 2 1,growx");
		textField_1.setColumns(10);
		
		JRadioButton rdbtnCorrect = new JRadioButton("Correct");
		add(rdbtnCorrect, "cell 3 4");
		
		JSpinner spinner = new JSpinner();
		add(spinner, "cell 4 4,alignx center");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 1 5 2 1,growx");
		textField_2.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("Correct");
		add(radioButton, "cell 3 5");
		
		JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 4 5,alignx center");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		add(textField_3, "cell 1 6 2 1,growx");
		textField_3.setColumns(10);
		
		JRadioButton radioButton_1 = new JRadioButton("Correct");
		radioButton_1.setEnabled(false);
		add(radioButton_1, "cell 3 6");
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		add(spinner_2, "cell 4 6,alignx center");
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		add(textField_4, "cell 1 7 2 1,growx");
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Save to test file");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JRadioButton radioButton_2 = new JRadioButton("Correct");
		radioButton_2.setEnabled(false);
		add(radioButton_2, "cell 3 7");
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setEnabled(false);
		add(spinner_3, "cell 4 7,alignx center");
		add(btnNewButton_3, "cell 0 8,growx");
		add(btnNewButton_2, "cell 0 10 2 1,growx");

	}

}
