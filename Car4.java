
public class Car4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile8 Cabbie = new Automobile8("Yellow", 4, 3, 5);
		Cabbie.SetName("Cabbie");
		System.out.println(Cabbie.About());
		
		Automobile8 Sporty = new Automobile8(2, 3, 5);
		Sporty.SetName("Sporty");
		Sporty.SetColor("Red");
		System.out.println(Sporty.About());
		
		Automobile8 Vany = new Automobile8("Vany","green",5,3,4);
		System.out.println(Vany.About());
		
	}

}
