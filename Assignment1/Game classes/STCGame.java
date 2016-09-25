import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* Created by Adam Cowie from 15/08/2016(SuperTrumps,SuperTrumpsCard,SuperTrumpsCards)
 to 21/09/2016 (STCGame,STCDeck,STCCard,STCPlayer)
  to 25/9/2016. (STCGame,STCCard,STCheck) */
/* Game starts.
Created list of 5 players.
60 cards in cardSet with data added.
Cards move at random to cards arraylist.
8 cards moved from deck to each players arraylist.
Welcome message displayed.
Game randomly selects dealer player, and starts with dealer +1(to left of dealer).
First card to play, if computer player, random card from player arraylist,
and random choice category, set category, set value of this cards category.
If human player, all cards for player list to choose, choice of category displayed,
and value of this cards category set.
If not first card, check category currently set, build list of cards to use,
and, if player display to select, otherwise if computer makes a random selection.
If trump card is played, value check set to 0, and category is fix by card or
human player choice if THE GEOLOGIST or random choice if computer.
If no usable card is available to the player, one will be added to the players arraylist
and remove from the cards deck array list.
Game continues until a player has no cards left or the deck has no cards left.
player with the lowest number of cards wins.
 */
public class STCGame {
    // Allocate memory for vars and cards
    private static final int numOfCards = 60;
    private static final int numOfPlayers = 5;
    private static final int dealer = setDealer();
    private static final ArrayList<STCCard> cardSet = new ArrayList<>();
    private static final ArrayList<STCCard> cards = new ArrayList<>();
    private static final List<STCCard>[] players = new List[numOfPlayers];
    private static final STCheck check = new STCheck(0,0.00,false,"");
    public static void main(String[] args) {
        // Init game functions
        setupPlayers();
        setupCards();
        dealCards();
        // Display Welcome message
        welcome();
        // start hands with player left on dealer
            runGame();
    }
    private static void showHands(int player) {
            String type = "";
            switch (check.cardCheck) {//check.cardCheck
                case (0):
                    type = "ny";//Player can select card type
                    for (int i = 0; i < players[player].size(); i++) {
                        cardSet.add(players[player].get(i));
                    }
                    break;
                case (1):
                    type = " Hardness";
                    for (int i = 0; i < players[player].size(); i++) {
                        if (check.prevCard < players[player].get(i).getHardness()) {
                            cardSet.add(players[player].get(i));
                        }
                    }
                    break;
                case (2):
                    type = " Gravity";
                    for (int i = 0; i < players[player].size(); i++) {
                        if (check.prevCard < players[player].get(i).getGravity()) {
                            cardSet.add(players[player].get(i));
                        }
                    }
                    break;
                case (3):
                    type = " Cleavage";
                    for (int i = 0; i < players[player].size(); i++) {
                        if (check.prevCard < players[player].get(i).getCleavage()) {
                            cardSet.add(players[player].get(i));
                        }
                    }
                    break;
                case (4):
                    type = " Abundance";
                    for (int i = 0; i < players[player].size(); i++) {
                        if (check.prevCard < players[player].get(i).getAbundance()) {
                            cardSet.add(players[player].get(i));
                        }
                    }
                    break;
                case (5):
                    type = " Value";
                    for (int i = 0; i < players[player].size(); i++) {
                        if (check.prevCard < players[player].get(i).getValue()) {
                            cardSet.add(players[player].get(i));
                        }
                    }
                    break;
            }
            if (player == 0)// human player
            {
                if (cardSet.size() != 0) {
                    String[] temp = new String[cardSet.size()];
                    for (int j=0;j<cardSet.size();j++) {
                        temp[j]=cardSet.get(j).toString();
                    }
                    check.selection=lookHand(temp, type, player);
                    playCard(player,check.selection);
                    for (int j=0;j<players[player].size();j++) {
                        if (check.selection.startsWith(players[player].get(j).getCardName())) {
                            players[player].remove(j);
                        }
                    }
                } else {
                    String[]temp=new String[1];
                    temp[0]="Collect a new card from the deck.";
                    check.selection = lookHand(temp, type, player);
                    cardSet.clear();
                    dealCard();
                    players[player].add(cardSet.get(0));
                }
            }
            if (player != 0)// computer player
            {
                if (cardSet.size() != 0) {
                    int test=r((cardSet.size()-1));
                    check.selection = cardSet.get(test).toString();
                    playCard(player,check.selection);
                    for (int i=0;i<players[player].size();i++) {
                        if (check.selection.startsWith(players[player].get(i).toString())) {
                            players[player].remove(i);
                        }
                    }
                    cardSet.clear();

                } else {
                    cardSet.clear();
                    dealCard();
                    players[player].add(cardSet.get(0));
                    check.selection = "Collected new card from deck: " + cardSet.get(0).toString();
                }
            }
            if (cards.size() != 0) {
                cardSet.clear();
            } else {
                check.gameFinished=true;
            }
        cardSet.clear();
            JOptionPane.showMessageDialog(null, "Player " + player + " played the card " + check.selection + "\n with Category Type \"" + cats(check.cardCheck) + "\" and a value of " + check.prevCard, "Super Trumps Game : Player " + player + " has " + players[player].size() + " cards left.", JOptionPane.PLAIN_MESSAGE);
        if (players[player].size()<1){check.gameFinished=true;}
    }
    private static String cats(int check)
    {
        String cats="";
        switch (check)
        {
            case (1):cats="Hardness";break;
            case (2):cats="Gravity";break;
            case (3):cats="Cleavage";break;
            case (4):cats="Abundance";break;
            case (5):cats="Value";break;
        }
        return cats;
    }
    private static void category()//called for human player to select Category option
    {
        String[] cats = new String[5];
        cats[0]="Hardness";cats[1]="Gravity";cats[2]="Cleavage";cats[3]="Abundance";cats[4]="Value";
        String temp = (String)JOptionPane.showInputDialog(null, "Choose a Category to change to.", "Super Trumps Game : Deck has " + cards.size() + " cards.", JOptionPane.PLAIN_MESSAGE, null, cats, cats[0]);
        if(temp.equalsIgnoreCase("Hardness")){check.cardCheck=1;}
        if(temp.equalsIgnoreCase("Gravity")){check.cardCheck=2;}
        if(temp.equalsIgnoreCase("Cleavage")){check.cardCheck=3;}
        if(temp.equalsIgnoreCase("Abundance")){check.cardCheck=4;}
        if(temp.equalsIgnoreCase("Value")){check.cardCheck=5;}
    }
    private static void playCard(int player, String selection)//handle card plays
    {
        boolean found=false;//check trump cards
        if (selection.startsWith("THE GEMMOLOGIST")){check.cardCheck=1;check.prevCard=0;found=true;}
        if (selection.startsWith("THE GEOPHYSICIST")){check.cardCheck=2;check.prevCard=0;found=true;}
        if (selection.startsWith("THE MINERALOGIST")){check.cardCheck=3;check.prevCard=0;found=true;}
        if (selection.startsWith("THE PETROLOGIST")){check.cardCheck=4;check.prevCard=0;found=true;}
        if (selection.startsWith("THE MINER")){check.cardCheck=5;check.prevCard=0;found=true;}
        if (selection.startsWith("THE GEOLOGIST")&&player==0){category();check.prevCard=0;found=true;}
        if (selection.startsWith("THE GEOLOGIST")&&player!=0){check.cardCheck=r(5);check.prevCard=0;found=true;}
        if (!found)
        {//check other cards
            for (STCCard aCardSet : cardSet) {//if (selection.startsWith(cardSet.get(j).getCardName()))
                if (selection.startsWith(aCardSet.getCardName())) {
                    switch (check.cardCheck)
                    {
                        case (0):check.cardCheck=r(4)+1;for(int i=0;i<6;i++)//if new cat for pc allocate value
                        {
                            switch (i)
                            {
                                case (1):check.prevCard = aCardSet.getHardness();break;
                                case (2):check.prevCard = aCardSet.getGravity();break;
                                case (3):check.prevCard = aCardSet.getCleavage();break;
                                case (4):check.prevCard = aCardSet.getAbundance();break;
                                case (5):check.prevCard = aCardSet.getValue();break;
                            }
                        }break;
                        case (1):check.prevCard = aCardSet.getHardness();break;
                        case (2):check.prevCard = aCardSet.getGravity();break;
                        case (3):check.prevCard = aCardSet.getCleavage();break;
                        case (4):check.prevCard = aCardSet.getAbundance();break;
                        case (5):check.prevCard = aCardSet.getValue();break;
                    }
                }
            }
        }
    }
    private static String lookHand(String message[], String type, int player){
        return(String)JOptionPane.showInputDialog(null, "Player " + player + " , choose a" + type + " card" , "Super Trumps Game : Deck has " + cards.size() + " Player has " + cardSet.size(), JOptionPane.QUESTION_MESSAGE, null, message, message[0]);}
    private static void runGame()
    {
        int i;
        if(dealer==5){i=0;}else{i=dealer+1;}// control players turns
        do {
            showHands(i++);// Game hand control - playing game
            if(i==5){i=0;}
        }while(!check.getGameFinished());
        // Check winning player
        JOptionPane.showMessageDialog(null, "Congrats to Player " + winner(), "Super Trumps Game", JOptionPane.PLAIN_MESSAGE);
        // Display Finished message
        JOptionPane.showMessageDialog(null, "Thanks for playing my Super Trumps Game", "Super Trumps Game", JOptionPane.PLAIN_MESSAGE);
    }
    private static int winner()
    {
        int win=10;
        int player=0;
        for(int i=0;i<numOfPlayers;i++){if(players[i].size()<win){win=players[i].size();player=i;}}
        return player;
    }
    private static void welcome()
    {
        UIManager.put("OptionPane.okButtonText", "Next");
        JOptionPane.showMessageDialog(null, "Welcome to the Super Trumps Game", "Super Trumps Game", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This game has one human player, and 4 computer players", "Super Trumps Game", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "The Dealer player is number: " + dealer, "Super Trumps Game", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Cards are shuffled and each player has been dealt 8 cards", "Super Trumps Game : Deck has " + cards.size() + " cards.", JOptionPane.PLAIN_MESSAGE);
    }
    private static int setDealer(){return r(numOfPlayers)-1;}
    private static void setupPlayers(){for (int i = 0; i<numOfPlayers; i++) {players[i] = new ArrayList<>();}}
    private static void dealCards()
    {
        for(int i=0;i<8;i++)// deal 8 cards
        {
            for(int j=0;j<numOfPlayers;j++)// 5 players
            {
                players[j].add(cards.get(0));//get card from cards deck copy to players hand
                cards.remove(0);//remove card from cards deck
            }
        }
    }
    private static void dealCard()
    {
        STCGame.cardSet.add(cards.get(0));//get card from cards deck copy to temp deck
        cards.remove(0);//remove card from cards deck
    }

