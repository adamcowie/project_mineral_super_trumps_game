import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;
public class test {

    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> myCards = new ArrayList<Integer>();
        for(int i=0;i<60;i++){a.add(i,i);}
       for(int i=0;i<60;i++)
       {
           int t = r(a.size()-1);
           myCards.add(i,a.get(t));
           a.remove(t);
       }
   //     myList.add(0,0);
  //      myList.remove(0);
  //      aList.get(0);
  //      myList.
        String adam="";
        for(int i=0;i<60;i++){adam = adam + myCards.get(i) + " : ";}
        JOptionPane.showMessageDialog(null,adam, "CARDS" ,JOptionPane.PLAIN_MESSAGE);
    }
    protected static int r(int max) {
        int min=0;
        Random rand = new Random(System.currentTimeMillis());
        return rand.nextInt((max - min) + 1) + min;
    }
}
