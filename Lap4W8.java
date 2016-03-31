import javax.swing.JOptionPane;


public class Lap4W8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int oldAge;
		
		for(int i=0;i < 3;i++){
		name=JOptionPane.showInputDialog("Please enter your name");
		String var = JOptionPane.showInputDialog("Please enter your age:");
		oldAge=Integer.parseInt(var);
		var=String.format("Your Name is: %s\n Your age is : %d", name, oldAge );
		JOptionPane.showMessageDialog(null, var);
		}
	}

}
