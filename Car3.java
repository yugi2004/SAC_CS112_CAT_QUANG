// lap 7
public class Car3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobile7 Cabbie = new Automobile7("Yellow", 4, 3, 5);
		Cabbie.SetName("Cabbie");
		System.out.println(Cabbie.About());
		
		Automobile7 Sporty = new Automobile7(2, 3, 5);
		Sporty.SetName("Sporty");
		Sporty.SetColor("Red");
		System.out.println(Sporty.About());
		
		Automobile7 Vany = new Automobile7(5,3);
		Vany.SetName("Vany");
		Vany.SetColor("green");
		System.out.println(Vany.About());
		
	}

}
