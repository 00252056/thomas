package moodleEditer;

public class GiftBuilder {
	
	public String GiftBuilder(String question,String questionQ,String answerQ) {
		String a ="WORKS";
		return a;
		
	}
	
	public String falseTrue(String question,String questionQ,String answerQ){
		question = stringModifier(question);
		questionQ = stringModifier(questionQ);
		answerQ =stringModifier(answerQ);
		
		System.out.println("TITLE: " + question + "\nBODY: " + questionQ + "\nANSWER: " + answerQ);
	
		String finalQ = "";
		finalQ = ("::" + question + "::" + questionQ + "{" + answerQ + "}");
		
		return finalQ;
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

}
