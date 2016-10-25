/**
 * Created by Adam Cowie on 21/09/2016.
 */
public class STCCard {

    private String cardName;
    private String cardType;
    private String cardChem;
    private String cardClass;
    private String cardCrystal;
    private String cardOccurrence;
    private String cardImage;
    private double cardHardness;
    private double cardGravity;
    private int cardCleavage;
    private int cardAbundance;
    private int cardValue;

    public STCCard(String cardName, String cardType, String cardChem, String cardClass, String cardCrystal, String cardOccurrence, double cardHardness, double cardGravity, int cardCleavage, int cardAbundance, int cardValue, String cardImage) {
        setCard(cardName, cardType, cardChem, cardClass, cardCrystal, cardOccurrence, cardHardness, cardGravity, cardCleavage, cardAbundance, cardValue, cardImage);
    }

    public String toString() {
        return this.cardName + "\n  Hardness= " + this.cardHardness + "  |  Gravity= " + this.cardGravity + "  |  Cleavage= " + cleavageToString(this.cardCleavage) + "  |  Abundance= " + abundanceToString(this.cardAbundance) + "  |  Value= " + valueToString(this.cardValue) + " ";
    }

    public String getCardName() {
        return this.cardName;
    }

    public double getHardness() {
        return this.cardHardness;
    }

    public double getGravity() {
        return this.cardGravity;
    }

    public int getCleavage() {
        return this.cardCleavage;
    }

    public int getAbundance() {
        return this.cardAbundance;
    }

    public int getValue() {
        return this.cardValue;
    }

    public String getImage() {
        return this.cardImage;
    }

    public void setCard(String cardName, String cardType, String cardChem, String cardClass, String cardCrystal, String cardOccurrence, double cardHardness, double cardGravity, int cardCleavage, int cardAbundance, int cardValue, String cardImage) {
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardChem = cardChem;
        this.cardClass = cardClass;
        this.cardCrystal = cardCrystal;
        this.cardOccurrence = cardOccurrence;
        this.cardHardness = cardHardness;
        this.cardGravity = cardGravity;
        this.cardCleavage = cardCleavage;
        this.cardAbundance = cardAbundance;
        this.cardValue = cardValue;
        this.cardImage = cardImage;
    }

    public String valueToString(int num) {
        switch (num) {
            case (1):
                return "1 Trivial";
            case (2):
                return "2 Low";
            case (3):
                return "3 Moderate";
            case (4):
                return "4 High";
            case (5):
                return "5 Very High";
            case (6):
                return "6 I'm Rich!";
            case (7):
                return "TRUMP";
            default:
                return "ERROR - getValue";
        }
    }

    public String abundanceToString(int num) {
        switch (num) {
            case (1):
                return "1 Ultra Trace";
            case (2):
                return "2 Trace";
            case (3):
                return "3 Low";
            case (4):
                return "4 Moderate";
            case (5):
                return "5 High";
            case (6):
                return "6 Very High";
            case (7):
                return "TRUMP";
            default:
                return "ERROR - getAbundance";
        }
    }

    public String cleavageToString(int num) {
        switch (num) {
            case (1):
                return "1 None";
            case (2):
                return "2 Poor / None";
            case (3):
                return "3 One Poor";
            case (4):
                return "4 Two Poor";
            case (5):
                return "5 One Good";
            case (6):
                return "6 One Good, One Poor";
            case (7):
                return "7 Two Good";
            case (8):
                return "8 Three Good";
            case (9):
                return "9 One Perfect";
            case (10):
                return "10 One Perfect, One Good";
            case (11):
                return "11 One Perfect, Two Good";
            case (12):
                return "12 Two Perfect, One Good";
            case (13):
                return "13 Three Perfect";
            case (14):
                return "14 Four Perfect";
            case (15):
                return "15 Six Perfect";
            case (16):
                return "TRUMP";
            default:
                return "ERROR - getAbundance";
        }
    }
}
