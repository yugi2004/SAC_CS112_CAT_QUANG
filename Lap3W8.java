import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;


public class Lap3W8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String date;
		int birthYear;
		String message;
	
		
		// get Year in System
		Date dateNow= new Date(); // your date
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(dateNow);
	    int year = cal.get(Calendar.YEAR);
	    
	    
		name=JOptionPane.showInputDialog("Please enter your name");
		date=JOptionPane.showInputDialog("Please enter your birth Year:");
		
		birthYear=Integer.parseInt(date);
		message=String.format("Hello, %s ,You're %d year-old today!", name,year - birthYear);
		JOptionPane.showMessageDialog(null,message);
		if((year-birthYear)>=21)
		{
			JOptionPane.showMessageDialog(null, "You Can drink!!");
			message = String.format("You can drink from %d to now", birthYear+21);
			
			JOptionPane.showMessageDialog(null	, message);
		}
		else 
			{
			 message=String.format("You Can't drink until %d",birthYear+21);
			JOptionPane.showMessageDialog(null,message);
			}
	}

}
