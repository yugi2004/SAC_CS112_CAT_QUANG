
public class Dice {
	private int count=0;
	private int oddNumber=0;
	private int evenNumber=0;
	private int diceNumber=0;
	private String diceResult;
	private int win=0;
	private int lose=0;
	 private double winPercent;
	 private double oddPercent;
	 private double evenPercent;
	public Dice()
	{
		DiceRoll();
	}
	public void DiceRoll()
	{
		diceNumber=(int)(Math.random()*6+1);
		count++;
		CheckDiceOddEven();
	}
	private void CheckDiceOddEven()
	{
		if (diceNumber % 2 != 0) {
			diceResult="O";
			evenNumber++;
   	 }
   	 else
   		 {
   		 	diceResult="E";
   		 	oddNumber++;
   		 }
	}
	public int DiceNumber()
	{
		return diceNumber;
	}
	public boolean CheckWin(String guess)
	{ boolean check;
		if(guess.equalsIgnoreCase(diceResult))
		{
			win++;
			check=true;
			diceResult="Odd";
		}
		else
			{
			lose++;
			check=false;
			diceResult="Even";
			}
		return check;
	}
	public int diceWin()
	{
		return win;
	}
	public int diceLose()
	{
		return lose;
	}
	public void DicePercent()
	{
		winPercent=((win*100)/count);
        oddPercent=((oddNumber*100)/count);
        evenPercent = ((evenNumber*100)/count	);
	}
	public double DiceWinPercent()
	{
		return winPercent;
	}
	public double DiceOddPercent()
	{
		return oddPercent;
	}
	public double DiceEvenPercent()
	{
		return evenPercent;
	}
	public String DiceResult()
	{
		return diceResult;
	}
	public int DiceOdd()
	{
		return oddNumber;
	}
	public int DiceEven()
	{
		return evenNumber;
	}
	public int DiceCount()
	{
		return count;
	}
}
