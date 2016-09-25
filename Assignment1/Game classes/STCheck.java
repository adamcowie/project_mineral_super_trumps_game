/* Created by Adam Cowie on 25/9/2016. */
public class STCheck{
    public double prevCard;
    public int cardCheck;
    public boolean gameFinished;
    public String selection;

    public STCheck(int cardcheck, double prevcard, boolean gameFinish, String select)
    {
        cardCheck=cardcheck;
        prevCard=prevcard;
        gameFinished=gameFinish;
        selection=select;
    }
    protected void setCardCheck(int set){cardCheck=set;}
    protected int getCardCheck(){return cardCheck;}
    protected void setPrevCard(double set){prevCard=set;}
    protected double getPrevCard(){return prevCard;}
    protected void setGameFinished(boolean set){gameFinished=set;}
    protected boolean getGameFinished(){return gameFinished;}
    protected void setSelection(String set){selection=set;}
    protected String getSelection(){return selection;}
}
