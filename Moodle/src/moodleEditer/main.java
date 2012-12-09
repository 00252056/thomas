package moodleEditer;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class Main {

		

	private static final GiftBuilder GiftBuilder = null;

	public static void main(String[] a) {
	    JFrame f = new JFrame("Gift Editor");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JTabbedPane jtp = new JTabbedPane();
	    jtp.addTab("Multiiple Choice",new Mult());
	    jtp.addTab("Missing Word",new Missing());
	    jtp.addTab("Short Answer", new Short());
	    jtp.addTab("Matching", new matching());
	    jtp.addTab("True-False", new True(GiftBuilder));
	    jtp.addTab("Essay", new Essay());
	    jtp.addTab("Math", new Math());
	    jtp.addTab("Numerical", new Num());
	    
	    f.add(jtp);
	    f.pack();
	    f.setSize(1000, 600);
	    f.setVisible(true);
	    
	 }

}
