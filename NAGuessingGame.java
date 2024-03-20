import java.util.Scanner;
//Name: Nicholas Alvarez 
//Class: CS 141
//File: GuessingGame.java
//Source: Class Work
//Purpose: Create a Guessing game 
import java.util.Random;
public class NAGuessingGame{
      public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int plays = 0;
        int guessCount = 0;
         //guessesPerGame 
        int gameCount = 0;
        int bestGame = 1000; 
         
         
         System.out.print("would you like to play a game? Y/N \n");
         String userInput = input.next().toLowerCase();
         
         while (userInput.equals("y")){
            
            int currentGuesses = guessGame(input);
            guessCount += currentGuesses;
            if(bestGame > currentGuesses) bestGame = currentGuesses; 
        
           //while loop reads user input and determines wether 
           //or not to play the game again
         
           System.out.print("would you like to play again? Y/N \n");
           userInput = input.next().toLowerCase();
           gameCount++;
     } 
    
               
       //give best game 
       // how many games
       // total guess
       // guesses/game   
      
      System.out.println("Overall results: ");
      System.out.println("Game count: " + gameCount);
      System.out.println("Total Guesses: " + guessCount);
      System.out.println("guesses per game: " + guessCount/gameCount);
      System.out.println("Best game:" +bestGame);
      
      
      
     
      
      
      } 
     // prompt for user
            //prompt the user to guess 
            //store the user guess inside a variable 
            //userGuess 
            //guessCount ++; 
            //switch(userGuess)
            //case userGuess < randomNumber, print ("Higher!")
            //case userGuess > randomNumber, print("Lower!")
            //case userGuess == randomNumber, print("You got it!");
                  
         public static int guessGame(Scanner input) {     
            System.out.print("guess the number i am thinking... i am thinking of a number between 1-100 \n ");
                    // Generate a random number between 1 and 100.
            Random randomObject = new Random(); 
            int randomNumber = randomObject.nextInt(100+1);
         

            int number = input.nextInt();
            int guessCount = 0;

            
         while(number != randomNumber){
            if (number < randomNumber){
               System.out.print("Go Higher!\n your guess\t");
               number = input.nextInt();
            
            } else { 
               System.out.print("Go Lower!\n your guess\t");
               number = input.nextInt();
               
            }
                  guessCount++;
         
          
           }
             
        // Print the number of guesses it took to guess correctly.
            System.out.println("You got it in " + guessCount + " guesses!");
            return guessCount; 
     }
          
}
         
 
             
             
         
 
   
   
   
   
   
   
         