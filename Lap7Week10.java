
public class Lap7Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile2[] auto=new Automobile2[3];
		
		auto[0]=new Automobile2("Yellow",4,0,0);
		auto[0].SetName("Cabbie");
	
		auto[1]=new Automobile2("Red",2,0,0);
		auto[1].SetName("Sporty");
		
		auto[2]=new Automobile2("Green",5,0,0);
		auto[2].SetName("Vany");
		String message;
		for(int i=0; i <3;i++)
		{
		message=auto[i].About();
			System.out.println(message);
		}
	}

}
