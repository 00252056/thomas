package moodleEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class Missing  extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Missing(){
		JTextField textField;

		setLayout(new MigLayout("", "[116.00][30.00][90][135.00][50.00]", "[20][15][60.00,grow][15][20][20][20][20][20][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		add(lblNewLabel_1, "cell 0 2,alignx right,aligny top");
		
		JTextPane textPane_1 = new JTextPane();
		add(textPane_1, "cell 2 2 3 1,grow");
		
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
		add(btnNewButton, "cell 4 3,growx,aligny top");
		
		JButton btnNewButton_2 = new JButton("Add New Missing Word Question");
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
		add(btnNewButton_1, "cell 0 4,growx");
		
		JLabel lblA = new JLabel("A");
		add(lblA, "cell 1 4,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 4 2 1,growx");
		textField_1.setColumns(10);
		
		JRadioButton rdbtnCorrect = new JRadioButton("Correct");
		add(rdbtnCorrect, "cell 4 4,alignx right");
		
		JButton button = new JButton("Remove Answer");
		add(button, "cell 0 5,growx");
		
		JLabel lblB = new JLabel("B");
		add(lblB, "cell 1 5,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 2 5 2 1,growx");
		textField_2.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("Correct");
		add(radioButton, "cell 4 5,alignx right");
		
		JLabel lblC = new JLabel("C");
		lblC.setEnabled(false);
		add(lblC, "cell 1 6,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		add(textField_3, "cell 2 6 2 1,growx");
		textField_3.setColumns(10);
		
		JRadioButton radioButton_1 = new JRadioButton("Correct");
		radioButton_1.setEnabled(false);
		add(radioButton_1, "cell 4 6,alignx right");
		
		JLabel lblD = new JLabel("D");
		lblD.setEnabled(false);
		add(lblD, "cell 1 7,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		add(textField_4, "cell 2 7 2 1,growx");
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
		add(radioButton_2, "cell 4 7,alignx right");
		add(btnNewButton_3, "cell 0 8,growx");
		add(btnNewButton_2, "cell 0 10 3 1");

	}

}
