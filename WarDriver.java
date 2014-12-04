/*
Emile Rivat
Final Project
War Tester
12-3-2014
CS 110
*/

public class WarDriver
{
   public static void main(String [] args)
   {
      Game game = new Game();
      game.play();
      Player winner = game.getWinner();
      if(winner == null)
      {
         System.out.println("It's a tie!");
      } 
      else
      {
         System.out.println("\nWinner is: " + winner.getName());
      }
   }
}