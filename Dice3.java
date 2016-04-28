
public class Dice3 {
	private static int randomNumber;
	public static int OneThrow(){
		randomNumber =1+(int)(Math.random()*6);
		return randomNumber;
	}
	public static int OneThrow(int dices,int bounces)
	{ 	randomNumber=0;
		for(int i=1;i<=bounces;i++)
		{
			randomNumber =randomNumber+(dices*(1+(int)(Math.random()*6)));
		}
		return randomNumber;
	}
}
