// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(11)+1;
          //print message asking user to enter a guess
          System.out.println("Try to guess the correct number between 1 and 10");
          //read in guess
          guess = scan.nextInt();
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                  System.out.println("WRONG. guess again");
                  guess = scan.nextInt();
          }
 
          System.out.println("You did it, yay");
        }
}