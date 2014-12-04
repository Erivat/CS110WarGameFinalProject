/*
Emile Rivat
Final Project
12-3-2014
CS 110
*/

public class Pile
{
   private Card [] pile;
   private int first, last;
   
   public Pile()
   {
      pile = new Card[52];
      first = 0;
      last = 0;
   }
   
   public int getSize()
   {
      return last - first;
   }
   
   public void clear()
   {
      first = 0;
      last = 0;
   }
   
   public void addCard(Card c)
   {
      pile[last] = c;
      last++;
   }
   
   public void addCards(Pile p)
   {
      while(p.getSize() > 0)
      {
         addCard(p.nextCard());
      }
   }
   
   public Card nextCard()
   {
      if (first == last)
      {
         return null;
      }
      Card card = pile[first];
      first++;
      return card;
   }
}