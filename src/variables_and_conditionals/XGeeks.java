package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
	String Miles = "Teleporting";
	String Matt = "Breating underwater";
	String Mario = "Parcour";
        // 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Please enter your name.");
        // 3. Show the superpower in a pop-up, depending on the name entered. 
	if(name.equalsIgnoreCase("Miles")) {
		JOptionPane.showMessageDialog(null, name + "'s superpower is..." + Miles);		
	} else if(name.equalsIgnoreCase("Matt")) {
		JOptionPane.showMessageDialog(null, name + "'s superpower is..." + Matt);
	} else if(name.equalsIgnoreCase("Mario")) {
		JOptionPane.showMessageDialog(null, name + "'s superpower is..." + Mario);
	} else {
		JOptionPane.showMessageDialog(null, "The name you entered is not listed.");
		
	}
	
    }
}