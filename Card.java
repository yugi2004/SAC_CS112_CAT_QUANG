
public class Card implements RandomNumber{
	private int rankNumber;
	private int count;
	public Card()
	{
		CardNRank();
	}
	 public void CardNRank()
	 {
		 count++;

				rankNumber=( (int)(Math.random()*13 ) + 1 );

	 }
	  public String rankToString(int rank) {
	        switch (rank) {
	        case 1:
	            return "Ace";
	        case 2:
	            return "Deuce";
	        case 3:
	            return "Three";
	        case 4:
	            return "Four";
	        case 5:
	            return "Five";
	        case 6:
	            return "Six";
	        case 7:
	            return "Seven";
	        case 8:
	            return "Eight";
	        case 9:
	            return "Nine";
	        case 10:
	            return "Ten";
	        case 11:
	            return "Jack";
	        case 12:
	            return "Queen";
	        case 13:
	            return "King";
	        default:
	            return null;
	        }    
	    }
@Override
	public int getRandomNumber()
	{

		return rankNumber ;
	}
@Override
	public int getCount()
	{
		return count;
	}
	public String toString()
	{
		return String.format("%s%d%s : %S%n","This is ",getCount()," times. Draw a card is : ",rankToString(getRandomNumber()) );
	}
}
