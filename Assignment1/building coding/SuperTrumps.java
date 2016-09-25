/**
 * Created by Adam Cowie on 15/08/2016.
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class SuperTrumps {

 //   private static SuperTrumpsCards theCards;

    public static void main(String[] args)
    {
        // Allocate memory for cards
     //   theCards;

        // Declare Variables
        String[] playerNames;
        int numPlayers=0;
        int[] myCards;
        int numCards=60;
        int cardDeal=8;
        int cardCount=0;
        int playersHand[][];

        // allocates memory for player names
        playerNames = new String[numPlayers];

        // Setup cards for game
        myCards = new int[numCards];
        for(int i =0;i<numCards ;i++){myCards[i]=i;}

        // Display Welcome message
        JOptionPane.showMessageDialog(null,"Welcome to the Super Trumps Game", "Super Trumps Game" ,JOptionPane.PLAIN_MESSAGE);

        // Display Request for players
        do {
            String numOfPlayers = JOptionPane.showInputDialog(null, "Enter Number of players, from 3 to 5:", "Super Trumps - number of players", JOptionPane.INFORMATION_MESSAGE);
            numPlayers = Integer.parseInt(numOfPlayers);
        }while(numPlayers<3||numPlayers>5);

      for(int i=0;i<numPlayers;i++)
        {
            // Display Request for player names
            playerNames[i] = JOptionPane.showInputDialog(null,"Enter Name of player " +(i+1)+ " :", "Super Trumps - player name", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Player: " + playerNames[i]);
        }

        // Deal cards to players
        playersHand = new int[numPlayers][cardDeal];//5X8
        for(int i =0;i<numPlayers ;i++){for(int j =0;j<cardDeal ;j++){playersHand[i][j]=0;}}

        /* Deal cards to players
        for(int j=0;j<cardDeal;j++)//8 cardDeal
        {
            for (int i=0;i<numPlayers;i++)//5 numPlayers
            {
                boolean newCard = false;
                do {
                    int temp = (randInt(1, numCards)) - 1;
                    if (myCards[temp]==0)
                    {
                        playersHand[i][j]=temp;
                        myCards[temp]=i;
                        newCard = true;
                    }
                } while (!newCard);
            }
        }*/

        // MORE
      //  for (int i=0;i<5;i++){for(int j=0;j<8;j++){System.out.println("Player: " + (i+1) + " Card: " + (j+1) + " = " + playersHand[i][j]);}}









    }

    private void ShuffleArray(int[] array)
    {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static int randInt(int min, int max)
    {
        Random rand = new Random();
        int temp;
        temp = rand.nextInt((max - min) + 1) + min;
        return temp;
    }


}
