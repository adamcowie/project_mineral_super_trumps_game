/**
 * Created by Adam Cowie on 15/08/2016.
 */
import javax.swing.JOptionPane;
public class SuperTrumps {

    private static SuperTrumpsCards theCards;
    public static void main(String[] args)
    {
        // Allocate memory for cards
        theCards.getCardInfo(0);

        // Declare Variables
        String[] myPlayers;
        int numPlayers=0;

        // Display Welcome message
        JOptionPane.showMessageDialog(null,"Welcome to the Super Trumps Game", "Super Trumps Game" ,JOptionPane.PLAIN_MESSAGE);

        // Display Request for players
        do {
            String numOfPlayers = JOptionPane.showInputDialog(null, "Enter Number of players, from 3 to 5:", "Super Trumps - number of players", JOptionPane.INFORMATION_MESSAGE);
            numPlayers = Integer.parseInt(numOfPlayers);
        }while(numPlayers<3||numPlayers>5);

        // allocates memory for player names
        myPlayers = new String[numPlayers];

        for(int i =0;i<numPlayers;i++)
        {
            // Display Request for player names
            myPlayers[i] = JOptionPane.showInputDialog(null,"Enter Name of player " +(i+1)+ " :", "Super Trumps - player name", JOptionPane.INFORMATION_MESSAGE);
        }


        // NEXT


    }
}