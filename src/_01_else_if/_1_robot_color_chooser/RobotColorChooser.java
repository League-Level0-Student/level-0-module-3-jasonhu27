
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot bob = new Robot();
		bob.penDown();
		while (true)
		{ String color = JOptionPane.showInputDialog("What color would you like your pen to be");
		if (color.equalsIgnoreCase("red")) {
		bob.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		}
		if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}
		if (color.equalsIgnoreCase("yellow")) {
			bob.setPenColor(Color.yellow);
		}
		if (color.equalsIgnoreCase("orange")) {
			bob.setPenColor(Color.orange);
		}
		if(color.equalsIgnoreCase("")) {
			bob.setPenColor(Color.magenta);
		}
			
		bob.setSpeed(10);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.setPenWidth(10);
		
		}
	}
}
