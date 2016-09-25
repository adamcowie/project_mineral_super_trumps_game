/**
 * Created by Adam Cowie on 15/08/2016.
 */
public class SuperTrumpsCard {

    private String cardName;
    private String cardType;
    private String cardChem;
    private String cardClass;
    private String cardCrystal;
    private String cardOccurrence;
    private double cardHardness;
    private double cardGravity;
    private int cardCleavage;
    private int cardAbundance;
    private int cardValue;
    private boolean cardChosen;

    public SuperTrumpsCard(){}

    public SuperTrumpsCard(String cardName, String cardType, String cardChem, String cardClass, String cardCrystal, String cardOccurrence, double cardHardness, double cardGravity, int cardCleavage, int cardAbundance, int cardValue, boolean cardChosen)
        {
        this.cardName=cardName;
        this.cardType=cardType;
        this.cardChem=cardChem;
        this.cardClass=cardClass;
        this.cardCrystal=cardCrystal;
        this.cardOccurrence=cardOccurrence;
        this.cardHardness=cardHardness;
        this.cardGravity=cardGravity;
        this.cardCleavage=cardCleavage;
        this.cardAbundance=cardAbundance;
        this.cardValue=cardValue;
        this.cardChosen=cardChosen;
    }
    public void setCard(String cardName, String cardType, String cardChem, String cardClass, String cardCrystal, String cardOccurrence, double cardHardness, double cardGravity, int cardCleavage, int cardAbundance, int cardValue, boolean cardChosen)
    {
        this.cardName=cardName;
        this.cardType=cardType;
        this.cardChem=cardChem;
        this.cardClass=cardClass;
        this.cardCrystal=cardCrystal;
        this.cardOccurrence=cardOccurrence;
        this.cardHardness=cardHardness;
        this.cardGravity=cardGravity;
        this.cardCleavage=cardCleavage;
        this.cardAbundance=cardAbundance;
        this.cardValue=cardValue;
        this.cardChosen=cardChosen;
    }

    public SuperTrumpsCard getCard()
    {
      //  return SuperTrumpsCard();
    }

    public String cardValue(int num)
    {
        switch (num){
            case(1): return"Trivial";
            case(2): return"Low";
            case(3): return"Moderate";
            case(4): return"High";
            case(5): return"Very High";
            case(6): return"I'm Rich!";
            default: return"ERROR - getValue";
        }
    }
    public String cardAbundance(int num)
    {
        switch (num){
            case(1): return"Ultra Trace";
            case(2): return"Trace";
            case(3): return"Low";
            case(4): return"Moderate";
            case(5): return"High";
            case(6): return"Very High";
            default: return"ERROR - getAbundance";
        }
    }
    public String cardCleavage(int num)
    {
        switch (num){
            case(1): return"None";
            case(2): return"Poor / None";
            case(3): return"1 Poor";
            case(4): return"2 Poor";
            case(5): return"1 Good";
            case(6): return"1 Good, 1 Poor";
            case(7): return"2 Good";
            case(8): return"3 Good";
            case(9): return"1 Perfect";
            case(10): return"1 Perfect, 1 Good";
            case(11): return"1 Perfect, 2 Good";
            case(12): return"2 Perfect, 1 Good";
            case(13): return"3 Perfect";
            case(14): return"4 Perfect";
            case(15): return"6 Perfect";
            default: return"ERROR - getAbundance";
        }
    }
}
