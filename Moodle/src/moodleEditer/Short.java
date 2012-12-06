package moodleEditer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Short extends JPanel {

	private JPanel panel, panel_1, panel_2, panel_3;
	JScrollPane scrPane;
	private JTextField textField;

	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
	private ArrayList<JTextField> fieldList = new ArrayList<JTextField>();
	private ArrayList<JCheckBox> chkList = new ArrayList<JCheckBox>();
	private String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			 			 "N", "O","P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	int x=1;

	
	public Short() {

		setLayout(new MigLayout("", "[right][grow][]", "[]10[150.00,top][40][50,grow][][40][40]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblQuistion = new JLabel("Question");
		add(lblQuistion, "cell 0 1,alignx right");
		
		JTextArea textArea = new JTextArea();
		add(textArea, "cell 1 1 2 1,grow");
		
		JLabel lblAnswer = new JLabel("Answer");
		add(lblAnswer, "cell 0 3");
		
		panel = new JPanel();
		panel.setLayout(new MigLayout("", "[Fill][grow][right]", "[grow,center]"));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		scrPane = new JScrollPane(panel);
		add(scrPane, "cell 1 3 2 1,grow");

		panel_1 = new JPanel();		panel_1.setLayout(new GridLayout(x, 0, 0, 5));
		panel_2 = new JPanel();		panel_2.setLayout(new GridLayout(x, 0, 0, 0));
		panel_3 = new JPanel();		panel_3.setLayout(new GridLayout(x, 0, 0, 0));
		
		labelList.add(new JLabel(letters[x-1]));
		fieldList.add(new JTextField());
		chkList.add(new JCheckBox("Delete"));
		
		setAddAnswer(x);
		
		
		panel.add(panel_1);
		panel.add(panel_2, "growx,aligny top");
		panel.add(panel_3);
		
		JButton button_3 = new JButton("Save to test file");
		add(button_3, "cell 0 4,growx");
		
		JButton button = new JButton("Add Answer");
		add(button, "cell 1 4");
		
		JButton button_1 = new JButton("Delete");
		add(button_1, "cell 2 4");
		
		JButton button_2 = new JButton("Cancel/Clear");
		button_2.setVerticalAlignment(SwingConstants.TOP);
		button_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(button_2, "cell 2 2");
		
		JButton btnNewButton = new JButton("Add New Short Question");
		add(btnNewButton, "cell 0 6 2 1,alignx left");
		btnNewButton.setVisible(false);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				x++;
				labelList.add(new JLabel(letters[x-1]));
				fieldList.add(new JTextField());
				chkList.add(new JCheckBox("Delete"));
				setAddAnswer(x);				
				scrPane.revalidate();
			}
		});
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				x--;
				labelList.remove(x);
				fieldList.remove(x);
				chkList.remove(x);
				setDelAnswer(x);				
				scrPane.revalidate();
			}
		});
		
		setVisible(true);
	}
	
	private void setAddAnswer(int i) {
		
		panel_1.setLayout(new GridLayout(i, 0, 0, 0));
		panel_2.setLayout(new GridLayout(i, 0, 0, 0));
		panel_3.setLayout(new GridLayout(i, 0, 0, 0));
		
		
		for (int x = 0; x < i; x++) {
			
			panel_1.add(labelList.get(x));
			panel_2.add(fieldList.get(x));
			panel_3.add(chkList.get(x));
			
		}
	}	
	
	private void setDelAnswer(int i) {
			
		panel_1.setLayout(new GridLayout(i, 0, 0, 0));
		panel_2.setLayout(new GridLayout(i, 0, 0, 0));
		panel_3.setLayout(new GridLayout(i, 0, 0, 0));
			
			
		for (int x = 0; x < i; x++) {
			
			panel_1.add(labelList.get(x));
			panel_2.add(fieldList.get(x));
			panel_3.add(chkList.get(x));
				
		}		
	}
}