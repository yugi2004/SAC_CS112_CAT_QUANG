import javax.swing.JOptionPane;


public class Lap5W8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int oldAge;
		boolean stop=false;
		
		String message;
		while(stop==false)
		{
		name=JOptionPane.showInputDialog("Please enter your name");
		message = JOptionPane.showInputDialog("Please enter your age:");
		oldAge=Integer.parseInt(message);
		message=String.format("Your Name is: %s\n Your age is : %d", name, oldAge );
		JOptionPane.showMessageDialog(null, message);
		message=JOptionPane.showInputDialog("Do you want to stop? Y or N");
		stop=(message.equalsIgnoreCase("Y"))? true: false;
		}
		JOptionPane.showMessageDialog(null, "Thank you !! Bye !!");
	}

}
