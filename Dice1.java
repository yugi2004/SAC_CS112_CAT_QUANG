
public class Dice1 {
	private int diceNumber=0;
	private int point=0;
	private int diceCount=0;
	private String playerName=null;
	private int diceResult=0;
	public Dice1(String name,int diceCount,int point)
	{
		playerName=name;
		this.diceCount=diceCount;
		this.point=point;
	}
	public String GetName()
	{
		return playerName;
	}
	public void SetPoint(int point)
	{
		this.point=point+this.point;
	}
	public void DiceRoll()
	{
		diceNumber=diceCount*(1+(int)(Math.random()*6));
	}
	public int CheckResult()
	{
		if(diceNumber%2==0)
			diceResult=2;//1 is odd
		else diceResult=1; // 2 is Even
		return diceResult;
	}
	public int DiceNumber()
	{
		return diceNumber;
	}
	public String toString()
	{
		// Good!
		return String.format("%s,\nplayed with %d dices.\nTotal points: %d", playerName, diceCount, point);
	}
}
