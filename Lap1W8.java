
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Lap1W8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String date;
		int birthYear;
		String message;
		int today;
		
		
		today=Calendar.getInstance().get(Calendar.YEAR);// get Year in System
		//input your name
		name=JOptionPane.showInputDialog("Please enter your name");
		//input your birth year
		date=JOptionPane.showInputDialog("Please enter your birth Year:");
		birthYear=Integer.parseInt(date);
		// show your old age
		message=String.format("Hello, %s ,You're %d year-old today!", name, today - birthYear);
		JOptionPane.showMessageDialog(null,message);
		
	}

}
