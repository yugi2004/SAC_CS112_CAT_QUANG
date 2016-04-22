
public class Lap6Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Automobile1[] auto=new Automobile1[3];
		
			auto[0]=new Automobile1(4,0);
			auto[0].SetColor("Yellow");
			auto[0].SetName("Cabbie");
		
			auto[1]=new Automobile1(2,0);
			auto[1].SetColor("Red");
			auto[1].SetName("Sporty");
			
			auto[2]=new Automobile1(5,0);
			auto[2].SetColor("Green");
			auto[2].SetName("Vany");
			String message;
			for(int i=0; i <3;i++)
			{
			message=auto[i].About();
				System.out.println(message);
			}
		
	}

}
