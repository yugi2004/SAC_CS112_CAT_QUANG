
public class Lap8Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automobile3[] auto=new Automobile3[3];
		
		auto[0]=new Automobile3("Cabbie","Yellow",4,0,0);
	
		auto[1]=new Automobile3("Sporty","Red",2,0,0);
		
		auto[2]=new Automobile3("Vany","Green",5,0,0);
		String message;
		for(int i=0; i <3;i++)
		{
		message=auto[i].About();
			System.out.println(message);
		}
	}

}
