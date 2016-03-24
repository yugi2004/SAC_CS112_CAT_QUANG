import javax.swing.JOptionPane;
public class Lap1W7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int computerNum;
		int personNum;
		String message;
		computerNum = 1 + (int) (Math.random () * 10); ///  random of math 
		String var=JOptionPane.showInputDialog("Please enter your number:");// return type String
		
		// change String to int use Integer.parseInt(string) or Integer.valueof(string)
		personNum = Integer.parseInt(var);
		
		// use String.format("") container your message ;
		message=String.format("Your number is : %d\nComputer number is : %d\n",personNum,computerNum);
		JOptionPane.showMessageDialog(null,message);
		
		if(computerNum==personNum)
		{
	
			JOptionPane.showMessageDialog(null,"your number is correct!! You Won!!! ");
		}
		else
			{	
				String messageS = (computerNum>personNum) ? "your number is too big" : "your number is too small";
				JOptionPane.showMessageDialog(null,messageS);
			}
 
		JOptionPane.showMessageDialog(null,"thank you ! Bye ! see you soon");
		
	}

}
