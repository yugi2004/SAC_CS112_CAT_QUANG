import java.util.Scanner;
public class DickGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
            int dice1;
            int dice2;
            int sum;
            boolean stop=true;
            Scanner input = new Scanner(System.in);
            String message;
            int[] tracking= new int[255];
            int win=0;
            int lose=0;
            int count=0;
            int oddNumber=0;
            int evenGuess=0;
            float percent;
            System.out.println("Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");
            while (stop) {
             
                dice1=(int)(Math.random()*6+1);
                if ( dice1 % 2 != 0 )
                    oddNumber++;
                dice2=(int)(Math.random()*6+1);
                if ( dice2 % 2 != 0 )
                    oddNumber++;
                sum = dice1 + dice2;
                if(sum % 2 ==0)
                {
                	evenGuess++;
                }
                tracking[count]=sum;
                System.out.println("Roll: total = " + sum);

                if (sum==2 || sum==3 || sum==12) {
                    System.out.println("Sorry with number " + sum + " You LOSE :(");
                    System.out.println("Do you Want Stop? Y or N");
                    message=input.next();
                   stop=(message.equalsIgnoreCase("Y"))? false : true;
                   count++;
                   win++;
                   
                } else if(sum==7 || sum==11) {
                    System.out.println("Woah!!! With number " + sum + " You WIN!!!!!!!");
                    System.out.println("Do you Want Stop? Y or N");
                    message=input.next();
                   stop=(message.equalsIgnoreCase("Y"))? false : true;
                   count++;                 
                   lose++;
                }
                else count++;
             
         
            }
            for(int i=0; i <tracking.length ; i++)
            {
                if(tracking[i]!=0 )
                    System.out.printf("your Number is played :%d\n" , tracking[i]);
            }
            System.out.printf("Total you is played :%d\n" , count);
            System.out.printf("Total you is win :%d\nTotal you is lose :%d\n" , win,lose);
            percent=(float)((win*100)/count);
            System.out.println("Percentage of player win :" +percent+"%");
            percent=(float)((oddNumber*100)/count);
            System.out.println("Percentage of Odd number :" +percent+"%");
            percent=(float)((evenGuess*100)/count);
            System.out.println("percentage of Even guesses by the player :" +percent+"%");
    }
}

