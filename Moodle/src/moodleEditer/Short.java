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
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;

public class Short extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Short() {

		JTextField textField;

		setLayout(new MigLayout("", "[89.00][30.00][100,grow][30][100.00,grow][70.00]", "[20][15][20,grow][15][20][20][][20][15][20.00]"));
		
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
		add(lblAnswer, "cell 0 4,alignx right,aligny top");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 2 4 3 1,growx");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		add(textField_2, "cell 2 5 3 1,growx");
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewLine = new JCheckBox("New Line");
		add(chckbxNewLine, "cell 5 5");
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		add(textField_3, "cell 2 6 3 1,growx");
		textField_3.setColumns(10);
		
		JCheckBox checkBox = new JCheckBox("New Line");
		add(checkBox, "cell 5 6");
		add(btnNewButton_3, "cell 0 7 2 1,growx");
		add(btnNewButton_2, "cell 0 9 3 1,growx");

	}

}