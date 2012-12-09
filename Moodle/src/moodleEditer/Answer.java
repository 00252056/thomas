package moodleEditer;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Answer extends JPanel{
	
	private JLabel lblName = new JLabel();
	private JTextField tfName = new JTextField();
	private JCheckBox cbName = new JCheckBox("Delete");
	private JRadioButton rdbtn = new JRadioButton("Correct");
	
	public Answer(){
		
		setLayout(new MigLayout("", "[][grow,fill][]", "[][grow][]"));
		add(lblName);
		add(tfName,"grow");
		add(cbName);
		add(rdbtn);
				
	}

	public JLabel getLblName() {
		return lblName;
	}

	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}

	public JTextField getTfName() {
		return tfName;
	}

	public void setTfName(JTextField tfName) {
		this.tfName = tfName;
	}

	public JCheckBox getCbName() {
		return cbName;
	}

	public void setCbName(JCheckBox cbName) {
		this.cbName = cbName;
	}
	public JLabel getrdbtn() {
		return lblName;
	}

	public void setrdbtn(JRadioButton rdbtn) {
		this.rdbtn = rdbtn;
	}

}
