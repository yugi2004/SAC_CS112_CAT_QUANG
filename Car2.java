
public class Car2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Automobile6[] auto=new Automobile6[3];
		
		auto[0]=new Automobile6(4,3,4);
		auto[0].SetName("Cabbie");
		auto[0].SetColor("Yellow");
	
		auto[1]=new Automobile6(2,3,4);
		auto[1].SetName("Sporty");
		auto[1].SetColor("Red");
		
		auto[2]=new Automobile6(5,6,4);
		auto[2].SetName("Vany");
		auto[2].SetColor("Green");
		String message;
		for(int i=0; i <3;i++)
		{
		message=auto[i].About();
			System.out.println(message);
		}
	}

}
