/*
Emile Rivat
Final Project
War GUI
12-3-2014
CS 110
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.Color;

public class WarGUI extends JFrame
{
   private JPanel jContentPane = null;
   private JLabel PlayerACard = null;
   private JLabel PlayerBCard = null;
   private JPanel ControlPanel = null;
   private Border blackLine = BorderFactory.createLineBorder(Color.black);
   private Border raisedEtched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
   private Border raisedBevel = BorderFactory.createRaisedBevelBorder();
   private Border loweredBevel = BorderFactory.createLoweredBevelBorder();
   private JButton Play = null;
   private JButton Quit = null;
   private JLabel ACardsRemaining = null;
   private JLabel BCardsRemaining = null;
   private JLabel AWarSlot1 = null;
   private JLabel AWarSlot2 = null;
   private JLabel BWarSlot1 = null;
   private JLabel BWarSlot2 = null;
   private JTextArea messageBox = null;
   private JLabel jLabelA = null;
   private JLabel jLabelB = null;
   private JLabel labelRemainA = null;
   private JLabel labelRemainB = null;
   private JButton newGame = null;

   private JPanel getControlPanel()
   {
      if(this.ControlPanel == null)
      {
         this.ControlPanel = new JPanel();
         this.ControlPanel.setBorder(this.raisedEtched);
         this.ControlPanel.setLayout(new GridBagLayout());
      }
      return this.ControlPanel;
   }
   
   private ImageIcon getCardPic(String card)
   {
      ImageIcon getCardPic = new ImageIcon("cards/" + card + ".jpg");
      return getCardPic;
   }

   private JPanel getJContentPane()
   {
      if (this.jContentPane == null) 
      {
			this.jLabelA = new JLabel();
			this.jLabelA.setBounds(new Rectangle(40, 75, 100, 30));
			this.jLabelA.setText("First Player's Hand");
			this.messageBox = new JTextArea();
			this.messageBox.setBounds(new Rectangle(50, 300, 375, 100));
			this.messageBox.setText("");
			messageBox.setBackground(new Color(51, 204, 51));
			this.messageBox.setEditable(false);
			this.PlayerACard = new JLabel();
			this.PlayerACard.setText("Player One");
			this.PlayerACard.setBounds(new Rectangle(50, 100, 73, 97));
			this.PlayerACard.setBorder(this.raisedBevel);
			this.AWarSlot1 = new JLabel();
			this.AWarSlot1.setBounds(new Rectangle(200, 50, 73, 97));
			this.AWarSlot1.setText("");
			this.AWarSlot1.setBackground(Color.black);
			this.AWarSlot1.setBorder(this.loweredBevel);
			this.AWarSlot2 = new JLabel();
			this.AWarSlot2.setBounds(new Rectangle(350, 50, 73, 97));
			this.AWarSlot2.setText("");
			this.AWarSlot2.setBackground(Color.black);
			this.AWarSlot2.setBorder(this.loweredBevel);
			this.ACardsRemaining = new JLabel();
			this.ACardsRemaining.setBounds(new Rectangle(60, 200, 50, 20));
			this.ACardsRemaining.setText("0");
			this.ACardsRemaining.setHorizontalAlignment(SwingConstants.CENTER);
			this.ACardsRemaining.setBorder(this.blackLine);
			this.ACardsRemaining.setForeground(Color.black);
			this.labelRemainA = new JLabel();
		   this.labelRemainA.setBounds(new Rectangle(40, 220, 100, 25));
			this.labelRemainA.setText("Remaining Cards");
			this.jLabelB = new JLabel();
			this.jLabelB.setBounds(new Rectangle(490, 75, 100, 30));
			this.jLabelB.setText("Player Two's Hand");
			this.PlayerBCard = new JLabel();
			this.PlayerBCard.setText("Player Two");
			this.PlayerBCard.setBounds(new Rectangle(500, 99, 73, 97));
			this.PlayerBCard.setBorder(this.raisedBevel);
			this.BWarSlot1 = new JLabel();
			this.BWarSlot1.setBounds(new Rectangle(200, 150, 73, 97));
			this.BWarSlot1.setText("");
			this.BWarSlot1.setBackground(Color.black);
			this.BWarSlot1.setBorder(this.loweredBevel);
			this.BWarSlot2 = new JLabel();
			this.BWarSlot2.setBounds(new Rectangle(350, 150, 73, 97));
			this.BWarSlot2.setText("");
			this.BWarSlot2.setBackground(Color.black);
			this.BWarSlot2.setBorder(this.loweredBevel);
			this.labelRemainB = new JLabel();
			this.labelRemainB.setBounds(new Rectangle(490, 220, 100, 25));
			this.labelRemainB.setText("Remaining Cards");
			this.BCardsRemaining = new JLabel();
			this.BCardsRemaining.setBounds(new Rectangle(510, 200, 50, 20));
			this.BCardsRemaining.setText("0");
			this.BCardsRemaining.setHorizontalAlignment(SwingConstants.CENTER);
			this.BCardsRemaining.setBorder(this.blackLine);
			this.BCardsRemaining.setForeground(Color.black);
			this.jContentPane = new JPanel();
			this.jContentPane.setLayout(null);
			jContentPane.setBackground(new Color(51, 204, 51));
			this.jContentPane.add(this.PlayerACard);
			this.jContentPane.add(this.PlayerBCard);
			this.jContentPane.add(getControlPanel());
			this.jContentPane.add(getPlay(), null);
			this.jContentPane.add(getQuit(), null);
			this.jContentPane.add(this.ACardsRemaining, null);
			this.jContentPane.add(this.BCardsRemaining, null);
			this.jContentPane.add(this.AWarSlot1, null);
			this.jContentPane.add(this.AWarSlot2, null);
			this.jContentPane.add(this.BWarSlot1, null);
			this.jContentPane.add(this.BWarSlot2, null);
			this.jContentPane.add(this.messageBox, null);
			this.jContentPane.add(this.jLabelA, null);
			this.jContentPane.add(this.jLabelB, null);
			this.jContentPane.add(this.labelRemainA, null);
			this.jContentPane.add(this.labelRemainB, null);
			this.jContentPane.add(getNewGame(), null);
      }
      return this.jContentPane;
   }
   
   private JButton getNewGame() // Starts a new game
   {
         
   }
   
   private JButton getPlay() // Plays game
   {
   
   }
   
   private JButton getQuit() // Quits Game
   {
      if(this.Quit == null)
      {
         this.Quit = new JButton();
         this.Quit.setBounds(new Rectangle(600, 400, 50, 50));
         this.Quit.addActionListener(new java.awt.event.ActionListener()
         {
            public void actionPerformed(java.awt.event.ActionEvent e)
            {
               System.exit(0);
            }
         });
      }
      return this.Quit;
   }
   
   private void initialize() // initial main frame
   {
      this.setSize(700, 600);
      this.setContentPane(getJContentPane());
      this.add(getControlPanel());
      this.setTitle("Game of War");
   }
   
   public static void main(String [] args)
   {
      SwingUtilities.invokeLater(new Runnable()
      {
         public void run()
         {
            WarGUI thisClass = new WarGUI();
            thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            thisClass.setVisible(true);
         }
      });
   }
   
}
