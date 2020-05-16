package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ownadventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"You are entering a restaurant that sells two types of food, burgers and hot dogs.");
		String answer = JOptionPane.showInputDialog("Which one do you want?");
		if (answer.contentEquals("burgers")) {
			JOptionPane.showInputDialog("The burgers come with any toppings you want, which ones would you like?");
			JOptionPane.showMessageDialog(null, "Perfect! Your total will be $10.");
		}
		if (answer.contentEquals("hot dogs")) {
			JOptionPane.showInputDialog(
					"The hot dogs only come with two choices, ketchup or mustard, which one would you like?");
			JOptionPane.showMessageDialog(null, "Perfect! Your total will be $5.");

		}
	}
}
