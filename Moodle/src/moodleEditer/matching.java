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

public class matching extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public matching() {

		JTextField textField;

		setLayout(new MigLayout("", "[89.00][30.00][100,grow][30][100.00,grow][70.00]", "[20][15][20][20][20][20][][][20][15][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0 2 1,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 4 1,growx");
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Add New Matching Question");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Add Q & A");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		add(btnNewButton_1, "cell 0 2");
		
		JLabel lblA = new JLabel("A");
		add(lblA, "cell 1 2,alignx trailing");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblA_1 = new JLabel("A");
		add(lblA_1, "cell 3 2,alignx trailing");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 4 2,growx");
		textField_2.setColumns(10);
		
		JCheckBox chckbxDelete = new JCheckBox("Delete");
		add(chckbxDelete, "cell 5 2");
		
	
		
		JLabel lblB = new JLabel("B");
		add(lblB, "cell 1 3, alignx trailing");
		
		JTextField textField_8 = new JTextField();
		add(textField_8, "cell 2 3,growx");
		textField_8.setColumns(10);
		
		JLabel lblB_1 = new JLabel("B");
		add(lblB_1, "cell 3 3,alignx trailing");
		
		textField_3 = new JTextField();
		add(textField_3, "cell 4 3,growx");
		textField_3.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("Delete");
		add(checkBox, "cell 5 3");
		
		
		JLabel lblC = new JLabel("C");
		lblC.setEnabled(false);
		add(lblC, "cell 1 4,alignx trailing");
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		add(textField_4, "cell 2 4,growx");
		textField_4.setColumns(10);
		
		JLabel lblC_1 = new JLabel("C");
		lblC_1.setEnabled(false);
		add(lblC_1, "cell 3 4,alignx trailing");
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		add(textField_5, "cell 4 4,growx");
		textField_5.setColumns(10);
		
		
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
		
		JCheckBox checkBox_1 = new JCheckBox("Delete");
		checkBox_1.setEnabled(false);
		add(checkBox_1, "cell 5 4");
		
		JLabel lblD = new JLabel("D");
		lblD.setEnabled(false);
		add(lblD, "cell 1 5,alignx trailing");
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		add(textField_6, "cell 2 5,growx");
		textField_6.setColumns(10);
		
		JLabel lblD_1 = new JLabel("D");
		lblD_1.setEnabled(false);
		add(lblD_1, "cell 3 5,alignx trailing");
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		add(textField_7, "cell 4 5,growx");
		textField_7.setColumns(10);
		
		JCheckBox checkBox_2 = new JCheckBox("Delete");
		checkBox_2.setEnabled(false);
		add(checkBox_2, "cell 5 5");
		
		JButton btnDelete = new JButton("Delete Selected");
		add(btnDelete, "cell 4 6 2 1,alignx right");
		add(btnNewButton_3, "cell 0 8 2 1,growx");
		add(btnNewButton_2, "cell 0 10 3 1,growx");

	}

}
