
public class Lap1W14 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber[] number = new RandomNumber[4];
		number[0]= new DiceW14();
		number[1]= new Card();
		number[2]= new DiceW14();
		number[3]= new Card();
		for(int i = 0 ; i <3 ; i++)
		{
			for(RandomNumber currentrandomNumber : number)
			{
			System.out.printf("%s %n",currentrandomNumber.toString());
			currentrandomNumber.Throw();
			}
		}
	}
}
