
public class Dice3 {
	public static int OneThrow(){
		int randomNumber;
		randomNumber =1+(int)(Math.random()*6);
		return randomNumber;
	}
	public static int OneThrow(int dices,int bounces)
	{ 	int randomNumber;
	
			randomNumber =(dices*(1+(int)(Math.random()*6)))+bounces;
		return randomNumber;
	}
}
