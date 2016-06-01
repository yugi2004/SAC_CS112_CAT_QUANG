import java.util.Arrays;
import java.util.Random;
public class SingleArray {
	private final int[] array;// tao mang
	private int writerIndex=0;// vi tri con tro cua mang
	private int size=0;
	private final static Random generator = new Random();
	// contructor
	public SingleArray(int size)
	{
		this.size=size;
		array = new int[size];// luc nay moi khoi tao chinh thuc day.
	}
	// tu khoa synchronized de kiem soat viec them vao doi tuong da co hay chua
	public synchronized void add(int value)
	{
		int position=writerIndex; // vi tri con tro
		try{
			Thread.sleep(generator.nextInt(500));		
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		array[position]=value;
		System.out.printf("%s wrote %2d tp element %d. \n",Thread.currentThread().getName(),value, position);
		++writerIndex;
		if(writerIndex<size)
		System.out.printf("next write index : %d \n",writerIndex);		
	}
	public String toString()
	{
		return "\nContents of singArray:\n" + Arrays.toString(array);
	}
}
