package moodleEditer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;

public class Math extends  JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Math() {

		JTextField textField;

		setLayout(new MigLayout("", "[89.00][30.00][80][80][80][80,grow]", "[20][15][20,grow][20][20][20][][20][20.00]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional)");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNewLabel, "cell 0 0 2 1,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 0 4 1,growx");
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Add New Math Question");
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
		
		JLabel lblAnswer = new JLabel("Answer");
		add(lblAnswer, "cell 0 4,alignx right");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 4 4 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblRange = new JLabel("Range +/-");
		add(lblRange, "cell 0 5,alignx right");
		
		JSpinner spinner = new JSpinner();
		add(spinner, "cell 2 5 2 1,growx");
		
		JLabel lblSpiecificPoints = new JLabel("Specific Points");
		add(lblSpiecificPoints, "cell 0 6,alignx right");
		
		JCheckBox chckbxSpicificPoints = new JCheckBox("");
		add(chckbxSpicificPoints, "cell 1 6");
		
		JLabel lblStartPoint = new JLabel("Start Point");
		lblStartPoint.setEnabled(false);
		add(lblStartPoint, "cell 2 6,alignx trailing");
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		add(textField_2, "cell 3 6,growx");
		textField_2.setColumns(10);
		
		JLabel lblEndPoint = new JLabel("End Point");
		lblEndPoint.setEnabled(false);
		add(lblEndPoint, "cell 4 6,alignx trailing");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		add(textField_3, "cell 5 6,growx");
		add(btnNewButton_3, "cell 0 7 2 1,growx");
		add(btnNewButton_2, "cell 0 8 3 1");

	}

}