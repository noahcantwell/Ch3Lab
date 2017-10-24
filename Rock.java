
// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = null;  //Computer's play -- "R", "P", or "S"
        String capitalPersonPlay; //standardizes play for humans
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        
        //Get player's play -- note that this is stored as a string
        System.out.println("Rock Paper Scissors");
        System.out.println("What do you play? R/P/S");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        capitalPersonPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string
        if( computerInt == 0) {
            computerPlay = "S";
        }
        if( computerInt == 1) {
            computerPlay = "R";
        }
        if( computerInt == 2) {
            computerPlay = "P";
        }
        //Print computer's play
        System.out.println("The computer played " + computerPlay);
        //See who won.
        if( capitalPersonPlay.equals("R") && computerPlay.equals("S") ){
            System.out.println("You win!");
        }
        
        else if ( capitalPersonPlay.equals("S") && computerPlay.equals("P") ){
            System.out.println("You win!");
        }
        
        else if ( capitalPersonPlay.equals("P") && computerPlay.equals("R") ){
            System.out.println("You win!");
        }
        
        else if ( capitalPersonPlay.equals("S") && computerPlay.equals("R") ){
            System.out.println("You lose!");
        }
        
        else if ( capitalPersonPlay.equals("P") && computerPlay.equals("S") ){
            System.out.println("You lose!");
        }
        
        else if ( capitalPersonPlay.equals("P") && computerPlay.equals("R") ){
            System.out.println("You lose!");
        }
        
        else {
            System.out.println("You tied!");
        }
    }
}
