import com.sun.org.apache.bcel.internal.generic.LLOAD;


public class DiceL5 {
	//Lab 1 
private int count = 0;
	
	public int Throw()
	{
		count++;
		if (count <= 3)
		{
			int randNum = 1 + (int)(Math.random()*6);
			return randNum;
		}
		else
			throw new IllegalArgumentException();	
	}

	public int getDiceCount() 
	{ 
		return count; 
	}

}
