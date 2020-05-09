
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 24th";
		String dadsBirthday = "September 9th";
		String myBirthday = "July 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
String answer = JOptionPane.showInputDialog("Whos birthday do you want?");
JOptionPane.showMessageDialog(null, answer);
		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, "May 24th");
		}
		if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, "September 9th");
		}
		if (answer.contentEquals("jason")) {
			JOptionPane.showMessageDialog(null, "July 14th");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday");
		}
	} 
}
