package moodleEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JSpinner;

public class Num extends  JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public Num() {

		JTextField textField;

		setLayout(new MigLayout("", "[89.00][30.00][100,grow][30][100.00,grow][30.00]", "[20][15][20,grow][15][20][20][][][20][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0 2 1,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 4 1,growx");
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Add New Numerical Question");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
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
		
		JLabel label = new JLabel("Question");
		add(label, "cell 0 2,alignx right,aligny top");
		
		JTextPane textPane = new JTextPane();
		add(textPane, "cell 2 2 4 1,grow");
		
		JLabel lblAnswer = new JLabel("answer");
		add(lblAnswer, "cell 2 3,alignx center,aligny bottom");
		
		JLabel label_1 = new JLabel("+/-");
		add(label_1, "cell 3 3,alignx center");
		
		JLabel lblFeedback = new JLabel("Feedback");
		add(lblFeedback, "cell 4 3,alignx center,aligny bottom");
		
		JLabel label_2 = new JLabel("%");
		add(label_2, "cell 5 3,alignx center");
		
		JButton btnAddAnswer = new JButton("Add Answer");
		add(btnAddAnswer, "cell 0 4,growx");
		
		JLabel lblA = new JLabel("A");
		add(lblA, "cell 1 4,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 4,growx");
		textField_1.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		add(spinner, "cell 3 4");
		
		textField_5 = new JTextField();
		add(textField_5, "cell 4 4,growx");
		textField_5.setColumns(10);
		
		JSpinner spinner_4 = new JSpinner();
		add(spinner_4, "cell 5 4");
		
		JButton btnRemoveAnswer = new JButton("Remove Answer");
		add(btnRemoveAnswer, "cell 0 5");
		
		JLabel lblB = new JLabel("B");
		add(lblB, "cell 1 5,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 2 5,growx");
		textField_2.setColumns(10);
		
		JSpinner spinner_1 = new JSpinner();
		add(spinner_1, "cell 3 5");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		add(textField_6, "cell 4 5,growx");
		
		JSpinner spinner_5 = new JSpinner();
		add(spinner_5, "cell 5 5");
		
		JLabel lblC = new JLabel("C");
		lblC.setEnabled(false);
		add(lblC, "cell 1 6,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		add(textField_3, "cell 2 6,growx");
		textField_3.setColumns(10);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		add(spinner_2, "cell 3 6");
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		add(textField_7, "cell 4 6,growx");
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setEnabled(false);
		add(spinner_6, "cell 5 6");
		
		JLabel lblD = new JLabel("D");
		lblD.setEnabled(false);
		add(lblD, "cell 1 7,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		add(textField_4, "cell 2 7,growx");
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setEnabled(false);
		add(spinner_3, "cell 3 7");
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		add(textField_8, "cell 4 7,growx");
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setEnabled(false);
		add(spinner_7, "cell 5 7");
		add(btnNewButton_3, "cell 0 8 2 1,growx");
		add(btnNewButton_2, "cell 0 9 3 1");

	}

}