
public class DiceHW {
	private int count=0;
	private int diceNumber=0;
	private int win=0;
	private int lose=0;
	private int diceResult=0;
	private String name;
	private int numOfDice=1;
	public DiceHW(String name,int numOfDice)
	{
		this.name=name;
		this.numOfDice=numOfDice;
	}
	public int GetNumOfDice()
	   {
	      return numOfDice;
	   }
	public void SetNumOfDice(int numOfDice)
	{
		this.numOfDice=numOfDice;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public String GetName()
	{
		return name;
	}
	public void DiceRoll()
	{
		diceNumber=numOfDice*(1+(int)(Math.random()*6));
		count++;
		CheckDiceOddEven();
	}
	private void CheckDiceOddEven()
	{
		if (diceNumber % 2 == 0) {
			diceResult=2;

   	 }
   	 else
   		 {
   		 	diceResult=1;
   		 }
	}
	public int GetDiceResult()
	{
		return diceResult;
	}
	public int GetDiceNumber()
	{
		return diceNumber;
	}
	public void SetDiceWin()
	{
		win++;
	}
	public void SetDiceLose()
	{
		lose++;
	}
	public int GetDiceWin()
	{
		return win;
	}
	public int GetDiceLose()
	{
		return lose;
	}
	public int GetDiceCount()
	{
		return count;
	}
}
