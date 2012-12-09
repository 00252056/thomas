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

	private JPanel panel;
	JScrollPane scrPane;
	private JTextField textField;
	private ArrayList<Answer> allAns = new ArrayList<Answer>();
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
		panel.setLayout(new MigLayout("", "[grow,fill]", "[grow,fill]"));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(171, 173, 179)), "", 
				TitledBorder.LEFT, TitledBorder.TOP, null, null));
		
		scrPane = new JScrollPane(panel);
		add(scrPane, "cell 1 3 2 1,grow");
		
		
		JButton button_3 = new JButton("Save to test file");
		add(button_3, "cell 0 4,growx");
		
		JButton addBtn = new JButton("Add Answer");
		add(addBtn, "cell 1 4");
		
		JButton removeAnsBtn = new JButton("Delete");
		add(removeAnsBtn, "cell 2 4");
		
		JButton button_2 = new JButton("Cancel/Clear");
		button_2.setVerticalAlignment(SwingConstants.TOP);
		button_2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(button_2, "cell 2 2");
		
		JButton btnNewButton = new JButton("Add New Short Question");
		add(btnNewButton, "cell 0 6 2 1,alignx left");
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