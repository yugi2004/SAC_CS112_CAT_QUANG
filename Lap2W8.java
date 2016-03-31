import java.util.Calendar;

import javax.swing.JOptionPane;

import java.util.Date;

public class Lap2W8 {

	@SuppressWarnings("deprecation")
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
		    int month = cal.get(Calendar.MONTH);
		    int day = cal.get(Calendar.DAY_OF_MONTH);
		
		    
		/*today=Calendar.getInstance().get(Calendar.YEAR);
		 *	Calendar.getInstance().get(Calendar.DATE);
		 *	Calendar.getInstance().get(Calendar.MONTH);
		 */
		
		 //input your name
		name=JOptionPane.showInputDialog("Please enter your name");
		//input your birth year
		date=JOptionPane.showInputDialog("Please enter your birth Year:");
		birthYear=Integer.parseInt(date);
		// show your old age
		message=String.format("Hello, %s ,You're %d year-old today!", name, year - birthYear);
		JOptionPane.showMessageDialog(null,message);
		
		
		if((year-birthYear)>=21)
			JOptionPane.showMessageDialog(null, "You Can drink!!");
		else JOptionPane.showMessageDialog(null, "You Can't drink!!");
		
	}
	

}
