/*
Emile Rivat
Final Project
Card Class
12-3-2014
CS 110
*/
public class Card implements Comparable
{
   private final int rank, suit;
   private final static int SPADES = 1, CLUBS = 2, HEARTS = 3, DIAMONDS = 4;
   private final static int ACE = 1, JACK = 11, QUEEN = 12 , KING = 13;
   
   
   public Card(int rank, int suit)
   {
      assert isValidRank(rank); // search for valid rank
      assert isValidSuit(suit); // search for valid suit
      
      this.rank = rank;
      this.suit = suit;
   } 
   
   public int getSuit() // get suit
   {
      return suit;
   }
   
   public int getRank()
   {
      return rank;
   }
   
   public int compareTo(Object obj)
   {
      Card other = (Card)obj;
      int thisRank = this.getRank();
      int otherRank = other.getRank();
      if(thisRank == 1)
      {
         thisRank = 14;
      }
      if(otherRank == 1)
      {
         otherRank = 14;
      }
      return thisRank - otherRank;
   }
   
   public static boolean isValidRank(int rank)
   {
      return rank >= ACE && rank <= KING;
   }
   
   public static boolean isValidSuit(int suit)
   {
      return suit >= SPADES && suit <= DIAMONDS;
   }
   
   public String toString()
   {
      String val;
      String [] suitList = {" ", "Clubs", "Diamonds", "Hearts", "Spades"};
      
      if(rank == 1)
      {
         val = "Ace";
      }
      
      else if(rank == 11)
      {
         val = "Jack";
      }
      
      else if(rank == 12)
      {
         val = "Queen";
      }
      
      else if(rank == 13)
      {
         val = "King";
      }
      
      else val = String.valueOf(rank);
      String str = val + " of " + suitList[suit];
      
      for(int i = str.length() + 1; i <= 17; i++)
         str = str + " ";
      return str;
      
   }
   
   public boolean equals(Object obj)
   {
      if(obj instanceof Card)
      {
         Card other = (Card)obj;
         return value == other.value && suit == other.suit;
      }
      else
      {
         return false;
      }
   }
}