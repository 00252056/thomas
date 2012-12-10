package moodleEditer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class GiftBuilder {
	
	String finalQ = "";
	
	public String GiftBuilder(String question,String questionQ,String answerQ) {
		String a ="WORKS";
		return a;
		
	}
	
	public void falseTrue(String question,String questionQ,String answerQ){
		question = stringModifier(question);
		questionQ = stringModifier(questionQ);
		answerQ =stringModifier(answerQ);
		
		System.out.println("TITLE: " + question + "\nBODY: " + questionQ + "\nANSWER: " + answerQ);
	
		
		finalQ = ("::" + question + "::" + questionQ + "{" + answerQ + "}");
		
		return;
	}
	
	public void blank(String question,String startQ,String endQ,ArrayList<Answer> allAns){
		question = stringModifier(question);
		startQ = stringModifier(startQ);
		endQ = stringModifier(endQ);
		
		
		return;
	}
	

	private String stringModifier(String string){
		
		string = string.replace("::", "\\::");
		string = string.replace("{", "\\{");
		string = string.replace("}", "\\}");
		string = string.replace("~", "\\~");
		string = string.replace("=", "\\=");
		string = string.replace("#", "\\#");
		string = string.replace("%", "\\%");
		
		return string;
	}
	private void saveFile(){
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		File file = new File("");

		if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
		}
		StringBuilder sb = new StringBuilder();	
		sb.append(finalQ);
		
		try {
			PrintWriter wr = new PrintWriter(file);
			wr.write(sb.toString());
			wr.flush();
			wr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return ;
	}

}
