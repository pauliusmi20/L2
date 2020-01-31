import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class TestTracer {


    public static void main(String[] args) {

        // Construction d'une image 600x600
        int nColonnes = 600;
        int nLignes = 600;
        
        BufferedImage im = // objet image en mémoire
                new BufferedImage(nColonnes, nLignes, BufferedImage.TYPE_INT_ARGB);

        // mise au bleu de tous les pixels pour mieux voir
 
        for(int i=0; i<im.getWidth();i++)
            for(int j=0; j<im.getHeight();j++)
                im.setRGB(i, j, Color.white.getRGB()); // mettre le pixel (i,j) en bleu






        // récupération d'un stylo pour écrire dans l'image
        Graphics g = im.getGraphics();




        try {
            File outputfile = new File("saved.png");
            ImageIO.write(im, "png", outputfile);
         } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde");
         }
    }
}
