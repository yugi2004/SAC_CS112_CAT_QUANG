import javax.swing.JOptionPane;

public class Lap7W7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNum;
		int personNum;
		String message;
		boolean theEnd=false;
	
		do{
		computerNum= 1 + (int) Math.random()*10;// random 1-10
		
		
		String var= JOptionPane.showInputDialog("Please enter your number :");
		// change String to Int
		personNum=Integer.parseInt(var);
		// use String.format("") container your message ;
		message=String.format("Your number is : %d\nComputer number is : %d\n",personNum,computerNum);
		JOptionPane.showMessageDialog(null,message);
		
		boolean tooBig=(computerNum<personNum);
		boolean isEqual=(computerNum==personNum);
		if(isEqual)
		{
				JOptionPane.showMessageDialog(null,"your number is correct!! You Won!!! ");
		}
		else
			{	
				String messageS = (tooBig) ? "your number is too big":"your number is too small";
				JOptionPane.showMessageDialog(null,messageS);
			}

		var= JOptionPane.showInputDialog("Do you want quit ?Y or N");
		theEnd=var.equalsIgnoreCase("Y")? true : false;
		
		}while(theEnd==false);
		JOptionPane.showMessageDialog(null,"thank you ! Bye ! see you soon");
	}

}
