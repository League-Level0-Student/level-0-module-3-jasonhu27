package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you Happy?");
		if (answer.contentEquals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		}
		if (answer.contentEquals("no")) {
			String response = JOptionPane.showInputDialog("Do you want to be happy");
			if (response.contentEquals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something.");
			}
			if (response.contentEquals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
		}
	}
}