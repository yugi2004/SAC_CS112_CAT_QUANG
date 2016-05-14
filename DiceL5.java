import com.sun.org.apache.bcel.internal.generic.LLOAD;


public class DiceL5 {
	//Lab 1 
private int count = 0;
private int randomNumber;
	public int Throw()
	{
		count++;
		if (count <= 3)
		{
			 randomNumber=( (int)(Math.random()*6 ) + 1 );
			return randomNumber;
		}
		else
			throw new IllegalArgumentException();	
	}

	public int getDiceCount() 
	{ 
		return count; 
	}
	
}
