import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/* Created by Adam Cowie on 25/9/2016. */
public class STCheck extends JFrame{
    public double prevCard;
    public int cardCheck;
    public int count;
    public boolean button_clicked = false;
    public String myReturn;
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
    protected void getImages() throws IOException // get images and convert to use for program
    {
        File folder = new File("c://images//");
        File[] listOfFiles = folder.listFiles();
        BufferedImage img = null;
        BufferedImage tempPNG = null;
        BufferedImage tempJPG = null;
        File newFilePNG = null;
        File newFileJPG = null;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                img = ImageIO.read(new File("c://images//" + listOfFiles[i].getName()));
                tempJPG = resizeImages(img, img.getWidth(), img.getHeight());
                newFileJPG = new File("c://images2//" + listOfFiles[i].getName());
                ImageIO.write(tempJPG, "jpg", newFileJPG);
            }
        }
    }
    protected String lookCards(String message[], String image[], String title) throws IOException
    {
        setLayout(new GridLayout(2, 3, 2, 4));
        myReturn="";
        count=0;
        BufferedImage cardImg[] = new BufferedImage[message.length];
        ImageIcon cardIcon[] = new ImageIcon[message.length];
        JButton[] cardButtons = new JButton[message.length];
        // build buttons to display
        for(int i=0;i<cardButtons.length;i++)
        {
            count=i;
            cardButtons[i] = new JButton();
            cardImg[i] = ImageIO.read(new File(image[i]));
            cardIcon[i] = new ImageIcon(cardImg[i]);
            cardButtons[i].setIcon(cardIcon[i]);
            add(cardButtons[i]);
            cardButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    myReturn=message[count];// handle player selection of button
                    button_clicked = true;
                }});
        }
        setSize(1500, 840);
        setTitle(title);
        setVisible(true);
        do{
            try {
            Thread.sleep(200);
        } catch(InterruptedException e) {}
        }while(!button_clicked);// waiting for button click
        // clean up jframe display
        setVisible(false);
        button_clicked = false;
        for(int i=0;i<cardButtons.length;i++)
        {
            remove(cardButtons[i]);
        }
        return myReturn;
    }

    protected BufferedImage resizeImages(final Image image, int width, int height) {// resize image to work with program
        int targetw = 300;
        int targeth = 420;
        if (width > height) targetw = 420;
        else targetw = 300;
        do {
            if (width > targetw) {
                width /= 2;
                if (width < targetw) width = targetw;
            }
            if (height > targeth) {
                height /= 2;
                if (height < targeth) height = targeth;
            }
        } while (width != targetw || height != targeth);
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
    }
}
