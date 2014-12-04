/*
Emile Rivat
Final Project
Player Class
12-3-2014
CS 110
*/

public class Player
{

   private Pile playPile, winPile;
   private String name;

   public Player(String n)
   {
      name = n;
      playPile = new Pile();
      winPile = new Pile();
   }
   
   public Card playCard()
   {
      if(playPile.getSize() == 0)
      {
         useWinPile();
      }
      
      if(playPile.getSize() > 0)
      {
         return playPile.nextCard();
      }
      return null;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void collectCard(Card card)
   {
      winPile.addCard(card);
   }
   
   public void collectCards(Pile p)
   {
      winPile.addCards(p);
   }
   
   public void useWinPile()
   {
      playPile.clear();
      playPile.addCards(winPile);
      winPile.clear();
   }
   
   public int numCards()
   {
      return playPile.getSize() + winPile.getSize();
   }
}