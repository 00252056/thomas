package moodleEditer;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
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

public class True extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public True() {
		setLayout(new MigLayout("", "[140][183.00,grow][40.00][140][30]", "[20][15][85.00,grow][40][15][20.00]"));
		
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
		
		JTextPane textPane_1 = new JTextPane();
		add(textPane_1, "cell 1 2 3 1,grow");
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar, "cell 4 2");
		
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
		add(btnNewButton_3, "cell 0 3,growx,aligny bottom");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Correct Answer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, "cell 1 3,grow");
		panel.setLayout(new MigLayout("", "[110,grow][110]", "[40]"));
		
		JRadioButton rdbtnTrue = new JRadioButton("True");
		panel.add(rdbtnTrue, "cell 0 0,alignx right,aligny bottom");
		
		JRadioButton rdbtnFalse = new JRadioButton("False");
		panel.add(rdbtnFalse, "cell 1 0,alignx left,aligny bottom");
		
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
		add(btnNewButton, "cell 3 3,alignx right,aligny top");
		
		JButton btnNewButton_2 = new JButton("Add New True/False Question");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnNewButton_2, "cell 0 5 2 1");

	}

}
