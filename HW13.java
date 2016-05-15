
public class HW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		TrippleDice dice1=new TrippleDice();
		TrippleDice dice2 = (TrippleDice)dice1.clone();
		//clone is copy object # create new object
		System.out.println(dice1);
		System.out.println(dice2);
		
		System.out.println(dice1.equals(dice2));
		}
		catch(CloneNotSupportedException c)
		{
			System.err.println("Error.....");
		}
	}
}
// Good job...please create a nother TrippleDic object so that you can test the case where equals fails
