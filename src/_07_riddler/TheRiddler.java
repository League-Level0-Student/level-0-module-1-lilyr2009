package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-ridd
String ans=JOptionPane.showInputDialog("what room do ghosts avoid?" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(ans.equals("the living room")) {
	JOptionPane.showMessageDialog(null, "your correct!");
	score=score+1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "your wrong");
}
		// 6. Add some more riddles
String ans2=JOptionPane.showInputDialog("what belongs to you, but other people use it more than you?");
if(ans2.equals("your name")) {
	JOptionPane.showMessageDialog(null, "your correct!");
	score=score+1;
}
	// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
}
}



