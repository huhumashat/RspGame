package rspgame;
import java.util.*;
public class RspGame {
    
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";
    
    public static void main(String[] args) {
        boolean playAgain = true;
      do{
          System.out.println("Enter any one of the following inputs:\n"
              + "1- Rock\n"
              + "2- Paper\n"
              + "3- Scissors\n");
      
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove();
      
//      if both playerMove and computerMove produces the same formation, then Game is a tie
      if(playerMove.equals(computerMove))
          System.out.println("Game is Tie !!");
      else if(playerMove.equals(RspGame.ROCK))
          System.out.println(computerMove.equals(RspGame.PAPER) ? "Computer Wins":"Player Wins");
      else if(playerMove.equals(RspGame.PAPER))
          System.out.println(computerMove.equals(RspGame.SCISSORS) ? "Computer Wins": "Player Wins");
      else
          System.out.println(computerMove.equals(RspGame.ROCK) ? "Computer Wins" : "Player Wins");
      
        Scanner in  = new Scanner(System.in);
        System.out.println("***************\n"
                + "do you want play again?\n"
                + "Yes or No\n");
        String input = in.next();
        if(input.equalsIgnoreCase("yes"))
            playAgain = true;
        else
            playAgain = false;
      }while(playAgain == true);
      
      System.out.println("***************\n"
              + "See you soon <3");
      
    }
    
//    Get player's move using scanner 
    public static String getPlayerMove(){
        Scanner in  = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move is:" + playermove);
        return playermove;
    }
    //    Get computer's move using Random 
    public static String getComputerMove(){
        String computermove;
        Random random = new Random();
        int input  = random.nextInt(3)+1;
        if(input == 1)
            computermove = RspGame.ROCK;
        else if(input == 2)
            computermove = RspGame.PAPER;
        else
            computermove = RspGame.SCISSORS;
        System.out.println("Computer move is: " + computermove+"\n");
        return computermove;
    }
}