    private static void shuffleCards()
    {
        for(int i=0;i<numOfCards;i++)//60 cards move from cardSet to cards with random positions
        {
            int t = r(cardSet.size()-1);//pick random card from cardSet
            cards.add(cardSet.get(t));//copy card from cardSet to cards
        //    cards.add(i,cardSet.get(t));
            cardSet.remove(t);//delete card from cardSet
        }
    }
    private static int r(int max) {
        int min=0;
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt((max - min) + 1) + min;
    }

    private static void setupCards()
    {
        cardSet.add(new STCCard("QUARTZ", "MINERAL", "SiO2", "Tectosilicate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 7.0, 2.65, 2, 5, 3));
        cardSet.add(new STCCard("PLAGIOCLASE", "MINERAL", "NaAlSi3O8 - CaAl2Si2O8", "Tectosilicate", "Triclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.8, 10, 6, 3));
        cardSet.add(new STCCard("ORTHOCLASE", "MINERAL", "KAlSi3O8", "Tectosilicate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.6, 10, 5, 3));
        cardSet.add(new STCCard("BIOTITE", "MINERAL", "K(Fe,Mg)3AlSi3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 3.3, 9, 4, 2));
        cardSet.add(new STCCard("MUSCOVITE", "MINERAL", "KAl3Si3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 2.9, 9, 4, 3));
        cardSet.add(new STCCard("HORNBLENDE", "MINERAL", "Ca2(Mg,Fe)4Al2Si7O22(OH)2", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.0, 3.5, 7, 4, 1));
        cardSet.add(new STCCard("ACTINOLITE", "MINERAL", "Ca2(Mg,Fe)5Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.5, 7, 3, 2));
        cardSet.add(new STCCard("GLAUCOPHANE", "MINERAL", "Na2(Mg,Fe)3Al2Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.2, 7, 3, 1));
        cardSet.add(new STCCard("OLIVINE", "MINERAL", "(Mg,Fe)2SiO4", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 7.0, 4.4, 4, 5, 2));
        cardSet.add(new STCCard("GARNET", "MINERAL", "(Fe,Mg,Ca,Mn)3(Al,Fe)2Si3O12", "Nesosilicate", "Isometric", "Igneous, Metamorphic, Mantle", 7.5, 4.3, 1, 4, 3));
        cardSet.add(new STCCard("TITANITE", "MINERAL", "CaTiSiO5", "Nesosilicate", "Monoclinic", "Igneous, Metamorphic", 5.5, 3.6, 8, 3, 2));
        cardSet.add(new STCCard("ZIRCON", "MINERAL", "ZrSiO4", "Nesosilicate", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.5, 4.7, 4, 2, 3));
        cardSet.add(new STCCard("AUGITE", "MINERAL", "Ca(Mg,Fe)Si2O6", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.6, 7, 5, 1));
        cardSet.add(new STCCard("ORTHOPYROXENE", "MINERAL", "(Mg,Fe)2Si2O6", "Inosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 6.0, 3.9, 7, 5, 1));
        cardSet.add(new STCCard("CHLORITE", "MINERAL", "(Mg,Fe)5Al2Si3O10(OH)8", "Phyllosilicate", "Monoclinic", "Metamorphic", 3.0, 3.3, 9, 4, 2));
        cardSet.add(new STCCard("ANTIGORITE", "MINERAL", "(Mg,Fe)3Si2O5(OH)4", "Phyllosilicate", "Monoclinic", "Metamorphic, Mantle", 4.0, 2.6, 9, 3, 2));
        cardSet.add(new STCCard("TALC", "MINERAL", "Mg3Si4O10(OH)2", "Phyllosilicate", "Monoclinic", "Metamorphic", 1.0, 2.8, 9, 3, 3));
        cardSet.add(new STCCard("KAOLINITE", "MINERAL", "Al2Si2O5(OH)", "Phyllosilicate", "Triclinic", "Sedimentary", 2.5, 2.7, 9, 4, 4));
        cardSet.add(new STCCard("ANDALUSITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Metamorphic", 7.0, 3.15, 7, 3, 3));
        cardSet.add(new STCCard("KYANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Triclinic", "Metamorphic", 7.0, 3.7, 10, 2, 3));
        cardSet.add(new STCCard("SILLIMANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic", 7.5, 3.25, 10, 3, 2));
        cardSet.add(new STCCard("STAUROLITE", "MINERAL", "(Fe,Mg)2Al9Si4O22(OH)2", "Nesosilicate", "Metamorphic", "Metamorphic", 7.0, 3.8, 5, 2, 2));
        cardSet.add(new STCCard("EPIDOTE", "MINERAL", "Ca2(Al,Fe)3Si3O12(OH)", "Sorosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.5, 9, 4, 1));
        cardSet.add(new STCCard("TOURMALINE", "MINERAL", "Na(Mg,Fe)3Al6B3Si6O27(OH)4", "Cyclosilicate", "Hexagonal", "Metamorphic", 7.5, 3.2, 4, 2, 3));
        cardSet.add(new STCCard("TOPAZ", "MINERAL", "Al2SiO4(F,OH)2", "Nesosilicate", "Orthorhombic", "Metamorphic, Sedimentary", 8.0, 3.6, 9, 1, 2));
        cardSet.add(new STCCard("BERYL", "MINERAL", "Be3Al2Si6O18", "Cyclosilicate", "Hexagonal", "Igneous, Metamorphic", 8.0, 2.9, 3, 2, 3));
        cardSet.add(new STCCard("PYRITE", "MINERAL", "FeS2", "Sulfide", "Isometic", "Igneous, Metamorphic", 6.5, 5.0, 4, 3, 3));
        cardSet.add(new STCCard("PYRRHOTITE", "MINERAL", "Fe1-xS", "Sulfide", "Monoclinic", "Igneous, Metamorphic", 4.5, 4.6, 1, 3, 3));
        cardSet.add(new STCCard("CHALCOPYRITE", "MINERAL", "CuFeS2", "Sulfide", "Tetragonal", "Igneous, Metamorphic", 4.0, 4.3, 4, 3, 5));
        cardSet.add(new STCCard("GALENA", "MINERAL", "PbS", "Sulfide", "Isometic", "Metamorphic", 2.5, 7.6, 13, 2, 4));
        cardSet.add(new STCCard("SPHALERITE", "MINERAL", "(Zn,Fe)S", "Sulfide", "Isometic", "Metamorphic", 4.0, 4.1, 15, 2, 4));
        cardSet.add(new STCCard("MOLYBDENITE", "MINERAL", "MoS2", "Sulfide", "Hexagonal", "Igneous, Metamorphic", 1.5, 4.7, 9, 2, 4));
        cardSet.add(new STCCard("GOLD", "MINERAL", "Au", "Naive Element", "Isometic", "Metamorphic, Sedimentary", 3.0, 19.3, 1, 1, 6));
        cardSet.add(new STCCard("DIAMOND", "MINERAL", "C", "Naive Element", "Isometic", "Igneous, Metamorphic, Sedimentary", 10.0, 3.5, 14, 1, 6));
        cardSet.add(new STCCard("GRAPHITE", "MINERAL", "C", "Naive Element", "Hexagonal", "Metamorphic, Sedimentary", 2.0, 2.2, 9, 2, 3));
        cardSet.add(new STCCard("HALITE", "MINERAL", "NaCl", "Halide", "Isometic", "Sedimentary", 2.5, 2.2, 13, 2, 3));
        cardSet.add(new STCCard("FLUORITE", "MINERAL", "CaF2", "Halide", "Isometic", "Metamorphic", 4.0, 3.2, 14, 2, 3));
        cardSet.add(new STCCard("GYPSUM", "MINERAL", "CaSO4(H2O)2", "Sulfide", "Monoclinic", "Metamorphic, Sedimentary", 2.0, 2.3, 11, 2, 4));
        cardSet.add(new STCCard("BARITE", "MINERAL", "BaSO4", "Sulfide", "Orthorhombic", "Metamorphic, Sedimentary", 3.5, 4.5, 12, 2, 3));
        cardSet.add(new STCCard("APATITE", "MINERAL", "Ca5(PO4)3(OH,F,Cl)", "Phosphate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 5.0, 3.2, 4, 3, 4));
        cardSet.add(new STCCard("MONAZITE", "MINERAL", "(La,Ce,Nd)PO4", "Phosphate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 5.0, 5.3, 6, 2, 3));
        cardSet.add(new STCCard("CALCITE", "MINERAL", "CaCO3", "Carbonate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 3.0, 2.7, 13, 4, 4));
        cardSet.add(new STCCard("DOLOMITE", "MINERAL", "CaMg(CO3)2", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 2.9, 13, 3, 2));
        cardSet.add(new STCCard("MAGNESITE", "MINERAL", "MgCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 3.0, 13, 3, 3));
        cardSet.add(new STCCard("SIDERITE", "MINERAL", "FeCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.5, 4.0, 13, 2, 3));
        cardSet.add(new STCCard("MAGNETITE", "MINERAL", "Fe3O4", "Oxide (Spinel)", "Isometic", "Igneous, Metamorphic, Sedimentary", 6.0, 5.2, 1, 4, 5));
        cardSet.add(new STCCard("HEMATITE", "MINERAL", "Fe2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 6.0, 5.3, 1, 2, 4));
        cardSet.add(new STCCard("CHROMITE", "MINERAL", "(Fe,Mg)Cr2O4", "Oxide (Spinel)", "Isometic", "Igneous, Sedimentary", 5.5, 5.1, 1, 3, 4));
        cardSet.add(new STCCard("ILMENITE", "MINERAL", "TiFeO3", "Oxide", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 6.0, 4.8, 1, 3, 3));
        cardSet.add(new STCCard("RUTILE", "MINERAL", "TiO2", "Oxide", "Tetragonal", "Metamorphic, Sedimentary", 6.5, 4.3, 7, 3, 4));
        cardSet.add(new STCCard("CORUNDUM", "MINERAL", "Al2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 9.0, 4.0, 1, 2, 3));
        cardSet.add(new STCCard("CASSITERITE", "MINERAL", "SnO2", "Oxide", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.0, 7.1, 6, 2, 4));
        cardSet.add(new STCCard("GIBBSITE", "MINERAL", "Al(OH)3", "Hydroxide", "Monoclinic", "Metamorphic, Sedimentary", 3.5, 2.4, 9, 3, 4));
        cardSet.add(new STCCard("GOETHITE", "MINERAL", "FeO(OH)", "Hydroxide", "Orthorhombic", "Sedimentary", 5.5, 4.3, 10, 4, 3));
        cardSet.add(new STCCard("THE MINER - Change to Value ", "TRUMP", " ", "Change category to Economic Value", " ", " ", 11.0, 20.0, 16, 7, 7));
        cardSet.add(new STCCard("THE PETROLOGIST - Change to Abundance ", "TRUMP", " ", "Change category to Crustal Abundance", " ", " ", 11.0, 20.0, 16, 7, 7));
        cardSet.add(new STCCard("THE GEMMOLOGIST - Change to Hardness ", "TRUMP", " ", "Change category to Hardness", " ", " ", 11.0, 20.0, 16, 7, 7));
        cardSet.add(new STCCard("THE MINERALOGIST - Change to Cleavage ", "TRUMP", " ", "Change category to Cleavage", " ", " ", 11.0, 20.0, 16, 7, 7));
        cardSet.add(new STCCard("THE GEOPHYSICIST - Change to Gravity ", "TRUMP", " ", "Change category to Specific Gravity, or throw Magnetite", " ", " ", 11.0, 20.0, 16, 7, 7));
        cardSet.add(new STCCard("THE GEOLOGIST - Change to Your Choice ", "TRUMP", " ", "Change category to Your Choice", " ", " ", 11.0, 20.0, 16, 7, 7));
        shuffleCards();
    }
}