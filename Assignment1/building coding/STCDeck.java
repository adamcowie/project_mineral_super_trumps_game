import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Admin on 21/09/2016.
 */
public class STCDeck {

    // Allocate memory for cards
    protected static int numOfCards = 60;
 //   int cardCount=0;
    public static ArrayList<Integer> myCards = new ArrayList<Integer>();
    public static STCCard[] cards = new STCCard[numOfCards];
  //  public static STCCard card = new STCCard();


    public STCDeck()
    {
        setupCards();
        shuffleCards();
  //      JOptionPane.showMessageDialog(null,cards[0].getCard(), "Super Trumps Game" ,JOptionPane.PLAIN_MESSAGE);
    }

    public String disCard(int a)
    {
        String temp = " "; // cards[a].getCard();
        return temp;
    }

    protected static void shuffleCards()
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<60;i++){a.add(i,i);}
        for(int i=0;i<60;i++)
        {
            int t = r(a.size()-1);
            myCards.add(i,a.get(t));
            a.remove(t);
        }
    }

    public static boolean yesNo() {
        Random random = new Random();
        return random.nextBoolean();
    }

    protected static int randInt(int min, int max) {

        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt((max - min) + 1) + min;
    }

    protected static int r(int max) {
        int min=0;
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt((max - min) + 1) + min;
    }

    protected static void setupCards()
    {
        cards[0].setCard("QUARTZ", "MINERAL", "SiO2", "Tectosilicate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 7.0, 2.65, 2, 5, 3);
        cards[1].setCard("PLAGIOCLASE", "MINERAL", "NaAlSi3O8 - CaAl2Si2O8", "Tectosilicate", "Triclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.8, 10, 6, 3);
        cards[2].setCard("ORTHOCLASE", "MINERAL", "KAlSi3O8", "Tectosilicate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.6, 10, 5, 3);
        cards[3].setCard("BIOTITE", "MINERAL", "K(Fe,Mg)3AlSi3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 3.3, 9, 4, 2);
        cards[4].setCard("MUSCOVITE", "MINERAL", "KAl3Si3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 2.9, 9, 4, 3);
        cards[5].setCard("HORNBLENDE", "MINERAL", "Ca2(Mg,Fe)4Al2Si7O22(OH)2", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.0, 3.5, 7, 4, 1);
        cards[6].setCard("ACTINOLITE", "MINERAL", "Ca2(Mg,Fe)5Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.5, 7, 3, 2);
        cards[7].setCard("GLAUCOPHANE", "MINERAL", "Na2(Mg,Fe)3Al2Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.2, 7, 3, 1);
        cards[8].setCard("OLIVINE", "MINERAL", "(Mg,Fe)2SiO4", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 7.0, 4.4, 4, 5, 2);
        cards[9].setCard("GARNET", "MINERAL", "(Fe,Mg,Ca,Mn)3(Al,Fe)2Si3O12", "Nesosilicate", "Isometric", "Igneous, Metamorphic, Mantle", 7.5, 4.3, 1, 4, 3);
        cards[10].setCard("TITANITE", "MINERAL", "CaTiSiO5", "Nesosilicate", "Monoclinic", "Igneous, Metamorphic", 5.5, 3.6, 8, 3, 2);
        cards[11].setCard("ZIRCON", "MINERAL", "ZrSiO4", "Nesosilicate", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.5, 4.7, 4, 2, 3);
        cards[12].setCard("AUGITE", "MINERAL", "Ca(Mg,Fe)Si2O6", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.6, 7, 5, 1);
        cards[13].setCard("ORTHOPYROXENE", "MINERAL", "(Mg,Fe)2Si2O6", "Inosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 6.0, 3.9, 7, 5, 1);
        cards[14].setCard("CHLORITE", "MINERAL", "(Mg,Fe)5Al2Si3O10(OH)8", "Phyllosilicate", "Monoclinic", "Metamorphic", 3.0, 3.3, 9, 4, 2);
        cards[15].setCard("ANTIGORITE", "MINERAL", "(Mg,Fe)3Si2O5(OH)4", "Phyllosilicate", "Monoclinic", "Metamorphic, Mantle", 4.0, 2.6, 9, 3, 2);
        cards[16].setCard("TALC", "MINERAL", "Mg3Si4O10(OH)2", "Phyllosilicate", "Monoclinic", "Metamorphic", 1.0, 2.8, 9, 3, 3);
        cards[17].setCard("KAOLINITE", "MINERAL", "Al2Si2O5(OH)", "Phyllosilicate", "Triclinic", "Sedimentary", 2.5, 2.7, 9, 4, 4);
        cards[18].setCard("ANDALUSITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Metamorphic", 7.0, 3.15, 7, 3, 3);
        cards[19].setCard("KYANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Triclinic", "Metamorphic", 7.0, 3.7, 10, 2, 3);
        cards[20].setCard("SILLIMANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic", 7.5, 3.25, 10, 3, 2);
        cards[21].setCard("STAUROLITE", "MINERAL", "(Fe,Mg)2Al9Si4O22(OH)2", "Nesosilicate", "Metamorphic", "Metamorphic", 7.0, 3.8, 5, 2, 2);
        cards[22].setCard("EPIDOTE", "MINERAL", "Ca2(Al,Fe)3Si3O12(OH)", "Sorosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.5, 9, 4, 1);
        cards[23].setCard("TOURMALINE", "MINERAL", "Na(Mg,Fe)3Al6B3Si6O27(OH)4", "Cyclosilicate", "Hexagonal", "Metamorphic", 7.5, 3.2, 4, 2, 3);
        cards[24].setCard("TOPAZ", "MINERAL", "Al2SiO4(F,OH)2", "Nesosilicate", "Orthorhombic", "Metamorphic, Sedimentary", 8.0, 3.6, 9, 1, 2);
        cards[25].setCard("BERYL", "MINERAL", "Be3Al2Si6O18", "Cyclosilicate", "Hexagonal", "Igneous, Metamorphic", 8.0, 2.9, 3, 2, 3);
        cards[26].setCard("PYRITE", "MINERAL", "FeS2", "Sulfide", "Isometic", "Igneous, Metamorphic", 6.5, 5.0, 4, 3, 3);
        cards[27].setCard("PYRRHOTITE", "MINERAL", "Fe1-xS", "Sulfide", "Monoclinic", "Igneous, Metamorphic", 4.5, 4.6, 1, 3, 3);
        cards[28].setCard("CHALCOPYRITE", "MINERAL", "CuFeS2", "Sulfide", "Tetragonal", "Igneous, Metamorphic", 4.0, 4.3, 4, 3, 5);
        cards[29].setCard("GALENA", "MINERAL", "PbS", "Sulfide", "Isometic", "Metamorphic", 2.5, 7.6, 13, 2, 4);
        cards[30].setCard("SPHALERITE", "MINERAL", "(Zn,Fe)S", "Sulfide", "Isometic", "Metamorphic", 4.0, 4.1, 15, 2, 4);
        cards[31].setCard("MOLYBDENITE", "MINERAL", "MoS2", "Sulfide", "Hexagonal", "Igneous, Metamorphic", 1.5, 4.7, 9, 2, 4);
        cards[32].setCard("GOLD", "MINERAL", "Au", "Naive Element", "Isometic", "Metamorphic, Sedimentary", 3.0, 19.3, 1, 1, 6);
        cards[33].setCard("DIAMOND", "MINERAL", "C", "Naive Element", "Isometic", "Igneous, Metamorphic, Sedimentary", 10.0, 3.5, 14, 1, 6);
        cards[34].setCard("GRAPHITE", "MINERAL", "C", "Naive Element", "Hexagonal", "Metamorphic, Sedimentary", 2.0, 2.2, 9, 2, 3);
        cards[35].setCard("HALITE", "MINERAL", "NaCl", "Halide", "Isometic", "Sedimentary", 2.5, 2.2, 13, 2, 3);
        cards[36].setCard("FLUORITE", "MINERAL", "CaF2", "Halide", "Isometic", "Metamorphic", 4.0, 3.2, 14, 2, 3);
        cards[37].setCard("GYPSUM", "MINERAL", "CaSO4(H2O)2", "Sulfide", "Monoclinic", "Metamorphic, Sedimentary", 2.0, 2.3, 11, 2, 4);
        cards[38].setCard("BARITE", "MINERAL", "BaSO4", "Sulfide", "Orthorhombic", "Metamorphic, Sedimentary", 3.5, 4.5, 12, 2, 3);
        cards[39].setCard("APATITE", "MINERAL", "Ca5(PO4)3(OH,F,Cl)", "Phosphate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 5.0, 3.2, 4, 3, 4);
        cards[40].setCard("MONAZITE", "MINERAL", "(La,Ce,Nd)PO4", "Phosphate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 5.0, 5.3, 6, 2, 3);
        cards[41].setCard("CALCITE", "MINERAL", "CaCO3", "Carbonate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 3.0, 2.7, 13, 4, 4);
        cards[42].setCard("DOLOMITE", "MINERAL", "CaMg(CO3)2", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 2.9, 13, 3, 2);
        cards[43].setCard("MAGNESITE", "MINERAL", "MgCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 3.0, 13, 3, 3);
        cards[44].setCard("SIDERITE", "MINERAL", "FeCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.5, 4.0, 13, 2, 3);
        cards[45].setCard("MAGNETITE", "MINERAL", "Fe3O4", "Oxide (Spinel)", "Isometic", "Igneous, Metamorphic, Sedimentary", 6.0, 5.2, 1, 4, 5);
        cards[46].setCard("HEMATITE", "MINERAL", "Fe2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 6.0, 5.3, 1, 2, 4);
        cards[47].setCard("CHROMITE", "MINERAL", "(Fe,Mg)Cr2O4", "Oxide (Spinel)", "Isometic", "Igneous, Sedimentary", 5.5, 5.1, 1, 3, 4);
        cards[48].setCard("ILMENITE", "MINERAL", "TiFeO3", "Oxide", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 6.0, 4.8, 1, 3, 3);
        cards[49].setCard("RUTILE", "MINERAL", "TiO2", "Oxide", "Tetragonal", "Metamorphic, Sedimentary", 6.5, 4.3, 7, 3, 4);
        cards[50].setCard("CORUNDUM", "MINERAL", "Al2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 9.0, 4.0, 1, 2, 3);
        cards[51].setCard("CASSITERITE", "MINERAL", "SnO2", "Oxide", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.0, 7.1, 6, 2, 4);
        cards[52].setCard("GIBBSITE", "MINERAL", "Al(OH)3", "Hydroxide", "Monoclinic", "Metamorphic, Sedimentary", 3.5, 2.4, 9, 3, 4);
        cards[53].setCard("GOETHITE", "MINERAL", "FeO(OH)", "Hydroxide", "Orthorhombic", "Sedimentary", 5.5, 4.3, 10, 4, 3);
        cards[54].setCard("THE MINER", "TRUMP", " ", "Change category to Economic Value", " ", " ", 1.0, 1.0, 1, 1, 6);
        cards[55].setCard("THE PETROLOGIST", "TRUMP", " ", "Change category to Crustal Abundance", " ", " ", 1.0, 1.0, 1, 6, 1);
        cards[56].setCard("THE GEMMOLOGIST", "TRUMP", " ", "Change category to Hardness", " ", " ", 10.0, 1.0, 1, 1, 1);
        cards[57].setCard("THE MINERALOGIST", "TRUMP", " ", "Change category to Cleavage", " ", " ", 1.0, 1.0, 20, 1, 1);
        cards[58].setCard("THE GEOPHYSICIST", "TRUMP", " ", "Change category to Specific Gravity, or throw Magnetite", " ", " ", 1.0, 10.0, 1, 1, 1);
        cards[59].setCard("THE GEOLOGIST", "TRUMP", " ", "Change category to Your Choice", " ", " ", 10.0, 10.0, 20, 6, 6);
    }
}
