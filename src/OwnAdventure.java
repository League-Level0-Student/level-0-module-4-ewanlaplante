import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null, "The news got turned on and you hear that we are going to die.", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Do you go and see what it is about.", "Go back ot bed"}, null);
		if(task==1) {
			JOptionPane.showMessageDialog(null, "You died in your sleep.");
		}
		if (task == 0) {
			int task2 = JOptionPane.showOptionDialog(null, "You see that a meator is going to hit your city of salty factory and dusty depot where you work.", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go to work as normal", "Try and figure out if you can stop the meator" }, null);
			if (task2 == 0) {
				JOptionPane.showMessageDialog(null, "The metor killed you and your family. ");}
		
			
		if (task2 == 1 ) {
			int task3 = JOptionPane.showOptionDialog(null, "You go to the creators of the fornite gods. wil you...", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "go beserk and yell at the gods", "Try and reason with them to stop the meator." }, null);
	if (task3 == 0) {
		JOptionPane.showMessageDialog(null, "The metor killed your family and you were killed instantly. ");
	}
	if (task3==1) {
	JOptionPane.showMessageDialog(null, "The gods stopped the meator and the map was safe. For now.");
		
	}
	}
		}
		}
		
	}


