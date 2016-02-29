public class Increment
{
	public static void main(String[] ars)
	{
	 // demonstrate postfix increment operator
		int c = 5 ;
		System.out.printf("c before postincrement: %d%n",c );// print 5
		System.out.printf(" postincrementing c: %d%n", c++);// print 5
		System.out.printf("c after postincrement: %d%n", c);// print 6
		
		System.out.println(); // skip a line
		// demonstrate prefix increment operator
		System.out.printf("c before postincrement: %d%n",c ); // print 6
		System.out.printf(" postincrementing c: %d%n", ++c); // print 7
		System.out.printf("c after postincrement: %d%n", c); // print 7
		
	}
}