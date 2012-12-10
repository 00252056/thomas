package moodleEditer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class Missing extends JPanel {
	
	private GiftBuilder localBuilder;
	private JPanel panel;
	JScrollPane scrPane;
	private JTextField textField;
	private String answer;
	public static PrintWriter output;
	private ArrayList<Answer> allAns = new ArrayList<Answer>();
	private String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
			 			 "N", "O","P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	int x=1;

	
	public Missing(GiftBuilder editor) {

		this.localBuilder = editor;
		setLayout(new MigLayout("", "[right][grow][]", "[]10[40.00,grow][40,grow][20][50,grow][][20][40]"));
		
		JLabel lblNewLabel = new JLabel("Question Title (optional) ");
		add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 1 0 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblQuistion = new JLabel("Question Start");
		add(lblQuistion, "cell 0 1,alignx right,aligny top");
		
		final JTextArea taStart = new JTextArea();
		add(taStart, "cell 1 1 2 1,grow");
		
		JLabel lblQuestionEnd = new JLabel("Question End");
		add(lblQuestionEnd, "cell 0 2,aligny top");
		
		final JTextArea taClose = new JTextArea();
		add(taClose, "cell 1 2 2 1,grow");
		
		JLabel lblAnswer = new JLabel("Options");
		add(lblAnswer, "cell 0 4");
		
		panel = new JPanel();
		panel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill]"));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "", 
				TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		scrPane = new JScrollPane(panel);
		add(scrPane, "cell 1 4 2 1,grow");
		
		
		JButton saveBtn = new JButton("Save to test file");
		add(saveBtn, "cell 0 5,growx");
		
		JButton addBtn = new JButton("Add Option");
		add(addBtn, "cell 1 5");
		
		JButton removeAnsBtn = new JButton("Delete");
		add(removeAnsBtn, "cell 2 5");
		
		JButton button_2 = new JButton("Cancel/Clear");
		button_2.setVerticalAlignment(SwingConstants.TOP);
		button_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(button_2, "cell 2 3");
		
		final JButton btnNewButton = new JButton("Add New Missing Word Question");
		add(btnNewButton, "cell 0 7 2 1,alignx left");
		btnNewButton.setVisible(false);
				
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Answer ans = new Answer();
				ans.getLblName().setText(letters[x-1]);
				allAns.add(ans);	
				displayAns();
				scrPane.revalidate();
				x++;
			}
		});
		removeAnsBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				int index = -1;	
				for(Answer a: allAns ){
					if(a.getCbName().isSelected())
					{
						index = allAns.indexOf(a);
					}
				}
				allAns.remove(index);	
				displayAns();
				scrPane.revalidate();
			}
		});	
		
		saveBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			btnNewButton.setVisible(true);
			String qusetionTitle = textField.getText();
			String qusetionQ =  taStart.getText();
			String endQ = taClose.getText();

			}
		});
		setVisible(true);
	}
	
	protected void displayAns() {
		
		panel.removeAll();
		int i = 0;
		for(Answer a: allAns ){
			a.getLblName().setText(letters[i]);
			i++;
		}
		for(Answer a: allAns ){
			panel.add(a,"wrap");
		}
		
	}
}