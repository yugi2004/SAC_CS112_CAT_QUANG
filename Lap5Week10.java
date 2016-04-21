import java.util.Scanner;
public class Lap5Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Automobile auto1=new Automobile();
		Automobile auto2=new Automobile();
		Automobile auto3=new Automobile();
	

			System.out.println("\nPlease enter the Name of auto1 ");			
			auto1.SetName(input.next());
			System.out.println("\nPlease enter the color of auto1");
			auto1.SetColor(input.next());
			System.out.println("\nPlease enter a number Cylinders of auto1 ");
			auto1.SetNumberOfCylinders(input.nextInt());		
			System.out.println("\nPlease enter a number door of auto1 ");
			auto1.SetNumberOfDoors(input.nextInt());		
			System.out.println("\nPlease enter a number of gear auto1 ");
			auto1.SetTransmission(input.nextInt());
			
			System.out.println("\nPlease enter the Name of auto2 ");			
			auto2.SetName(input.next());
			System.out.println("\nPlease enter the color of auto2");
			auto2.SetColor(input.next());
			System.out.println("\nPlease enter a number Cylinders of auto2 ");
			auto2.SetNumberOfCylinders(input.nextInt());	
			System.out.println("\nPlease enter a number door of auto2 ");
			auto2.SetNumberOfDoors(input.nextInt());	
			System.out.println("\nPlease enter a number of gear auto2 ");
			auto2.SetTransmission(input.nextInt());
			
			System.out.println("\nPlease enter the Name of auto3");			
			auto3.SetName(input.next());
			System.out.println("\nPlease enter the color of auto3");
			auto3.SetColor(input.next());
			System.out.println("\nPlease enter a number Cylinders of auto3 ");
			auto3.SetNumberOfCylinders(input.nextInt());	
			System.out.println("\nPlease enter a number door of auto3 ");
			auto3.SetNumberOfDoors(input.nextInt());	
			System.out.println("\nPlease enter a number of gear auto3 ");
			auto3.SetTransmission(input.nextInt());
			
			System.out.printf("the Automobile 1 description %s\n",auto1.About());
			
			System.out.printf("the Automobile 1 description %s\n",auto2.About());
			System.out.printf("the Automobile 1 description %s\n",auto3.About());
	}

}
