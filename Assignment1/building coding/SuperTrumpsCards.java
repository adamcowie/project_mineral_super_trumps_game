/**
 * Created by Adam Cowie on 15/08/2016.
 */
public class SuperTrumpsCards {

    private static SuperTrumpsCard[] myCards;

    public SuperTrumpsCards()
    {
        // Allocate memory for cards
        int numOfCards=60;
        String cardName="", cardType="", cardChem="", cardClass="", cardCrystal="", cardOccurrence="";
        double cardHardness=0.0, cardGravity=0.0;
        int cardCleavage=0, cardAbundance=0, cardValue=0;
        boolean cardChosen=false;
        myCards = new SuperTrumpsCard[numOfCards];
        for (int i=0;i<numOfCards;i++){
            myCards[i].setCard(cardName, cardType, cardChem, cardClass, cardCrystal, cardOccurrence, cardHardness, cardGravity, cardCleavage, cardAbundance, cardValue, cardChosen);
        }
    }
    public SuperTrumpsCard getCardInfo(int num)
    {
        SuperTrumpsCard aCard = new SuperTrumpsCard();
        switch (num){
            case(0): aCard.setCard("QUARTZ", "MINERAL", "SiO2", "Tectosilicate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 7.0, 2.65, 2, 5, 3, false);
            case(1): aCard.setCard("PLAGIOCLASE", "MINERAL", "NaAlSi3O8 - CaAl2Si2O8", "Tectosilicate", "Triclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.8, 10, 6, 3, false);
            case(2): aCard.setCard("ORTHOCLASE", "MINERAL", "KAlSi3O8", "Tectosilicate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 6.5, 2.6, 10, 5, 3, false);
            case(3): aCard.setCard("BIOTITE", "MINERAL", "K(Fe,Mg)3AlSi3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 3.3, 9, 4, 2, false);
            case(4): aCard.setCard("MUSCOVITE", "MINERAL", "KAl3Si3O10(OH)2", "Phyllosilicate", "Monoclinic", "Igneous, Metamorphic", 3.0, 2.9, 9, 4, 3, false);
            case(5): aCard.setCard("HORNBLENDE", "MINERAL", "Ca2(Mg,Fe)4Al2Si7O22(OH)2", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.0, 3.5, 7, 4, 1, false);
            case(6): aCard.setCard("ACTINOLITE", "MINERAL", "Ca2(Mg,Fe)5Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.5, 7, 3, 2, false);
            case(7): aCard.setCard("GLAUCOPHANE", "MINERAL", "Na2(Mg,Fe)3Al2Si8O22(OH)2", "Inosilicate", "Monoclinic", "Metamorphic", 6.0, 3.2, 7, 3, 1, false);
            case(8): aCard.setCard("OLIVINE", "MINERAL", "(Mg,Fe)2SiO4", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 7.0, 4.4, 4, 5, 2, false);
            case(9): aCard.setCard("GARNET", "MINERAL", "(Fe,Mg,Ca,Mn)3(Al,Fe)2Si3O12", "Nesosilicate", "Isometric", "Igneous, Metamorphic, Mantle", 7.5, 4.3, 1, 4, 3, false);
            case(10): aCard.setCard("TITANITE", "MINERAL", "CaTiSiO5", "Nesosilicate", "Monoclinic", "Igneous, Metamorphic", 5.5, 3.6, 8, 3, 2, false);
            case(11): aCard.setCard("ZIRCON", "MINERAL", "ZrSiO4", "Nesosilicate", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.5, 4.7, 4, 2, 3, false);
            case(12): aCard.setCard("AUGITE", "MINERAL", "Ca(Mg,Fe)Si2O6", "Inosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.6, 7, 5, 1, false);
            case(13): aCard.setCard("ORTHOPYROXENE", "MINERAL", "(Mg,Fe)2Si2O6", "Inosilicate", "Orthorhombic", "Igneous, Metamorphic, Mantle", 6.0, 3.9, 7, 5, 1, false);
            case(14): aCard.setCard("CHLORITE", "MINERAL", "(Mg,Fe)5Al2Si3O10(OH)8", "Phyllosilicate", "Monoclinic", "Metamorphic", 3.0, 3.3, 9, 4, 2, false);
            case(15): aCard.setCard("ANTIGORITE", "MINERAL", "(Mg,Fe)3Si2O5(OH)4", "Phyllosilicate", "Monoclinic", "Metamorphic, Mantle", 4.0, 2.6, 9, 3, 2, false);
            case(16): aCard.setCard("TALC", "MINERAL", "Mg3Si4O10(OH)2", "Phyllosilicate", "Monoclinic", "Metamorphic", 1.0, 2.8, 9, 3, 3, false);
            case(17): aCard.setCard("KAOLINITE", "MINERAL", "Al2Si2O5(OH)", "Phyllosilicate", "Triclinic", "Sedimentary", 2.5, 2.7, 9, 4, 4, false);
            case(18): aCard.setCard("ANDALUSITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Metamorphic", 7.0, 3.15, 7, 3, 3, false);
            case(19): aCard.setCard("KYANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Triclinic", "Metamorphic", 7.0, 3.7, 10, 2, 3, false);
            case(20): aCard.setCard("SILLIMANITE", "MINERAL", "Al2SiO5", "Nesosilicate", "Orthorhombic", "Igneous, Metamorphic", 7.5, 3.25, 10, 3, 2, false);
            case(21): aCard.setCard("STAUROLITE", "MINERAL", "(Fe,Mg)2Al9Si4O22(OH)2", "Nesosilicate", "Metamorphic", "Metamorphic", 7.0, 3.8, 5, 2, 2, false);
            case(22): aCard.setCard("EPIDOTE", "MINERAL", "Ca2(Al,Fe)3Si3O12(OH)", "Sorosilicate", "Monoclinic", "Igneous, Metamorphic", 6.5, 3.5, 9, 4, 1, false);
            case(23): aCard.setCard("TOURMALINE", "MINERAL", "Na(Mg,Fe)3Al6B3Si6O27(OH)4", "Cyclosilicate", "Hexagonal", "Metamorphic", 7.5, 3.2, 4, 2, 3, false);
            case(24): aCard.setCard("TOPAZ", "MINERAL", "Al2SiO4(F,OH)2", "Nesosilicate", "Orthorhombic", "Metamorphic, Sedimentary", 8.0, 3.6, 9, 1, 2, false);
            case(25): aCard.setCard("BERYL", "MINERAL", "Be3Al2Si6O18", "Cyclosilicate", "Hexagonal", "Igneous, Metamorphic", 8.0, 2.9, 3, 2, 3, false);
            case(26): aCard.setCard("PYRITE", "MINERAL", "FeS2", "Sulfide", "Isometic", "Igneous, Metamorphic", 6.5, 5.0, 4, 3, 3, false);
            case(27): aCard.setCard("PYRRHOTITE", "MINERAL", "Fe1-xS", "Sulfide", "Monoclinic", "Igneous, Metamorphic", 4.5, 4.6, 1, 3, 3, false);
            case(28): aCard.setCard("CHALCOPYRITE", "MINERAL", "CuFeS2", "Sulfide", "Tetragonal", "Igneous, Metamorphic", 4.0, 4.3, 4, 3, 5, false);
            case(29): aCard.setCard("GALENA", "MINERAL", "PbS", "Sulfide", "Isometic", "Metamorphic", 2.5, 7.6, 13, 2, 4, false);
            case(30): aCard.setCard("SPHALERITE", "MINERAL", "(Zn,Fe)S", "Sulfide", "Isometic", "Metamorphic", 4.0, 4.1, 15, 2, 4, false);
            case(31): aCard.setCard("MOLYBDENITE", "MINERAL", "MoS2", "Sulfide", "Hexagonal", "Igneous, Metamorphic", 1.5, 4.7, 9, 2, 4, false);
            case(32): aCard.setCard("GOLD", "MINERAL", "Au", "Naive Element", "Isometic", "Metamorphic, Sedimentary", 3.0, 19.3, 1, 1, 6, false);
            case(33): aCard.setCard("DIAMOND", "MINERAL", "C", "Naive Element", "Isometic", "Igneous, Metamorphic, Sedimentary", 10.0, 3.5, 14, 1, 6, false);
            case(34): aCard.setCard("GRAPHITE", "MINERAL", "C", "Naive Element", "Hexagonal", "Metamorphic, Sedimentary", 2.0, 2.2, 9, 2, 3, false);
            case(35): aCard.setCard("HALITE", "MINERAL", "NaCl", "Halide", "Isometic", "Sedimentary", 2.5, 2.2, 13, 2, 3, false);
            case(36): aCard.setCard("FLUORITE", "MINERAL", "CaF2", "Halide", "Isometic", "Metamorphic", 4.0, 3.2, 14, 2, 3, false);
            case(37): aCard.setCard("GYPSUM", "MINERAL", "CaSO4(H2O)2", "Sulfide", "Monoclinic", "Metamorphic, Sedimentary", 2.0, 2.3, 11, 2, 4, false);
            case(38): aCard.setCard("BARITE", "MINERAL", "BaSO4", "Sulfide", "Orthorhombic", "Metamorphic, Sedimentary", 3.5, 4.5, 12, 2, 3, false);
            case(39): aCard.setCard("APATITE", "MINERAL", "Ca5(PO4)3(OH,F,Cl)", "Phosphate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 5.0, 3.2, 4, 3, 4, false);
            case(40): aCard.setCard("MONAZITE", "MINERAL", "(La,Ce,Nd)PO4", "Phosphate", "Monoclinic", "Igneous, Metamorphic, Sedimentary", 5.0, 5.3, 6, 2, 3, false);
            case(41): aCard.setCard("CALCITE", "MINERAL", "CaCO3", "Carbonate", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 3.0, 2.7, 13, 4, 4, false);
            case(42): aCard.setCard("DOLOMITE", "MINERAL", "CaMg(CO3)2", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 2.9, 13, 3, 2, false);
            case(43): aCard.setCard("MAGNESITE", "MINERAL", "MgCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.0, 3.0, 13, 3, 3, false);
            case(44): aCard.setCard("SIDERITE", "MINERAL", "FeCO3", "Carbonate", "Hexagonal", "Metamorphic, Sedimentary", 4.5, 4.0, 13, 2, 3, false);
            case(45): aCard.setCard("MAGNETITE", "MINERAL", "Fe3O4", "Oxide (Spinel)", "Isometic", "Igneous, Metamorphic, Sedimentary", 6.0, 5.2, 1, 4, 5, false);
            case(46): aCard.setCard("HEMATITE", "MINERAL", "Fe2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 6.0, 5.3, 1, 2, 4, false);
            case(47): aCard.setCard("CHROMITE", "MINERAL", "(Fe,Mg)Cr2O4", "Oxide (Spinel)", "Isometic", "Igneous, Sedimentary", 5.5, 5.1, 1, 3, 4, false);
            case(48): aCard.setCard("ILMENITE", "MINERAL", "TiFeO3", "Oxide", "Hexagonal", "Igneous, Metamorphic, Sedimentary", 6.0, 4.8, 1, 3, 3, false);
            case(49): aCard.setCard("RUTILE", "MINERAL", "TiO2", "Oxide", "Tetragonal", "Metamorphic, Sedimentary", 6.5, 4.3, 7, 3, 4, false);
            case(50): aCard.setCard("CORUNDUM", "MINERAL", "Al2O3", "Oxide", "Hexagonal", "Metamorphic, Sedimentary", 9.0, 4.0, 1, 2, 3, false);
            case(51): aCard.setCard("CASSITERITE", "MINERAL", "SnO2", "Oxide", "Tetragonal", "Igneous, Metamorphic, Sedimentary", 7.0, 7.1, 6, 2, 4, false);
            case(52): aCard.setCard("GIBBSITE", "MINERAL", "Al(OH)3", "Hydroxide", "Monoclinic", "Metamorphic, Sedimentary", 3.5, 2.4, 9, 3, 4, false);
            case(53): aCard.setCard("GOETHITE", "MINERAL", "FeO(OH)", "Hydroxide", "Orthorhombic", "Sedimentary", 5.5, 4.3, 10, 4, 3, false);
            case(54): aCard.setCard("THE MINER", "TRUMP", " ", "Change category to Economic Value", " ", " ", 1.0, 1.0, 1, 1, 6, false);
            case(55): aCard.setCard("THE PETROLOGIST", "TRUMP", " ", "Change category to Crustal Abundance", " ", " ", 1.0, 1.0, 1, 6, 1, false);
            case(56): aCard.setCard("THE GEMMOLOGIST", "TRUMP", " ", "Change category to Hardness", " ", " ", 10.0, 1.0, 1, 1, 1, false);
            case(57): aCard.setCard("THE MINERALOGIST", "TRUMP", " ", "Change category to Cleavage", " ", " ", 1.0, 1.0, 20, 1, 1, false);
            case(58): aCard.setCard("THE GEOPHYSICIST", "TRUMP", " ", "Change category to Specific Gravity, or throw Magnetite", " ", " ", 1.0, 10.0, 1, 1, 1, false);
            case(59): aCard.setCard("THE GEOLOGIST", "TRUMP", " ", "Change category to Your Choice", " ", " ", 10.0, 10.0, 20, 6, 6, false);
            default: aCard.setCard("ERROR - setCardInfo","","","","","",0.0,0.0,0,0,0, true);
        }
        return aCard;
    }

    public void setCard(SuperTrumpsCard whichCard, int cardNumber)
    {
        SuperTrumpsCard aCard = new SuperTrumpsCard();

        myCards[i].setCard(cardName, cardType, cardChem, cardClass, cardCrystal, cardOccurrence, cardHardness, cardGravity, cardCleavage, cardAbundance, cardValue, cardChosen);
    }

    public void setCardChosen(int num)
    {
        myCards[i].setCard(cardName, cardType, cardChem, cardClass, cardCrystal, cardOccurrence, cardHardness, cardGravity, cardCleavage, cardAbundance, cardValue, cardChosen);
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
